class LLVMGenerator {
    static String header_text = "";
    static String main_text = "";
    static int reg = 1;

    private static String checkType(String type) {
        return type.equals("Mortal") ? "i32" : "double";
    }

    static void declare(String id, String type) {
       String llvmType = checkType(type);
       main_text += "    %" + id + " = alloca " + llvmType + "\n";
    }

    static void assign(String id, String valueReg, String type) {
       String llvmType = checkType(type);
       main_text += "    store " + llvmType + " " + valueReg + ", " + llvmType + "* %" + id + "\n";
    }

    static void load(String id, String type) {
       String llvmType = checkType(type);
       main_text += "    %" + reg + " = load " + llvmType + ", " + llvmType + "* %" + id + "\n";
       reg++;
    }

    static void arithmetic(String op, String val1, String val2, String type) {
       String llvmType = checkType(type);
       String inst = "";
       
       if (type.equals("Mortal")) {
          if (op.equals("+")) inst = "add";
          if (op.equals("-")) inst = "sub";
          if (op.equals("*")) inst = "mul";
          if (op.equals("/")) inst = "sdiv";
       } else {
          if (op.equals("+")) inst = "fadd";
          if (op.equals("-")) inst = "fsub";
          if (op.equals("*")) inst = "fmul";
          if (op.equals("/")) inst = "fdiv";
       }
       
       main_text += "    %" + reg + " = " + inst + " " + llvmType + " " + val1 + ", " + val2 + "\n";
       reg++;
    }

    static void print(String valueReg, String type) {
       if (type.equals("Mortal")) {
          main_text += "    %" + reg + " = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strp, i32 0, i32 0), i32 " + valueReg + ")\n";
       } else {
          main_text += "    %" + reg + " = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strp_real, i32 0, i32 0), double " + valueReg + ")\n";
       }
       reg++;
    }

    static void read(String id, String type) {
       if (type.equals("Mortal")) {
          main_text += "    call void @readInt(i32* %" + id + ")\n";
       } else {
          main_text += "    call void @readReal(double* %" + id + ")\n";
       }
    }

    static String generate() {
        String text = "";
        text += "declare i32 @printf(i8*, ...)\n";
        text += "declare void @readInt(i32*)\n";
        text += "declare void @readReal(double*)\n";
        text += "@strp = constant [4 x i8] c\"%d\\0A\\00\"\n";
        text += "@strp_real = constant [4 x i8] c\"%f\\0A\\00\"\n";
        text += header_text + "\n";
        text += "define i32 @main() {\n";
        text += main_text;
        text += "    ret i32 0\n";
        text += "}\n";
        return text;
    }
}