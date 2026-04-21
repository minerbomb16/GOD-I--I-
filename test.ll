declare i32 @printf(i8*, ...)
declare void @readInt(i32*)
declare void @readReal(double*)
@strp = constant [4 x i8] c"%d\0A\00"
@strp_real = constant [4 x i8] c"%f\0A\00"

define i32 @main() {
    %sins = alloca i32
    call void @readInt(i32* %sins)
    %1 = load i32, i32* %sins
    %2 = mul i32 %1, 2
    %penance = alloca i32
    store i32 %2, i32* %penance
    %3 = load i32, i32* %penance
    %4 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strp, i32 0, i32 0), i32 %3)
    %grace = alloca double
    store double 3.14, double* %grace
    %5 = load double, double* %grace
    %6 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strp_real, i32 0, i32 0), double %5)
    store i32 0, i32* %penance
    %7 = load i32, i32* %penance
    %8 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strp, i32 0, i32 0), i32 %7)
    %9 = add i32 3, 1
    %10 = mul i32 4, %9
    %11 = add i32 2, %10
    %12 = sdiv i32 5, 5
    %13 = sub i32 %11, %12
    %trial = alloca i32
    store i32 %13, i32* %trial
    %14 = load i32, i32* %trial
    %15 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strp, i32 0, i32 0), i32 %14)
    ret i32 0
}

