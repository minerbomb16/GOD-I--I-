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
@str2 = constant [48 x i8] c"========= The Ultimate Trial of Faith =========\00"
@str3 = constant [52 x i8] c"--- Phase 1: Pilgrimage with Dogma AND Equation ---\00"
@str4 = constant [16 x i8] c"Current cycle: \00"
@str7 = constant [47 x i8] c"  [!] Reached cycle 2. Testing deeper faith...\00"
@str8 = constant [45 x i8] c"    [*] (testVal * 2) > 15. Faith is strong!\00"
@str9 = constant [23 x i8] c"    [-] Faith wavered.\00"
@str10 = constant [42 x i8] c"  [!] Reached cycle 4. Faith is fading...\00"
@str11 = constant [1 x i8] c"\00"
@str12 = constant [44 x i8] c"--- Phase 2: Pilgrimage with pure Dogma ---\00"
@str13 = constant [12 x i8] c"Countdown: \00"
@str16 = constant [47 x i8] c"  [!] Countdown is 0. Exiting pure dogma loop.\00"
@str17 = constant [25 x i8] c"========= Amen =========\00"
@str18 = constant [1 x i8] c"\00"
@str19 = constant [37 x i8] c"========= Way of the Cross =========\00"
@str20 = constant [31 x i8] c"Way of the Cross by step of 2:\00"
@str21 = constant [16 x i8] c"  Stepping up: \00"
@str24 = constant [12 x i8] c"    inner: \00"
@str27 = constant [1 x i8] c"\00"
@str28 = constant [43 x i8] c"Way of the Cross downwards into the abyss:\00"
@str29 = constant [18 x i8] c"  Stepping down: \00"
@str32 = constant [23 x i8] c"All journeys complete.\00"

define i32 @main() {
    %str1 = alloca [1 x i8]
    %1 = bitcast [1 x i8]* %str1 to i8*
    call void @llvm.memcpy.p0i8.p0i8.i64(i8* align 1 %1, i8* align 1 getelementptr inbounds ([1 x i8], [1 x i8]* @str1, i32 0, i32 0), i64 1, i1 false)
    %2 = getelementptr inbounds [1 x i8], [1 x i8]* %str1, i32 0, i32 0
    %3 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %2)
    %str2 = alloca [48 x i8]
    %4 = bitcast [48 x i8]* %str2 to i8*
    call void @llvm.memcpy.p0i8.p0i8.i64(i8* align 1 %4, i8* align 1 getelementptr inbounds ([48 x i8], [48 x i8]* @str2, i32 0, i32 0), i64 48, i1 false)
    %5 = getelementptr inbounds [48 x i8], [48 x i8]* %str2, i32 0, i32 0
    %6 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %5)
    %cycle = alloca i32
    store i32 0, i32* %cycle
    %isFaithful = alloca i1
    store i1 true, i1* %isFaithful
    %str3 = alloca [52 x i8]
    %7 = bitcast [52 x i8]* %str3 to i8*
    call void @llvm.memcpy.p0i8.p0i8.i64(i8* align 1 %7, i8* align 1 getelementptr inbounds ([52 x i8], [52 x i8]* @str3, i32 0, i32 0), i64 52, i1 false)
    %8 = getelementptr inbounds [52 x i8], [52 x i8]* %str3, i32 0, i32 0
    %9 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %8)
    br label %while_cond_1
while_cond_1:
    %10 = load i1, i1* %isFaithful
    br label %and_lhs_end_2
and_lhs_end_2:
    br i1 %10, label %and_rhs_2, label %and_end_2
and_rhs_2:
    %11 = load i32, i32* %cycle
    %12 = sub i32 5, %11
    %13 = icmp sgt i32 %12, 0
    br label %and_rhs_end_2
and_rhs_end_2:
    br label %and_end_2
and_end_2:
    %14 = phi i1 [ false, %and_lhs_end_2 ], [ %13, %and_rhs_end_2 ]
    br i1 %14, label %while_body_1, label %while_end_1
while_body_1:
    %str4 = alloca [16 x i8]
    %15 = bitcast [16 x i8]* %str4 to i8*
    call void @llvm.memcpy.p0i8.p0i8.i64(i8* align 1 %15, i8* align 1 getelementptr inbounds ([16 x i8], [16 x i8]* @str4, i32 0, i32 0), i64 16, i1 false)
    %16 = getelementptr inbounds [16 x i8], [16 x i8]* %str4, i32 0, i32 0
    %17 = load i32, i32* %cycle
    %str5 = alloca [17 x i8]
    %18 = getelementptr inbounds [17 x i8], [17 x i8]* %str5, i32 0, i32 0
    %19 = call i32 (i8*, i8*, ...) @sprintf(i8* %18, i8* getelementptr inbounds ([3 x i8], [3 x i8]* @strspi, i32 0, i32 0), i32 %17)
    %str6 = alloca [32 x i8]
    %20 = getelementptr inbounds [32 x i8], [32 x i8]* %str6, i32 0, i32 0
    %21 = call i8* @strcpy(i8* %20, i8* %16)
    %22 = call i8* @strcat(i8* %20, i8* %18)
    %23 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %20)
    %24 = load i32, i32* %cycle
    %25 = icmp eq i32 %24, 2
    br i1 %25, label %if_true_3, label %if_false_3
if_true_3:
    %str7 = alloca [47 x i8]
    %26 = bitcast [47 x i8]* %str7 to i8*
    call void @llvm.memcpy.p0i8.p0i8.i64(i8* align 1 %26, i8* align 1 getelementptr inbounds ([47 x i8], [47 x i8]* @str7, i32 0, i32 0), i64 47, i1 false)
    %27 = getelementptr inbounds [47 x i8], [47 x i8]* %str7, i32 0, i32 0
    %28 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %27)
    %testVal = alloca i32
    store i32 10, i32* %testVal
    %29 = load i32, i32* %testVal
    %30 = mul i32 %29, 2
    %31 = icmp sgt i32 %30, 15
    br i1 %31, label %if_true_4, label %if_false_4
if_true_4:
    %str8 = alloca [45 x i8]
    %32 = bitcast [45 x i8]* %str8 to i8*
    call void @llvm.memcpy.p0i8.p0i8.i64(i8* align 1 %32, i8* align 1 getelementptr inbounds ([45 x i8], [45 x i8]* @str8, i32 0, i32 0), i64 45, i1 false)
    %33 = getelementptr inbounds [45 x i8], [45 x i8]* %str8, i32 0, i32 0
    %34 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %33)
    br label %if_end_4
if_false_4:
    %str9 = alloca [23 x i8]
    %35 = bitcast [23 x i8]* %str9 to i8*
    call void @llvm.memcpy.p0i8.p0i8.i64(i8* align 1 %35, i8* align 1 getelementptr inbounds ([23 x i8], [23 x i8]* @str9, i32 0, i32 0), i64 23, i1 false)
    %36 = getelementptr inbounds [23 x i8], [23 x i8]* %str9, i32 0, i32 0
    %37 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %36)
    br label %if_end_4
if_end_4:
    br label %if_end_3
if_false_3:
    %38 = load i32, i32* %cycle
    %39 = icmp eq i32 %38, 4
    br i1 %39, label %if_true_5, label %if_false_5
if_true_5:
    %str10 = alloca [42 x i8]
    %40 = bitcast [42 x i8]* %str10 to i8*
    call void @llvm.memcpy.p0i8.p0i8.i64(i8* align 1 %40, i8* align 1 getelementptr inbounds ([42 x i8], [42 x i8]* @str10, i32 0, i32 0), i64 42, i1 false)
    %41 = getelementptr inbounds [42 x i8], [42 x i8]* %str10, i32 0, i32 0
    %42 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %41)
    store i1 false, i1* %isFaithful
    br label %if_end_5
if_false_5:
    br label %if_end_5
if_end_5:
    br label %if_end_3
if_end_3:
    %43 = load i32, i32* %cycle
    %44 = add i32 %43, 1
    store i32 %44, i32* %cycle
    br label %while_cond_1
while_end_1:
    %str11 = alloca [1 x i8]
    %45 = bitcast [1 x i8]* %str11 to i8*
    call void @llvm.memcpy.p0i8.p0i8.i64(i8* align 1 %45, i8* align 1 getelementptr inbounds ([1 x i8], [1 x i8]* @str11, i32 0, i32 0), i64 1, i1 false)
    %46 = getelementptr inbounds [1 x i8], [1 x i8]* %str11, i32 0, i32 0
    %47 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %46)
    %str12 = alloca [44 x i8]
    %48 = bitcast [44 x i8]* %str12 to i8*
    call void @llvm.memcpy.p0i8.p0i8.i64(i8* align 1 %48, i8* align 1 getelementptr inbounds ([44 x i8], [44 x i8]* @str12, i32 0, i32 0), i64 44, i1 false)
    %49 = getelementptr inbounds [44 x i8], [44 x i8]* %str12, i32 0, i32 0
    %50 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %49)
    %pureDogma = alloca i1
    store i1 true, i1* %pureDogma
    %countdown = alloca i32
    store i32 3, i32* %countdown
    br label %while_cond_6
while_cond_6:
    %51 = load i1, i1* %pureDogma
    br i1 %51, label %while_body_6, label %while_end_6
while_body_6:
    %str13 = alloca [12 x i8]
    %52 = bitcast [12 x i8]* %str13 to i8*
    call void @llvm.memcpy.p0i8.p0i8.i64(i8* align 1 %52, i8* align 1 getelementptr inbounds ([12 x i8], [12 x i8]* @str13, i32 0, i32 0), i64 12, i1 false)
    %53 = getelementptr inbounds [12 x i8], [12 x i8]* %str13, i32 0, i32 0
    %54 = load i32, i32* %countdown
    %str14 = alloca [17 x i8]
    %55 = getelementptr inbounds [17 x i8], [17 x i8]* %str14, i32 0, i32 0
    %56 = call i32 (i8*, i8*, ...) @sprintf(i8* %55, i8* getelementptr inbounds ([3 x i8], [3 x i8]* @strspi, i32 0, i32 0), i32 %54)
    %str15 = alloca [28 x i8]
    %57 = getelementptr inbounds [28 x i8], [28 x i8]* %str15, i32 0, i32 0
    %58 = call i8* @strcpy(i8* %57, i8* %53)
    %59 = call i8* @strcat(i8* %57, i8* %55)
    %60 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %57)
    %61 = load i32, i32* %countdown
    %62 = icmp sle i32 %61, 0
    br i1 %62, label %if_true_7, label %if_false_7
if_true_7:
    %str16 = alloca [47 x i8]
    %63 = bitcast [47 x i8]* %str16 to i8*
    call void @llvm.memcpy.p0i8.p0i8.i64(i8* align 1 %63, i8* align 1 getelementptr inbounds ([47 x i8], [47 x i8]* @str16, i32 0, i32 0), i64 47, i1 false)
    %64 = getelementptr inbounds [47 x i8], [47 x i8]* %str16, i32 0, i32 0
    %65 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %64)
    store i1 false, i1* %pureDogma
    br label %if_end_7
if_false_7:
    br label %if_end_7
if_end_7:
    %66 = load i32, i32* %countdown
    %67 = sub i32 %66, 1
    store i32 %67, i32* %countdown
    br label %while_cond_6
while_end_6:
    %str17 = alloca [25 x i8]
    %68 = bitcast [25 x i8]* %str17 to i8*
    call void @llvm.memcpy.p0i8.p0i8.i64(i8* align 1 %68, i8* align 1 getelementptr inbounds ([25 x i8], [25 x i8]* @str17, i32 0, i32 0), i64 25, i1 false)
    %69 = getelementptr inbounds [25 x i8], [25 x i8]* %str17, i32 0, i32 0
    %70 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %69)
    %str18 = alloca [1 x i8]
    %71 = bitcast [1 x i8]* %str18 to i8*
    call void @llvm.memcpy.p0i8.p0i8.i64(i8* align 1 %71, i8* align 1 getelementptr inbounds ([1 x i8], [1 x i8]* @str18, i32 0, i32 0), i64 1, i1 false)
    %72 = getelementptr inbounds [1 x i8], [1 x i8]* %str18, i32 0, i32 0
    %73 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %72)
    %str19 = alloca [37 x i8]
    %74 = bitcast [37 x i8]* %str19 to i8*
    call void @llvm.memcpy.p0i8.p0i8.i64(i8* align 1 %74, i8* align 1 getelementptr inbounds ([37 x i8], [37 x i8]* @str19, i32 0, i32 0), i64 37, i1 false)
    %75 = getelementptr inbounds [37 x i8], [37 x i8]* %str19, i32 0, i32 0
    %76 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %75)
    %stepValue = alloca i32
    store i32 2, i32* %stepValue
    %iterator = alloca i32
    %str20 = alloca [31 x i8]
    %77 = bitcast [31 x i8]* %str20 to i8*
    call void @llvm.memcpy.p0i8.p0i8.i64(i8* align 1 %77, i8* align 1 getelementptr inbounds ([31 x i8], [31 x i8]* @str20, i32 0, i32 0), i64 31, i1 false)
    %78 = getelementptr inbounds [31 x i8], [31 x i8]* %str20, i32 0, i32 0
    %79 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %78)
    store i32 0, i32* %iterator
    br label %for_cond_8
for_cond_8:
    %80 = add i32 3, 3
    %81 = load i32, i32* %stepValue
    %82 = load i32, i32* %iterator
    %83 = icmp sle i32 %82, %80
    %84 = icmp sge i32 %82, %80
    %85 = icmp slt i32 %81, 0
    %86 = select i1 %85, i1 %84, i1 %83
    br i1 %86, label %for_body_8, label %for_end_8
for_body_8:
    %str21 = alloca [16 x i8]
    %87 = bitcast [16 x i8]* %str21 to i8*
    call void @llvm.memcpy.p0i8.p0i8.i64(i8* align 1 %87, i8* align 1 getelementptr inbounds ([16 x i8], [16 x i8]* @str21, i32 0, i32 0), i64 16, i1 false)
    %88 = getelementptr inbounds [16 x i8], [16 x i8]* %str21, i32 0, i32 0
    %89 = load i32, i32* %iterator
    %str22 = alloca [17 x i8]
    %90 = getelementptr inbounds [17 x i8], [17 x i8]* %str22, i32 0, i32 0
    %91 = call i32 (i8*, i8*, ...) @sprintf(i8* %90, i8* getelementptr inbounds ([3 x i8], [3 x i8]* @strspi, i32 0, i32 0), i32 %89)
    %str23 = alloca [32 x i8]
    %92 = getelementptr inbounds [32 x i8], [32 x i8]* %str23, i32 0, i32 0
    %93 = call i8* @strcpy(i8* %92, i8* %88)
    %94 = call i8* @strcat(i8* %92, i8* %90)
    %95 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %92)
    %iterator2 = alloca i32
    store i32 0, i32* %iterator2
    br label %for_cond_9
for_cond_9:
    %96 = load i32, i32* %iterator2
    %97 = icmp sle i32 %96, 2
    %98 = icmp sge i32 %96, 2
    %99 = icmp slt i32 1, 0
    %100 = select i1 %99, i1 %98, i1 %97
    br i1 %100, label %for_body_9, label %for_end_9
for_body_9:
    %str24 = alloca [12 x i8]
    %101 = bitcast [12 x i8]* %str24 to i8*
    call void @llvm.memcpy.p0i8.p0i8.i64(i8* align 1 %101, i8* align 1 getelementptr inbounds ([12 x i8], [12 x i8]* @str24, i32 0, i32 0), i64 12, i1 false)
    %102 = getelementptr inbounds [12 x i8], [12 x i8]* %str24, i32 0, i32 0
    %103 = load i32, i32* %iterator2
    %str25 = alloca [17 x i8]
    %104 = getelementptr inbounds [17 x i8], [17 x i8]* %str25, i32 0, i32 0
    %105 = call i32 (i8*, i8*, ...) @sprintf(i8* %104, i8* getelementptr inbounds ([3 x i8], [3 x i8]* @strspi, i32 0, i32 0), i32 %103)
    %str26 = alloca [28 x i8]
    %106 = getelementptr inbounds [28 x i8], [28 x i8]* %str26, i32 0, i32 0
    %107 = call i8* @strcpy(i8* %106, i8* %102)
    %108 = call i8* @strcat(i8* %106, i8* %104)
    %109 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %106)
    %110 = load i32, i32* %iterator2
    %111 = add i32 %110, 1
    store i32 %111, i32* %iterator2
    br label %for_cond_9
for_end_9:
    %112 = load i32, i32* %iterator
    %113 = add i32 %112, %81
    store i32 %113, i32* %iterator
    br label %for_cond_8
for_end_8:
    %str27 = alloca [1 x i8]
    %114 = bitcast [1 x i8]* %str27 to i8*
    call void @llvm.memcpy.p0i8.p0i8.i64(i8* align 1 %114, i8* align 1 getelementptr inbounds ([1 x i8], [1 x i8]* @str27, i32 0, i32 0), i64 1, i1 false)
    %115 = getelementptr inbounds [1 x i8], [1 x i8]* %str27, i32 0, i32 0
    %116 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %115)
    %str28 = alloca [43 x i8]
    %117 = bitcast [43 x i8]* %str28 to i8*
    call void @llvm.memcpy.p0i8.p0i8.i64(i8* align 1 %117, i8* align 1 getelementptr inbounds ([43 x i8], [43 x i8]* @str28, i32 0, i32 0), i64 43, i1 false)
    %118 = getelementptr inbounds [43 x i8], [43 x i8]* %str28, i32 0, i32 0
    %119 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %118)
    store i32 5, i32* %iterator
    br label %for_cond_10
for_cond_10:
    %120 = load i32, i32* %iterator
    %121 = icmp sle i32 %120, 1
    %122 = icmp sge i32 %120, 1
    %123 = icmp slt i32 -1, 0
    %124 = select i1 %123, i1 %122, i1 %121
    br i1 %124, label %for_body_10, label %for_end_10
for_body_10:
    %str29 = alloca [18 x i8]
    %125 = bitcast [18 x i8]* %str29 to i8*
    call void @llvm.memcpy.p0i8.p0i8.i64(i8* align 1 %125, i8* align 1 getelementptr inbounds ([18 x i8], [18 x i8]* @str29, i32 0, i32 0), i64 18, i1 false)
    %126 = getelementptr inbounds [18 x i8], [18 x i8]* %str29, i32 0, i32 0
    %127 = load i32, i32* %iterator
    %str30 = alloca [17 x i8]
    %128 = getelementptr inbounds [17 x i8], [17 x i8]* %str30, i32 0, i32 0
    %129 = call i32 (i8*, i8*, ...) @sprintf(i8* %128, i8* getelementptr inbounds ([3 x i8], [3 x i8]* @strspi, i32 0, i32 0), i32 %127)
    %str31 = alloca [34 x i8]
    %130 = getelementptr inbounds [34 x i8], [34 x i8]* %str31, i32 0, i32 0
    %131 = call i8* @strcpy(i8* %130, i8* %126)
    %132 = call i8* @strcat(i8* %130, i8* %128)
    %133 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %130)
    %134 = load i32, i32* %iterator
    %135 = add i32 %134, -1
    store i32 %135, i32* %iterator
    br label %for_cond_10
for_end_10:
    %str32 = alloca [23 x i8]
    %136 = bitcast [23 x i8]* %str32 to i8*
    call void @llvm.memcpy.p0i8.p0i8.i64(i8* align 1 %136, i8* align 1 getelementptr inbounds ([23 x i8], [23 x i8]* @str32, i32 0, i32 0), i64 23, i1 false)
    %137 = getelementptr inbounds [23 x i8], [23 x i8]* %str32, i32 0, i32 0
    %138 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %137)
    ret i32 0
}

