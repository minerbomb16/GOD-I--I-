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
@soulPower = global i32 0
@grace = global double 0.0
@spark = global float 0.0
@str1 = constant [8 x i8] c"Lazarus\00"
@pilgrimName = global i8* null
@isAscended = global i1 false
@str2 = constant [21 x i8] c"Blessings upon you, \00"
@str4 = constant [21 x i8] c"Status: Divine Being\00"
@str5 = constant [20 x i8] c"Status: Mortal Hero\00"
@str6 = constant [18 x i8] c"Status: Lost Soul\00"
@str7 = constant [43 x i8] c"Your grace shines brighter than the spark.\00"
@purification = global i32 0
@str8 = constant [26 x i8] c"Purification at station: \00"
@descent = global i32 0
@str11 = constant [28 x i8] c"Descending into the abyss: \00"
@prayerCount = global i32 0
@str14 = constant [20 x i8] c"Uttering prayer... \00"
@finalJudgment = global i1 false
@str17 = constant [17 x i8] c"Final Judgment: \00"
@artifacts = global [5 x i32] zeroinitializer
@str19 = constant [18 x i8] c"First artifacts: \00"
@grid = global [3 x [3 x double]] zeroinitializer
@str20 = constant [21 x i8] c"Center of the grid: \00"
%Relic = type { i32, double }
@holyGrail = global %Relic zeroinitializer
@str21 = constant [14 x i8] c"Relic Power: \00"
%Paladin = type { i32, i32 }
@arthur = global %Paladin zeroinitializer
@totalDamage = global i32 0
@str24 = constant [22 x i8] c"Paladin strikes for: \00"
@myKarma = global i32 0
@str27 = constant [22 x i8] c"Your final karma is: \00"

define i32 @Paladin_strike(%Paladin* %this_arg, i32 %weaponDamage_arg) {
    %weaponDamage = alloca i32
    store i32 %weaponDamage_arg, i32* %weaponDamage
    %129 = getelementptr inbounds %Paladin, %Paladin* %this_arg, i32 0, i32 0
    %130 = load i32, i32* %129
    %131 = getelementptr inbounds %Paladin, %Paladin* %this_arg, i32 0, i32 1
    %132 = load i32, i32* %131
    %133 = add i32 %130, %132
    %134 = load i32, i32* %weaponDamage
    %135 = add i32 %133, %134
    ret i32 %135
    ret i32 0
}

define i32 @calculateKarma(i32 %goodDeeds_arg, i32 %sins_arg) {
    %goodDeeds = alloca i32
    store i32 %goodDeeds_arg, i32* %goodDeeds
    %sins = alloca i32
    store i32 %sins_arg, i32* %sins
    %147 = load i32, i32* %goodDeeds
    %148 = load i32, i32* %sins
    %149 = sub i32 %147, %148
    %karma = alloca i32
    store i32 %149, i32* %karma
    %150 = load i32, i32* %karma
    ret i32 %150
    ret i32 0
}


define i32 @main() {
    call void @readInt(i32* @soulPower)
    store double 7.77, double* @grace
    %1 = fptrunc double 1.1 to float
    store float %1, float* @spark
    %str1 = alloca [8 x i8]
    %2 = bitcast [8 x i8]* %str1 to i8*
    call void @llvm.memcpy.p0i8.p0i8.i64(i8* align 1 %2, i8* align 1 getelementptr inbounds ([8 x i8], [8 x i8]* @str1, i32 0, i32 0), i64 8, i1 false)
    %3 = getelementptr inbounds [8 x i8], [8 x i8]* %str1, i32 0, i32 0
    store i8* %3, i8** @pilgrimName
    store i1 false, i1* @isAscended
    %str2 = alloca [21 x i8]
    %4 = bitcast [21 x i8]* %str2 to i8*
    call void @llvm.memcpy.p0i8.p0i8.i64(i8* align 1 %4, i8* align 1 getelementptr inbounds ([21 x i8], [21 x i8]* @str2, i32 0, i32 0), i64 21, i1 false)
    %5 = getelementptr inbounds [21 x i8], [21 x i8]* %str2, i32 0, i32 0
    %6 = load i8*, i8** @pilgrimName
    %str3 = alloca [28 x i8]
    %7 = getelementptr inbounds [28 x i8], [28 x i8]* %str3, i32 0, i32 0
    %8 = call i8* @strcpy(i8* %7, i8* %5)
    %9 = call i8* @strcat(i8* %7, i8* %6)
    %10 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %7)
    %11 = load i32, i32* @soulPower
    %12 = icmp sgt i32 %11, 100
    br i1 %12, label %if_true_1, label %if_false_1
if_true_1:
    %str4 = alloca [21 x i8]
    %13 = bitcast [21 x i8]* %str4 to i8*
    call void @llvm.memcpy.p0i8.p0i8.i64(i8* align 1 %13, i8* align 1 getelementptr inbounds ([21 x i8], [21 x i8]* @str4, i32 0, i32 0), i64 21, i1 false)
    %14 = getelementptr inbounds [21 x i8], [21 x i8]* %str4, i32 0, i32 0
    %15 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %14)
    store i1 true, i1* @isAscended
    br label %if_end_1
if_false_1:
    %16 = load i32, i32* @soulPower
    %17 = icmp sgt i32 %16, 50
    br i1 %17, label %if_true_2, label %if_false_2
if_true_2:
    %str5 = alloca [20 x i8]
    %18 = bitcast [20 x i8]* %str5 to i8*
    call void @llvm.memcpy.p0i8.p0i8.i64(i8* align 1 %18, i8* align 1 getelementptr inbounds ([20 x i8], [20 x i8]* @str5, i32 0, i32 0), i64 20, i1 false)
    %19 = getelementptr inbounds [20 x i8], [20 x i8]* %str5, i32 0, i32 0
    %20 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %19)
    br label %if_end_2
if_false_2:
    %str6 = alloca [18 x i8]
    %21 = bitcast [18 x i8]* %str6 to i8*
    call void @llvm.memcpy.p0i8.p0i8.i64(i8* align 1 %21, i8* align 1 getelementptr inbounds ([18 x i8], [18 x i8]* @str6, i32 0, i32 0), i64 18, i1 false)
    %22 = getelementptr inbounds [18 x i8], [18 x i8]* %str6, i32 0, i32 0
    %23 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %22)
    br label %if_end_2
if_end_2:
    br label %if_end_1
if_end_1:
    %24 = load double, double* @grace
    %25 = load float, float* @spark
    %26 = fpext float %25 to double
    %27 = fcmp ogt double %24, %26
    br i1 %27, label %if_true_3, label %if_false_3
if_true_3:
    %str7 = alloca [43 x i8]
    %28 = bitcast [43 x i8]* %str7 to i8*
    call void @llvm.memcpy.p0i8.p0i8.i64(i8* align 1 %28, i8* align 1 getelementptr inbounds ([43 x i8], [43 x i8]* @str7, i32 0, i32 0), i64 43, i1 false)
    %29 = getelementptr inbounds [43 x i8], [43 x i8]* %str7, i32 0, i32 0
    %30 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %29)
    br label %if_end_3
if_false_3:
    br label %if_end_3
if_end_3:
    store i32 1, i32* @purification
    br label %for_cond_4
for_cond_4:
    %31 = load i32, i32* @purification
    %32 = icmp sle i32 %31, 3
    %33 = icmp sge i32 %31, 3
    %34 = icmp slt i32 1, 0
    %35 = select i1 %34, i1 %33, i1 %32
    br i1 %35, label %for_body_4, label %for_end_4
for_body_4:
    %str8 = alloca [26 x i8]
    %36 = bitcast [26 x i8]* %str8 to i8*
    call void @llvm.memcpy.p0i8.p0i8.i64(i8* align 1 %36, i8* align 1 getelementptr inbounds ([26 x i8], [26 x i8]* @str8, i32 0, i32 0), i64 26, i1 false)
    %37 = getelementptr inbounds [26 x i8], [26 x i8]* %str8, i32 0, i32 0
    %38 = load i32, i32* @purification
    %str9 = alloca [17 x i8]
    %39 = getelementptr inbounds [17 x i8], [17 x i8]* %str9, i32 0, i32 0
    %40 = call i32 (i8*, i8*, ...) @sprintf(i8* %39, i8* getelementptr inbounds ([3 x i8], [3 x i8]* @strspi, i32 0, i32 0), i32 %38)
    %str10 = alloca [42 x i8]
    %41 = getelementptr inbounds [42 x i8], [42 x i8]* %str10, i32 0, i32 0
    %42 = call i8* @strcpy(i8* %41, i8* %37)
    %43 = call i8* @strcat(i8* %41, i8* %39)
    %44 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %41)
    %45 = load i32, i32* @purification
    %46 = add i32 %45, 1
    store i32 %46, i32* @purification
    br label %for_cond_4
for_end_4:
    store i32 10, i32* @descent
    br label %for_cond_5
for_cond_5:
    %47 = load i32, i32* @descent
    %48 = icmp sle i32 %47, 0
    %49 = icmp sge i32 %47, 0
    %50 = icmp slt i32 -2, 0
    %51 = select i1 %50, i1 %49, i1 %48
    br i1 %51, label %for_body_5, label %for_end_5
for_body_5:
    %str11 = alloca [28 x i8]
    %52 = bitcast [28 x i8]* %str11 to i8*
    call void @llvm.memcpy.p0i8.p0i8.i64(i8* align 1 %52, i8* align 1 getelementptr inbounds ([28 x i8], [28 x i8]* @str11, i32 0, i32 0), i64 28, i1 false)
    %53 = getelementptr inbounds [28 x i8], [28 x i8]* %str11, i32 0, i32 0
    %54 = load i32, i32* @descent
    %str12 = alloca [17 x i8]
    %55 = getelementptr inbounds [17 x i8], [17 x i8]* %str12, i32 0, i32 0
    %56 = call i32 (i8*, i8*, ...) @sprintf(i8* %55, i8* getelementptr inbounds ([3 x i8], [3 x i8]* @strspi, i32 0, i32 0), i32 %54)
    %str13 = alloca [44 x i8]
    %57 = getelementptr inbounds [44 x i8], [44 x i8]* %str13, i32 0, i32 0
    %58 = call i8* @strcpy(i8* %57, i8* %53)
    %59 = call i8* @strcat(i8* %57, i8* %55)
    %60 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %57)
    %61 = load i32, i32* @descent
    %62 = add i32 %61, -2
    store i32 %62, i32* @descent
    br label %for_cond_5
for_end_5:
    store i32 3, i32* @prayerCount
    br label %while_cond_6
while_cond_6:
    %63 = load i32, i32* @prayerCount
    %64 = icmp sgt i32 %63, 0
    br label %and_lhs_end_7
and_lhs_end_7:
    br i1 %64, label %and_rhs_7, label %and_end_7
and_rhs_7:
    %65 = load i1, i1* @isAscended
    br label %and_rhs_end_7
and_rhs_end_7:
    br label %and_end_7
and_end_7:
    %66 = phi i1 [ false, %and_lhs_end_7 ], [ %65, %and_rhs_end_7 ]
    br i1 %66, label %while_body_6, label %while_end_6
while_body_6:
    %str14 = alloca [20 x i8]
    %67 = bitcast [20 x i8]* %str14 to i8*
    call void @llvm.memcpy.p0i8.p0i8.i64(i8* align 1 %67, i8* align 1 getelementptr inbounds ([20 x i8], [20 x i8]* @str14, i32 0, i32 0), i64 20, i1 false)
    %68 = getelementptr inbounds [20 x i8], [20 x i8]* %str14, i32 0, i32 0
    %69 = load i32, i32* @prayerCount
    %str15 = alloca [17 x i8]
    %70 = getelementptr inbounds [17 x i8], [17 x i8]* %str15, i32 0, i32 0
    %71 = call i32 (i8*, i8*, ...) @sprintf(i8* %70, i8* getelementptr inbounds ([3 x i8], [3 x i8]* @strspi, i32 0, i32 0), i32 %69)
    %str16 = alloca [36 x i8]
    %72 = getelementptr inbounds [36 x i8], [36 x i8]* %str16, i32 0, i32 0
    %73 = call i8* @strcpy(i8* %72, i8* %68)
    %74 = call i8* @strcat(i8* %72, i8* %70)
    %75 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %72)
    %76 = load i32, i32* @prayerCount
    %77 = sub i32 %76, 1
    store i32 %77, i32* @prayerCount
    br label %while_cond_6
while_end_6:
    %78 = load i1, i1* @isAscended
    br label %or_lhs_end_8
or_lhs_end_8:
    br i1 %78, label %or_end_8, label %or_rhs_8
or_rhs_8:
    %79 = load double, double* @grace
    %80 = fcmp ogt double %79, 5.0
    br label %or_rhs_end_8
or_rhs_end_8:
    br label %or_end_8
or_end_8:
    %81 = phi i1 [ true, %or_lhs_end_8 ], [ %80, %or_rhs_end_8 ]
    store i1 %81, i1* @finalJudgment
    %str17 = alloca [17 x i8]
    %82 = bitcast [17 x i8]* %str17 to i8*
    call void @llvm.memcpy.p0i8.p0i8.i64(i8* align 1 %82, i8* align 1 getelementptr inbounds ([17 x i8], [17 x i8]* @str17, i32 0, i32 0), i64 17, i1 false)
    %83 = getelementptr inbounds [17 x i8], [17 x i8]* %str17, i32 0, i32 0
    %84 = load i1, i1* @finalJudgment
    %85 = select i1 %84, i8* getelementptr inbounds ([7 x i8], [7 x i8]* @dogma_Heaven, i32 0, i32 0), i8* getelementptr inbounds ([5 x i8], [5 x i8]* @dogma_Hell, i32 0, i32 0)
    %str18 = alloca [23 x i8]
    %86 = getelementptr inbounds [23 x i8], [23 x i8]* %str18, i32 0, i32 0
    %87 = call i8* @strcpy(i8* %86, i8* %83)
    %88 = call i8* @strcat(i8* %86, i8* %85)
    %89 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %86)
    %90 = getelementptr inbounds [5 x i32], [5 x i32]* @artifacts, i32 0, i32 0
    store i32 42, i32* %90
    %91 = getelementptr inbounds [5 x i32], [5 x i32]* @artifacts, i32 0, i32 4
    store i32 77, i32* %91
    %str19 = alloca [18 x i8]
    %92 = bitcast [18 x i8]* %str19 to i8*
    call void @llvm.memcpy.p0i8.p0i8.i64(i8* align 1 %92, i8* align 1 getelementptr inbounds ([18 x i8], [18 x i8]* @str19, i32 0, i32 0), i64 18, i1 false)
    %93 = getelementptr inbounds [18 x i8], [18 x i8]* %str19, i32 0, i32 0
    %94 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %93)
    %95 = getelementptr inbounds [5 x i32], [5 x i32]* @artifacts, i32 0, i32 0
    %96 = load i32, i32* %95
    %97 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strp, i32 0, i32 0), i32 %96)
    %98 = getelementptr inbounds [5 x i32], [5 x i32]* @artifacts, i32 0, i32 1
    %99 = load i32, i32* %98
    %100 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strp, i32 0, i32 0), i32 %99)
    %101 = getelementptr inbounds [5 x i32], [5 x i32]* @artifacts, i32 0, i32 2
    %102 = load i32, i32* %101
    %103 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strp, i32 0, i32 0), i32 %102)
    %104 = getelementptr inbounds [3 x [3 x double]], [3 x [3 x double]]* @grid, i32 0, i32 1, i32 1
    store double 3.14, double* %104
    %str20 = alloca [21 x i8]
    %105 = bitcast [21 x i8]* %str20 to i8*
    call void @llvm.memcpy.p0i8.p0i8.i64(i8* align 1 %105, i8* align 1 getelementptr inbounds ([21 x i8], [21 x i8]* @str20, i32 0, i32 0), i64 21, i1 false)
    %106 = getelementptr inbounds [21 x i8], [21 x i8]* %str20, i32 0, i32 0
    %107 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %106)
    %108 = getelementptr inbounds [3 x [3 x double]], [3 x [3 x double]]* @grid, i32 0, i32 1, i32 0
    %109 = load double, double* %108
    %110 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strp_real, i32 0, i32 0), double %109)
    %111 = getelementptr inbounds [3 x [3 x double]], [3 x [3 x double]]* @grid, i32 0, i32 1, i32 1
    %112 = load double, double* %111
    %113 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strp_real, i32 0, i32 0), double %112)
    %114 = getelementptr inbounds [3 x [3 x double]], [3 x [3 x double]]* @grid, i32 0, i32 1, i32 2
    %115 = load double, double* %114
    %116 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strp_real, i32 0, i32 0), double %115)
    %117 = getelementptr inbounds %Relic, %Relic* @holyGrail, i32 0, i32 0
    store i32 2000, i32* %117
    %118 = getelementptr inbounds %Relic, %Relic* @holyGrail, i32 0, i32 1
    store double 99.9, double* %118
    %str21 = alloca [14 x i8]
    %119 = bitcast [14 x i8]* %str21 to i8*
    call void @llvm.memcpy.p0i8.p0i8.i64(i8* align 1 %119, i8* align 1 getelementptr inbounds ([14 x i8], [14 x i8]* @str21, i32 0, i32 0), i64 14, i1 false)
    %120 = getelementptr inbounds [14 x i8], [14 x i8]* %str21, i32 0, i32 0
    %121 = getelementptr inbounds %Relic, %Relic* @holyGrail, i32 0, i32 1
    %122 = load double, double* %121
    %str22 = alloca [33 x i8]
    %123 = getelementptr inbounds [33 x i8], [33 x i8]* %str22, i32 0, i32 0
    %124 = call i32 (i8*, i8*, ...) @sprintf(i8* %123, i8* getelementptr inbounds ([3 x i8], [3 x i8]* @strspf, i32 0, i32 0), double %122)
    %str23 = alloca [46 x i8]
    %125 = getelementptr inbounds [46 x i8], [46 x i8]* %str23, i32 0, i32 0
    %126 = call i8* @strcpy(i8* %125, i8* %120)
    %127 = call i8* @strcat(i8* %125, i8* %123)
    %128 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %125)
    %136 = getelementptr inbounds %Paladin, %Paladin* @arthur, i32 0, i32 0
    store i32 100, i32* %136
    %137 = call i32 @Paladin_strike(%Paladin* @arthur, i32 15)
    store i32 %137, i32* @totalDamage
    %str24 = alloca [22 x i8]
    %138 = bitcast [22 x i8]* %str24 to i8*
    call void @llvm.memcpy.p0i8.p0i8.i64(i8* align 1 %138, i8* align 1 getelementptr inbounds ([22 x i8], [22 x i8]* @str24, i32 0, i32 0), i64 22, i1 false)
    %139 = getelementptr inbounds [22 x i8], [22 x i8]* %str24, i32 0, i32 0
    %140 = load i32, i32* @totalDamage
    %str25 = alloca [17 x i8]
    %141 = getelementptr inbounds [17 x i8], [17 x i8]* %str25, i32 0, i32 0
    %142 = call i32 (i8*, i8*, ...) @sprintf(i8* %141, i8* getelementptr inbounds ([3 x i8], [3 x i8]* @strspi, i32 0, i32 0), i32 %140)
    %str26 = alloca [38 x i8]
    %143 = getelementptr inbounds [38 x i8], [38 x i8]* %str26, i32 0, i32 0
    %144 = call i8* @strcpy(i8* %143, i8* %139)
    %145 = call i8* @strcat(i8* %143, i8* %141)
    %146 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %143)
    %151 = call i32 @calculateKarma(i32 100, i32 25)
    store i32 %151, i32* @myKarma
    %str27 = alloca [22 x i8]
    %152 = bitcast [22 x i8]* %str27 to i8*
    call void @llvm.memcpy.p0i8.p0i8.i64(i8* align 1 %152, i8* align 1 getelementptr inbounds ([22 x i8], [22 x i8]* @str27, i32 0, i32 0), i64 22, i1 false)
    %153 = getelementptr inbounds [22 x i8], [22 x i8]* %str27, i32 0, i32 0
    %154 = load i32, i32* @myKarma
    %str28 = alloca [17 x i8]
    %155 = getelementptr inbounds [17 x i8], [17 x i8]* %str28, i32 0, i32 0
    %156 = call i32 (i8*, i8*, ...) @sprintf(i8* %155, i8* getelementptr inbounds ([3 x i8], [3 x i8]* @strspi, i32 0, i32 0), i32 %154)
    %str29 = alloca [38 x i8]
    %157 = getelementptr inbounds [38 x i8], [38 x i8]* %str29, i32 0, i32 0
    %158 = call i8* @strcpy(i8* %157, i8* %153)
    %159 = call i8* @strcat(i8* %157, i8* %155)
    %160 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %157)
    ret i32 0
}

