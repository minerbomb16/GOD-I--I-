class LLVMGenerator {
   static String header_text = "";
   static String main_text = "";
   static int reg = 1;
   static int str = 1;
   static int br = 1;
   static String functions_text = "";
   static String main_buffer = "";

   static String llvmType(String type) {
      if (type.equals("Mortal")) return "i32";
      if (type.equals("Divine")) return "double";
      if (type.equals("SmallDivine")) return "float";
      if (type.equals("Dogma")) return "i1";
      if (type.equals("Eternal")) return "i8*";

      return "%" + type + "*";
   }

   static void declare(String id, String type) {
      String llvmType = llvmType(type);
      main_text += "    %" + id + " = alloca " + llvmType + "\n";
   }

   static void declareGlobal(String id, String type) {
      String llvmType = llvmType(type);
      String init = type.equals("Mortal") ? "0" : type.equals("Dogma") ? "false" : type.equals("Eternal") ? "null" : "0.0";
      header_text += "@" + id + " = global " + llvmType + " " + init + "\n";
   }

   static void declareArray(String id, String type, int size) {
      String llvmType = llvmType(type);
      String arrayType = "[" + size + " x " + llvmType + "]";
      main_text += "    %" + id + " = alloca " + arrayType + "\n";
      main_text += "    store " + arrayType + " zeroinitializer, " + arrayType + "* %" + id + "\n";
   }

   static void declareGlobalArray(String id, String type, int size) {
      String llvmType = llvmType(type);
      String arrayType = "[" + size + " x " + llvmType + "]";
      header_text += "@" + id + " = global " + arrayType + " zeroinitializer\n";
   }

   static void declareMatrix(String id, String type, int rows, int cols) {
      String llvmType = llvmType(type);
      String matrixType = "[" + rows + " x [" + cols + " x " + llvmType + "]]";

      main_text += "    %" + id + " = alloca " + matrixType + "\n";
      main_text += "    store " + matrixType + " zeroinitializer, " + matrixType + "* %" + id + "\n";
   }

   static void declareGlobalMatrix(String id, String type, int rows, int cols) {
      String llvmType = llvmType(type);
      String matrixType = "[" + rows + " x [" + cols + " x " + llvmType + "]]";
      header_text += "@" + id + " = global " + matrixType + " zeroinitializer\n";
   }

   static void assign(String address, String valueReg, String type) {
      String llvmType = llvmType(type);
      main_text += "    store " + llvmType + " " + valueReg + ", " + llvmType + "* " + address + "\n";
   }

   static void load(String address, String type) {
      String llvmType = llvmType(type);
      main_text += "    %" + reg + " = load " + llvmType + ", " + llvmType + "* " + address + "\n";
      reg++;
   }


   static String getArrayElementAddress(String id, String type, int size, String indexReg) {
      String llvmType = llvmType(type);

      main_text += "    %" + reg + " = getelementptr inbounds ["+ size + " x " + llvmType + "], ["+ size + " x " + llvmType + "]* " + id+ ", i32 0, i32 " + indexReg + "\n";

      String address = "%" + reg;
      reg++;
      return address;
   }

   static String getMatrixElementAddress(String id, String type, int rows, int cols, String rowReg, String colReg) {
      String llvmType = llvmType(type);
      main_text += "    %" + reg + " = getelementptr inbounds [" + rows + " x [" + cols + " x " + llvmType + "]], [" + rows + " x [" + cols + " x " + llvmType + "]]* " + id + ", i32 0, i32 " + rowReg + ", i32 " + colReg + "\n";
      String address = "%" + reg;
      reg++;
      return address;
   }

   static void startFunction(String id, String type, java.util.List<String> argNames, java.util.List<String> argTypes, java.util.Map<String, Boolean> isStructMap) {
      main_buffer = main_text; 
      main_text = ""; 
        
      String llvmRetType = llvmType(type);
      StringBuilder args = new StringBuilder();
      for(int i=0; i<argNames.size(); i++) {
          if(i > 0) args.append(", ");
          String t = argTypes.get(i);
          args.append(llvmType(t)).append(" %").append(argNames.get(i)).append("_arg");
      }
        
      main_text += "define " + llvmRetType + " @" + id + "(" + args.toString() + ") {\n";
        
      for(int i=0; i<argNames.size(); i++) {
          String t = argTypes.get(i);
          String name = argNames.get(i);
          boolean isStr = isStructMap.getOrDefault(name, false);

          if (!isStr) {
              declare(name, t);
              assign("%" + name, "%" + name + "_arg", t);
          }
      }
   }

   static void endFunction() {
      main_text += "}\n\n";
      functions_text += main_text; 
      main_text = main_buffer;     
   }

   static void fulfill(String valueReg, String type) {
      main_text += "    ret " + llvmType(type) + " " + valueReg + "\n";
   }
    
   static String callFunction(String id, String type, java.util.List<String> argRegs, java.util.List<String> argTypes) {
      String llvmType = llvmType(type);
      StringBuilder args = new StringBuilder();
      for(int i=0; i<argRegs.size(); i++) {
          if(i > 0) args.append(", ");
          args.append(llvmType(argTypes.get(i))).append(" ").append(argRegs.get(i));
      }
      main_text += "    %" + reg + " = call " + llvmType + " @" + id + "(" + args.toString() + ")\n";
      String retReg = "%" + reg;
      reg++;
      return retReg;
   }

   static void defineStruct(String name, java.util.List<String> types) {
      StringBuilder fields = new StringBuilder();
      for (int i = 0; i < types.size(); i++) {
         if (i > 0) fields.append(", ");
         fields.append(llvmType(types.get(i)));
      }
      header_text += "%" + name + " = type { " + fields.toString() + " }\n";
   }

   static void declareStruct(String id, String structName) {
      main_text += "    %" + id + " = alloca %" + structName + "\n";
      main_text += "    store %" + structName + " zeroinitializer, %" + structName + "* %" + id + "\n";
   }

   static void declareGlobalStruct(String id, String structName) {
      header_text += "@" + id + " = global %" + structName + " zeroinitializer\n";
   }

   static String getStructElementAddress(String id, String structName, int fieldIndex) {
      main_text += "    %" + reg + " = getelementptr inbounds %" + structName + ", %" + structName + "* " + id + ", i32 0, i32 " + fieldIndex + "\n";
      String address = "%" + reg;
      reg++;
      return address;
   }

   static void copyStruct(String destAddr, String srcAddr, String structName) {
      main_text += "    %" + reg + " = load %" + structName + ", %" + structName + "* " + srcAddr + "\n";
      String valReg = "%" + reg;
      reg++;
      main_text += "    store %" + structName + " " + valReg + ", %" + structName + "* " + destAddr + "\n";
   }

   static void arithmetic(String op, String val1, String val2, String type) {
      String llvmType = llvmType(type);

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
   
   static String mortal_to_dogma(Value val, int line) {
        if (val.name.equals("0")) return "false";
        if (val.name.equals("1")) return "true";

        System.err.println(
            "Semantic error (line " + line + "): Dogma can be assigned only Heaven, Hell, 0 or 1."
        );
        System.exit(1);
        return "";
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

   static String double_to_float(String valReg) {
      main_text += "    %" + reg + " = fptrunc double " + valReg + " to float\n";
      String newReg = "%" + reg;
      reg++;
      return newReg;
   }

   static String float_to_double(String valReg) {
      main_text += "    %" + reg + " = fpext float " + valReg + " to double\n";
      String newReg = "%" + reg;
      reg++;
      return newReg;
   }

   static String mortal_to_divine(String valReg) {
      main_text += "    %" + reg + " = sitofp i32 " + valReg + " to double\n";
      String newReg = "%" + reg;
      reg++;
      return newReg;
   }

   static String mortal_to_small_divine(String valReg) {
      main_text += "    %" + reg + " = sitofp i32 " + valReg + " to float\n";
      String newReg = "%" + reg;
      reg++;
      return newReg;
   }

   static String float_to_string(String in, int lout) {
      allocate_string("str" + str, lout);
      main_text += "    %" + reg + " = getelementptr inbounds [" + (lout + 1) + " x i8], [" + (lout + 1) + " x i8]* %str" + str + ", i32 0, i32 0\n";
      String newStrPtr = "%" + reg;
      reg++;
      str++;
      main_text += "    %" + reg + " = fpext float " + in + " to double\n";
      String extendedReg = "%" + reg;
      reg++;
      main_text += "    %" + reg + " = call i32 (i8*, i8*, ...) @sprintf(i8* " 
            + newStrPtr 
            + ", i8* getelementptr inbounds ([3 x i8], [3 x i8]* @strspf, i32 0, i32 0), double " 
            + extendedReg 
            + ")\n";
      reg++;
      return newStrPtr;
   }

   static String dogma_to_string(String in) {
      main_text += "    %" + reg + " = select i1 " + in + 
                   ", i8* getelementptr inbounds ([7 x i8], [7 x i8]* @dogma_Heaven, i32 0, i32 0)" + 
                   ", i8* getelementptr inbounds ([5 x i8], [5 x i8]* @dogma_Hell, i32 0, i32 0)\n";
      String newStrPtr = "%" + reg;
      reg++;
      return newStrPtr;
   }

   static void print(String valueReg, String type) {
      if (type.equals("Mortal")) {
         main_text += "    %" + reg + " = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strp, i32 0, i32 0), i32 " + valueReg + ")\n";
      } else if (type.equals("Divine")) {
         main_text += "    %" + reg + " = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strp_real, i32 0, i32 0), double " + valueReg + ")\n";
      }else if (type.equals("SmallDivine")) {
         String extendedReg = float_to_double(valueReg);
         main_text += "    %" + reg + " = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strp_real, i32 0, i32 0), double " + extendedReg + ")\n";
      }else if (type.equals("Eternal")) {
         main_text += "    %" + reg + " = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* " + valueReg + ")\n";
      } else if (type.equals("Dogma")) {
         main_text += "    %" + reg + " = select i1 " + valueReg + ", i8* getelementptr inbounds ([7 x i8], [7 x i8]* @dogma_Heaven, i32 0, i32 0)" + ", i8* getelementptr inbounds ([5 x i8], [5 x i8]* @dogma_Hell, i32 0, i32 0)\n";
         String dogmaStrReg = "%" + reg;
         reg++;
         main_text += "    %" + reg + " = call i32 (i8*, ...) @printf(" + "i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), "+ "i8* " + dogmaStrReg + ")\n";
      }
      reg++;
   }

   static void printArrayRange(String id, String type, int size, int start, int end) {
      for (int i = start; i <= end; i++) {
         String address = getArrayElementAddress(id, type, size, Integer.toString(i));
         load(address, type);

         String valueReg = "%" + (reg - 1);
         print(valueReg, type);
         }
   }

   static void printArray(String id, String type, int size) {
      printArrayRange(id, type, size, 0, size - 1);
   }

      static void printMatrix(String id, String type, int rows, int cols) {
      for (int i = 0; i < rows; i++) {
         for (int j = 0; j < cols; j++) {
            String address = getMatrixElementAddress(id, type, rows, cols, Integer.toString(i), Integer.toString(j));
            load(address, type);
            String valueReg = "%" + (reg - 1);
            print(valueReg, type);
         }
      }
   }

   static void printMatrixRow(String id, String type, int rows, int cols, int row) {
      for (int j = 0; j < cols; j++) {
         String address = getMatrixElementAddress(id, type, rows, cols, Integer.toString(row), Integer.toString(j));
         load(address, type);
         String valueReg = "%" + (reg - 1);
         print(valueReg, type);
      }
   }

   static void printMatrixColumn(String id, String type, int rows, int cols, int col) {
      for (int i = 0; i < rows; i++) {
         String address = getMatrixElementAddress(id, type, rows, cols, Integer.toString(i), Integer.toString(col));
         load(address, type);
         String valueReg = "%" + (reg - 1);
         print(valueReg, type);
      }
   }

   static void read(String pointer, String type, int length) {
      if (type.equals("Mortal")) {
         main_text += "    call void @readInt(i32* " + pointer + ")\n";
      } else if (type.equals("Divine")) {
         main_text += "    call void @readReal(double* " + pointer + ")\n";
      } else if (type.equals("SmallDivine")) {
         main_text += "    call void @readFloat(float* " + pointer + ")\n";
      } else if (type.equals("Eternal")) {
         allocate_string("str" + str, length);
         main_text += "    %" + reg + " = getelementptr inbounds [" + (length + 1) + " x i8], [" + (length + 1) + " x i8]* %str" + str + ", i32 0, i32 0\n";
         String buffPtr = "%" + reg;
         reg++;
         main_text += "    store i8* " + buffPtr + ", i8** " + pointer + "\n"; 
         str++;
         main_text += "    call void @readString(i8* " + buffPtr + ")\n";
      } else if (type.equals("Dogma")) {
         main_text += "    %" + reg + " = call i32 @readDogma()\n";
         String intReg = "%" + reg;
         reg++;
         main_text += "    %" + reg + " = icmp ne i32 " + intReg + ", 0\n";
         String boolReg = "%" + reg;
         reg++;
         main_text += "    store i1 " + boolReg + ", i1* " + pointer + "\n";
      }
   }


   static void compare(String op, String val1, String val2, String type) {
      String llvmType = llvmType(type);
      String cond = "";
        
      if (type.equals("Mortal")) {
         if (op.equals("==")) cond = "eq";
         else if (op.equals("!=")) cond = "ne";
         else if (op.equals(">")) cond = "sgt";
         else if (op.equals("<")) cond = "slt";
         else if (op.equals(">=")) cond = "sge";
         else if (op.equals("<=")) cond = "sle";
         main_text += "    %" + reg + " = icmp " + cond + " " + llvmType + " " + val1 + ", " + val2 + "\n";
      } else {
         if (op.equals("==")) cond = "oeq";
         else if (op.equals("!=")) cond = "one";
         else if (op.equals(">")) cond = "ogt";
         else if (op.equals("<")) cond = "olt";
         else if (op.equals(">=")) cond = "oge";
         else if (op.equals("<=")) cond = "ole";
         main_text += "    %" + reg + " = fcmp " + cond + " " + llvmType + " " + val1 + ", " + val2 + "\n";
      }
      reg++;
   }

   static void ifStart(String condReg, int brCnt) {
      main_text += "    br i1 " + condReg + ", label %if_true_" + brCnt + ", label %if_false_" + brCnt + "\n";
      main_text += "if_true_" + brCnt + ":\n";
   }

   static void elseStart(int brCnt) {
      main_text += "    br label %if_end_" + brCnt + "\n";
      main_text += "if_false_" + brCnt + ":\n";
   }

   static void ifEnd(int brCnt, boolean hasElse) {
      main_text += "    br label %if_end_" + brCnt + "\n";
      if (!hasElse) {
         main_text += "if_false_" + brCnt + ":\n";
         main_text += "    br label %if_end_" + brCnt + "\n";
      }
      main_text += "if_end_" + brCnt + ":\n";
   }

   static void whileStart(int brCnt) {
      main_text += "    br label %while_cond_" + brCnt + "\n";
      main_text += "while_cond_" + brCnt + ":\n";
   }

   static void whileCond(String condReg, int brCnt) {
      main_text += "    br i1 " + condReg + ", label %while_body_" + brCnt + ", label %while_end_" + brCnt + "\n";
      main_text += "while_body_" + brCnt + ":\n";
   }

   static void whileEnd(int brCnt) {
      main_text += "    br label %while_cond_" + brCnt + "\n";
      main_text += "while_end_" + brCnt + ":\n";
   }

   static void forCondStart(int brCnt) {
      main_text += "    br label %for_cond_" + brCnt + "\n";
      main_text += "for_cond_" + brCnt + ":\n";
   }

static void forCond(String idReg, String endValReg, String stepReg, int brCnt) {
      main_text += "    %" + reg + " = load i32, i32* " + idReg + "\n";
      String currVal = "%" + reg;
      reg++;

      main_text += "    %" + reg + " = icmp sle i32 " + currVal + ", " + endValReg + "\n";
      String cmpPos = "%" + reg;
      reg++;

      main_text += "    %" + reg + " = icmp sge i32 " + currVal + ", " + endValReg + "\n";
      String cmpNeg = "%" + reg;
      reg++;

      main_text += "    %" + reg + " = icmp slt i32 " + stepReg + ", 0\n";
      String isStepNeg = "%" + reg;
      reg++;

      main_text += "    %" + reg + " = select i1 " + isStepNeg + ", i1 " + cmpNeg + ", i1 " + cmpPos + "\n";
      String condReg = "%" + reg;
      reg++;

      main_text += "    br i1 " + condReg + ", label %for_body_" + brCnt + ", label %for_end_" + brCnt + "\n";
      main_text += "for_body_" + brCnt + ":\n";
   }

   static void forInc(String idReg, String stepReg, int brCnt) {
      main_text += "    %" + reg + " = load i32, i32* " + idReg + "\n";
      String currVal = "%" + reg;
      reg++;
      main_text += "    %" + reg + " = add i32 " + currVal + ", " + stepReg + "\n";
      String nextVal = "%" + reg;
      reg++;

      main_text += "    store i32 " + nextVal + ", i32* " + idReg + "\n";
      main_text += "    br label %for_cond_" + brCnt + "\n";
      main_text += "for_end_" + brCnt + ":\n";
   }

   static void unaryMinus(String val, String type) {
      if (type.equals("Mortal")) {
         main_text += "    %" + reg + " = sub i32 0, " + val + "\n";
      } else if (type.equals("Divine")) {
         main_text += "    %" + reg + " = fsub double 0.0, " + val + "\n";
      } else if (type.equals("SmallDivine")) {
         main_text += "    %" + reg + " = fsub float 0.0, " + val + "\n";
      }
      reg++;
   }

   static void logicNeg(String val) {
      main_text += "    %" + reg + " = xor i1 " + val + ", true\n";
      reg++;
   }
   
   static void startAnd(String lhsReg, int brCnt) {
      main_text += "    br label %and_lhs_end_" + brCnt + "\n";
      main_text += "and_lhs_end_" + brCnt + ":\n";
      main_text += "    br i1 " + lhsReg + ", label %and_rhs_" + brCnt + ", label %and_end_" + brCnt + "\n";
      main_text += "and_rhs_" + brCnt + ":\n";
   }

   static void endAnd(String rhsReg, int brCnt) {
      main_text += "    br label %and_rhs_end_" + brCnt + "\n";
      main_text += "and_rhs_end_" + brCnt + ":\n";
      main_text += "    br label %and_end_" + brCnt + "\n";
      main_text += "and_end_" + brCnt + ":\n";
      main_text += "    %" + reg + " = phi i1 [ false, %and_lhs_end_" + brCnt + " ], [ " + rhsReg + ", %and_rhs_end_" + brCnt + " ]\n";
      reg++;
   }

   static void startOr(String lhsReg, int brCnt) {
      main_text += "    br label %or_lhs_end_" + brCnt + "\n";
      main_text += "or_lhs_end_" + brCnt + ":\n";
      main_text += "    br i1 " + lhsReg + ", label %or_end_" + brCnt + ", label %or_rhs_" + brCnt + "\n";
      main_text += "or_rhs_" + brCnt + ":\n";
   }

   static void endOr(String rhsReg, int brCnt) {
      main_text += "    br label %or_rhs_end_" + brCnt + "\n";
      main_text += "or_rhs_end_" + brCnt + ":\n";
      main_text += "    br label %or_end_" + brCnt + "\n";
      main_text += "or_end_" + brCnt + ":\n";
      main_text += "    %" + reg + " = phi i1 [ true, %or_lhs_end_" + brCnt + " ], [ " + rhsReg + ", %or_rhs_end_" + brCnt + " ]\n";
      reg++;
   }

   static String generate() {
      String text = "";
      text += "declare i32 @printf(i8*, ...)\n";
      text += "declare void @readInt(i32*)\n";
      text += "declare void @readReal(double*)\n";
      text += "declare void @readFloat(float*)\n";
      text += "declare void @readString(i8*)\n";
      text += "declare i32 @readDogma()\n";

      text += "declare i32 @sprintf(i8*, i8*, ...)\n";
      text += "declare i8* @strcpy(i8*, i8*)\n";
      text += "declare i8* @strcat(i8*, i8*)\n";
      text += "declare void @llvm.memcpy.p0i8.p0i8.i64(i8* noalias nocapture writeonly, i8* noalias nocapture readonly, i64, i1 immarg)\n";

      text += "@strp = constant [4 x i8] c\"%d\\0A\\00\"\n";
      text += "@strp_real = constant [4 x i8] c\"%f\\0A\\00\"\n";
      text += "@strps = constant [4 x i8] c\"%s\\0A\\00\"\n";
      text += "@strspi = constant [3 x i8] c\"%d\\00\"\n";
      text += "@strspf = constant [3 x i8] c\"%f\\00\"\n";

      text += "@dogma_Heaven = constant [7 x i8] c\"Heaven\\00\"\n";
      text += "@dogma_Hell = constant [5 x i8] c\"Hell\\00\"\n";

      text += header_text + "\n";
      text += functions_text + "\n";
      text += "define i32 @main() {\n";
      text += main_text;
      text += "    ret i32 0\n";
      text += "}\n";
      return text;
   }
}