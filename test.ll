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
    %x = alloca i1
    store i1 true, i1* %x
    %1 = load i1, i1* %x
    %2 = select i1 %1, i8* getelementptr inbounds ([6 x i8], [6 x i8]* @dogma_heven, i32 0, i32 0), i8* getelementptr inbounds ([5 x i8], [5 x i8]* @dogma_hell, i32 0, i32 0)
    %3 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %2)
    store i1 false, i1* %x
    %4 = load i1, i1* %x
    %5 = select i1 %4, i8* getelementptr inbounds ([6 x i8], [6 x i8]* @dogma_heven, i32 0, i32 0), i8* getelementptr inbounds ([5 x i8], [5 x i8]* @dogma_hell, i32 0, i32 0)
    %6 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %5)
    %x2 = alloca i1
    store i1 true, i1* %x2
    %7 = load i1, i1* %x2
    %8 = select i1 %7, i8* getelementptr inbounds ([6 x i8], [6 x i8]* @dogma_heven, i32 0, i32 0), i8* getelementptr inbounds ([5 x i8], [5 x i8]* @dogma_hell, i32 0, i32 0)
    %9 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %8)
    store i1 false, i1* %x2
    %10 = load i1, i1* %x2
    %11 = select i1 %10, i8* getelementptr inbounds ([6 x i8], [6 x i8]* @dogma_heven, i32 0, i32 0), i8* getelementptr inbounds ([5 x i8], [5 x i8]* @dogma_hell, i32 0, i32 0)
    %12 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %11)
    %x3 = alloca i1
    %13 = call i32 @readDogma()
    %14 = icmp ne i32 %13, 0
    store i1 %14, i1* %x3
    %15 = load i1, i1* %x3
    %16 = select i1 %15, i8* getelementptr inbounds ([6 x i8], [6 x i8]* @dogma_heven, i32 0, i32 0), i8* getelementptr inbounds ([5 x i8], [5 x i8]* @dogma_hell, i32 0, i32 0)
    %17 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %16)
    ret i32 0
}

