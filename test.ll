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
@dogma_Heaven = constant [7 x i8] c"Heaven\00"
@dogma_hell = constant [5 x i8] c"Hell\00"

define i32 @main() {
    %sins2 = alloca [5 x i32]
    %1 = getelementptr inbounds [5 x i32], [5 x i32]* %sins2, i32 0, i32 0
    store i32 10, i32* %1
    %2 = getelementptr inbounds [5 x i32], [5 x i32]* %sins2, i32 0, i32 1
    store i32 20, i32* %2
    %3 = getelementptr inbounds [5 x i32], [5 x i32]* %sins2, i32 0, i32 2
    store i32 30, i32* %3
    %4 = getelementptr inbounds [5 x i32], [5 x i32]* %sins2, i32 0, i32 3
    store i32 40, i32* %4
    %5 = getelementptr inbounds [5 x i32], [5 x i32]* %sins2, i32 0, i32 4
    store i32 50, i32* %5
    %6 = getelementptr inbounds [5 x i32], [5 x i32]* %sins2, i32 0, i32 0
    %7 = load i32, i32* %6
    %8 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strp, i32 0, i32 0), i32 %7)
    %9 = getelementptr inbounds [5 x i32], [5 x i32]* %sins2, i32 0, i32 1
    %10 = load i32, i32* %9
    %11 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strp, i32 0, i32 0), i32 %10)
    %12 = getelementptr inbounds [5 x i32], [5 x i32]* %sins2, i32 0, i32 2
    %13 = load i32, i32* %12
    %14 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strp, i32 0, i32 0), i32 %13)
    %15 = getelementptr inbounds [5 x i32], [5 x i32]* %sins2, i32 0, i32 1
    %16 = load i32, i32* %15
    %17 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strp, i32 0, i32 0), i32 %16)
    %18 = getelementptr inbounds [5 x i32], [5 x i32]* %sins2, i32 0, i32 2
    %19 = load i32, i32* %18
    %20 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strp, i32 0, i32 0), i32 %19)
    %21 = getelementptr inbounds [5 x i32], [5 x i32]* %sins2, i32 0, i32 1
    %22 = load i32, i32* %21
    %23 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strp, i32 0, i32 0), i32 %22)
    %24 = getelementptr inbounds [5 x i32], [5 x i32]* %sins2, i32 0, i32 2
    %25 = load i32, i32* %24
    %26 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strp, i32 0, i32 0), i32 %25)
    %27 = getelementptr inbounds [5 x i32], [5 x i32]* %sins2, i32 0, i32 3
    %28 = load i32, i32* %27
    %29 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strp, i32 0, i32 0), i32 %28)
    %30 = getelementptr inbounds [5 x i32], [5 x i32]* %sins2, i32 0, i32 4
    %31 = load i32, i32* %30
    %32 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strp, i32 0, i32 0), i32 %31)
    %newsins = alloca [3 x i32]
    %33 = getelementptr inbounds [3 x i32], [3 x i32]* %newsins, i32 0, i32 0
    call void @readInt(i32* %33)
    %34 = getelementptr inbounds [3 x i32], [3 x i32]* %newsins, i32 0, i32 1
    call void @readInt(i32* %34)
    %35 = getelementptr inbounds [3 x i32], [3 x i32]* %newsins, i32 0, i32 0
    %36 = load i32, i32* %35
    %37 = getelementptr inbounds [3 x i32], [3 x i32]* %newsins, i32 0, i32 1
    %38 = load i32, i32* %37
    %39 = add i32 %36, %38
    %40 = getelementptr inbounds [3 x i32], [3 x i32]* %newsins, i32 0, i32 2
    store i32 %39, i32* %40
    %41 = getelementptr inbounds [3 x i32], [3 x i32]* %newsins, i32 0, i32 0
    %42 = load i32, i32* %41
    %43 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strp, i32 0, i32 0), i32 %42)
    %44 = getelementptr inbounds [3 x i32], [3 x i32]* %newsins, i32 0, i32 1
    %45 = load i32, i32* %44
    %46 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strp, i32 0, i32 0), i32 %45)
    %47 = getelementptr inbounds [3 x i32], [3 x i32]* %newsins, i32 0, i32 2
    %48 = load i32, i32* %47
    %49 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strp, i32 0, i32 0), i32 %48)
    %sins = alloca [3 x i32]
    %50 = getelementptr inbounds [3 x i32], [3 x i32]* %sins, i32 0, i32 0
    store i32 10, i32* %50
    %51 = getelementptr inbounds [3 x i32], [3 x i32]* %sins, i32 0, i32 1
    store i32 20, i32* %51
    %52 = getelementptr inbounds [3 x i32], [3 x i32]* %sins, i32 0, i32 0
    %53 = load i32, i32* %52
    %54 = getelementptr inbounds [3 x i32], [3 x i32]* %sins, i32 0, i32 1
    %55 = load i32, i32* %54
    %56 = add i32 %53, %55
    %57 = getelementptr inbounds [3 x i32], [3 x i32]* %sins, i32 0, i32 2
    store i32 %56, i32* %57
    %58 = getelementptr inbounds [3 x i32], [3 x i32]* %sins, i32 0, i32 1
    %59 = load i32, i32* %58
    %60 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strp, i32 0, i32 0), i32 %59)
    %61 = getelementptr inbounds [3 x i32], [3 x i32]* %sins, i32 0, i32 0
    %62 = load i32, i32* %61
    %63 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strp, i32 0, i32 0), i32 %62)
    %64 = getelementptr inbounds [3 x i32], [3 x i32]* %sins, i32 0, i32 1
    %65 = load i32, i32* %64
    %66 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strp, i32 0, i32 0), i32 %65)
    %67 = getelementptr inbounds [3 x i32], [3 x i32]* %sins, i32 0, i32 2
    %68 = load i32, i32* %67
    %69 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strp, i32 0, i32 0), i32 %68)
    %graces = alloca [3 x double]
    %70 = getelementptr inbounds [3 x double], [3 x double]* %graces, i32 0, i32 0
    store double 3.14, double* %70
    %71 = getelementptr inbounds [3 x double], [3 x double]* %graces, i32 0, i32 0
    %72 = load double, double* %71
    %73 = fmul double %72, 2.0
    %74 = getelementptr inbounds [3 x double], [3 x double]* %graces, i32 0, i32 1
    store double %73, double* %74
    %75 = getelementptr inbounds [3 x double], [3 x double]* %graces, i32 0, i32 2
    call void @readReal(double* %75)
    %76 = getelementptr inbounds [3 x double], [3 x double]* %graces, i32 0, i32 0
    %77 = load double, double* %76
    %78 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strp_real, i32 0, i32 0), double %77)
    %79 = getelementptr inbounds [3 x double], [3 x double]* %graces, i32 0, i32 1
    %80 = load double, double* %79
    %81 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strp_real, i32 0, i32 0), double %80)
    %82 = getelementptr inbounds [3 x double], [3 x double]* %graces, i32 0, i32 2
    %83 = load double, double* %82
    %84 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strp_real, i32 0, i32 0), double %83)
    %smalls = alloca [2 x float]
    %85 = fptrunc double 1.5 to float
    %86 = getelementptr inbounds [2 x float], [2 x float]* %smalls, i32 0, i32 0
    store float %85, float* %86
    %87 = getelementptr inbounds [2 x float], [2 x float]* %smalls, i32 0, i32 0
    %88 = load float, float* %87
    %89 = fpext float %88 to double
    %90 = fmul double %89, 2.0
    %91 = fptrunc double %90 to float
    %92 = getelementptr inbounds [2 x float], [2 x float]* %smalls, i32 0, i32 1
    store float %91, float* %92
    %93 = getelementptr inbounds [2 x float], [2 x float]* %smalls, i32 0, i32 0
    %94 = load float, float* %93
    %95 = fpext float %94 to double
    %96 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strp_real, i32 0, i32 0), double %95)
    %97 = getelementptr inbounds [2 x float], [2 x float]* %smalls, i32 0, i32 1
    %98 = load float, float* %97
    %99 = fpext float %98 to double
    %100 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strp_real, i32 0, i32 0), double %99)
    %signs = alloca [2 x i1]
    %101 = getelementptr inbounds [2 x i1], [2 x i1]* %signs, i32 0, i32 0
    store i1 true, i1* %101
    %102 = getelementptr inbounds [2 x i1], [2 x i1]* %signs, i32 0, i32 1
    store i1 false, i1* %102
    %103 = getelementptr inbounds [2 x i1], [2 x i1]* %signs, i32 0, i32 0
    %104 = load i1, i1* %103
    %105 = select i1 %104, i8* getelementptr inbounds ([7 x i8], [7 x i8]* @dogma_Heaven, i32 0, i32 0), i8* getelementptr inbounds ([5 x i8], [5 x i8]* @dogma_hell, i32 0, i32 0)
    %106 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %105)
    %107 = getelementptr inbounds [2 x i1], [2 x i1]* %signs, i32 0, i32 1
    %108 = load i1, i1* %107
    %109 = select i1 %108, i8* getelementptr inbounds ([7 x i8], [7 x i8]* @dogma_Heaven, i32 0, i32 0), i8* getelementptr inbounds ([5 x i8], [5 x i8]* @dogma_hell, i32 0, i32 0)
    %110 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %109)
    ret i32 0
}

