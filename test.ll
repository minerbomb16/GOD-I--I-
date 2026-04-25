declare i32 @printf(i8*, ...)
declare void @readInt(i32*)
declare void @readReal(double*)
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
@dogma_heven = constant [6 x i8] c"Heven\00"
@dogma_hell = constant [5 x i8] c"Hell\00"

define i32 @main() {
    %newsins = alloca [3 x i32]
    %1 = getelementptr inbounds [3 x i32], [3 x i32]* %newsins, i32 0, i32 0
    call void @readInt(i32* %1)
    %2 = getelementptr inbounds [3 x i32], [3 x i32]* %newsins, i32 0, i32 1
    call void @readInt(i32* %2)
    %3 = getelementptr inbounds [3 x i32], [3 x i32]* %newsins, i32 0, i32 0
    %4 = load i32, i32* %3
    %5 = getelementptr inbounds [3 x i32], [3 x i32]* %newsins, i32 0, i32 1
    %6 = load i32, i32* %5
    %7 = add i32 %4, %6
    %8 = getelementptr inbounds [3 x i32], [3 x i32]* %newsins, i32 0, i32 2
    store i32 %7, i32* %8
    %9 = getelementptr inbounds [3 x i32], [3 x i32]* %newsins, i32 0, i32 0
    %10 = load i32, i32* %9
    %11 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strp, i32 0, i32 0), i32 %10)
    %12 = getelementptr inbounds [3 x i32], [3 x i32]* %newsins, i32 0, i32 1
    %13 = load i32, i32* %12
    %14 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strp, i32 0, i32 0), i32 %13)
    %15 = getelementptr inbounds [3 x i32], [3 x i32]* %newsins, i32 0, i32 2
    %16 = load i32, i32* %15
    %17 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strp, i32 0, i32 0), i32 %16)
    %sins = alloca [3 x i32]
    %18 = getelementptr inbounds [3 x i32], [3 x i32]* %sins, i32 0, i32 0
    store i32 10, i32* %18
    %19 = getelementptr inbounds [3 x i32], [3 x i32]* %sins, i32 0, i32 1
    store i32 20, i32* %19
    %20 = getelementptr inbounds [3 x i32], [3 x i32]* %sins, i32 0, i32 0
    %21 = load i32, i32* %20
    %22 = getelementptr inbounds [3 x i32], [3 x i32]* %sins, i32 0, i32 1
    %23 = load i32, i32* %22
    %24 = add i32 %21, %23
    %25 = getelementptr inbounds [3 x i32], [3 x i32]* %sins, i32 0, i32 2
    store i32 %24, i32* %25
    %26 = getelementptr inbounds [3 x i32], [3 x i32]* %sins, i32 0, i32 2
    %27 = load i32, i32* %26
    %28 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strp, i32 0, i32 0), i32 %27)
    %29 = getelementptr inbounds [3 x i32], [3 x i32]* %sins, i32 0, i32 0
    %30 = load i32, i32* %29
    %31 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strp, i32 0, i32 0), i32 %30)
    %32 = getelementptr inbounds [3 x i32], [3 x i32]* %sins, i32 0, i32 1
    %33 = load i32, i32* %32
    %34 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strp, i32 0, i32 0), i32 %33)
    %35 = getelementptr inbounds [3 x i32], [3 x i32]* %sins, i32 0, i32 2
    %36 = load i32, i32* %35
    %37 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strp, i32 0, i32 0), i32 %36)
    %graces = alloca [3 x double]
    %38 = getelementptr inbounds [3 x double], [3 x double]* %graces, i32 0, i32 0
    store double 3.14, double* %38
    %39 = getelementptr inbounds [3 x double], [3 x double]* %graces, i32 0, i32 0
    %40 = load double, double* %39
    %41 = fmul double %40, 2.0
    %42 = getelementptr inbounds [3 x double], [3 x double]* %graces, i32 0, i32 1
    store double %41, double* %42
    %43 = getelementptr inbounds [3 x double], [3 x double]* %graces, i32 0, i32 2
    call void @readReal(double* %43)
    %44 = getelementptr inbounds [3 x double], [3 x double]* %graces, i32 0, i32 0
    %45 = load double, double* %44
    %46 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strp_real, i32 0, i32 0), double %45)
    %47 = getelementptr inbounds [3 x double], [3 x double]* %graces, i32 0, i32 1
    %48 = load double, double* %47
    %49 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strp_real, i32 0, i32 0), double %48)
    %50 = getelementptr inbounds [3 x double], [3 x double]* %graces, i32 0, i32 2
    %51 = load double, double* %50
    %52 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strp_real, i32 0, i32 0), double %51)
    %smalls = alloca [2 x float]
    %53 = fptrunc double 1.5 to float
    %54 = getelementptr inbounds [2 x float], [2 x float]* %smalls, i32 0, i32 0
    store float %53, float* %54
    %55 = getelementptr inbounds [2 x float], [2 x float]* %smalls, i32 0, i32 0
    %56 = load float, float* %55
    %57 = fpext float %56 to double
    %58 = fmul double %57, 2.0
    %59 = fptrunc double %58 to float
    %60 = getelementptr inbounds [2 x float], [2 x float]* %smalls, i32 0, i32 1
    store float %59, float* %60
    %61 = getelementptr inbounds [2 x float], [2 x float]* %smalls, i32 0, i32 0
    %62 = load float, float* %61
    %63 = fpext float %62 to double
    %64 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strp_real, i32 0, i32 0), double %63)
    %65 = getelementptr inbounds [2 x float], [2 x float]* %smalls, i32 0, i32 1
    %66 = load float, float* %65
    %67 = fpext float %66 to double
    %68 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strp_real, i32 0, i32 0), double %67)
    %signs = alloca [2 x i1]
    %69 = getelementptr inbounds [2 x i1], [2 x i1]* %signs, i32 0, i32 0
    store i1 true, i1* %69
    %70 = getelementptr inbounds [2 x i1], [2 x i1]* %signs, i32 0, i32 1
    store i1 false, i1* %70
    %71 = getelementptr inbounds [2 x i1], [2 x i1]* %signs, i32 0, i32 0
    %72 = load i1, i1* %71
    %73 = select i1 %72, i8* getelementptr inbounds ([6 x i8], [6 x i8]* @dogma_heven, i32 0, i32 0), i8* getelementptr inbounds ([5 x i8], [5 x i8]* @dogma_hell, i32 0, i32 0)
    %74 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %73)
    %75 = getelementptr inbounds [2 x i1], [2 x i1]* %signs, i32 0, i32 1
    %76 = load i1, i1* %75
    %77 = select i1 %76, i8* getelementptr inbounds ([6 x i8], [6 x i8]* @dogma_heven, i32 0, i32 0), i8* getelementptr inbounds ([5 x i8], [5 x i8]* @dogma_hell, i32 0, i32 0)
    %78 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %77)
    ret i32 0
}

