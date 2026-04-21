declare i32 @printf(i8*, ...)
declare void @readInt(i32*)
declare void @readReal(double*)
@strp = constant [4 x i8] c"%d\0A\00"
@strp_real = constant [4 x i8] c"%f\0A\00"

define i32 @main() {
    %grzechy = alloca i32
    call void @readInt(i32* %grzechy)
    %1 = load i32, i32* %grzechy
    %2 = mul i32 %1, 2
    %pokuta = alloca i32
    store i32 %2, i32* %pokuta
    %3 = load i32, i32* %pokuta
    %4 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strp, i32 0, i32 0), i32 %3)
    %laska = alloca double
    store double 3.14, double* %laska
    %5 = load double, double* %laska
    %6 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strp_real, i32 0, i32 0), double %5)
    %7 = add i32 3, 1
    %8 = mul i32 4, %7
    %9 = add i32 2, %8
    %10 = sdiv i32 5, 5
    %11 = sub i32 %9, %10
    %12 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strp, i32 0, i32 0), i32 %11)
    ret i32 0
}

