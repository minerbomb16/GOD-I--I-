declare i32 @printf(i8*, ...)
declare void @readInt(i32*)
declare void @readReal(double*)
declare void @readFloat(float*)
declare void @readString(i8*)
declare i32 @readDogma()
declare i32 @sprintf(i8*, i8*, ...)
declare i8* @strcpy(i8*, i8*)
declare i8* @strcat(i8*, i8*)
declare void @llvm.memcpy.p0i8.p0i8.i64(i8* noalias nocapture writeonly, i8* noalias nocapture readonly, i64, i1 immarg)
@strp = constant [4 x i8] c"%d\0A\00"
@strp_real = constant [4 x i8] c"%f\0A\00"
@strps = constant [4 x i8] c"%s\0A\00"
@strspi = constant [3 x i8] c"%d\00"
@strspf = constant [3 x i8] c"%f\00"
@dogma_Heaven = constant [7 x i8] c"Heaven\00"
@dogma_Hell = constant [5 x i8] c"Hell\00"
@str1 = constant [1 x i8] c"\00"
@str2 = constant [38 x i8] c"========= Mortal operations =========\00"
@str3 = constant [17 x i8] c"Value of Mortal:\00"
@str4 = constant [23 x i8] c"Value of Mortal * -2: \00"
@str7 = constant [37 x i8] c"Value of Mortal transformed into 0: \00"
@str10 = constant [1 x i8] c"\00"
@str11 = constant [38 x i8] c"========= Divine operations =========\00"
@str12 = constant [17 x i8] c"Value of Divine:\00"
@str13 = constant [25 x i8] c"Value of Divine * 3.14: \00"
@str16 = constant [40 x i8] c"Value of Divine transformed into 17.8: \00"
@str19 = constant [1 x i8] c"\00"
@str20 = constant [43 x i8] c"========= SmallDivine operations =========\00"
@str21 = constant [22 x i8] c"Value of SmallDivine:\00"
@str22 = constant [27 x i8] c"Value of SmallDivine * 2: \00"
@str25 = constant [44 x i8] c"Value of SmallDivine transformed into 1.0: \00"
@str28 = constant [1 x i8] c"\00"
@str29 = constant [39 x i8] c"========= Eternal operations =========\00"
@str30 = constant [18 x i8] c"Value of Eternal:\00"
@str32 = constant [6 x i8] c"holy \00"
@str34 = constant [29 x i8] c"Value of 'holy ' + Eternal: \00"
@str36 = constant [16 x i8] c" is a value of \00"
@str41 = constant [59 x i8] c"Value of Eternal transformed 3 + ' is a value of ' + 7.0: \00"
@str44 = constant [1 x i8] c"\00"
@str45 = constant [52 x i8] c"========= Divine + SmallDivine operations =========\00"
@str46 = constant [17 x i8] c"Value of Divine:\00"
@str47 = constant [23 x i8] c"Value of SmallDivine: \00"
@str48 = constant [32 x i8] c"Value of Divine + SmallDivine: \00"
@str51 = constant [32 x i8] c"Value of SmallDivine * Divine: \00"
@str54 = constant [1 x i8] c"\00"
@str55 = constant [37 x i8] c"========= Dogma operations =========\00"
@str56 = constant [16 x i8] c"Value of Dogma:\00"
@str57 = constant [25 x i8] c"Povided value of Dogma: \00"
@str59 = constant [27 x i8] c"Value of Heaven AND Hell: \00"
@str61 = constant [26 x i8] c"Value of Heaven OR Hell: \00"
@str63 = constant [27 x i8] c"Value of Heaven XOR Hell: \00"
@str65 = constant [22 x i8] c"Value of NEG Heaven: \00"
@str67 = constant [20 x i8] c"Value of NEG Hell: \00"
@str69 = constant [44 x i8] c"Value of Heaven AND Heaven AND NEG Heaven: \00"
@str71 = constant [1 x i8] c"\00"
@str72 = constant [37 x i8] c"========= Table operations =========\00"
@str73 = constant [15 x i8] c"Value by idx: \00"
@str76 = constant [20 x i8] c"Whole Mortal table:\00"
@str77 = constant [14 x i8] c"Table idx 0: \00"
@str80 = constant [18 x i8] c"Table idx 1 to 3:\00"
@str81 = constant [22 x i8] c"Table idx start to 2:\00"
@str82 = constant [20 x i8] c"Table idx 3 to end:\00"
@str83 = constant [20 x i8] c"Whole Divine table:\00"
@str84 = constant [25 x i8] c"Whole SmallDivine table:\00"
@str85 = constant [19 x i8] c"Whole Dogma table:\00"
@str86 = constant [1 x i8] c"\00"
@str87 = constant [38 x i8] c"========= Matrix operations =========\00"
@str88 = constant [31 x i8] c"Value of Mortal matrix[1][2]: \00"
@str91 = constant [21 x i8] c"Whole Mortal matrix:\00"
@str92 = constant [21 x i8] c"Mortal matrix row 0:\00"
@str93 = constant [21 x i8] c"Mortal matrix row 1:\00"
@str94 = constant [24 x i8] c"Mortal matrix column 2:\00"
@str95 = constant [45 x i8] c"Value of Mortal matrix[rowIndex][colIndex]: \00"
@str98 = constant [21 x i8] c"Whole Divine matrix:\00"
@str99 = constant [21 x i8] c"Divine matrix row 1:\00"
@str100 = constant [24 x i8] c"Divine matrix column 0:\00"
@str101 = constant [26 x i8] c"Whole SmallDivine matrix:\00"
@str102 = constant [26 x i8] c"SmallDivine matrix row 0:\00"
@str103 = constant [29 x i8] c"SmallDivine matrix column 1:\00"
@str104 = constant [1 x i8] c"\00"

define i32 @main() {
    %str1 = alloca [1 x i8]
    %1 = bitcast [1 x i8]* %str1 to i8*
    call void @llvm.memcpy.p0i8.p0i8.i64(i8* align 1 %1, i8* align 1 getelementptr inbounds ([1 x i8], [1 x i8]* @str1, i32 0, i32 0), i64 1, i1 false)
    %2 = getelementptr inbounds [1 x i8], [1 x i8]* %str1, i32 0, i32 0
    %3 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %2)
    %str2 = alloca [38 x i8]
    %4 = bitcast [38 x i8]* %str2 to i8*
    call void @llvm.memcpy.p0i8.p0i8.i64(i8* align 1 %4, i8* align 1 getelementptr inbounds ([38 x i8], [38 x i8]* @str2, i32 0, i32 0), i64 38, i1 false)
    %5 = getelementptr inbounds [38 x i8], [38 x i8]* %str2, i32 0, i32 0
    %6 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %5)
    %sin = alloca i32
    %str3 = alloca [17 x i8]
    %7 = bitcast [17 x i8]* %str3 to i8*
    call void @llvm.memcpy.p0i8.p0i8.i64(i8* align 1 %7, i8* align 1 getelementptr inbounds ([17 x i8], [17 x i8]* @str3, i32 0, i32 0), i64 17, i1 false)
    %8 = getelementptr inbounds [17 x i8], [17 x i8]* %str3, i32 0, i32 0
    %9 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %8)
    call void @readInt(i32* %sin)
    %10 = load i32, i32* %sin
    %11 = sub i32 0, 2
    %12 = mul i32 %10, %11
    %sin2 = alloca i32
    store i32 %12, i32* %sin2
    %str4 = alloca [23 x i8]
    %13 = bitcast [23 x i8]* %str4 to i8*
    call void @llvm.memcpy.p0i8.p0i8.i64(i8* align 1 %13, i8* align 1 getelementptr inbounds ([23 x i8], [23 x i8]* @str4, i32 0, i32 0), i64 23, i1 false)
    %14 = getelementptr inbounds [23 x i8], [23 x i8]* %str4, i32 0, i32 0
    %15 = load i32, i32* %sin2
    %str5 = alloca [17 x i8]
    %16 = getelementptr inbounds [17 x i8], [17 x i8]* %str5, i32 0, i32 0
    %17 = call i32 (i8*, i8*, ...) @sprintf(i8* %16, i8* getelementptr inbounds ([3 x i8], [3 x i8]* @strspi, i32 0, i32 0), i32 %15)
    %str6 = alloca [39 x i8]
    %18 = getelementptr inbounds [39 x i8], [39 x i8]* %str6, i32 0, i32 0
    %19 = call i8* @strcpy(i8* %18, i8* %14)
    %20 = call i8* @strcat(i8* %18, i8* %16)
    %21 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %18)
    store i32 0, i32* %sin2
    %str7 = alloca [37 x i8]
    %22 = bitcast [37 x i8]* %str7 to i8*
    call void @llvm.memcpy.p0i8.p0i8.i64(i8* align 1 %22, i8* align 1 getelementptr inbounds ([37 x i8], [37 x i8]* @str7, i32 0, i32 0), i64 37, i1 false)
    %23 = getelementptr inbounds [37 x i8], [37 x i8]* %str7, i32 0, i32 0
    %24 = load i32, i32* %sin2
    %str8 = alloca [17 x i8]
    %25 = getelementptr inbounds [17 x i8], [17 x i8]* %str8, i32 0, i32 0
    %26 = call i32 (i8*, i8*, ...) @sprintf(i8* %25, i8* getelementptr inbounds ([3 x i8], [3 x i8]* @strspi, i32 0, i32 0), i32 %24)
    %str9 = alloca [53 x i8]
    %27 = getelementptr inbounds [53 x i8], [53 x i8]* %str9, i32 0, i32 0
    %28 = call i8* @strcpy(i8* %27, i8* %23)
    %29 = call i8* @strcat(i8* %27, i8* %25)
    %30 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %27)
    %str10 = alloca [1 x i8]
    %31 = bitcast [1 x i8]* %str10 to i8*
    call void @llvm.memcpy.p0i8.p0i8.i64(i8* align 1 %31, i8* align 1 getelementptr inbounds ([1 x i8], [1 x i8]* @str10, i32 0, i32 0), i64 1, i1 false)
    %32 = getelementptr inbounds [1 x i8], [1 x i8]* %str10, i32 0, i32 0
    %33 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %32)
    %str11 = alloca [38 x i8]
    %34 = bitcast [38 x i8]* %str11 to i8*
    call void @llvm.memcpy.p0i8.p0i8.i64(i8* align 1 %34, i8* align 1 getelementptr inbounds ([38 x i8], [38 x i8]* @str11, i32 0, i32 0), i64 38, i1 false)
    %35 = getelementptr inbounds [38 x i8], [38 x i8]* %str11, i32 0, i32 0
    %36 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %35)
    %grace = alloca double
    %str12 = alloca [17 x i8]
    %37 = bitcast [17 x i8]* %str12 to i8*
    call void @llvm.memcpy.p0i8.p0i8.i64(i8* align 1 %37, i8* align 1 getelementptr inbounds ([17 x i8], [17 x i8]* @str12, i32 0, i32 0), i64 17, i1 false)
    %38 = getelementptr inbounds [17 x i8], [17 x i8]* %str12, i32 0, i32 0
    %39 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %38)
    call void @readReal(double* %grace)
    %40 = load double, double* %grace
    %41 = fmul double %40, 3.14
    %grace2 = alloca double
    store double %41, double* %grace2
    %str13 = alloca [25 x i8]
    %42 = bitcast [25 x i8]* %str13 to i8*
    call void @llvm.memcpy.p0i8.p0i8.i64(i8* align 1 %42, i8* align 1 getelementptr inbounds ([25 x i8], [25 x i8]* @str13, i32 0, i32 0), i64 25, i1 false)
    %43 = getelementptr inbounds [25 x i8], [25 x i8]* %str13, i32 0, i32 0
    %44 = load double, double* %grace2
    %str14 = alloca [33 x i8]
    %45 = getelementptr inbounds [33 x i8], [33 x i8]* %str14, i32 0, i32 0
    %46 = call i32 (i8*, i8*, ...) @sprintf(i8* %45, i8* getelementptr inbounds ([3 x i8], [3 x i8]* @strspf, i32 0, i32 0), double %44)
    %str15 = alloca [57 x i8]
    %47 = getelementptr inbounds [57 x i8], [57 x i8]* %str15, i32 0, i32 0
    %48 = call i8* @strcpy(i8* %47, i8* %43)
    %49 = call i8* @strcat(i8* %47, i8* %45)
    %50 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %47)
    %51 = fadd double 3.0, 1.0
    %52 = fmul double 4.2, %51
    %53 = fadd double 2.0, %52
    %54 = fdiv double 5.0, 5.0
    %55 = fsub double %53, %54
    store double %55, double* %grace2
    %str16 = alloca [40 x i8]
    %56 = bitcast [40 x i8]* %str16 to i8*
    call void @llvm.memcpy.p0i8.p0i8.i64(i8* align 1 %56, i8* align 1 getelementptr inbounds ([40 x i8], [40 x i8]* @str16, i32 0, i32 0), i64 40, i1 false)
    %57 = getelementptr inbounds [40 x i8], [40 x i8]* %str16, i32 0, i32 0
    %58 = load double, double* %grace2
    %str17 = alloca [33 x i8]
    %59 = getelementptr inbounds [33 x i8], [33 x i8]* %str17, i32 0, i32 0
    %60 = call i32 (i8*, i8*, ...) @sprintf(i8* %59, i8* getelementptr inbounds ([3 x i8], [3 x i8]* @strspf, i32 0, i32 0), double %58)
    %str18 = alloca [72 x i8]
    %61 = getelementptr inbounds [72 x i8], [72 x i8]* %str18, i32 0, i32 0
    %62 = call i8* @strcpy(i8* %61, i8* %57)
    %63 = call i8* @strcat(i8* %61, i8* %59)
    %64 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %61)
    %str19 = alloca [1 x i8]
    %65 = bitcast [1 x i8]* %str19 to i8*
    call void @llvm.memcpy.p0i8.p0i8.i64(i8* align 1 %65, i8* align 1 getelementptr inbounds ([1 x i8], [1 x i8]* @str19, i32 0, i32 0), i64 1, i1 false)
    %66 = getelementptr inbounds [1 x i8], [1 x i8]* %str19, i32 0, i32 0
    %67 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %66)
    %str20 = alloca [43 x i8]
    %68 = bitcast [43 x i8]* %str20 to i8*
    call void @llvm.memcpy.p0i8.p0i8.i64(i8* align 1 %68, i8* align 1 getelementptr inbounds ([43 x i8], [43 x i8]* @str20, i32 0, i32 0), i64 43, i1 false)
    %69 = getelementptr inbounds [43 x i8], [43 x i8]* %str20, i32 0, i32 0
    %70 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %69)
    %smallGrace = alloca float
    %str21 = alloca [22 x i8]
    %71 = bitcast [22 x i8]* %str21 to i8*
    call void @llvm.memcpy.p0i8.p0i8.i64(i8* align 1 %71, i8* align 1 getelementptr inbounds ([22 x i8], [22 x i8]* @str21, i32 0, i32 0), i64 22, i1 false)
    %72 = getelementptr inbounds [22 x i8], [22 x i8]* %str21, i32 0, i32 0
    %73 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %72)
    call void @readFloat(float* %smallGrace)
    %74 = load float, float* %smallGrace
    %75 = fpext float %74 to double
    %76 = fmul double %75, 2.0
    %77 = fptrunc double %76 to float
    %smallGrace2 = alloca float
    store float %77, float* %smallGrace2
    %str22 = alloca [27 x i8]
    %78 = bitcast [27 x i8]* %str22 to i8*
    call void @llvm.memcpy.p0i8.p0i8.i64(i8* align 1 %78, i8* align 1 getelementptr inbounds ([27 x i8], [27 x i8]* @str22, i32 0, i32 0), i64 27, i1 false)
    %79 = getelementptr inbounds [27 x i8], [27 x i8]* %str22, i32 0, i32 0
    %80 = load float, float* %smallGrace2
    %str23 = alloca [33 x i8]
    %81 = getelementptr inbounds [33 x i8], [33 x i8]* %str23, i32 0, i32 0
    %82 = fpext float %80 to double
    %83 = call i32 (i8*, i8*, ...) @sprintf(i8* %81, i8* getelementptr inbounds ([3 x i8], [3 x i8]* @strspf, i32 0, i32 0), double %82)
    %str24 = alloca [59 x i8]
    %84 = getelementptr inbounds [59 x i8], [59 x i8]* %str24, i32 0, i32 0
    %85 = call i8* @strcpy(i8* %84, i8* %79)
    %86 = call i8* @strcat(i8* %84, i8* %81)
    %87 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %84)
    %88 = fsub double 0.0, 1.0
    %89 = fadd double %88, 2.0
    %90 = fptrunc double %89 to float
    store float %90, float* %smallGrace2
    %str25 = alloca [44 x i8]
    %91 = bitcast [44 x i8]* %str25 to i8*
    call void @llvm.memcpy.p0i8.p0i8.i64(i8* align 1 %91, i8* align 1 getelementptr inbounds ([44 x i8], [44 x i8]* @str25, i32 0, i32 0), i64 44, i1 false)
    %92 = getelementptr inbounds [44 x i8], [44 x i8]* %str25, i32 0, i32 0
    %93 = load float, float* %smallGrace2
    %str26 = alloca [33 x i8]
    %94 = getelementptr inbounds [33 x i8], [33 x i8]* %str26, i32 0, i32 0
    %95 = fpext float %93 to double
    %96 = call i32 (i8*, i8*, ...) @sprintf(i8* %94, i8* getelementptr inbounds ([3 x i8], [3 x i8]* @strspf, i32 0, i32 0), double %95)
    %str27 = alloca [76 x i8]
    %97 = getelementptr inbounds [76 x i8], [76 x i8]* %str27, i32 0, i32 0
    %98 = call i8* @strcpy(i8* %97, i8* %92)
    %99 = call i8* @strcat(i8* %97, i8* %94)
    %100 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %97)
    %str28 = alloca [1 x i8]
    %101 = bitcast [1 x i8]* %str28 to i8*
    call void @llvm.memcpy.p0i8.p0i8.i64(i8* align 1 %101, i8* align 1 getelementptr inbounds ([1 x i8], [1 x i8]* @str28, i32 0, i32 0), i64 1, i1 false)
    %102 = getelementptr inbounds [1 x i8], [1 x i8]* %str28, i32 0, i32 0
    %103 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %102)
    %str29 = alloca [39 x i8]
    %104 = bitcast [39 x i8]* %str29 to i8*
    call void @llvm.memcpy.p0i8.p0i8.i64(i8* align 1 %104, i8* align 1 getelementptr inbounds ([39 x i8], [39 x i8]* @str29, i32 0, i32 0), i64 39, i1 false)
    %105 = getelementptr inbounds [39 x i8], [39 x i8]* %str29, i32 0, i32 0
    %106 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %105)
    %glory = alloca i8*
    %str30 = alloca [18 x i8]
    %107 = bitcast [18 x i8]* %str30 to i8*
    call void @llvm.memcpy.p0i8.p0i8.i64(i8* align 1 %107, i8* align 1 getelementptr inbounds ([18 x i8], [18 x i8]* @str30, i32 0, i32 0), i64 18, i1 false)
    %108 = getelementptr inbounds [18 x i8], [18 x i8]* %str30, i32 0, i32 0
    %109 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %108)
    %str31 = alloca [257 x i8]
    %110 = getelementptr inbounds [257 x i8], [257 x i8]* %str31, i32 0, i32 0
    store i8* %110, i8** %glory
    call void @readString(i8* %110)
    %str32 = alloca [6 x i8]
    %111 = bitcast [6 x i8]* %str32 to i8*
    call void @llvm.memcpy.p0i8.p0i8.i64(i8* align 1 %111, i8* align 1 getelementptr inbounds ([6 x i8], [6 x i8]* @str32, i32 0, i32 0), i64 6, i1 false)
    %112 = getelementptr inbounds [6 x i8], [6 x i8]* %str32, i32 0, i32 0
    %113 = load i8*, i8** %glory
    %str33 = alloca [262 x i8]
    %114 = getelementptr inbounds [262 x i8], [262 x i8]* %str33, i32 0, i32 0
    %115 = call i8* @strcpy(i8* %114, i8* %112)
    %116 = call i8* @strcat(i8* %114, i8* %113)
    %glory2 = alloca i8*
    store i8* %114, i8** %glory2
    %str34 = alloca [29 x i8]
    %117 = bitcast [29 x i8]* %str34 to i8*
    call void @llvm.memcpy.p0i8.p0i8.i64(i8* align 1 %117, i8* align 1 getelementptr inbounds ([29 x i8], [29 x i8]* @str34, i32 0, i32 0), i64 29, i1 false)
    %118 = getelementptr inbounds [29 x i8], [29 x i8]* %str34, i32 0, i32 0
    %119 = load i8*, i8** %glory2
    %str35 = alloca [290 x i8]
    %120 = getelementptr inbounds [290 x i8], [290 x i8]* %str35, i32 0, i32 0
    %121 = call i8* @strcpy(i8* %120, i8* %118)
    %122 = call i8* @strcat(i8* %120, i8* %119)
    %123 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %120)
    %str36 = alloca [16 x i8]
    %124 = bitcast [16 x i8]* %str36 to i8*
    call void @llvm.memcpy.p0i8.p0i8.i64(i8* align 1 %124, i8* align 1 getelementptr inbounds ([16 x i8], [16 x i8]* @str36, i32 0, i32 0), i64 16, i1 false)
    %125 = getelementptr inbounds [16 x i8], [16 x i8]* %str36, i32 0, i32 0
    %str37 = alloca [17 x i8]
    %126 = getelementptr inbounds [17 x i8], [17 x i8]* %str37, i32 0, i32 0
    %127 = call i32 (i8*, i8*, ...) @sprintf(i8* %126, i8* getelementptr inbounds ([3 x i8], [3 x i8]* @strspi, i32 0, i32 0), i32 3)
    %str38 = alloca [32 x i8]
    %128 = getelementptr inbounds [32 x i8], [32 x i8]* %str38, i32 0, i32 0
    %129 = call i8* @strcpy(i8* %128, i8* %126)
    %130 = call i8* @strcat(i8* %128, i8* %125)
    %str39 = alloca [33 x i8]
    %131 = getelementptr inbounds [33 x i8], [33 x i8]* %str39, i32 0, i32 0
    %132 = call i32 (i8*, i8*, ...) @sprintf(i8* %131, i8* getelementptr inbounds ([3 x i8], [3 x i8]* @strspf, i32 0, i32 0), double 7.0)
    %str40 = alloca [64 x i8]
    %133 = getelementptr inbounds [64 x i8], [64 x i8]* %str40, i32 0, i32 0
    %134 = call i8* @strcpy(i8* %133, i8* %128)
    %135 = call i8* @strcat(i8* %133, i8* %131)
    store i8* %133, i8** %glory2
    %str41 = alloca [59 x i8]
    %136 = bitcast [59 x i8]* %str41 to i8*
    call void @llvm.memcpy.p0i8.p0i8.i64(i8* align 1 %136, i8* align 1 getelementptr inbounds ([59 x i8], [59 x i8]* @str41, i32 0, i32 0), i64 59, i1 false)
    %137 = getelementptr inbounds [59 x i8], [59 x i8]* %str41, i32 0, i32 0
    %138 = load float, float* %smallGrace2
    %str42 = alloca [33 x i8]
    %139 = getelementptr inbounds [33 x i8], [33 x i8]* %str42, i32 0, i32 0
    %140 = fpext float %138 to double
    %141 = call i32 (i8*, i8*, ...) @sprintf(i8* %139, i8* getelementptr inbounds ([3 x i8], [3 x i8]* @strspf, i32 0, i32 0), double %140)
    %str43 = alloca [91 x i8]
    %142 = getelementptr inbounds [91 x i8], [91 x i8]* %str43, i32 0, i32 0
    %143 = call i8* @strcpy(i8* %142, i8* %137)
    %144 = call i8* @strcat(i8* %142, i8* %139)
    %145 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %142)
    %str44 = alloca [1 x i8]
    %146 = bitcast [1 x i8]* %str44 to i8*
    call void @llvm.memcpy.p0i8.p0i8.i64(i8* align 1 %146, i8* align 1 getelementptr inbounds ([1 x i8], [1 x i8]* @str44, i32 0, i32 0), i64 1, i1 false)
    %147 = getelementptr inbounds [1 x i8], [1 x i8]* %str44, i32 0, i32 0
    %148 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %147)
    %str45 = alloca [52 x i8]
    %149 = bitcast [52 x i8]* %str45 to i8*
    call void @llvm.memcpy.p0i8.p0i8.i64(i8* align 1 %149, i8* align 1 getelementptr inbounds ([52 x i8], [52 x i8]* @str45, i32 0, i32 0), i64 52, i1 false)
    %150 = getelementptr inbounds [52 x i8], [52 x i8]* %str45, i32 0, i32 0
    %151 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %150)
    %grace3 = alloca double
    %str46 = alloca [17 x i8]
    %152 = bitcast [17 x i8]* %str46 to i8*
    call void @llvm.memcpy.p0i8.p0i8.i64(i8* align 1 %152, i8* align 1 getelementptr inbounds ([17 x i8], [17 x i8]* @str46, i32 0, i32 0), i64 17, i1 false)
    %153 = getelementptr inbounds [17 x i8], [17 x i8]* %str46, i32 0, i32 0
    %154 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %153)
    call void @readReal(double* %grace3)
    %smallGrace3 = alloca float
    %str47 = alloca [23 x i8]
    %155 = bitcast [23 x i8]* %str47 to i8*
    call void @llvm.memcpy.p0i8.p0i8.i64(i8* align 1 %155, i8* align 1 getelementptr inbounds ([23 x i8], [23 x i8]* @str47, i32 0, i32 0), i64 23, i1 false)
    %156 = getelementptr inbounds [23 x i8], [23 x i8]* %str47, i32 0, i32 0
    %157 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %156)
    call void @readFloat(float* %smallGrace3)
    %158 = load double, double* %grace3
    %159 = load float, float* %smallGrace3
    %160 = fpext float %159 to double
    %161 = fadd double %158, %160
    %grace4 = alloca double
    store double %161, double* %grace4
    %str48 = alloca [32 x i8]
    %162 = bitcast [32 x i8]* %str48 to i8*
    call void @llvm.memcpy.p0i8.p0i8.i64(i8* align 1 %162, i8* align 1 getelementptr inbounds ([32 x i8], [32 x i8]* @str48, i32 0, i32 0), i64 32, i1 false)
    %163 = getelementptr inbounds [32 x i8], [32 x i8]* %str48, i32 0, i32 0
    %164 = load double, double* %grace4
    %str49 = alloca [33 x i8]
    %165 = getelementptr inbounds [33 x i8], [33 x i8]* %str49, i32 0, i32 0
    %166 = call i32 (i8*, i8*, ...) @sprintf(i8* %165, i8* getelementptr inbounds ([3 x i8], [3 x i8]* @strspf, i32 0, i32 0), double %164)
    %str50 = alloca [64 x i8]
    %167 = getelementptr inbounds [64 x i8], [64 x i8]* %str50, i32 0, i32 0
    %168 = call i8* @strcpy(i8* %167, i8* %163)
    %169 = call i8* @strcat(i8* %167, i8* %165)
    %170 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %167)
    %171 = load float, float* %smallGrace3
    %172 = load double, double* %grace3
    %173 = fpext float %171 to double
    %174 = fmul double %173, %172
    %175 = fptrunc double %174 to float
    %grace5 = alloca float
    store float %175, float* %grace5
    %str51 = alloca [32 x i8]
    %176 = bitcast [32 x i8]* %str51 to i8*
    call void @llvm.memcpy.p0i8.p0i8.i64(i8* align 1 %176, i8* align 1 getelementptr inbounds ([32 x i8], [32 x i8]* @str51, i32 0, i32 0), i64 32, i1 false)
    %177 = getelementptr inbounds [32 x i8], [32 x i8]* %str51, i32 0, i32 0
    %178 = load float, float* %grace5
    %str52 = alloca [33 x i8]
    %179 = getelementptr inbounds [33 x i8], [33 x i8]* %str52, i32 0, i32 0
    %180 = fpext float %178 to double
    %181 = call i32 (i8*, i8*, ...) @sprintf(i8* %179, i8* getelementptr inbounds ([3 x i8], [3 x i8]* @strspf, i32 0, i32 0), double %180)
    %str53 = alloca [64 x i8]
    %182 = getelementptr inbounds [64 x i8], [64 x i8]* %str53, i32 0, i32 0
    %183 = call i8* @strcpy(i8* %182, i8* %177)
    %184 = call i8* @strcat(i8* %182, i8* %179)
    %185 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %182)
    %str54 = alloca [1 x i8]
    %186 = bitcast [1 x i8]* %str54 to i8*
    call void @llvm.memcpy.p0i8.p0i8.i64(i8* align 1 %186, i8* align 1 getelementptr inbounds ([1 x i8], [1 x i8]* @str54, i32 0, i32 0), i64 1, i1 false)
    %187 = getelementptr inbounds [1 x i8], [1 x i8]* %str54, i32 0, i32 0
    %188 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %187)
    %str55 = alloca [37 x i8]
    %189 = bitcast [37 x i8]* %str55 to i8*
    call void @llvm.memcpy.p0i8.p0i8.i64(i8* align 1 %189, i8* align 1 getelementptr inbounds ([37 x i8], [37 x i8]* @str55, i32 0, i32 0), i64 37, i1 false)
    %190 = getelementptr inbounds [37 x i8], [37 x i8]* %str55, i32 0, i32 0
    %191 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %190)
    %dog = alloca i1
    %str56 = alloca [16 x i8]
    %192 = bitcast [16 x i8]* %str56 to i8*
    call void @llvm.memcpy.p0i8.p0i8.i64(i8* align 1 %192, i8* align 1 getelementptr inbounds ([16 x i8], [16 x i8]* @str56, i32 0, i32 0), i64 16, i1 false)
    %193 = getelementptr inbounds [16 x i8], [16 x i8]* %str56, i32 0, i32 0
    %194 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %193)
    %195 = call i32 @readDogma()
    %196 = icmp ne i32 %195, 0
    store i1 %196, i1* %dog
    %str57 = alloca [25 x i8]
    %197 = bitcast [25 x i8]* %str57 to i8*
    call void @llvm.memcpy.p0i8.p0i8.i64(i8* align 1 %197, i8* align 1 getelementptr inbounds ([25 x i8], [25 x i8]* @str57, i32 0, i32 0), i64 25, i1 false)
    %198 = getelementptr inbounds [25 x i8], [25 x i8]* %str57, i32 0, i32 0
    %199 = load i1, i1* %dog
    %200 = select i1 %199, i8* getelementptr inbounds ([7 x i8], [7 x i8]* @dogma_Heaven, i32 0, i32 0), i8* getelementptr inbounds ([5 x i8], [5 x i8]* @dogma_Hell, i32 0, i32 0)
    %str58 = alloca [31 x i8]
    %201 = getelementptr inbounds [31 x i8], [31 x i8]* %str58, i32 0, i32 0
    %202 = call i8* @strcpy(i8* %201, i8* %198)
    %203 = call i8* @strcat(i8* %201, i8* %200)
    %204 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %201)
    %dogT = alloca i1
    store i1 true, i1* %dogT
    %dogF = alloca i1
    store i1 false, i1* %dogF
    %205 = load i1, i1* %dogT
    br label %and_lhs_end_1
and_lhs_end_1:
    br i1 %205, label %and_rhs_1, label %and_end_1
and_rhs_1:
    %206 = load i1, i1* %dogF
    br label %and_rhs_end_1
and_rhs_end_1:
    br label %and_end_1
and_end_1:
    %207 = phi i1 [ false, %and_lhs_end_1 ], [ %206, %and_rhs_end_1 ]
    %andV = alloca i1
    store i1 %207, i1* %andV
    %str59 = alloca [27 x i8]
    %208 = bitcast [27 x i8]* %str59 to i8*
    call void @llvm.memcpy.p0i8.p0i8.i64(i8* align 1 %208, i8* align 1 getelementptr inbounds ([27 x i8], [27 x i8]* @str59, i32 0, i32 0), i64 27, i1 false)
    %209 = getelementptr inbounds [27 x i8], [27 x i8]* %str59, i32 0, i32 0
    %210 = load i1, i1* %andV
    %211 = select i1 %210, i8* getelementptr inbounds ([7 x i8], [7 x i8]* @dogma_Heaven, i32 0, i32 0), i8* getelementptr inbounds ([5 x i8], [5 x i8]* @dogma_Hell, i32 0, i32 0)
    %str60 = alloca [33 x i8]
    %212 = getelementptr inbounds [33 x i8], [33 x i8]* %str60, i32 0, i32 0
    %213 = call i8* @strcpy(i8* %212, i8* %209)
    %214 = call i8* @strcat(i8* %212, i8* %211)
    %215 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %212)
    %216 = load i1, i1* %dogT
    br label %or_lhs_end_2
or_lhs_end_2:
    br i1 %216, label %or_end_2, label %or_rhs_2
or_rhs_2:
    %217 = load i1, i1* %dogF
    br label %or_rhs_end_2
or_rhs_end_2:
    br label %or_end_2
or_end_2:
    %218 = phi i1 [ true, %or_lhs_end_2 ], [ %217, %or_rhs_end_2 ]
    %orV = alloca i1
    store i1 %218, i1* %orV
    %str61 = alloca [26 x i8]
    %219 = bitcast [26 x i8]* %str61 to i8*
    call void @llvm.memcpy.p0i8.p0i8.i64(i8* align 1 %219, i8* align 1 getelementptr inbounds ([26 x i8], [26 x i8]* @str61, i32 0, i32 0), i64 26, i1 false)
    %220 = getelementptr inbounds [26 x i8], [26 x i8]* %str61, i32 0, i32 0
    %221 = load i1, i1* %orV
    %222 = select i1 %221, i8* getelementptr inbounds ([7 x i8], [7 x i8]* @dogma_Heaven, i32 0, i32 0), i8* getelementptr inbounds ([5 x i8], [5 x i8]* @dogma_Hell, i32 0, i32 0)
    %str62 = alloca [32 x i8]
    %223 = getelementptr inbounds [32 x i8], [32 x i8]* %str62, i32 0, i32 0
    %224 = call i8* @strcpy(i8* %223, i8* %220)
    %225 = call i8* @strcat(i8* %223, i8* %222)
    %226 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %223)
    %227 = load i1, i1* %dogT
    %228 = load i1, i1* %dogF
    %229 = xor i1 %227, %228
    %xorV = alloca i1
    store i1 %229, i1* %xorV
    %str63 = alloca [27 x i8]
    %230 = bitcast [27 x i8]* %str63 to i8*
    call void @llvm.memcpy.p0i8.p0i8.i64(i8* align 1 %230, i8* align 1 getelementptr inbounds ([27 x i8], [27 x i8]* @str63, i32 0, i32 0), i64 27, i1 false)
    %231 = getelementptr inbounds [27 x i8], [27 x i8]* %str63, i32 0, i32 0
    %232 = load i1, i1* %xorV
    %233 = select i1 %232, i8* getelementptr inbounds ([7 x i8], [7 x i8]* @dogma_Heaven, i32 0, i32 0), i8* getelementptr inbounds ([5 x i8], [5 x i8]* @dogma_Hell, i32 0, i32 0)
    %str64 = alloca [33 x i8]
    %234 = getelementptr inbounds [33 x i8], [33 x i8]* %str64, i32 0, i32 0
    %235 = call i8* @strcpy(i8* %234, i8* %231)
    %236 = call i8* @strcat(i8* %234, i8* %233)
    %237 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %234)
    %238 = load i1, i1* %dogT
    %239 = xor i1 %238, true
    %negVT = alloca i1
    store i1 %239, i1* %negVT
    %str65 = alloca [22 x i8]
    %240 = bitcast [22 x i8]* %str65 to i8*
    call void @llvm.memcpy.p0i8.p0i8.i64(i8* align 1 %240, i8* align 1 getelementptr inbounds ([22 x i8], [22 x i8]* @str65, i32 0, i32 0), i64 22, i1 false)
    %241 = getelementptr inbounds [22 x i8], [22 x i8]* %str65, i32 0, i32 0
    %242 = load i1, i1* %negVT
    %243 = select i1 %242, i8* getelementptr inbounds ([7 x i8], [7 x i8]* @dogma_Heaven, i32 0, i32 0), i8* getelementptr inbounds ([5 x i8], [5 x i8]* @dogma_Hell, i32 0, i32 0)
    %str66 = alloca [28 x i8]
    %244 = getelementptr inbounds [28 x i8], [28 x i8]* %str66, i32 0, i32 0
    %245 = call i8* @strcpy(i8* %244, i8* %241)
    %246 = call i8* @strcat(i8* %244, i8* %243)
    %247 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %244)
    %248 = load i1, i1* %dogF
    %249 = xor i1 %248, true
    %negVF = alloca i1
    store i1 %249, i1* %negVF
    %str67 = alloca [20 x i8]
    %250 = bitcast [20 x i8]* %str67 to i8*
    call void @llvm.memcpy.p0i8.p0i8.i64(i8* align 1 %250, i8* align 1 getelementptr inbounds ([20 x i8], [20 x i8]* @str67, i32 0, i32 0), i64 20, i1 false)
    %251 = getelementptr inbounds [20 x i8], [20 x i8]* %str67, i32 0, i32 0
    %252 = load i1, i1* %negVF
    %253 = select i1 %252, i8* getelementptr inbounds ([7 x i8], [7 x i8]* @dogma_Heaven, i32 0, i32 0), i8* getelementptr inbounds ([5 x i8], [5 x i8]* @dogma_Hell, i32 0, i32 0)
    %str68 = alloca [26 x i8]
    %254 = getelementptr inbounds [26 x i8], [26 x i8]* %str68, i32 0, i32 0
    %255 = call i8* @strcpy(i8* %254, i8* %251)
    %256 = call i8* @strcat(i8* %254, i8* %253)
    %257 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %254)
    %258 = load i1, i1* %dogT
    br label %and_lhs_end_3
and_lhs_end_3:
    br i1 %258, label %and_rhs_3, label %and_end_3
and_rhs_3:
    %259 = load i1, i1* %dogT
    br label %and_rhs_end_3
and_rhs_end_3:
    br label %and_end_3
and_end_3:
    %260 = phi i1 [ false, %and_lhs_end_3 ], [ %259, %and_rhs_end_3 ]
    br label %and_lhs_end_4
and_lhs_end_4:
    br i1 %260, label %and_rhs_4, label %and_end_4
and_rhs_4:
    %261 = load i1, i1* %dogT
    %262 = xor i1 %261, true
    br label %and_rhs_end_4
and_rhs_end_4:
    br label %and_end_4
and_end_4:
    %263 = phi i1 [ false, %and_lhs_end_4 ], [ %262, %and_rhs_end_4 ]
    %multV = alloca i1
    store i1 %263, i1* %multV
    %str69 = alloca [44 x i8]
    %264 = bitcast [44 x i8]* %str69 to i8*
    call void @llvm.memcpy.p0i8.p0i8.i64(i8* align 1 %264, i8* align 1 getelementptr inbounds ([44 x i8], [44 x i8]* @str69, i32 0, i32 0), i64 44, i1 false)
    %265 = getelementptr inbounds [44 x i8], [44 x i8]* %str69, i32 0, i32 0
    %266 = load i1, i1* %multV
    %267 = select i1 %266, i8* getelementptr inbounds ([7 x i8], [7 x i8]* @dogma_Heaven, i32 0, i32 0), i8* getelementptr inbounds ([5 x i8], [5 x i8]* @dogma_Hell, i32 0, i32 0)
    %str70 = alloca [50 x i8]
    %268 = getelementptr inbounds [50 x i8], [50 x i8]* %str70, i32 0, i32 0
    %269 = call i8* @strcpy(i8* %268, i8* %265)
    %270 = call i8* @strcat(i8* %268, i8* %267)
    %271 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %268)
    %str71 = alloca [1 x i8]
    %272 = bitcast [1 x i8]* %str71 to i8*
    call void @llvm.memcpy.p0i8.p0i8.i64(i8* align 1 %272, i8* align 1 getelementptr inbounds ([1 x i8], [1 x i8]* @str71, i32 0, i32 0), i64 1, i1 false)
    %273 = getelementptr inbounds [1 x i8], [1 x i8]* %str71, i32 0, i32 0
    %274 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %273)
    %str72 = alloca [37 x i8]
    %275 = bitcast [37 x i8]* %str72 to i8*
    call void @llvm.memcpy.p0i8.p0i8.i64(i8* align 1 %275, i8* align 1 getelementptr inbounds ([37 x i8], [37 x i8]* @str72, i32 0, i32 0), i64 37, i1 false)
    %276 = getelementptr inbounds [37 x i8], [37 x i8]* %str72, i32 0, i32 0
    %277 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %276)
    %legion = alloca [5 x i32]
    store [5 x i32] zeroinitializer, [5 x i32]* %legion
    %278 = getelementptr inbounds [5 x i32], [5 x i32]* %legion, i32 0, i32 0
    store i32 10, i32* %278
    %279 = getelementptr inbounds [5 x i32], [5 x i32]* %legion, i32 0, i32 1
    store i32 20, i32* %279
    %index = alloca i32
    store i32 2, i32* %index
    %280 = load i32, i32* %index
    %281 = getelementptr inbounds [5 x i32], [5 x i32]* %legion, i32 0, i32 0
    %282 = load i32, i32* %281
    %283 = getelementptr inbounds [5 x i32], [5 x i32]* %legion, i32 0, i32 1
    %284 = load i32, i32* %283
    %285 = add i32 %282, %284
    %286 = getelementptr inbounds [5 x i32], [5 x i32]* %legion, i32 0, i32 %280
    store i32 %285, i32* %286
    %287 = getelementptr inbounds [5 x i32], [5 x i32]* %legion, i32 0, i32 3
    store i32 40, i32* %287
    %288 = getelementptr inbounds [5 x i32], [5 x i32]* %legion, i32 0, i32 4
    store i32 50, i32* %288
    %str73 = alloca [15 x i8]
    %289 = bitcast [15 x i8]* %str73 to i8*
    call void @llvm.memcpy.p0i8.p0i8.i64(i8* align 1 %289, i8* align 1 getelementptr inbounds ([15 x i8], [15 x i8]* @str73, i32 0, i32 0), i64 15, i1 false)
    %290 = getelementptr inbounds [15 x i8], [15 x i8]* %str73, i32 0, i32 0
    %291 = load i32, i32* %index
    %292 = getelementptr inbounds [5 x i32], [5 x i32]* %legion, i32 0, i32 %291
    %293 = load i32, i32* %292
    %str74 = alloca [17 x i8]
    %294 = getelementptr inbounds [17 x i8], [17 x i8]* %str74, i32 0, i32 0
    %295 = call i32 (i8*, i8*, ...) @sprintf(i8* %294, i8* getelementptr inbounds ([3 x i8], [3 x i8]* @strspi, i32 0, i32 0), i32 %293)
    %str75 = alloca [31 x i8]
    %296 = getelementptr inbounds [31 x i8], [31 x i8]* %str75, i32 0, i32 0
    %297 = call i8* @strcpy(i8* %296, i8* %290)
    %298 = call i8* @strcat(i8* %296, i8* %294)
    %299 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %296)
    %str76 = alloca [20 x i8]
    %300 = bitcast [20 x i8]* %str76 to i8*
    call void @llvm.memcpy.p0i8.p0i8.i64(i8* align 1 %300, i8* align 1 getelementptr inbounds ([20 x i8], [20 x i8]* @str76, i32 0, i32 0), i64 20, i1 false)
    %301 = getelementptr inbounds [20 x i8], [20 x i8]* %str76, i32 0, i32 0
    %302 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %301)
    %303 = getelementptr inbounds [5 x i32], [5 x i32]* %legion, i32 0, i32 0
    %304 = load i32, i32* %303
    %305 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strp, i32 0, i32 0), i32 %304)
    %306 = getelementptr inbounds [5 x i32], [5 x i32]* %legion, i32 0, i32 1
    %307 = load i32, i32* %306
    %308 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strp, i32 0, i32 0), i32 %307)
    %309 = getelementptr inbounds [5 x i32], [5 x i32]* %legion, i32 0, i32 2
    %310 = load i32, i32* %309
    %311 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strp, i32 0, i32 0), i32 %310)
    %312 = getelementptr inbounds [5 x i32], [5 x i32]* %legion, i32 0, i32 3
    %313 = load i32, i32* %312
    %314 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strp, i32 0, i32 0), i32 %313)
    %315 = getelementptr inbounds [5 x i32], [5 x i32]* %legion, i32 0, i32 4
    %316 = load i32, i32* %315
    %317 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strp, i32 0, i32 0), i32 %316)
    %str77 = alloca [14 x i8]
    %318 = bitcast [14 x i8]* %str77 to i8*
    call void @llvm.memcpy.p0i8.p0i8.i64(i8* align 1 %318, i8* align 1 getelementptr inbounds ([14 x i8], [14 x i8]* @str77, i32 0, i32 0), i64 14, i1 false)
    %319 = getelementptr inbounds [14 x i8], [14 x i8]* %str77, i32 0, i32 0
    %320 = getelementptr inbounds [5 x i32], [5 x i32]* %legion, i32 0, i32 0
    %321 = load i32, i32* %320
    %str78 = alloca [17 x i8]
    %322 = getelementptr inbounds [17 x i8], [17 x i8]* %str78, i32 0, i32 0
    %323 = call i32 (i8*, i8*, ...) @sprintf(i8* %322, i8* getelementptr inbounds ([3 x i8], [3 x i8]* @strspi, i32 0, i32 0), i32 %321)
    %str79 = alloca [30 x i8]
    %324 = getelementptr inbounds [30 x i8], [30 x i8]* %str79, i32 0, i32 0
    %325 = call i8* @strcpy(i8* %324, i8* %319)
    %326 = call i8* @strcat(i8* %324, i8* %322)
    %327 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %324)
    %str80 = alloca [18 x i8]
    %328 = bitcast [18 x i8]* %str80 to i8*
    call void @llvm.memcpy.p0i8.p0i8.i64(i8* align 1 %328, i8* align 1 getelementptr inbounds ([18 x i8], [18 x i8]* @str80, i32 0, i32 0), i64 18, i1 false)
    %329 = getelementptr inbounds [18 x i8], [18 x i8]* %str80, i32 0, i32 0
    %330 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %329)
    %331 = getelementptr inbounds [5 x i32], [5 x i32]* %legion, i32 0, i32 1
    %332 = load i32, i32* %331
    %333 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strp, i32 0, i32 0), i32 %332)
    %334 = getelementptr inbounds [5 x i32], [5 x i32]* %legion, i32 0, i32 2
    %335 = load i32, i32* %334
    %336 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strp, i32 0, i32 0), i32 %335)
    %337 = getelementptr inbounds [5 x i32], [5 x i32]* %legion, i32 0, i32 3
    %338 = load i32, i32* %337
    %339 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strp, i32 0, i32 0), i32 %338)
    %str81 = alloca [22 x i8]
    %340 = bitcast [22 x i8]* %str81 to i8*
    call void @llvm.memcpy.p0i8.p0i8.i64(i8* align 1 %340, i8* align 1 getelementptr inbounds ([22 x i8], [22 x i8]* @str81, i32 0, i32 0), i64 22, i1 false)
    %341 = getelementptr inbounds [22 x i8], [22 x i8]* %str81, i32 0, i32 0
    %342 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %341)
    %343 = getelementptr inbounds [5 x i32], [5 x i32]* %legion, i32 0, i32 0
    %344 = load i32, i32* %343
    %345 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strp, i32 0, i32 0), i32 %344)
    %346 = getelementptr inbounds [5 x i32], [5 x i32]* %legion, i32 0, i32 1
    %347 = load i32, i32* %346
    %348 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strp, i32 0, i32 0), i32 %347)
    %349 = getelementptr inbounds [5 x i32], [5 x i32]* %legion, i32 0, i32 2
    %350 = load i32, i32* %349
    %351 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strp, i32 0, i32 0), i32 %350)
    %str82 = alloca [20 x i8]
    %352 = bitcast [20 x i8]* %str82 to i8*
    call void @llvm.memcpy.p0i8.p0i8.i64(i8* align 1 %352, i8* align 1 getelementptr inbounds ([20 x i8], [20 x i8]* @str82, i32 0, i32 0), i64 20, i1 false)
    %353 = getelementptr inbounds [20 x i8], [20 x i8]* %str82, i32 0, i32 0
    %354 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %353)
    %355 = getelementptr inbounds [5 x i32], [5 x i32]* %legion, i32 0, i32 3
    %356 = load i32, i32* %355
    %357 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strp, i32 0, i32 0), i32 %356)
    %358 = getelementptr inbounds [5 x i32], [5 x i32]* %legion, i32 0, i32 4
    %359 = load i32, i32* %358
    %360 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strp, i32 0, i32 0), i32 %359)
    %legion2 = alloca [2 x double]
    store [2 x double] zeroinitializer, [2 x double]* %legion2
    %361 = getelementptr inbounds [2 x double], [2 x double]* %legion2, i32 0, i32 0
    store double 1.1, double* %361
    %str83 = alloca [20 x i8]
    %362 = bitcast [20 x i8]* %str83 to i8*
    call void @llvm.memcpy.p0i8.p0i8.i64(i8* align 1 %362, i8* align 1 getelementptr inbounds ([20 x i8], [20 x i8]* @str83, i32 0, i32 0), i64 20, i1 false)
    %363 = getelementptr inbounds [20 x i8], [20 x i8]* %str83, i32 0, i32 0
    %364 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %363)
    %365 = getelementptr inbounds [2 x double], [2 x double]* %legion2, i32 0, i32 0
    %366 = load double, double* %365
    %367 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strp_real, i32 0, i32 0), double %366)
    %368 = getelementptr inbounds [2 x double], [2 x double]* %legion2, i32 0, i32 1
    %369 = load double, double* %368
    %370 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strp_real, i32 0, i32 0), double %369)
    %legion3 = alloca [2 x float]
    store [2 x float] zeroinitializer, [2 x float]* %legion3
    %371 = fptrunc double 1.1 to float
    %372 = getelementptr inbounds [2 x float], [2 x float]* %legion3, i32 0, i32 0
    store float %371, float* %372
    %str84 = alloca [25 x i8]
    %373 = bitcast [25 x i8]* %str84 to i8*
    call void @llvm.memcpy.p0i8.p0i8.i64(i8* align 1 %373, i8* align 1 getelementptr inbounds ([25 x i8], [25 x i8]* @str84, i32 0, i32 0), i64 25, i1 false)
    %374 = getelementptr inbounds [25 x i8], [25 x i8]* %str84, i32 0, i32 0
    %375 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %374)
    %376 = getelementptr inbounds [2 x float], [2 x float]* %legion3, i32 0, i32 0
    %377 = load float, float* %376
    %378 = fpext float %377 to double
    %379 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strp_real, i32 0, i32 0), double %378)
    %380 = getelementptr inbounds [2 x float], [2 x float]* %legion3, i32 0, i32 1
    %381 = load float, float* %380
    %382 = fpext float %381 to double
    %383 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strp_real, i32 0, i32 0), double %382)
    %legion4 = alloca [2 x i1]
    store [2 x i1] zeroinitializer, [2 x i1]* %legion4
    %384 = getelementptr inbounds [2 x i1], [2 x i1]* %legion4, i32 0, i32 0
    store i1 true, i1* %384
    %str85 = alloca [19 x i8]
    %385 = bitcast [19 x i8]* %str85 to i8*
    call void @llvm.memcpy.p0i8.p0i8.i64(i8* align 1 %385, i8* align 1 getelementptr inbounds ([19 x i8], [19 x i8]* @str85, i32 0, i32 0), i64 19, i1 false)
    %386 = getelementptr inbounds [19 x i8], [19 x i8]* %str85, i32 0, i32 0
    %387 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %386)
    %388 = getelementptr inbounds [2 x i1], [2 x i1]* %legion4, i32 0, i32 0
    %389 = load i1, i1* %388
    %390 = select i1 %389, i8* getelementptr inbounds ([7 x i8], [7 x i8]* @dogma_Heaven, i32 0, i32 0), i8* getelementptr inbounds ([5 x i8], [5 x i8]* @dogma_Hell, i32 0, i32 0)
    %391 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %390)
    %392 = getelementptr inbounds [2 x i1], [2 x i1]* %legion4, i32 0, i32 1
    %393 = load i1, i1* %392
    %394 = select i1 %393, i8* getelementptr inbounds ([7 x i8], [7 x i8]* @dogma_Heaven, i32 0, i32 0), i8* getelementptr inbounds ([5 x i8], [5 x i8]* @dogma_Hell, i32 0, i32 0)
    %395 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %394)
    %str86 = alloca [1 x i8]
    %396 = bitcast [1 x i8]* %str86 to i8*
    call void @llvm.memcpy.p0i8.p0i8.i64(i8* align 1 %396, i8* align 1 getelementptr inbounds ([1 x i8], [1 x i8]* @str86, i32 0, i32 0), i64 1, i1 false)
    %397 = getelementptr inbounds [1 x i8], [1 x i8]* %str86, i32 0, i32 0
    %398 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %397)
    %str87 = alloca [38 x i8]
    %399 = bitcast [38 x i8]* %str87 to i8*
    call void @llvm.memcpy.p0i8.p0i8.i64(i8* align 1 %399, i8* align 1 getelementptr inbounds ([38 x i8], [38 x i8]* @str87, i32 0, i32 0), i64 38, i1 false)
    %400 = getelementptr inbounds [38 x i8], [38 x i8]* %str87, i32 0, i32 0
    %401 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %400)
    %matrix = alloca [3 x [4 x i32]]
    store [3 x [4 x i32]] zeroinitializer, [3 x [4 x i32]]* %matrix
    %402 = getelementptr inbounds [3 x [4 x i32]], [3 x [4 x i32]]* %matrix, i32 0, i32 0, i32 0
    store i32 10, i32* %402
    %403 = getelementptr inbounds [3 x [4 x i32]], [3 x [4 x i32]]* %matrix, i32 0, i32 0, i32 1
    store i32 20, i32* %403
    %404 = getelementptr inbounds [3 x [4 x i32]], [3 x [4 x i32]]* %matrix, i32 0, i32 0, i32 2
    store i32 30, i32* %404
    %405 = getelementptr inbounds [3 x [4 x i32]], [3 x [4 x i32]]* %matrix, i32 0, i32 0, i32 3
    store i32 40, i32* %405
    %406 = getelementptr inbounds [3 x [4 x i32]], [3 x [4 x i32]]* %matrix, i32 0, i32 1, i32 0
    store i32 50, i32* %406
    %407 = getelementptr inbounds [3 x [4 x i32]], [3 x [4 x i32]]* %matrix, i32 0, i32 1, i32 1
    store i32 60, i32* %407
    %408 = getelementptr inbounds [3 x [4 x i32]], [3 x [4 x i32]]* %matrix, i32 0, i32 1, i32 2
    store i32 70, i32* %408
    %409 = getelementptr inbounds [3 x [4 x i32]], [3 x [4 x i32]]* %matrix, i32 0, i32 1, i32 3
    store i32 80, i32* %409
    %410 = getelementptr inbounds [3 x [4 x i32]], [3 x [4 x i32]]* %matrix, i32 0, i32 2, i32 0
    store i32 90, i32* %410
    %411 = getelementptr inbounds [3 x [4 x i32]], [3 x [4 x i32]]* %matrix, i32 0, i32 2, i32 1
    store i32 100, i32* %411
    %412 = getelementptr inbounds [3 x [4 x i32]], [3 x [4 x i32]]* %matrix, i32 0, i32 2, i32 2
    store i32 110, i32* %412
    %413 = getelementptr inbounds [3 x [4 x i32]], [3 x [4 x i32]]* %matrix, i32 0, i32 2, i32 3
    store i32 120, i32* %413
    %str88 = alloca [31 x i8]
    %414 = bitcast [31 x i8]* %str88 to i8*
    call void @llvm.memcpy.p0i8.p0i8.i64(i8* align 1 %414, i8* align 1 getelementptr inbounds ([31 x i8], [31 x i8]* @str88, i32 0, i32 0), i64 31, i1 false)
    %415 = getelementptr inbounds [31 x i8], [31 x i8]* %str88, i32 0, i32 0
    %416 = getelementptr inbounds [3 x [4 x i32]], [3 x [4 x i32]]* %matrix, i32 0, i32 1, i32 2
    %417 = load i32, i32* %416
    %str89 = alloca [17 x i8]
    %418 = getelementptr inbounds [17 x i8], [17 x i8]* %str89, i32 0, i32 0
    %419 = call i32 (i8*, i8*, ...) @sprintf(i8* %418, i8* getelementptr inbounds ([3 x i8], [3 x i8]* @strspi, i32 0, i32 0), i32 %417)
    %str90 = alloca [47 x i8]
    %420 = getelementptr inbounds [47 x i8], [47 x i8]* %str90, i32 0, i32 0
    %421 = call i8* @strcpy(i8* %420, i8* %415)
    %422 = call i8* @strcat(i8* %420, i8* %418)
    %423 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %420)
    %str91 = alloca [21 x i8]
    %424 = bitcast [21 x i8]* %str91 to i8*
    call void @llvm.memcpy.p0i8.p0i8.i64(i8* align 1 %424, i8* align 1 getelementptr inbounds ([21 x i8], [21 x i8]* @str91, i32 0, i32 0), i64 21, i1 false)
    %425 = getelementptr inbounds [21 x i8], [21 x i8]* %str91, i32 0, i32 0
    %426 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %425)
    %427 = getelementptr inbounds [3 x [4 x i32]], [3 x [4 x i32]]* %matrix, i32 0, i32 0, i32 0
    %428 = load i32, i32* %427
    %429 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strp, i32 0, i32 0), i32 %428)
    %430 = getelementptr inbounds [3 x [4 x i32]], [3 x [4 x i32]]* %matrix, i32 0, i32 0, i32 1
    %431 = load i32, i32* %430
    %432 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strp, i32 0, i32 0), i32 %431)
    %433 = getelementptr inbounds [3 x [4 x i32]], [3 x [4 x i32]]* %matrix, i32 0, i32 0, i32 2
    %434 = load i32, i32* %433
    %435 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strp, i32 0, i32 0), i32 %434)
    %436 = getelementptr inbounds [3 x [4 x i32]], [3 x [4 x i32]]* %matrix, i32 0, i32 0, i32 3
    %437 = load i32, i32* %436
    %438 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strp, i32 0, i32 0), i32 %437)
    %439 = getelementptr inbounds [3 x [4 x i32]], [3 x [4 x i32]]* %matrix, i32 0, i32 1, i32 0
    %440 = load i32, i32* %439
    %441 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strp, i32 0, i32 0), i32 %440)
    %442 = getelementptr inbounds [3 x [4 x i32]], [3 x [4 x i32]]* %matrix, i32 0, i32 1, i32 1
    %443 = load i32, i32* %442
    %444 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strp, i32 0, i32 0), i32 %443)
    %445 = getelementptr inbounds [3 x [4 x i32]], [3 x [4 x i32]]* %matrix, i32 0, i32 1, i32 2
    %446 = load i32, i32* %445
    %447 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strp, i32 0, i32 0), i32 %446)
    %448 = getelementptr inbounds [3 x [4 x i32]], [3 x [4 x i32]]* %matrix, i32 0, i32 1, i32 3
    %449 = load i32, i32* %448
    %450 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strp, i32 0, i32 0), i32 %449)
    %451 = getelementptr inbounds [3 x [4 x i32]], [3 x [4 x i32]]* %matrix, i32 0, i32 2, i32 0
    %452 = load i32, i32* %451
    %453 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strp, i32 0, i32 0), i32 %452)
    %454 = getelementptr inbounds [3 x [4 x i32]], [3 x [4 x i32]]* %matrix, i32 0, i32 2, i32 1
    %455 = load i32, i32* %454
    %456 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strp, i32 0, i32 0), i32 %455)
    %457 = getelementptr inbounds [3 x [4 x i32]], [3 x [4 x i32]]* %matrix, i32 0, i32 2, i32 2
    %458 = load i32, i32* %457
    %459 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strp, i32 0, i32 0), i32 %458)
    %460 = getelementptr inbounds [3 x [4 x i32]], [3 x [4 x i32]]* %matrix, i32 0, i32 2, i32 3
    %461 = load i32, i32* %460
    %462 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strp, i32 0, i32 0), i32 %461)
    %str92 = alloca [21 x i8]
    %463 = bitcast [21 x i8]* %str92 to i8*
    call void @llvm.memcpy.p0i8.p0i8.i64(i8* align 1 %463, i8* align 1 getelementptr inbounds ([21 x i8], [21 x i8]* @str92, i32 0, i32 0), i64 21, i1 false)
    %464 = getelementptr inbounds [21 x i8], [21 x i8]* %str92, i32 0, i32 0
    %465 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %464)
    %466 = getelementptr inbounds [3 x [4 x i32]], [3 x [4 x i32]]* %matrix, i32 0, i32 0, i32 0
    %467 = load i32, i32* %466
    %468 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strp, i32 0, i32 0), i32 %467)
    %469 = getelementptr inbounds [3 x [4 x i32]], [3 x [4 x i32]]* %matrix, i32 0, i32 0, i32 1
    %470 = load i32, i32* %469
    %471 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strp, i32 0, i32 0), i32 %470)
    %472 = getelementptr inbounds [3 x [4 x i32]], [3 x [4 x i32]]* %matrix, i32 0, i32 0, i32 2
    %473 = load i32, i32* %472
    %474 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strp, i32 0, i32 0), i32 %473)
    %475 = getelementptr inbounds [3 x [4 x i32]], [3 x [4 x i32]]* %matrix, i32 0, i32 0, i32 3
    %476 = load i32, i32* %475
    %477 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strp, i32 0, i32 0), i32 %476)
    %str93 = alloca [21 x i8]
    %478 = bitcast [21 x i8]* %str93 to i8*
    call void @llvm.memcpy.p0i8.p0i8.i64(i8* align 1 %478, i8* align 1 getelementptr inbounds ([21 x i8], [21 x i8]* @str93, i32 0, i32 0), i64 21, i1 false)
    %479 = getelementptr inbounds [21 x i8], [21 x i8]* %str93, i32 0, i32 0
    %480 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %479)
    %481 = getelementptr inbounds [3 x [4 x i32]], [3 x [4 x i32]]* %matrix, i32 0, i32 1, i32 0
    %482 = load i32, i32* %481
    %483 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strp, i32 0, i32 0), i32 %482)
    %484 = getelementptr inbounds [3 x [4 x i32]], [3 x [4 x i32]]* %matrix, i32 0, i32 1, i32 1
    %485 = load i32, i32* %484
    %486 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strp, i32 0, i32 0), i32 %485)
    %487 = getelementptr inbounds [3 x [4 x i32]], [3 x [4 x i32]]* %matrix, i32 0, i32 1, i32 2
    %488 = load i32, i32* %487
    %489 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strp, i32 0, i32 0), i32 %488)
    %490 = getelementptr inbounds [3 x [4 x i32]], [3 x [4 x i32]]* %matrix, i32 0, i32 1, i32 3
    %491 = load i32, i32* %490
    %492 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strp, i32 0, i32 0), i32 %491)
    %str94 = alloca [24 x i8]
    %493 = bitcast [24 x i8]* %str94 to i8*
    call void @llvm.memcpy.p0i8.p0i8.i64(i8* align 1 %493, i8* align 1 getelementptr inbounds ([24 x i8], [24 x i8]* @str94, i32 0, i32 0), i64 24, i1 false)
    %494 = getelementptr inbounds [24 x i8], [24 x i8]* %str94, i32 0, i32 0
    %495 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %494)
    %496 = getelementptr inbounds [3 x [4 x i32]], [3 x [4 x i32]]* %matrix, i32 0, i32 0, i32 2
    %497 = load i32, i32* %496
    %498 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strp, i32 0, i32 0), i32 %497)
    %499 = getelementptr inbounds [3 x [4 x i32]], [3 x [4 x i32]]* %matrix, i32 0, i32 1, i32 2
    %500 = load i32, i32* %499
    %501 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strp, i32 0, i32 0), i32 %500)
    %502 = getelementptr inbounds [3 x [4 x i32]], [3 x [4 x i32]]* %matrix, i32 0, i32 2, i32 2
    %503 = load i32, i32* %502
    %504 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strp, i32 0, i32 0), i32 %503)
    %rowIndex = alloca i32
    store i32 2, i32* %rowIndex
    %colIndex = alloca i32
    store i32 3, i32* %colIndex
    %str95 = alloca [45 x i8]
    %505 = bitcast [45 x i8]* %str95 to i8*
    call void @llvm.memcpy.p0i8.p0i8.i64(i8* align 1 %505, i8* align 1 getelementptr inbounds ([45 x i8], [45 x i8]* @str95, i32 0, i32 0), i64 45, i1 false)
    %506 = getelementptr inbounds [45 x i8], [45 x i8]* %str95, i32 0, i32 0
    %507 = load i32, i32* %rowIndex
    %508 = load i32, i32* %colIndex
    %509 = getelementptr inbounds [3 x [4 x i32]], [3 x [4 x i32]]* %matrix, i32 0, i32 %507, i32 %508
    %510 = load i32, i32* %509
    %str96 = alloca [17 x i8]
    %511 = getelementptr inbounds [17 x i8], [17 x i8]* %str96, i32 0, i32 0
    %512 = call i32 (i8*, i8*, ...) @sprintf(i8* %511, i8* getelementptr inbounds ([3 x i8], [3 x i8]* @strspi, i32 0, i32 0), i32 %510)
    %str97 = alloca [61 x i8]
    %513 = getelementptr inbounds [61 x i8], [61 x i8]* %str97, i32 0, i32 0
    %514 = call i8* @strcpy(i8* %513, i8* %506)
    %515 = call i8* @strcat(i8* %513, i8* %511)
    %516 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %513)
    %divineMatrix = alloca [2 x [2 x double]]
    store [2 x [2 x double]] zeroinitializer, [2 x [2 x double]]* %divineMatrix
    %517 = getelementptr inbounds [2 x [2 x double]], [2 x [2 x double]]* %divineMatrix, i32 0, i32 0, i32 0
    store double 1.1, double* %517
    %518 = getelementptr inbounds [2 x [2 x double]], [2 x [2 x double]]* %divineMatrix, i32 0, i32 0, i32 1
    store double 2.2, double* %518
    %519 = getelementptr inbounds [2 x [2 x double]], [2 x [2 x double]]* %divineMatrix, i32 0, i32 1, i32 0
    store double 3.3, double* %519
    %520 = getelementptr inbounds [2 x [2 x double]], [2 x [2 x double]]* %divineMatrix, i32 0, i32 1, i32 1
    store double 4.4, double* %520
    %str98 = alloca [21 x i8]
    %521 = bitcast [21 x i8]* %str98 to i8*
    call void @llvm.memcpy.p0i8.p0i8.i64(i8* align 1 %521, i8* align 1 getelementptr inbounds ([21 x i8], [21 x i8]* @str98, i32 0, i32 0), i64 21, i1 false)
    %522 = getelementptr inbounds [21 x i8], [21 x i8]* %str98, i32 0, i32 0
    %523 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %522)
    %524 = getelementptr inbounds [2 x [2 x double]], [2 x [2 x double]]* %divineMatrix, i32 0, i32 0, i32 0
    %525 = load double, double* %524
    %526 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strp_real, i32 0, i32 0), double %525)
    %527 = getelementptr inbounds [2 x [2 x double]], [2 x [2 x double]]* %divineMatrix, i32 0, i32 0, i32 1
    %528 = load double, double* %527
    %529 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strp_real, i32 0, i32 0), double %528)
    %530 = getelementptr inbounds [2 x [2 x double]], [2 x [2 x double]]* %divineMatrix, i32 0, i32 1, i32 0
    %531 = load double, double* %530
    %532 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strp_real, i32 0, i32 0), double %531)
    %533 = getelementptr inbounds [2 x [2 x double]], [2 x [2 x double]]* %divineMatrix, i32 0, i32 1, i32 1
    %534 = load double, double* %533
    %535 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strp_real, i32 0, i32 0), double %534)
    %str99 = alloca [21 x i8]
    %536 = bitcast [21 x i8]* %str99 to i8*
    call void @llvm.memcpy.p0i8.p0i8.i64(i8* align 1 %536, i8* align 1 getelementptr inbounds ([21 x i8], [21 x i8]* @str99, i32 0, i32 0), i64 21, i1 false)
    %537 = getelementptr inbounds [21 x i8], [21 x i8]* %str99, i32 0, i32 0
    %538 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %537)
    %539 = getelementptr inbounds [2 x [2 x double]], [2 x [2 x double]]* %divineMatrix, i32 0, i32 1, i32 0
    %540 = load double, double* %539
    %541 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strp_real, i32 0, i32 0), double %540)
    %542 = getelementptr inbounds [2 x [2 x double]], [2 x [2 x double]]* %divineMatrix, i32 0, i32 1, i32 1
    %543 = load double, double* %542
    %544 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strp_real, i32 0, i32 0), double %543)
    %str100 = alloca [24 x i8]
    %545 = bitcast [24 x i8]* %str100 to i8*
    call void @llvm.memcpy.p0i8.p0i8.i64(i8* align 1 %545, i8* align 1 getelementptr inbounds ([24 x i8], [24 x i8]* @str100, i32 0, i32 0), i64 24, i1 false)
    %546 = getelementptr inbounds [24 x i8], [24 x i8]* %str100, i32 0, i32 0
    %547 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %546)
    %548 = getelementptr inbounds [2 x [2 x double]], [2 x [2 x double]]* %divineMatrix, i32 0, i32 0, i32 0
    %549 = load double, double* %548
    %550 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strp_real, i32 0, i32 0), double %549)
    %551 = getelementptr inbounds [2 x [2 x double]], [2 x [2 x double]]* %divineMatrix, i32 0, i32 1, i32 0
    %552 = load double, double* %551
    %553 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strp_real, i32 0, i32 0), double %552)
    %smallDivineMatrix = alloca [2 x [2 x float]]
    store [2 x [2 x float]] zeroinitializer, [2 x [2 x float]]* %smallDivineMatrix
    %554 = fptrunc double 5.5 to float
    %555 = getelementptr inbounds [2 x [2 x float]], [2 x [2 x float]]* %smallDivineMatrix, i32 0, i32 0, i32 0
    store float %554, float* %555
    %556 = fptrunc double 6.6 to float
    %557 = getelementptr inbounds [2 x [2 x float]], [2 x [2 x float]]* %smallDivineMatrix, i32 0, i32 0, i32 1
    store float %556, float* %557
    %558 = fptrunc double 7.7 to float
    %559 = getelementptr inbounds [2 x [2 x float]], [2 x [2 x float]]* %smallDivineMatrix, i32 0, i32 1, i32 0
    store float %558, float* %559
    %560 = fptrunc double 8.8 to float
    %561 = getelementptr inbounds [2 x [2 x float]], [2 x [2 x float]]* %smallDivineMatrix, i32 0, i32 1, i32 1
    store float %560, float* %561
    %str101 = alloca [26 x i8]
    %562 = bitcast [26 x i8]* %str101 to i8*
    call void @llvm.memcpy.p0i8.p0i8.i64(i8* align 1 %562, i8* align 1 getelementptr inbounds ([26 x i8], [26 x i8]* @str101, i32 0, i32 0), i64 26, i1 false)
    %563 = getelementptr inbounds [26 x i8], [26 x i8]* %str101, i32 0, i32 0
    %564 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %563)
    %565 = getelementptr inbounds [2 x [2 x float]], [2 x [2 x float]]* %smallDivineMatrix, i32 0, i32 0, i32 0
    %566 = load float, float* %565
    %567 = fpext float %566 to double
    %568 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strp_real, i32 0, i32 0), double %567)
    %569 = getelementptr inbounds [2 x [2 x float]], [2 x [2 x float]]* %smallDivineMatrix, i32 0, i32 0, i32 1
    %570 = load float, float* %569
    %571 = fpext float %570 to double
    %572 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strp_real, i32 0, i32 0), double %571)
    %573 = getelementptr inbounds [2 x [2 x float]], [2 x [2 x float]]* %smallDivineMatrix, i32 0, i32 1, i32 0
    %574 = load float, float* %573
    %575 = fpext float %574 to double
    %576 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strp_real, i32 0, i32 0), double %575)
    %577 = getelementptr inbounds [2 x [2 x float]], [2 x [2 x float]]* %smallDivineMatrix, i32 0, i32 1, i32 1
    %578 = load float, float* %577
    %579 = fpext float %578 to double
    %580 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strp_real, i32 0, i32 0), double %579)
    %str102 = alloca [26 x i8]
    %581 = bitcast [26 x i8]* %str102 to i8*
    call void @llvm.memcpy.p0i8.p0i8.i64(i8* align 1 %581, i8* align 1 getelementptr inbounds ([26 x i8], [26 x i8]* @str102, i32 0, i32 0), i64 26, i1 false)
    %582 = getelementptr inbounds [26 x i8], [26 x i8]* %str102, i32 0, i32 0
    %583 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %582)
    %584 = getelementptr inbounds [2 x [2 x float]], [2 x [2 x float]]* %smallDivineMatrix, i32 0, i32 0, i32 0
    %585 = load float, float* %584
    %586 = fpext float %585 to double
    %587 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strp_real, i32 0, i32 0), double %586)
    %588 = getelementptr inbounds [2 x [2 x float]], [2 x [2 x float]]* %smallDivineMatrix, i32 0, i32 0, i32 1
    %589 = load float, float* %588
    %590 = fpext float %589 to double
    %591 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strp_real, i32 0, i32 0), double %590)
    %str103 = alloca [29 x i8]
    %592 = bitcast [29 x i8]* %str103 to i8*
    call void @llvm.memcpy.p0i8.p0i8.i64(i8* align 1 %592, i8* align 1 getelementptr inbounds ([29 x i8], [29 x i8]* @str103, i32 0, i32 0), i64 29, i1 false)
    %593 = getelementptr inbounds [29 x i8], [29 x i8]* %str103, i32 0, i32 0
    %594 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %593)
    %595 = getelementptr inbounds [2 x [2 x float]], [2 x [2 x float]]* %smallDivineMatrix, i32 0, i32 0, i32 1
    %596 = load float, float* %595
    %597 = fpext float %596 to double
    %598 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strp_real, i32 0, i32 0), double %597)
    %599 = getelementptr inbounds [2 x [2 x float]], [2 x [2 x float]]* %smallDivineMatrix, i32 0, i32 1, i32 1
    %600 = load float, float* %599
    %601 = fpext float %600 to double
    %602 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strp_real, i32 0, i32 0), double %601)
    %str104 = alloca [1 x i8]
    %603 = bitcast [1 x i8]* %str104 to i8*
    call void @llvm.memcpy.p0i8.p0i8.i64(i8* align 1 %603, i8* align 1 getelementptr inbounds ([1 x i8], [1 x i8]* @str104, i32 0, i32 0), i64 1, i1 false)
    %604 = getelementptr inbounds [1 x i8], [1 x i8]* %str104, i32 0, i32 0
    %605 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %604)
    ret i32 0
}

