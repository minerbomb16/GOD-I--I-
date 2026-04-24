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
@str9 = constant [839 x i8] c"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\00"

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
    %glory = alloca i8*
    %str1 = alloca [257 x i8]
    %18 = getelementptr inbounds [257 x i8], [257 x i8]* %str1, i32 0, i32 0
    store i8* %18, i8** %glory
    call void @readString(i8* %18)
    %19 = load i8*, i8** %glory
    %20 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %19)
    %str2 = alloca [6 x i8]
    %21 = bitcast [6 x i8]* %str2 to i8*
    call void @llvm.memcpy.p0i8.p0i8.i64(i8* align 1 %21, i8* align 1 getelementptr inbounds ([6 x i8], [6 x i8]* @str2, i32 0, i32 0), i64 6, i1 false)
    %22 = getelementptr inbounds [6 x i8], [6 x i8]* %str2, i32 0, i32 0
    %23 = load i8*, i8** %glory
    %str3 = alloca [262 x i8]
    %24 = getelementptr inbounds [262 x i8], [262 x i8]* %str3, i32 0, i32 0
    %25 = call i8* @strcpy(i8* %24, i8* %22)
    %26 = call i8* @strcat(i8* %24, i8* %23)
    %glory2 = alloca i8*
    store i8* %24, i8** %glory2
    %27 = load i8*, i8** %glory2
    %28 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %27)
    %str4 = alloca [16 x i8]
    %29 = bitcast [16 x i8]* %str4 to i8*
    call void @llvm.memcpy.p0i8.p0i8.i64(i8* align 1 %29, i8* align 1 getelementptr inbounds ([16 x i8], [16 x i8]* @str4, i32 0, i32 0), i64 16, i1 false)
    %30 = getelementptr inbounds [16 x i8], [16 x i8]* %str4, i32 0, i32 0
    %str5 = alloca [17 x i8]
    %31 = getelementptr inbounds [17 x i8], [17 x i8]* %str5, i32 0, i32 0
    %32 = call i32 (i8*, i8*, ...) @sprintf(i8* %31, i8* getelementptr inbounds ([3 x i8], [3 x i8]* @strspi, i32 0, i32 0), i32 3)
    %str6 = alloca [32 x i8]
    %33 = getelementptr inbounds [32 x i8], [32 x i8]* %str6, i32 0, i32 0
    %34 = call i8* @strcpy(i8* %33, i8* %31)
    %35 = call i8* @strcat(i8* %33, i8* %30)
    %str7 = alloca [33 x i8]
    %36 = getelementptr inbounds [33 x i8], [33 x i8]* %str7, i32 0, i32 0
    %37 = call i32 (i8*, i8*, ...) @sprintf(i8* %36, i8* getelementptr inbounds ([3 x i8], [3 x i8]* @strspf, i32 0, i32 0), double 7.0)
    %str8 = alloca [64 x i8]
    %38 = getelementptr inbounds [64 x i8], [64 x i8]* %str8, i32 0, i32 0
    %39 = call i8* @strcpy(i8* %38, i8* %33)
    %40 = call i8* @strcat(i8* %38, i8* %36)
    store i8* %38, i8** %glory2
    %41 = load i8*, i8** %glory2
    %42 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %41)
    %str9 = alloca [839 x i8]
    %43 = bitcast [839 x i8]* %str9 to i8*
    call void @llvm.memcpy.p0i8.p0i8.i64(i8* align 1 %43, i8* align 1 getelementptr inbounds ([839 x i8], [839 x i8]* @str9, i32 0, i32 0), i64 839, i1 false)
    %44 = getelementptr inbounds [839 x i8], [839 x i8]* %str9, i32 0, i32 0
    %glory3 = alloca i8*
    store i8* %44, i8** %glory3
    %45 = load i8*, i8** %glory3
    %46 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %45)
    ret i32 0
}

