declare i32 @printf(i8*, ...)
declare void @readInt(i32*)
declare void @readReal(double*)
declare void @readString(i8*)
declare i32 @sprintf(i8*, i8*, ...)
declare i8* @strcpy(i8*, i8*)
declare i8* @strcat(i8*, i8*)
declare void @llvm.memcpy.p0i8.p0i8.i64(i8* noalias nocapture writeonly, i8* noalias nocapture readonly, i64, i1 immarg)
@strp = constant [4 x i8] c"%d\0A\00"
@strp_real = constant [4 x i8] c"%f\0A\00"
@strps = constant [4 x i8] c"%s\0A\00"
@strspi = constant [3 x i8] c"%d\00"
@strspf = constant [3 x i8] c"%f\00"
@str2 = constant [6 x i8] c"holy \00"
@str4 = constant [16 x i8] c" is a value of \00"

define i32 @main() {
    %sin = alloca i32
    call void @readInt(i32* %sin)
    %1 = load i32, i32* %sin
    %2 = mul i32 %1, 2
    %sin2 = alloca i32
    store i32 %2, i32* %sin2
    %3 = load i32, i32* %sin2
    %4 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strp, i32 0, i32 0), i32 %3)
    store i32 0, i32* %sin2
    %5 = load i32, i32* %sin2
    %6 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strp, i32 0, i32 0), i32 %5)
    %grace = alloca double
    call void @readReal(double* %grace)
    %7 = load double, double* %grace
    %8 = fmul double %7, 3.14
    %grace2 = alloca double
    store double %8, double* %grace2
    %9 = load double, double* %grace2
    %10 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strp_real, i32 0, i32 0), double %9)
    %11 = fadd double 3.0, 1.0
    %12 = fmul double 4.2, %11
    %13 = fadd double 2.0, %12
    %14 = fdiv double 5.0, 5.0
    %15 = fsub double %13, %14
    store double %15, double* %grace2
    %16 = load double, double* %grace2
    %17 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strp_real, i32 0, i32 0), double %16)
    %smallGrace = alloca float
    %18 = alloca double
    call void @readReal(double* %18)
    %19 = load double, double* %18
    %20 = fptrunc double %19 to float
    store float %20, float* %smallGrace
    %21 = load float, float* %smallGrace
    %22 = fpext float %21 to double
    %23 = fmul double %22, 2.0
    %24 = fptrunc double %23 to float
    %smallGrace2 = alloca float
    store float %24, float* %smallGrace2
    %25 = load float, float* %smallGrace2
    %26 = fpext float %25 to double
    %27 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strp_real, i32 0, i32 0), double %26)
    %28 = fadd double 1.0, 2.0
    %29 = fptrunc double %28 to float
    store float %29, float* %smallGrace
    %30 = load float, float* %smallGrace
    %31 = fpext float %30 to double
    %32 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strp_real, i32 0, i32 0), double %31)
    %glory = alloca i8*
    %str1 = alloca [257 x i8]
    %33 = getelementptr inbounds [257 x i8], [257 x i8]* %str1, i32 0, i32 0
    store i8* %33, i8** %glory
    call void @readString(i8* %33)
    %34 = load i8*, i8** %glory
    %35 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %34)
    %str2 = alloca [6 x i8]
    %36 = bitcast [6 x i8]* %str2 to i8*
    call void @llvm.memcpy.p0i8.p0i8.i64(i8* align 1 %36, i8* align 1 getelementptr inbounds ([6 x i8], [6 x i8]* @str2, i32 0, i32 0), i64 6, i1 false)
    %37 = getelementptr inbounds [6 x i8], [6 x i8]* %str2, i32 0, i32 0
    %38 = load i8*, i8** %glory
    %str3 = alloca [262 x i8]
    %39 = getelementptr inbounds [262 x i8], [262 x i8]* %str3, i32 0, i32 0
    %40 = call i8* @strcpy(i8* %39, i8* %37)
    %41 = call i8* @strcat(i8* %39, i8* %38)
    %glory2 = alloca i8*
    store i8* %39, i8** %glory2
    %42 = load i8*, i8** %glory2
    %43 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %42)
    %str4 = alloca [16 x i8]
    %44 = bitcast [16 x i8]* %str4 to i8*
    call void @llvm.memcpy.p0i8.p0i8.i64(i8* align 1 %44, i8* align 1 getelementptr inbounds ([16 x i8], [16 x i8]* @str4, i32 0, i32 0), i64 16, i1 false)
    %45 = getelementptr inbounds [16 x i8], [16 x i8]* %str4, i32 0, i32 0
    %str5 = alloca [17 x i8]
    %46 = getelementptr inbounds [17 x i8], [17 x i8]* %str5, i32 0, i32 0
    %47 = call i32 (i8*, i8*, ...) @sprintf(i8* %46, i8* getelementptr inbounds ([3 x i8], [3 x i8]* @strspi, i32 0, i32 0), i32 3)
    %str6 = alloca [32 x i8]
    %48 = getelementptr inbounds [32 x i8], [32 x i8]* %str6, i32 0, i32 0
    %49 = call i8* @strcpy(i8* %48, i8* %46)
    %50 = call i8* @strcat(i8* %48, i8* %45)
    %str7 = alloca [33 x i8]
    %51 = getelementptr inbounds [33 x i8], [33 x i8]* %str7, i32 0, i32 0
    %52 = call i32 (i8*, i8*, ...) @sprintf(i8* %51, i8* getelementptr inbounds ([3 x i8], [3 x i8]* @strspf, i32 0, i32 0), double 7.0)
    %str8 = alloca [64 x i8]
    %53 = getelementptr inbounds [64 x i8], [64 x i8]* %str8, i32 0, i32 0
    %54 = call i8* @strcpy(i8* %53, i8* %48)
    %55 = call i8* @strcat(i8* %53, i8* %51)
    store i8* %53, i8** %glory2
    %56 = load i8*, i8** %glory2
    %57 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %56)
    %grace3 = alloca double
    call void @readReal(double* %grace3)
    %smallGrace3 = alloca float
    %58 = alloca double
    call void @readReal(double* %58)
    %59 = load double, double* %58
    %60 = fptrunc double %59 to float
    store float %60, float* %smallGrace3
    %61 = load double, double* %grace3
    %62 = load float, float* %smallGrace3
    %63 = fpext float %62 to double
    %64 = fadd double %61, %63
    %grace4 = alloca double
    store double %64, double* %grace4
    %65 = load double, double* %grace4
    %66 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strp_real, i32 0, i32 0), double %65)
    ret i32 0
}

