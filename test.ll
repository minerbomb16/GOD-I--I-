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
    %10 = sub i32 2, 2
    %sin2 = alloca i32
    store i32 %10, i32* %sin2
    %str4 = alloca [23 x i8]
    %11 = bitcast [23 x i8]* %str4 to i8*
    call void @llvm.memcpy.p0i8.p0i8.i64(i8* align 1 %11, i8* align 1 getelementptr inbounds ([23 x i8], [23 x i8]* @str4, i32 0, i32 0), i64 23, i1 false)
    %12 = getelementptr inbounds [23 x i8], [23 x i8]* %str4, i32 0, i32 0
    %13 = load i32, i32* %sin2
    %str5 = alloca [17 x i8]
    %14 = getelementptr inbounds [17 x i8], [17 x i8]* %str5, i32 0, i32 0
    %15 = call i32 (i8*, i8*, ...) @sprintf(i8* %14, i8* getelementptr inbounds ([3 x i8], [3 x i8]* @strspi, i32 0, i32 0), i32 %13)
    %str6 = alloca [39 x i8]
    %16 = getelementptr inbounds [39 x i8], [39 x i8]* %str6, i32 0, i32 0
    %17 = call i8* @strcpy(i8* %16, i8* %12)
    %18 = call i8* @strcat(i8* %16, i8* %14)
    %19 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %16)
    store i32 0, i32* %sin2
    %str7 = alloca [37 x i8]
    %20 = bitcast [37 x i8]* %str7 to i8*
    call void @llvm.memcpy.p0i8.p0i8.i64(i8* align 1 %20, i8* align 1 getelementptr inbounds ([37 x i8], [37 x i8]* @str7, i32 0, i32 0), i64 37, i1 false)
    %21 = getelementptr inbounds [37 x i8], [37 x i8]* %str7, i32 0, i32 0
    %22 = load i32, i32* %sin2
    %str8 = alloca [17 x i8]
    %23 = getelementptr inbounds [17 x i8], [17 x i8]* %str8, i32 0, i32 0
    %24 = call i32 (i8*, i8*, ...) @sprintf(i8* %23, i8* getelementptr inbounds ([3 x i8], [3 x i8]* @strspi, i32 0, i32 0), i32 %22)
    %str9 = alloca [53 x i8]
    %25 = getelementptr inbounds [53 x i8], [53 x i8]* %str9, i32 0, i32 0
    %26 = call i8* @strcpy(i8* %25, i8* %21)
    %27 = call i8* @strcat(i8* %25, i8* %23)
    %28 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %25)
    %str10 = alloca [1 x i8]
    %29 = bitcast [1 x i8]* %str10 to i8*
    call void @llvm.memcpy.p0i8.p0i8.i64(i8* align 1 %29, i8* align 1 getelementptr inbounds ([1 x i8], [1 x i8]* @str10, i32 0, i32 0), i64 1, i1 false)
    %30 = getelementptr inbounds [1 x i8], [1 x i8]* %str10, i32 0, i32 0
    %31 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %30)
    %str11 = alloca [38 x i8]
    %32 = bitcast [38 x i8]* %str11 to i8*
    call void @llvm.memcpy.p0i8.p0i8.i64(i8* align 1 %32, i8* align 1 getelementptr inbounds ([38 x i8], [38 x i8]* @str11, i32 0, i32 0), i64 38, i1 false)
    %33 = getelementptr inbounds [38 x i8], [38 x i8]* %str11, i32 0, i32 0
    %34 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %33)
    %grace = alloca double
    %str12 = alloca [17 x i8]
    %35 = bitcast [17 x i8]* %str12 to i8*
    call void @llvm.memcpy.p0i8.p0i8.i64(i8* align 1 %35, i8* align 1 getelementptr inbounds ([17 x i8], [17 x i8]* @str12, i32 0, i32 0), i64 17, i1 false)
    %36 = getelementptr inbounds [17 x i8], [17 x i8]* %str12, i32 0, i32 0
    %37 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %36)
    call void @readReal(double* %grace)
    %38 = load double, double* %grace
    %39 = fmul double %38, 3.14
    %grace2 = alloca double
    store double %39, double* %grace2
    %str13 = alloca [25 x i8]
    %40 = bitcast [25 x i8]* %str13 to i8*
    call void @llvm.memcpy.p0i8.p0i8.i64(i8* align 1 %40, i8* align 1 getelementptr inbounds ([25 x i8], [25 x i8]* @str13, i32 0, i32 0), i64 25, i1 false)
    %41 = getelementptr inbounds [25 x i8], [25 x i8]* %str13, i32 0, i32 0
    %42 = load double, double* %grace2
    %str14 = alloca [33 x i8]
    %43 = getelementptr inbounds [33 x i8], [33 x i8]* %str14, i32 0, i32 0
    %44 = call i32 (i8*, i8*, ...) @sprintf(i8* %43, i8* getelementptr inbounds ([3 x i8], [3 x i8]* @strspf, i32 0, i32 0), double %42)
    %str15 = alloca [57 x i8]
    %45 = getelementptr inbounds [57 x i8], [57 x i8]* %str15, i32 0, i32 0
    %46 = call i8* @strcpy(i8* %45, i8* %41)
    %47 = call i8* @strcat(i8* %45, i8* %43)
    %48 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %45)
    %49 = fadd double 3.0, 1.0
    %50 = fmul double 4.2, %49
    %51 = fadd double 2.0, %50
    %52 = fdiv double 5.0, 5.0
    %53 = fsub double %51, %52
    store double %53, double* %grace2
    %str16 = alloca [40 x i8]
    %54 = bitcast [40 x i8]* %str16 to i8*
    call void @llvm.memcpy.p0i8.p0i8.i64(i8* align 1 %54, i8* align 1 getelementptr inbounds ([40 x i8], [40 x i8]* @str16, i32 0, i32 0), i64 40, i1 false)
    %55 = getelementptr inbounds [40 x i8], [40 x i8]* %str16, i32 0, i32 0
    %56 = load double, double* %grace2
    %str17 = alloca [33 x i8]
    %57 = getelementptr inbounds [33 x i8], [33 x i8]* %str17, i32 0, i32 0
    %58 = call i32 (i8*, i8*, ...) @sprintf(i8* %57, i8* getelementptr inbounds ([3 x i8], [3 x i8]* @strspf, i32 0, i32 0), double %56)
    %str18 = alloca [72 x i8]
    %59 = getelementptr inbounds [72 x i8], [72 x i8]* %str18, i32 0, i32 0
    %60 = call i8* @strcpy(i8* %59, i8* %55)
    %61 = call i8* @strcat(i8* %59, i8* %57)
    %62 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %59)
    %str19 = alloca [1 x i8]
    %63 = bitcast [1 x i8]* %str19 to i8*
    call void @llvm.memcpy.p0i8.p0i8.i64(i8* align 1 %63, i8* align 1 getelementptr inbounds ([1 x i8], [1 x i8]* @str19, i32 0, i32 0), i64 1, i1 false)
    %64 = getelementptr inbounds [1 x i8], [1 x i8]* %str19, i32 0, i32 0
    %65 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %64)
    %str20 = alloca [43 x i8]
    %66 = bitcast [43 x i8]* %str20 to i8*
    call void @llvm.memcpy.p0i8.p0i8.i64(i8* align 1 %66, i8* align 1 getelementptr inbounds ([43 x i8], [43 x i8]* @str20, i32 0, i32 0), i64 43, i1 false)
    %67 = getelementptr inbounds [43 x i8], [43 x i8]* %str20, i32 0, i32 0
    %68 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %67)
    %smallGrace = alloca float
    %str21 = alloca [22 x i8]
    %69 = bitcast [22 x i8]* %str21 to i8*
    call void @llvm.memcpy.p0i8.p0i8.i64(i8* align 1 %69, i8* align 1 getelementptr inbounds ([22 x i8], [22 x i8]* @str21, i32 0, i32 0), i64 22, i1 false)
    %70 = getelementptr inbounds [22 x i8], [22 x i8]* %str21, i32 0, i32 0
    %71 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %70)
    call void @readFloat(float* %smallGrace)
    %72 = load float, float* %smallGrace
    %73 = fpext float %72 to double
    %74 = fmul double %73, 2.0
    %75 = fptrunc double %74 to float
    %smallGrace2 = alloca float
    store float %75, float* %smallGrace2
    %str22 = alloca [27 x i8]
    %76 = bitcast [27 x i8]* %str22 to i8*
    call void @llvm.memcpy.p0i8.p0i8.i64(i8* align 1 %76, i8* align 1 getelementptr inbounds ([27 x i8], [27 x i8]* @str22, i32 0, i32 0), i64 27, i1 false)
    %77 = getelementptr inbounds [27 x i8], [27 x i8]* %str22, i32 0, i32 0
    %78 = load float, float* %smallGrace2
    %str23 = alloca [33 x i8]
    %79 = getelementptr inbounds [33 x i8], [33 x i8]* %str23, i32 0, i32 0
    %80 = fpext float %78 to double
    %81 = call i32 (i8*, i8*, ...) @sprintf(i8* %79, i8* getelementptr inbounds ([3 x i8], [3 x i8]* @strspf, i32 0, i32 0), double %80)
    %str24 = alloca [59 x i8]
    %82 = getelementptr inbounds [59 x i8], [59 x i8]* %str24, i32 0, i32 0
    %83 = call i8* @strcpy(i8* %82, i8* %77)
    %84 = call i8* @strcat(i8* %82, i8* %79)
    %85 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %82)
    %86 = fsub double 0.0, 1.0
    %87 = fadd double %86, 2.0
    %88 = fptrunc double %87 to float
    store float %88, float* %smallGrace2
    %str25 = alloca [44 x i8]
    %89 = bitcast [44 x i8]* %str25 to i8*
    call void @llvm.memcpy.p0i8.p0i8.i64(i8* align 1 %89, i8* align 1 getelementptr inbounds ([44 x i8], [44 x i8]* @str25, i32 0, i32 0), i64 44, i1 false)
    %90 = getelementptr inbounds [44 x i8], [44 x i8]* %str25, i32 0, i32 0
    %91 = load float, float* %smallGrace2
    %str26 = alloca [33 x i8]
    %92 = getelementptr inbounds [33 x i8], [33 x i8]* %str26, i32 0, i32 0
    %93 = fpext float %91 to double
    %94 = call i32 (i8*, i8*, ...) @sprintf(i8* %92, i8* getelementptr inbounds ([3 x i8], [3 x i8]* @strspf, i32 0, i32 0), double %93)
    %str27 = alloca [76 x i8]
    %95 = getelementptr inbounds [76 x i8], [76 x i8]* %str27, i32 0, i32 0
    %96 = call i8* @strcpy(i8* %95, i8* %90)
    %97 = call i8* @strcat(i8* %95, i8* %92)
    %98 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %95)
    %str28 = alloca [1 x i8]
    %99 = bitcast [1 x i8]* %str28 to i8*
    call void @llvm.memcpy.p0i8.p0i8.i64(i8* align 1 %99, i8* align 1 getelementptr inbounds ([1 x i8], [1 x i8]* @str28, i32 0, i32 0), i64 1, i1 false)
    %100 = getelementptr inbounds [1 x i8], [1 x i8]* %str28, i32 0, i32 0
    %101 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %100)
    %str29 = alloca [39 x i8]
    %102 = bitcast [39 x i8]* %str29 to i8*
    call void @llvm.memcpy.p0i8.p0i8.i64(i8* align 1 %102, i8* align 1 getelementptr inbounds ([39 x i8], [39 x i8]* @str29, i32 0, i32 0), i64 39, i1 false)
    %103 = getelementptr inbounds [39 x i8], [39 x i8]* %str29, i32 0, i32 0
    %104 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %103)
    %glory = alloca i8*
    %str30 = alloca [18 x i8]
    %105 = bitcast [18 x i8]* %str30 to i8*
    call void @llvm.memcpy.p0i8.p0i8.i64(i8* align 1 %105, i8* align 1 getelementptr inbounds ([18 x i8], [18 x i8]* @str30, i32 0, i32 0), i64 18, i1 false)
    %106 = getelementptr inbounds [18 x i8], [18 x i8]* %str30, i32 0, i32 0
    %107 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %106)
    %str31 = alloca [257 x i8]
    %108 = getelementptr inbounds [257 x i8], [257 x i8]* %str31, i32 0, i32 0
    store i8* %108, i8** %glory
    call void @readString(i8* %108)
    %str32 = alloca [6 x i8]
    %109 = bitcast [6 x i8]* %str32 to i8*
    call void @llvm.memcpy.p0i8.p0i8.i64(i8* align 1 %109, i8* align 1 getelementptr inbounds ([6 x i8], [6 x i8]* @str32, i32 0, i32 0), i64 6, i1 false)
    %110 = getelementptr inbounds [6 x i8], [6 x i8]* %str32, i32 0, i32 0
    %111 = load i8*, i8** %glory
    %str33 = alloca [262 x i8]
    %112 = getelementptr inbounds [262 x i8], [262 x i8]* %str33, i32 0, i32 0
    %113 = call i8* @strcpy(i8* %112, i8* %110)
    %114 = call i8* @strcat(i8* %112, i8* %111)
    %glory2 = alloca i8*
    store i8* %112, i8** %glory2
    %str34 = alloca [29 x i8]
    %115 = bitcast [29 x i8]* %str34 to i8*
    call void @llvm.memcpy.p0i8.p0i8.i64(i8* align 1 %115, i8* align 1 getelementptr inbounds ([29 x i8], [29 x i8]* @str34, i32 0, i32 0), i64 29, i1 false)
    %116 = getelementptr inbounds [29 x i8], [29 x i8]* %str34, i32 0, i32 0
    %117 = load i8*, i8** %glory2
    %str35 = alloca [290 x i8]
    %118 = getelementptr inbounds [290 x i8], [290 x i8]* %str35, i32 0, i32 0
    %119 = call i8* @strcpy(i8* %118, i8* %116)
    %120 = call i8* @strcat(i8* %118, i8* %117)
    %121 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %118)
    %str36 = alloca [16 x i8]
    %122 = bitcast [16 x i8]* %str36 to i8*
    call void @llvm.memcpy.p0i8.p0i8.i64(i8* align 1 %122, i8* align 1 getelementptr inbounds ([16 x i8], [16 x i8]* @str36, i32 0, i32 0), i64 16, i1 false)
    %123 = getelementptr inbounds [16 x i8], [16 x i8]* %str36, i32 0, i32 0
    %str37 = alloca [17 x i8]
    %124 = getelementptr inbounds [17 x i8], [17 x i8]* %str37, i32 0, i32 0
    %125 = call i32 (i8*, i8*, ...) @sprintf(i8* %124, i8* getelementptr inbounds ([3 x i8], [3 x i8]* @strspi, i32 0, i32 0), i32 3)
    %str38 = alloca [32 x i8]
    %126 = getelementptr inbounds [32 x i8], [32 x i8]* %str38, i32 0, i32 0
    %127 = call i8* @strcpy(i8* %126, i8* %124)
    %128 = call i8* @strcat(i8* %126, i8* %123)
    %str39 = alloca [33 x i8]
    %129 = getelementptr inbounds [33 x i8], [33 x i8]* %str39, i32 0, i32 0
    %130 = call i32 (i8*, i8*, ...) @sprintf(i8* %129, i8* getelementptr inbounds ([3 x i8], [3 x i8]* @strspf, i32 0, i32 0), double 7.0)
    %str40 = alloca [64 x i8]
    %131 = getelementptr inbounds [64 x i8], [64 x i8]* %str40, i32 0, i32 0
    %132 = call i8* @strcpy(i8* %131, i8* %126)
    %133 = call i8* @strcat(i8* %131, i8* %129)
    store i8* %131, i8** %glory2
    %str41 = alloca [59 x i8]
    %134 = bitcast [59 x i8]* %str41 to i8*
    call void @llvm.memcpy.p0i8.p0i8.i64(i8* align 1 %134, i8* align 1 getelementptr inbounds ([59 x i8], [59 x i8]* @str41, i32 0, i32 0), i64 59, i1 false)
    %135 = getelementptr inbounds [59 x i8], [59 x i8]* %str41, i32 0, i32 0
    %136 = load float, float* %smallGrace2
    %str42 = alloca [33 x i8]
    %137 = getelementptr inbounds [33 x i8], [33 x i8]* %str42, i32 0, i32 0
    %138 = fpext float %136 to double
    %139 = call i32 (i8*, i8*, ...) @sprintf(i8* %137, i8* getelementptr inbounds ([3 x i8], [3 x i8]* @strspf, i32 0, i32 0), double %138)
    %str43 = alloca [91 x i8]
    %140 = getelementptr inbounds [91 x i8], [91 x i8]* %str43, i32 0, i32 0
    %141 = call i8* @strcpy(i8* %140, i8* %135)
    %142 = call i8* @strcat(i8* %140, i8* %137)
    %143 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %140)
    %str44 = alloca [1 x i8]
    %144 = bitcast [1 x i8]* %str44 to i8*
    call void @llvm.memcpy.p0i8.p0i8.i64(i8* align 1 %144, i8* align 1 getelementptr inbounds ([1 x i8], [1 x i8]* @str44, i32 0, i32 0), i64 1, i1 false)
    %145 = getelementptr inbounds [1 x i8], [1 x i8]* %str44, i32 0, i32 0
    %146 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %145)
    %str45 = alloca [52 x i8]
    %147 = bitcast [52 x i8]* %str45 to i8*
    call void @llvm.memcpy.p0i8.p0i8.i64(i8* align 1 %147, i8* align 1 getelementptr inbounds ([52 x i8], [52 x i8]* @str45, i32 0, i32 0), i64 52, i1 false)
    %148 = getelementptr inbounds [52 x i8], [52 x i8]* %str45, i32 0, i32 0
    %149 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %148)
    %grace3 = alloca double
    %str46 = alloca [17 x i8]
    %150 = bitcast [17 x i8]* %str46 to i8*
    call void @llvm.memcpy.p0i8.p0i8.i64(i8* align 1 %150, i8* align 1 getelementptr inbounds ([17 x i8], [17 x i8]* @str46, i32 0, i32 0), i64 17, i1 false)
    %151 = getelementptr inbounds [17 x i8], [17 x i8]* %str46, i32 0, i32 0
    %152 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %151)
    call void @readReal(double* %grace3)
    %smallGrace3 = alloca float
    %str47 = alloca [23 x i8]
    %153 = bitcast [23 x i8]* %str47 to i8*
    call void @llvm.memcpy.p0i8.p0i8.i64(i8* align 1 %153, i8* align 1 getelementptr inbounds ([23 x i8], [23 x i8]* @str47, i32 0, i32 0), i64 23, i1 false)
    %154 = getelementptr inbounds [23 x i8], [23 x i8]* %str47, i32 0, i32 0
    %155 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %154)
    call void @readFloat(float* %smallGrace3)
    %156 = load double, double* %grace3
    %157 = load float, float* %smallGrace3
    %158 = fpext float %157 to double
    %159 = fadd double %156, %158
    %grace4 = alloca double
    store double %159, double* %grace4
    %str48 = alloca [32 x i8]
    %160 = bitcast [32 x i8]* %str48 to i8*
    call void @llvm.memcpy.p0i8.p0i8.i64(i8* align 1 %160, i8* align 1 getelementptr inbounds ([32 x i8], [32 x i8]* @str48, i32 0, i32 0), i64 32, i1 false)
    %161 = getelementptr inbounds [32 x i8], [32 x i8]* %str48, i32 0, i32 0
    %162 = load double, double* %grace4
    %str49 = alloca [33 x i8]
    %163 = getelementptr inbounds [33 x i8], [33 x i8]* %str49, i32 0, i32 0
    %164 = call i32 (i8*, i8*, ...) @sprintf(i8* %163, i8* getelementptr inbounds ([3 x i8], [3 x i8]* @strspf, i32 0, i32 0), double %162)
    %str50 = alloca [64 x i8]
    %165 = getelementptr inbounds [64 x i8], [64 x i8]* %str50, i32 0, i32 0
    %166 = call i8* @strcpy(i8* %165, i8* %161)
    %167 = call i8* @strcat(i8* %165, i8* %163)
    %168 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %165)
    %169 = load float, float* %smallGrace3
    %170 = load double, double* %grace3
    %171 = fpext float %169 to double
    %172 = fmul double %171, %170
    %173 = fptrunc double %172 to float
    %grace5 = alloca float
    store float %173, float* %grace5
    %str51 = alloca [32 x i8]
    %174 = bitcast [32 x i8]* %str51 to i8*
    call void @llvm.memcpy.p0i8.p0i8.i64(i8* align 1 %174, i8* align 1 getelementptr inbounds ([32 x i8], [32 x i8]* @str51, i32 0, i32 0), i64 32, i1 false)
    %175 = getelementptr inbounds [32 x i8], [32 x i8]* %str51, i32 0, i32 0
    %176 = load float, float* %grace5
    %str52 = alloca [33 x i8]
    %177 = getelementptr inbounds [33 x i8], [33 x i8]* %str52, i32 0, i32 0
    %178 = fpext float %176 to double
    %179 = call i32 (i8*, i8*, ...) @sprintf(i8* %177, i8* getelementptr inbounds ([3 x i8], [3 x i8]* @strspf, i32 0, i32 0), double %178)
    %str53 = alloca [64 x i8]
    %180 = getelementptr inbounds [64 x i8], [64 x i8]* %str53, i32 0, i32 0
    %181 = call i8* @strcpy(i8* %180, i8* %175)
    %182 = call i8* @strcat(i8* %180, i8* %177)
    %183 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %180)
    %str54 = alloca [1 x i8]
    %184 = bitcast [1 x i8]* %str54 to i8*
    call void @llvm.memcpy.p0i8.p0i8.i64(i8* align 1 %184, i8* align 1 getelementptr inbounds ([1 x i8], [1 x i8]* @str54, i32 0, i32 0), i64 1, i1 false)
    %185 = getelementptr inbounds [1 x i8], [1 x i8]* %str54, i32 0, i32 0
    %186 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %185)
    %str55 = alloca [37 x i8]
    %187 = bitcast [37 x i8]* %str55 to i8*
    call void @llvm.memcpy.p0i8.p0i8.i64(i8* align 1 %187, i8* align 1 getelementptr inbounds ([37 x i8], [37 x i8]* @str55, i32 0, i32 0), i64 37, i1 false)
    %188 = getelementptr inbounds [37 x i8], [37 x i8]* %str55, i32 0, i32 0
    %189 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %188)
    %dog = alloca i1
    %str56 = alloca [16 x i8]
    %190 = bitcast [16 x i8]* %str56 to i8*
    call void @llvm.memcpy.p0i8.p0i8.i64(i8* align 1 %190, i8* align 1 getelementptr inbounds ([16 x i8], [16 x i8]* @str56, i32 0, i32 0), i64 16, i1 false)
    %191 = getelementptr inbounds [16 x i8], [16 x i8]* %str56, i32 0, i32 0
    %192 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %191)
    %193 = call i32 @readDogma()
    %194 = icmp ne i32 %193, 0
    store i1 %194, i1* %dog
    %str57 = alloca [25 x i8]
    %195 = bitcast [25 x i8]* %str57 to i8*
    call void @llvm.memcpy.p0i8.p0i8.i64(i8* align 1 %195, i8* align 1 getelementptr inbounds ([25 x i8], [25 x i8]* @str57, i32 0, i32 0), i64 25, i1 false)
    %196 = getelementptr inbounds [25 x i8], [25 x i8]* %str57, i32 0, i32 0
    %197 = load i1, i1* %dog
    %198 = select i1 %197, i8* getelementptr inbounds ([7 x i8], [7 x i8]* @dogma_Heaven, i32 0, i32 0), i8* getelementptr inbounds ([5 x i8], [5 x i8]* @dogma_Hell, i32 0, i32 0)
    %str58 = alloca [31 x i8]
    %199 = getelementptr inbounds [31 x i8], [31 x i8]* %str58, i32 0, i32 0
    %200 = call i8* @strcpy(i8* %199, i8* %196)
    %201 = call i8* @strcat(i8* %199, i8* %198)
    %202 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %199)
    %dogT = alloca i1
    store i1 true, i1* %dogT
    %dogF = alloca i1
    store i1 false, i1* %dogF
    %203 = load i1, i1* %dogT
    br label %and_lhs_end_1
and_lhs_end_1:
    br i1 %203, label %and_rhs_1, label %and_end_1
and_rhs_1:
    %204 = load i1, i1* %dogF
    br label %and_rhs_end_1
and_rhs_end_1:
    br label %and_end_1
and_end_1:
    %205 = phi i1 [ false, %and_lhs_end_1 ], [ %204, %and_rhs_end_1 ]
    %andV = alloca i1
    store i1 %205, i1* %andV
    %str59 = alloca [27 x i8]
    %206 = bitcast [27 x i8]* %str59 to i8*
    call void @llvm.memcpy.p0i8.p0i8.i64(i8* align 1 %206, i8* align 1 getelementptr inbounds ([27 x i8], [27 x i8]* @str59, i32 0, i32 0), i64 27, i1 false)
    %207 = getelementptr inbounds [27 x i8], [27 x i8]* %str59, i32 0, i32 0
    %208 = load i1, i1* %andV
    %209 = select i1 %208, i8* getelementptr inbounds ([7 x i8], [7 x i8]* @dogma_Heaven, i32 0, i32 0), i8* getelementptr inbounds ([5 x i8], [5 x i8]* @dogma_Hell, i32 0, i32 0)
    %str60 = alloca [33 x i8]
    %210 = getelementptr inbounds [33 x i8], [33 x i8]* %str60, i32 0, i32 0
    %211 = call i8* @strcpy(i8* %210, i8* %207)
    %212 = call i8* @strcat(i8* %210, i8* %209)
    %213 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %210)
    %214 = load i1, i1* %dogT
    br label %or_lhs_end_2
or_lhs_end_2:
    br i1 %214, label %or_end_2, label %or_rhs_2
or_rhs_2:
    %215 = load i1, i1* %dogF
    br label %or_rhs_end_2
or_rhs_end_2:
    br label %or_end_2
or_end_2:
    %216 = phi i1 [ true, %or_lhs_end_2 ], [ %215, %or_rhs_end_2 ]
    %orV = alloca i1
    store i1 %216, i1* %orV
    %str61 = alloca [26 x i8]
    %217 = bitcast [26 x i8]* %str61 to i8*
    call void @llvm.memcpy.p0i8.p0i8.i64(i8* align 1 %217, i8* align 1 getelementptr inbounds ([26 x i8], [26 x i8]* @str61, i32 0, i32 0), i64 26, i1 false)
    %218 = getelementptr inbounds [26 x i8], [26 x i8]* %str61, i32 0, i32 0
    %219 = load i1, i1* %orV
    %220 = select i1 %219, i8* getelementptr inbounds ([7 x i8], [7 x i8]* @dogma_Heaven, i32 0, i32 0), i8* getelementptr inbounds ([5 x i8], [5 x i8]* @dogma_Hell, i32 0, i32 0)
    %str62 = alloca [32 x i8]
    %221 = getelementptr inbounds [32 x i8], [32 x i8]* %str62, i32 0, i32 0
    %222 = call i8* @strcpy(i8* %221, i8* %218)
    %223 = call i8* @strcat(i8* %221, i8* %220)
    %224 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %221)
    %225 = load i1, i1* %dogT
    %226 = load i1, i1* %dogF
    %227 = xor i1 %225, %226
    %xorV = alloca i1
    store i1 %227, i1* %xorV
    %str63 = alloca [27 x i8]
    %228 = bitcast [27 x i8]* %str63 to i8*
    call void @llvm.memcpy.p0i8.p0i8.i64(i8* align 1 %228, i8* align 1 getelementptr inbounds ([27 x i8], [27 x i8]* @str63, i32 0, i32 0), i64 27, i1 false)
    %229 = getelementptr inbounds [27 x i8], [27 x i8]* %str63, i32 0, i32 0
    %230 = load i1, i1* %xorV
    %231 = select i1 %230, i8* getelementptr inbounds ([7 x i8], [7 x i8]* @dogma_Heaven, i32 0, i32 0), i8* getelementptr inbounds ([5 x i8], [5 x i8]* @dogma_Hell, i32 0, i32 0)
    %str64 = alloca [33 x i8]
    %232 = getelementptr inbounds [33 x i8], [33 x i8]* %str64, i32 0, i32 0
    %233 = call i8* @strcpy(i8* %232, i8* %229)
    %234 = call i8* @strcat(i8* %232, i8* %231)
    %235 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %232)
    %236 = load i1, i1* %dogT
    %237 = xor i1 %236, true
    %negVT = alloca i1
    store i1 %237, i1* %negVT
    %str65 = alloca [22 x i8]
    %238 = bitcast [22 x i8]* %str65 to i8*
    call void @llvm.memcpy.p0i8.p0i8.i64(i8* align 1 %238, i8* align 1 getelementptr inbounds ([22 x i8], [22 x i8]* @str65, i32 0, i32 0), i64 22, i1 false)
    %239 = getelementptr inbounds [22 x i8], [22 x i8]* %str65, i32 0, i32 0
    %240 = load i1, i1* %negVT
    %241 = select i1 %240, i8* getelementptr inbounds ([7 x i8], [7 x i8]* @dogma_Heaven, i32 0, i32 0), i8* getelementptr inbounds ([5 x i8], [5 x i8]* @dogma_Hell, i32 0, i32 0)
    %str66 = alloca [28 x i8]
    %242 = getelementptr inbounds [28 x i8], [28 x i8]* %str66, i32 0, i32 0
    %243 = call i8* @strcpy(i8* %242, i8* %239)
    %244 = call i8* @strcat(i8* %242, i8* %241)
    %245 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %242)
    %246 = load i1, i1* %dogF
    %247 = xor i1 %246, true
    %negVF = alloca i1
    store i1 %247, i1* %negVF
    %str67 = alloca [20 x i8]
    %248 = bitcast [20 x i8]* %str67 to i8*
    call void @llvm.memcpy.p0i8.p0i8.i64(i8* align 1 %248, i8* align 1 getelementptr inbounds ([20 x i8], [20 x i8]* @str67, i32 0, i32 0), i64 20, i1 false)
    %249 = getelementptr inbounds [20 x i8], [20 x i8]* %str67, i32 0, i32 0
    %250 = load i1, i1* %negVF
    %251 = select i1 %250, i8* getelementptr inbounds ([7 x i8], [7 x i8]* @dogma_Heaven, i32 0, i32 0), i8* getelementptr inbounds ([5 x i8], [5 x i8]* @dogma_Hell, i32 0, i32 0)
    %str68 = alloca [26 x i8]
    %252 = getelementptr inbounds [26 x i8], [26 x i8]* %str68, i32 0, i32 0
    %253 = call i8* @strcpy(i8* %252, i8* %249)
    %254 = call i8* @strcat(i8* %252, i8* %251)
    %255 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %252)
    %256 = load i1, i1* %dogT
    br label %and_lhs_end_3
and_lhs_end_3:
    br i1 %256, label %and_rhs_3, label %and_end_3
and_rhs_3:
    %257 = load i1, i1* %dogT
    br label %and_rhs_end_3
and_rhs_end_3:
    br label %and_end_3
and_end_3:
    %258 = phi i1 [ false, %and_lhs_end_3 ], [ %257, %and_rhs_end_3 ]
    br label %and_lhs_end_4
and_lhs_end_4:
    br i1 %258, label %and_rhs_4, label %and_end_4
and_rhs_4:
    %259 = load i1, i1* %dogT
    %260 = xor i1 %259, true
    br label %and_rhs_end_4
and_rhs_end_4:
    br label %and_end_4
and_end_4:
    %261 = phi i1 [ false, %and_lhs_end_4 ], [ %260, %and_rhs_end_4 ]
    %multV = alloca i1
    store i1 %261, i1* %multV
    %str69 = alloca [44 x i8]
    %262 = bitcast [44 x i8]* %str69 to i8*
    call void @llvm.memcpy.p0i8.p0i8.i64(i8* align 1 %262, i8* align 1 getelementptr inbounds ([44 x i8], [44 x i8]* @str69, i32 0, i32 0), i64 44, i1 false)
    %263 = getelementptr inbounds [44 x i8], [44 x i8]* %str69, i32 0, i32 0
    %264 = load i1, i1* %multV
    %265 = select i1 %264, i8* getelementptr inbounds ([7 x i8], [7 x i8]* @dogma_Heaven, i32 0, i32 0), i8* getelementptr inbounds ([5 x i8], [5 x i8]* @dogma_Hell, i32 0, i32 0)
    %str70 = alloca [50 x i8]
    %266 = getelementptr inbounds [50 x i8], [50 x i8]* %str70, i32 0, i32 0
    %267 = call i8* @strcpy(i8* %266, i8* %263)
    %268 = call i8* @strcat(i8* %266, i8* %265)
    %269 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %266)
    %str71 = alloca [1 x i8]
    %270 = bitcast [1 x i8]* %str71 to i8*
    call void @llvm.memcpy.p0i8.p0i8.i64(i8* align 1 %270, i8* align 1 getelementptr inbounds ([1 x i8], [1 x i8]* @str71, i32 0, i32 0), i64 1, i1 false)
    %271 = getelementptr inbounds [1 x i8], [1 x i8]* %str71, i32 0, i32 0
    %272 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %271)
    %str72 = alloca [37 x i8]
    %273 = bitcast [37 x i8]* %str72 to i8*
    call void @llvm.memcpy.p0i8.p0i8.i64(i8* align 1 %273, i8* align 1 getelementptr inbounds ([37 x i8], [37 x i8]* @str72, i32 0, i32 0), i64 37, i1 false)
    %274 = getelementptr inbounds [37 x i8], [37 x i8]* %str72, i32 0, i32 0
    %275 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %274)
    %legion = alloca [5 x i32]
    store [5 x i32] zeroinitializer, [5 x i32]* %legion
    %276 = getelementptr inbounds [5 x i32], [5 x i32]* %legion, i32 0, i32 0
    store i32 10, i32* %276
    %277 = getelementptr inbounds [5 x i32], [5 x i32]* %legion, i32 0, i32 1
    store i32 20, i32* %277
    %index = alloca i32
    store i32 2, i32* %index
    %278 = load i32, i32* %index
    %279 = getelementptr inbounds [5 x i32], [5 x i32]* %legion, i32 0, i32 0
    %280 = load i32, i32* %279
    %281 = getelementptr inbounds [5 x i32], [5 x i32]* %legion, i32 0, i32 1
    %282 = load i32, i32* %281
    %283 = add i32 %280, %282
    %284 = getelementptr inbounds [5 x i32], [5 x i32]* %legion, i32 0, i32 %278
    store i32 %283, i32* %284
    %285 = getelementptr inbounds [5 x i32], [5 x i32]* %legion, i32 0, i32 3
    store i32 40, i32* %285
    %286 = getelementptr inbounds [5 x i32], [5 x i32]* %legion, i32 0, i32 4
    store i32 50, i32* %286
    %str73 = alloca [15 x i8]
    %287 = bitcast [15 x i8]* %str73 to i8*
    call void @llvm.memcpy.p0i8.p0i8.i64(i8* align 1 %287, i8* align 1 getelementptr inbounds ([15 x i8], [15 x i8]* @str73, i32 0, i32 0), i64 15, i1 false)
    %288 = getelementptr inbounds [15 x i8], [15 x i8]* %str73, i32 0, i32 0
    %289 = load i32, i32* %index
    %290 = getelementptr inbounds [5 x i32], [5 x i32]* %legion, i32 0, i32 %289
    %291 = load i32, i32* %290
    %str74 = alloca [17 x i8]
    %292 = getelementptr inbounds [17 x i8], [17 x i8]* %str74, i32 0, i32 0
    %293 = call i32 (i8*, i8*, ...) @sprintf(i8* %292, i8* getelementptr inbounds ([3 x i8], [3 x i8]* @strspi, i32 0, i32 0), i32 %291)
    %str75 = alloca [31 x i8]
    %294 = getelementptr inbounds [31 x i8], [31 x i8]* %str75, i32 0, i32 0
    %295 = call i8* @strcpy(i8* %294, i8* %288)
    %296 = call i8* @strcat(i8* %294, i8* %292)
    %297 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %294)
    %str76 = alloca [20 x i8]
    %298 = bitcast [20 x i8]* %str76 to i8*
    call void @llvm.memcpy.p0i8.p0i8.i64(i8* align 1 %298, i8* align 1 getelementptr inbounds ([20 x i8], [20 x i8]* @str76, i32 0, i32 0), i64 20, i1 false)
    %299 = getelementptr inbounds [20 x i8], [20 x i8]* %str76, i32 0, i32 0
    %300 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %299)
    %301 = getelementptr inbounds [5 x i32], [5 x i32]* %legion, i32 0, i32 0
    %302 = load i32, i32* %301
    %303 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strp, i32 0, i32 0), i32 %302)
    %304 = getelementptr inbounds [5 x i32], [5 x i32]* %legion, i32 0, i32 1
    %305 = load i32, i32* %304
    %306 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strp, i32 0, i32 0), i32 %305)
    %307 = getelementptr inbounds [5 x i32], [5 x i32]* %legion, i32 0, i32 2
    %308 = load i32, i32* %307
    %309 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strp, i32 0, i32 0), i32 %308)
    %310 = getelementptr inbounds [5 x i32], [5 x i32]* %legion, i32 0, i32 3
    %311 = load i32, i32* %310
    %312 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strp, i32 0, i32 0), i32 %311)
    %313 = getelementptr inbounds [5 x i32], [5 x i32]* %legion, i32 0, i32 4
    %314 = load i32, i32* %313
    %315 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strp, i32 0, i32 0), i32 %314)
    %str77 = alloca [14 x i8]
    %316 = bitcast [14 x i8]* %str77 to i8*
    call void @llvm.memcpy.p0i8.p0i8.i64(i8* align 1 %316, i8* align 1 getelementptr inbounds ([14 x i8], [14 x i8]* @str77, i32 0, i32 0), i64 14, i1 false)
    %317 = getelementptr inbounds [14 x i8], [14 x i8]* %str77, i32 0, i32 0
    %318 = getelementptr inbounds [5 x i32], [5 x i32]* %legion, i32 0, i32 0
    %319 = load i32, i32* %318
    %str78 = alloca [17 x i8]
    %320 = getelementptr inbounds [17 x i8], [17 x i8]* %str78, i32 0, i32 0
    %321 = call i32 (i8*, i8*, ...) @sprintf(i8* %320, i8* getelementptr inbounds ([3 x i8], [3 x i8]* @strspi, i32 0, i32 0), i32 %319)
    %str79 = alloca [30 x i8]
    %322 = getelementptr inbounds [30 x i8], [30 x i8]* %str79, i32 0, i32 0
    %323 = call i8* @strcpy(i8* %322, i8* %317)
    %324 = call i8* @strcat(i8* %322, i8* %320)
    %325 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %322)
    %str80 = alloca [18 x i8]
    %326 = bitcast [18 x i8]* %str80 to i8*
    call void @llvm.memcpy.p0i8.p0i8.i64(i8* align 1 %326, i8* align 1 getelementptr inbounds ([18 x i8], [18 x i8]* @str80, i32 0, i32 0), i64 18, i1 false)
    %327 = getelementptr inbounds [18 x i8], [18 x i8]* %str80, i32 0, i32 0
    %328 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %327)
    %329 = getelementptr inbounds [5 x i32], [5 x i32]* %legion, i32 0, i32 1
    %330 = load i32, i32* %329
    %331 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strp, i32 0, i32 0), i32 %330)
    %332 = getelementptr inbounds [5 x i32], [5 x i32]* %legion, i32 0, i32 2
    %333 = load i32, i32* %332
    %334 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strp, i32 0, i32 0), i32 %333)
    %335 = getelementptr inbounds [5 x i32], [5 x i32]* %legion, i32 0, i32 3
    %336 = load i32, i32* %335
    %337 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strp, i32 0, i32 0), i32 %336)
    %str81 = alloca [22 x i8]
    %338 = bitcast [22 x i8]* %str81 to i8*
    call void @llvm.memcpy.p0i8.p0i8.i64(i8* align 1 %338, i8* align 1 getelementptr inbounds ([22 x i8], [22 x i8]* @str81, i32 0, i32 0), i64 22, i1 false)
    %339 = getelementptr inbounds [22 x i8], [22 x i8]* %str81, i32 0, i32 0
    %340 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %339)
    %341 = getelementptr inbounds [5 x i32], [5 x i32]* %legion, i32 0, i32 0
    %342 = load i32, i32* %341
    %343 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strp, i32 0, i32 0), i32 %342)
    %344 = getelementptr inbounds [5 x i32], [5 x i32]* %legion, i32 0, i32 1
    %345 = load i32, i32* %344
    %346 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strp, i32 0, i32 0), i32 %345)
    %347 = getelementptr inbounds [5 x i32], [5 x i32]* %legion, i32 0, i32 2
    %348 = load i32, i32* %347
    %349 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strp, i32 0, i32 0), i32 %348)
    %str82 = alloca [20 x i8]
    %350 = bitcast [20 x i8]* %str82 to i8*
    call void @llvm.memcpy.p0i8.p0i8.i64(i8* align 1 %350, i8* align 1 getelementptr inbounds ([20 x i8], [20 x i8]* @str82, i32 0, i32 0), i64 20, i1 false)
    %351 = getelementptr inbounds [20 x i8], [20 x i8]* %str82, i32 0, i32 0
    %352 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %351)
    %353 = getelementptr inbounds [5 x i32], [5 x i32]* %legion, i32 0, i32 3
    %354 = load i32, i32* %353
    %355 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strp, i32 0, i32 0), i32 %354)
    %356 = getelementptr inbounds [5 x i32], [5 x i32]* %legion, i32 0, i32 4
    %357 = load i32, i32* %356
    %358 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strp, i32 0, i32 0), i32 %357)
    %legion2 = alloca [2 x double]
    store [2 x double] zeroinitializer, [2 x double]* %legion2
    %359 = getelementptr inbounds [2 x double], [2 x double]* %legion2, i32 0, i32 0
    store double 1.1, double* %359
    %str83 = alloca [20 x i8]
    %360 = bitcast [20 x i8]* %str83 to i8*
    call void @llvm.memcpy.p0i8.p0i8.i64(i8* align 1 %360, i8* align 1 getelementptr inbounds ([20 x i8], [20 x i8]* @str83, i32 0, i32 0), i64 20, i1 false)
    %361 = getelementptr inbounds [20 x i8], [20 x i8]* %str83, i32 0, i32 0
    %362 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %361)
    %363 = getelementptr inbounds [2 x double], [2 x double]* %legion2, i32 0, i32 0
    %364 = load double, double* %363
    %365 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strp_real, i32 0, i32 0), double %364)
    %366 = getelementptr inbounds [2 x double], [2 x double]* %legion2, i32 0, i32 1
    %367 = load double, double* %366
    %368 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strp_real, i32 0, i32 0), double %367)
    %legion3 = alloca [2 x float]
    store [2 x float] zeroinitializer, [2 x float]* %legion3
    %369 = fptrunc double 1.1 to float
    %370 = getelementptr inbounds [2 x float], [2 x float]* %legion3, i32 0, i32 0
    store float %369, float* %370
    %str84 = alloca [25 x i8]
    %371 = bitcast [25 x i8]* %str84 to i8*
    call void @llvm.memcpy.p0i8.p0i8.i64(i8* align 1 %371, i8* align 1 getelementptr inbounds ([25 x i8], [25 x i8]* @str84, i32 0, i32 0), i64 25, i1 false)
    %372 = getelementptr inbounds [25 x i8], [25 x i8]* %str84, i32 0, i32 0
    %373 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %372)
    %374 = getelementptr inbounds [2 x float], [2 x float]* %legion3, i32 0, i32 0
    %375 = load float, float* %374
    %376 = fpext float %375 to double
    %377 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strp_real, i32 0, i32 0), double %376)
    %378 = getelementptr inbounds [2 x float], [2 x float]* %legion3, i32 0, i32 1
    %379 = load float, float* %378
    %380 = fpext float %379 to double
    %381 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strp_real, i32 0, i32 0), double %380)
    %legion4 = alloca [2 x i1]
    store [2 x i1] zeroinitializer, [2 x i1]* %legion4
    %382 = getelementptr inbounds [2 x i1], [2 x i1]* %legion4, i32 0, i32 0
    store i1 true, i1* %382
    %str85 = alloca [19 x i8]
    %383 = bitcast [19 x i8]* %str85 to i8*
    call void @llvm.memcpy.p0i8.p0i8.i64(i8* align 1 %383, i8* align 1 getelementptr inbounds ([19 x i8], [19 x i8]* @str85, i32 0, i32 0), i64 19, i1 false)
    %384 = getelementptr inbounds [19 x i8], [19 x i8]* %str85, i32 0, i32 0
    %385 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %384)
    %386 = getelementptr inbounds [2 x i1], [2 x i1]* %legion4, i32 0, i32 0
    %387 = load i1, i1* %386
    %388 = select i1 %387, i8* getelementptr inbounds ([7 x i8], [7 x i8]* @dogma_Heaven, i32 0, i32 0), i8* getelementptr inbounds ([5 x i8], [5 x i8]* @dogma_Hell, i32 0, i32 0)
    %389 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %388)
    %390 = getelementptr inbounds [2 x i1], [2 x i1]* %legion4, i32 0, i32 1
    %391 = load i1, i1* %390
    %392 = select i1 %391, i8* getelementptr inbounds ([7 x i8], [7 x i8]* @dogma_Heaven, i32 0, i32 0), i8* getelementptr inbounds ([5 x i8], [5 x i8]* @dogma_Hell, i32 0, i32 0)
    %393 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %392)
    %str86 = alloca [1 x i8]
    %394 = bitcast [1 x i8]* %str86 to i8*
    call void @llvm.memcpy.p0i8.p0i8.i64(i8* align 1 %394, i8* align 1 getelementptr inbounds ([1 x i8], [1 x i8]* @str86, i32 0, i32 0), i64 1, i1 false)
    %395 = getelementptr inbounds [1 x i8], [1 x i8]* %str86, i32 0, i32 0
    %396 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %395)
    ret i32 0
}

