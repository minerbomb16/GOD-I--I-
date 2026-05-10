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
@str1 = constant [15 x i8] c"=== LEGION ===\00"
%HolyPerson = type { i32, double, i1 }
@prophet = global %HolyPerson zeroinitializer
@str2 = constant [4 x i8] c"---\00"
@nextEra = global i32 0
@str3 = constant [21 x i8] c"nextEra (age + 80): \00"
@holyCheck = global i1 false
@str6 = constant [33 x i8] c"holyCheck (isSaint AND Heaven): \00"
@str8 = constant [1 x i8] c"\00"
@str9 = constant [24 x i8] c"--- Miracle Legionu ---\00"
@prophetest = global %HolyPerson zeroinitializer
@str10 = constant [11 x i8] c"age (20): \00"
@str13 = constant [16 x i8] c"purity (same): \00"
@str16 = constant [17 x i8] c"isSaint (same): \00"

define %HolyPerson* @rejuvenate(%HolyPerson* %target_arg) {
    %46 = getelementptr inbounds %HolyPerson, %HolyPerson* %target_arg, i32 0, i32 0
    store i32 20, i32* %46
    ret %HolyPerson* %target_arg
}


define i32 @main() {
    %str1 = alloca [15 x i8]
    %1 = bitcast [15 x i8]* %str1 to i8*
    call void @llvm.memcpy.p0i8.p0i8.i64(i8* align 1 %1, i8* align 1 getelementptr inbounds ([15 x i8], [15 x i8]* @str1, i32 0, i32 0), i64 15, i1 false)
    %2 = getelementptr inbounds [15 x i8], [15 x i8]* %str1, i32 0, i32 0
    %3 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %2)
    %4 = getelementptr inbounds %HolyPerson, %HolyPerson* @prophet, i32 0, i32 0
    store i32 120, i32* %4
    %5 = getelementptr inbounds %HolyPerson, %HolyPerson* @prophet, i32 0, i32 1
    store double 99.99, double* %5
    %6 = getelementptr inbounds %HolyPerson, %HolyPerson* @prophet, i32 0, i32 2
    store i1 true, i1* %6
    %7 = getelementptr inbounds %HolyPerson, %HolyPerson* @prophet, i32 0, i32 0
    %8 = load i32, i32* %7
    %9 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strp, i32 0, i32 0), i32 %8)
    %10 = getelementptr inbounds %HolyPerson, %HolyPerson* @prophet, i32 0, i32 1
    %11 = load double, double* %10
    %12 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strp_real, i32 0, i32 0), double %11)
    %13 = getelementptr inbounds %HolyPerson, %HolyPerson* @prophet, i32 0, i32 2
    %14 = load i1, i1* %13
    %15 = select i1 %14, i8* getelementptr inbounds ([7 x i8], [7 x i8]* @dogma_Heaven, i32 0, i32 0), i8* getelementptr inbounds ([5 x i8], [5 x i8]* @dogma_Hell, i32 0, i32 0)
    %16 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %15)
    %str2 = alloca [4 x i8]
    %17 = bitcast [4 x i8]* %str2 to i8*
    call void @llvm.memcpy.p0i8.p0i8.i64(i8* align 1 %17, i8* align 1 getelementptr inbounds ([4 x i8], [4 x i8]* @str2, i32 0, i32 0), i64 4, i1 false)
    %18 = getelementptr inbounds [4 x i8], [4 x i8]* %str2, i32 0, i32 0
    %19 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %18)
    %20 = getelementptr inbounds %HolyPerson, %HolyPerson* @prophet, i32 0, i32 0
    %21 = load i32, i32* %20
    %22 = add i32 %21, 80
    store i32 %22, i32* @nextEra
    %str3 = alloca [21 x i8]
    %23 = bitcast [21 x i8]* %str3 to i8*
    call void @llvm.memcpy.p0i8.p0i8.i64(i8* align 1 %23, i8* align 1 getelementptr inbounds ([21 x i8], [21 x i8]* @str3, i32 0, i32 0), i64 21, i1 false)
    %24 = getelementptr inbounds [21 x i8], [21 x i8]* %str3, i32 0, i32 0
    %25 = load i32, i32* @nextEra
    %str4 = alloca [17 x i8]
    %26 = getelementptr inbounds [17 x i8], [17 x i8]* %str4, i32 0, i32 0
    %27 = call i32 (i8*, i8*, ...) @sprintf(i8* %26, i8* getelementptr inbounds ([3 x i8], [3 x i8]* @strspi, i32 0, i32 0), i32 %25)
    %str5 = alloca [37 x i8]
    %28 = getelementptr inbounds [37 x i8], [37 x i8]* %str5, i32 0, i32 0
    %29 = call i8* @strcpy(i8* %28, i8* %24)
    %30 = call i8* @strcat(i8* %28, i8* %26)
    %31 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %28)
    %32 = getelementptr inbounds %HolyPerson, %HolyPerson* @prophet, i32 0, i32 2
    %33 = load i1, i1* %32
    br label %and_lhs_end_1
and_lhs_end_1:
    br i1 %33, label %and_rhs_1, label %and_end_1
and_rhs_1:
    br label %and_rhs_end_1
and_rhs_end_1:
    br label %and_end_1
and_end_1:
    %34 = phi i1 [ false, %and_lhs_end_1 ], [ true, %and_rhs_end_1 ]
    store i1 %34, i1* @holyCheck
    %str6 = alloca [33 x i8]
    %35 = bitcast [33 x i8]* %str6 to i8*
    call void @llvm.memcpy.p0i8.p0i8.i64(i8* align 1 %35, i8* align 1 getelementptr inbounds ([33 x i8], [33 x i8]* @str6, i32 0, i32 0), i64 33, i1 false)
    %36 = getelementptr inbounds [33 x i8], [33 x i8]* %str6, i32 0, i32 0
    %37 = load i1, i1* @holyCheck
    %38 = select i1 %37, i8* getelementptr inbounds ([7 x i8], [7 x i8]* @dogma_Heaven, i32 0, i32 0), i8* getelementptr inbounds ([5 x i8], [5 x i8]* @dogma_Hell, i32 0, i32 0)
    %str7 = alloca [39 x i8]
    %39 = getelementptr inbounds [39 x i8], [39 x i8]* %str7, i32 0, i32 0
    %40 = call i8* @strcpy(i8* %39, i8* %36)
    %41 = call i8* @strcat(i8* %39, i8* %38)
    %42 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %39)
    %str8 = alloca [1 x i8]
    %43 = bitcast [1 x i8]* %str8 to i8*
    call void @llvm.memcpy.p0i8.p0i8.i64(i8* align 1 %43, i8* align 1 getelementptr inbounds ([1 x i8], [1 x i8]* @str8, i32 0, i32 0), i64 1, i1 false)
    %44 = getelementptr inbounds [1 x i8], [1 x i8]* %str8, i32 0, i32 0
    %45 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %44)
    %str9 = alloca [24 x i8]
    %47 = bitcast [24 x i8]* %str9 to i8*
    call void @llvm.memcpy.p0i8.p0i8.i64(i8* align 1 %47, i8* align 1 getelementptr inbounds ([24 x i8], [24 x i8]* @str9, i32 0, i32 0), i64 24, i1 false)
    %48 = getelementptr inbounds [24 x i8], [24 x i8]* %str9, i32 0, i32 0
    %49 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %48)
    %50 = getelementptr inbounds %HolyPerson, %HolyPerson* @prophet, i32 0, i32 0
    store i32 150, i32* %50
    %51 = getelementptr inbounds %HolyPerson, %HolyPerson* @prophet, i32 0, i32 0
    %52 = load i32, i32* %51
    %53 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strp, i32 0, i32 0), i32 %52)
    %54 = call %HolyPerson* @rejuvenate(%HolyPerson* @prophet)
    %55 = load %HolyPerson, %HolyPerson* %54
    store %HolyPerson %55, %HolyPerson* @prophetest
    %str10 = alloca [11 x i8]
    %56 = bitcast [11 x i8]* %str10 to i8*
    call void @llvm.memcpy.p0i8.p0i8.i64(i8* align 1 %56, i8* align 1 getelementptr inbounds ([11 x i8], [11 x i8]* @str10, i32 0, i32 0), i64 11, i1 false)
    %57 = getelementptr inbounds [11 x i8], [11 x i8]* %str10, i32 0, i32 0
    %58 = getelementptr inbounds %HolyPerson, %HolyPerson* @prophetest, i32 0, i32 0
    %59 = load i32, i32* %58
    %str11 = alloca [17 x i8]
    %60 = getelementptr inbounds [17 x i8], [17 x i8]* %str11, i32 0, i32 0
    %61 = call i32 (i8*, i8*, ...) @sprintf(i8* %60, i8* getelementptr inbounds ([3 x i8], [3 x i8]* @strspi, i32 0, i32 0), i32 %59)
    %str12 = alloca [27 x i8]
    %62 = getelementptr inbounds [27 x i8], [27 x i8]* %str12, i32 0, i32 0
    %63 = call i8* @strcpy(i8* %62, i8* %57)
    %64 = call i8* @strcat(i8* %62, i8* %60)
    %65 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %62)
    %str13 = alloca [16 x i8]
    %66 = bitcast [16 x i8]* %str13 to i8*
    call void @llvm.memcpy.p0i8.p0i8.i64(i8* align 1 %66, i8* align 1 getelementptr inbounds ([16 x i8], [16 x i8]* @str13, i32 0, i32 0), i64 16, i1 false)
    %67 = getelementptr inbounds [16 x i8], [16 x i8]* %str13, i32 0, i32 0
    %68 = getelementptr inbounds %HolyPerson, %HolyPerson* @prophetest, i32 0, i32 1
    %69 = load double, double* %68
    %str14 = alloca [33 x i8]
    %70 = getelementptr inbounds [33 x i8], [33 x i8]* %str14, i32 0, i32 0
    %71 = call i32 (i8*, i8*, ...) @sprintf(i8* %70, i8* getelementptr inbounds ([3 x i8], [3 x i8]* @strspf, i32 0, i32 0), double %69)
    %str15 = alloca [48 x i8]
    %72 = getelementptr inbounds [48 x i8], [48 x i8]* %str15, i32 0, i32 0
    %73 = call i8* @strcpy(i8* %72, i8* %67)
    %74 = call i8* @strcat(i8* %72, i8* %70)
    %75 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %72)
    %str16 = alloca [17 x i8]
    %76 = bitcast [17 x i8]* %str16 to i8*
    call void @llvm.memcpy.p0i8.p0i8.i64(i8* align 1 %76, i8* align 1 getelementptr inbounds ([17 x i8], [17 x i8]* @str16, i32 0, i32 0), i64 17, i1 false)
    %77 = getelementptr inbounds [17 x i8], [17 x i8]* %str16, i32 0, i32 0
    %78 = getelementptr inbounds %HolyPerson, %HolyPerson* @prophetest, i32 0, i32 2
    %79 = load i1, i1* %78
    %80 = select i1 %79, i8* getelementptr inbounds ([7 x i8], [7 x i8]* @dogma_Heaven, i32 0, i32 0), i8* getelementptr inbounds ([5 x i8], [5 x i8]* @dogma_Hell, i32 0, i32 0)
    %str17 = alloca [23 x i8]
    %81 = getelementptr inbounds [23 x i8], [23 x i8]* %str17, i32 0, i32 0
    %82 = call i8* @strcpy(i8* %81, i8* %77)
    %83 = call i8* @strcat(i8* %81, i8* %80)
    %84 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %81)
    ret i32 0
}

