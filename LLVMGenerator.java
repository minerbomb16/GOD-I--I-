class LLVMGenerator {
   static String header_text = "";
   static String main_text = "";
   static int reg = 1;
   static int str = 1;

   static void declare(String id, String type) {
      if (type.equals("Mortal")) main_text += "    %" + id + " = alloca i32\n";
      else if (type.equals("Divine")) main_text += "    %" + id + " = alloca double\n";
      else if (type.equals("Eternal")) main_text += "    %" + id + " = alloca i8*\n"; // Zmienna Eternal jest tylko wskaźnikiem!
   }

   static void assign(String id, String valueReg, String type) {
      if (type.equals("Mortal")) main_text += "    store i32 " + valueReg + ", i32* %" + id + "\n";
      else if (type.equals("Divine")) main_text += "    store double " + valueReg + ", double* %" + id + "\n";
      else if (type.equals("Eternal")) main_text += "    store i8* " + valueReg + ", i8** %" + id + "\n";
   }

   static void load(String id, String type) {
      if (type.equals("Mortal")) main_text += "    %" + reg + " = load i32, i32* %" + id + "\n";
      else if (type.equals("Divine")) main_text += "    %" + reg + " = load double, double* %" + id + "\n";
      else if (type.equals("Eternal")) main_text += "    %" + reg + " = load i8*, i8** %" + id + "\n";
      reg++;
   }

   static void arithmetic(String op, String val1, String val2, String type) {
      String llvmType = type.equals("Mortal") ? "i32" : "double";
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

   static void allocate_string(String id, int l) {
      main_text += "    %" + id + " = alloca [" + (l + 1) + " x i8]\n";
   }

   static String constant_string(String content) {
      int l = content.length() + 1;     
      header_text += "@str" + str + " = constant [" + l + " x i8] c\"" + content + "\\00\"\n";
      String n = "str" + str;
      allocate_string(n, l - 1);
      main_text += "    %" + reg + " = bitcast [" + l + " x i8]* %" + n + " to i8*\n";
      main_text += "    call void @llvm.memcpy.p0i8.p0i8.i64(i8* align 1 %" + reg + ", i8* align 1 getelementptr inbounds ([" + l + " x i8], [" + l + " x i8]* @" + n + ", i32 0, i32 0), i64 " + l + ", i1 false)\n";
      reg++;
      main_text += "    %" + reg + " = getelementptr inbounds [" + l + " x i8], [" + l + " x i8]* %" + n + ", i32 0, i32 0\n";
      String ptrReg = "%" + reg;
      reg++;
      str++;
      return ptrReg;
   }

   static String add_string(String val1, int l1, String val2, int l2) {
      allocate_string("str" + str, l1 + l2);
      main_text += "    %" + reg + " = getelementptr inbounds [" + (l1 + l2 + 1) + " x i8], [" + (l1 + l2 + 1) + " x i8]* %str" + str + ", i32 0, i32 0\n";
      String newStrPtr = "%" + reg;
      reg++;
      main_text += "    %" + reg + " = call i8* @strcpy(i8* " + newStrPtr + ", i8* " + val1 + ")\n";
      reg++;
      main_text += "    %" + reg + " = call i8* @strcat(i8* " + newStrPtr + ", i8* " + val2 + ")\n";
      reg++;
      str++;
      return newStrPtr;
   }

   static String int_to_string(String in, int lout) {
      allocate_string("str" + str, lout);
      main_text += "    %" + reg + " = getelementptr inbounds [" + (lout + 1) + " x i8], [" + (lout + 1) + " x i8]* %str" + str + ", i32 0, i32 0\n";
      String newStrPtr = "%" + reg;
      reg++;
      str++;  
      main_text += "    %" + reg + " = call i32 (i8*, i8*, ...) @sprintf(i8* " + newStrPtr + ", i8* getelementptr inbounds ([3 x i8], [3 x i8]* @strspi, i32 0, i32 0), i32 " + in + ")\n";
      reg++;
      return newStrPtr;
   }

   static String double_to_string(String in, int lout) {
      allocate_string("str" + str, lout);
      main_text += "    %" + reg + " = getelementptr inbounds [" + (lout + 1) + " x i8], [" + (lout + 1) + " x i8]* %str" + str + ", i32 0, i32 0\n";
      String newStrPtr = "%" + reg;
      reg++;
      str++;  
      main_text += "    %" + reg + " = call i32 (i8*, i8*, ...) @sprintf(i8* " + newStrPtr + ", i8* getelementptr inbounds ([3 x i8], [3 x i8]* @strspf, i32 0, i32 0), double " + in + ")\n";
      reg++;
      return newStrPtr;
   }

   static void print(String valueReg, String type) {
      if (type.equals("Mortal")) {
         main_text += "    %" + reg + " = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strp, i32 0, i32 0), i32 " + valueReg + ")\n";
      } else if (type.equals("Divine")) {
         main_text += "    %" + reg + " = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strp_real, i32 0, i32 0), double " + valueReg + ")\n";
      } else if (type.equals("Eternal")) {
         main_text += "    %" + reg + " = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* " + valueReg + ")\n";
      }
      reg++;
   }

   static void read(String id, String type, int length) {
      if (type.equals("Mortal")) {
         main_text += "    call void @readInt(i32* %" + id + ")\n";
      } else if (type.equals("Divine")) {
         main_text += "    call void @readReal(double* %" + id + ")\n";
      } else if (type.equals("Eternal")) {
         allocate_string("str" + str, length);
         main_text += "    %" + reg + " = getelementptr inbounds [" + (length + 1) + " x i8], [" + (length + 1) + " x i8]* %str" + str + ", i32 0, i32 0\n";
         String buffPtr = "%" + reg;
         reg++;
         main_text += "    store i8* " + buffPtr + ", i8** %" + id + "\n"; 
         str++;
         main_text += "    call void @readString(i8* " + buffPtr + ")\n";
      }
   }

   static String generate() {
      String text = "";
      text += "declare i32 @printf(i8*, ...)\n";
      text += "declare void @readInt(i32*)\n";
      text += "declare void @readReal(double*)\n";
      text += "declare void @readString(i8*)\n";

      text += "declare i32 @sprintf(i8*, i8*, ...)\n";
      text += "declare i8* @strcpy(i8*, i8*)\n";
      text += "declare i8* @strcat(i8*, i8*)\n";
      text += "declare void @llvm.memcpy.p0i8.p0i8.i64(i8* noalias nocapture writeonly, i8* noalias nocapture readonly, i64, i1 immarg)\n";

      text += "@strp = constant [4 x i8] c\"%d\\0A\\00\"\n";
      text += "@strp_real = constant [4 x i8] c\"%f\\0A\\00\"\n";
      text += "@strps = constant [4 x i8] c\"%s\\0A\\00\"\n";
      text += "@strspi = constant [3 x i8] c\"%d\\00\"\n";
      text += "@strspf = constant [3 x i8] c\"%f\\00\"\n";

      text += header_text + "\n";
      text += "define i32 @main() {\n";
      text += main_text;
      text += "    ret i32 0\n";
      text += "}\n";
      return text;
   }
}