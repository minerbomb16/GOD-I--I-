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
@str1 = constant [43 x i8] c"=== INICJALIZACJA ZMIENNYCH GLOBALNYCH ===\00"
@mnoznik = global i32 0
@globalnaTablica = global [3 x i32] zeroinitializer
@globalnaMacierz = global [2 x [2 x i32]] zeroinitializer
@str2 = constant [34 x i8] c"=== DEFINICJE CUDOW (FUNKCJI) ===\00"
@str3 = constant [69 x i8] c"-> [Wnetrze funkcji] Wykonuje magiczna kalkulacje na roznych typach!\00"
@str4 = constant [55 x i8] c"-> [Wnetrze funkcji] Tworze i drukuje LOKALNA tablice:\00"
@str5 = constant [55 x i8] c"-> [Wnetrze funkcji] Tworze i drukuje LOKALNA macierz:\00"
@str6 = constant [94 x i8] c"-> [Wnetrze funkcji] Nadpisuje GLOBALNA tablice uzywajac funkcji pomnoz() i zmiennej mnoznik:\00"
@str7 = constant [36 x i8] c"=== WYKONANIE G£ÓWNEGO PROGRAMU ===\00"
@str8 = constant [34 x i8] c"Wynik zwyklej funkcji pomnoz(10):\00"
@x = global i32 0
@str9 = constant [54 x i8] c"Wynik funkcji z dwoma roznymi argumentami (10 * 2.5):\00"
@wynikMagii = global double 0.0
@str10 = constant [50 x i8] c"Stan GLOBALNEJ tablicy przed wejsciem do funkcji:\00"
@str11 = constant [25 x i8] c"Stan GLOBALNEJ macierzy:\00"
@str12 = constant [42 x i8] c"=== WCHODZE DO FUNKCJI testujKolekcje ===\00"
@smieci = global i32 0
@str13 = constant [26 x i8] c"=== WYSZLAM Z FUNKCJI ===\00"
@str14 = constant [56 x i8] c"Stan GLOBALNEJ tablicy po modyfikacji wewnatrz funkcji:\00"
@str15 = constant [15 x i8] c"=== KONIEC ===\00"

define i32 @pomnoz(i32 %liczba_arg) {
    %liczba = alloca i32
    store i32 %liczba_arg, i32* %liczba
    %14 = load i32, i32* %liczba
    %15 = load i32, i32* @mnoznik
    %16 = mul i32 %14, %15
    %wynik = alloca i32
    store i32 %16, i32* %wynik
    %17 = load i32, i32* %wynik
    ret i32 %17
}

define double @magicznaKalkulacja(i32 %baza_arg, double %mnoznikRzeczywisty_arg) {
    %baza = alloca i32
    store i32 %baza_arg, i32* %baza
    %mnoznikRzeczywisty = alloca double
    store double %mnoznikRzeczywisty_arg, double* %mnoznikRzeczywisty
    %str3 = alloca [69 x i8]
    %18 = bitcast [69 x i8]* %str3 to i8*
    call void @llvm.memcpy.p0i8.p0i8.i64(i8* align 1 %18, i8* align 1 getelementptr inbounds ([69 x i8], [69 x i8]* @str3, i32 0, i32 0), i64 69, i1 false)
    %19 = getelementptr inbounds [69 x i8], [69 x i8]* %str3, i32 0, i32 0
    %20 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %19)
    %21 = load i32, i32* %baza
    %22 = load double, double* %mnoznikRzeczywisty
    %23 = sitofp i32 %21 to double
    %24 = fmul double %23, %22
    %wynik = alloca double
    store double %24, double* %wynik
    %25 = load double, double* %wynik
    ret double %25
}

define i32 @testujKolekcje() {
    %str4 = alloca [55 x i8]
    %26 = bitcast [55 x i8]* %str4 to i8*
    call void @llvm.memcpy.p0i8.p0i8.i64(i8* align 1 %26, i8* align 1 getelementptr inbounds ([55 x i8], [55 x i8]* @str4, i32 0, i32 0), i64 55, i1 false)
    %27 = getelementptr inbounds [55 x i8], [55 x i8]* %str4, i32 0, i32 0
    %28 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %27)
    %lokalnaTablica = alloca [2 x i32]
    store [2 x i32] zeroinitializer, [2 x i32]* %lokalnaTablica
    %29 = getelementptr inbounds [2 x i32], [2 x i32]* %lokalnaTablica, i32 0, i32 0
    store i32 100, i32* %29
    %30 = getelementptr inbounds [2 x i32], [2 x i32]* %lokalnaTablica, i32 0, i32 1
    store i32 200, i32* %30
    %31 = getelementptr inbounds [2 x i32], [2 x i32]* %lokalnaTablica, i32 0, i32 0
    %32 = load i32, i32* %31
    %33 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strp, i32 0, i32 0), i32 %32)
    %34 = getelementptr inbounds [2 x i32], [2 x i32]* %lokalnaTablica, i32 0, i32 1
    %35 = load i32, i32* %34
    %36 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strp, i32 0, i32 0), i32 %35)
    %str5 = alloca [55 x i8]
    %37 = bitcast [55 x i8]* %str5 to i8*
    call void @llvm.memcpy.p0i8.p0i8.i64(i8* align 1 %37, i8* align 1 getelementptr inbounds ([55 x i8], [55 x i8]* @str5, i32 0, i32 0), i64 55, i1 false)
    %38 = getelementptr inbounds [55 x i8], [55 x i8]* %str5, i32 0, i32 0
    %39 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %38)
    %lokalnaMacierz = alloca [2 x [2 x i32]]
    store [2 x [2 x i32]] zeroinitializer, [2 x [2 x i32]]* %lokalnaMacierz
    %40 = getelementptr inbounds [2 x [2 x i32]], [2 x [2 x i32]]* %lokalnaMacierz, i32 0, i32 0, i32 0
    store i32 99, i32* %40
    %41 = getelementptr inbounds [2 x [2 x i32]], [2 x [2 x i32]]* %lokalnaMacierz, i32 0, i32 0, i32 1
    store i32 88, i32* %41
    %42 = getelementptr inbounds [2 x [2 x i32]], [2 x [2 x i32]]* %lokalnaMacierz, i32 0, i32 1, i32 0
    store i32 77, i32* %42
    %43 = getelementptr inbounds [2 x [2 x i32]], [2 x [2 x i32]]* %lokalnaMacierz, i32 0, i32 1, i32 1
    store i32 66, i32* %43
    %44 = getelementptr inbounds [2 x [2 x i32]], [2 x [2 x i32]]* %lokalnaMacierz, i32 0, i32 0, i32 0
    %45 = load i32, i32* %44
    %46 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strp, i32 0, i32 0), i32 %45)
    %47 = getelementptr inbounds [2 x [2 x i32]], [2 x [2 x i32]]* %lokalnaMacierz, i32 0, i32 0, i32 1
    %48 = load i32, i32* %47
    %49 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strp, i32 0, i32 0), i32 %48)
    %50 = getelementptr inbounds [2 x [2 x i32]], [2 x [2 x i32]]* %lokalnaMacierz, i32 0, i32 1, i32 0
    %51 = load i32, i32* %50
    %52 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strp, i32 0, i32 0), i32 %51)
    %53 = getelementptr inbounds [2 x [2 x i32]], [2 x [2 x i32]]* %lokalnaMacierz, i32 0, i32 1, i32 1
    %54 = load i32, i32* %53
    %55 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strp, i32 0, i32 0), i32 %54)
    %str6 = alloca [94 x i8]
    %56 = bitcast [94 x i8]* %str6 to i8*
    call void @llvm.memcpy.p0i8.p0i8.i64(i8* align 1 %56, i8* align 1 getelementptr inbounds ([94 x i8], [94 x i8]* @str6, i32 0, i32 0), i64 94, i1 false)
    %57 = getelementptr inbounds [94 x i8], [94 x i8]* %str6, i32 0, i32 0
    %58 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %57)
    %59 = getelementptr inbounds [3 x i32], [3 x i32]* @globalnaTablica, i32 0, i32 0
    %60 = load i32, i32* %59
    %61 = call i32 @pomnoz(i32 %60)
    %62 = getelementptr inbounds [3 x i32], [3 x i32]* @globalnaTablica, i32 0, i32 0
    store i32 %61, i32* %62
    %63 = getelementptr inbounds [3 x i32], [3 x i32]* @globalnaTablica, i32 0, i32 1
    %64 = load i32, i32* %63
    %65 = call i32 @pomnoz(i32 %64)
    %66 = getelementptr inbounds [3 x i32], [3 x i32]* @globalnaTablica, i32 0, i32 1
    store i32 %65, i32* %66
    %67 = getelementptr inbounds [3 x i32], [3 x i32]* @globalnaTablica, i32 0, i32 2
    %68 = load i32, i32* %67
    %69 = call i32 @pomnoz(i32 %68)
    %70 = getelementptr inbounds [3 x i32], [3 x i32]* @globalnaTablica, i32 0, i32 2
    store i32 %69, i32* %70
    ret i32 1
}


define i32 @main() {
    %str1 = alloca [43 x i8]
    %1 = bitcast [43 x i8]* %str1 to i8*
    call void @llvm.memcpy.p0i8.p0i8.i64(i8* align 1 %1, i8* align 1 getelementptr inbounds ([43 x i8], [43 x i8]* @str1, i32 0, i32 0), i64 43, i1 false)
    %2 = getelementptr inbounds [43 x i8], [43 x i8]* %str1, i32 0, i32 0
    %3 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %2)
    store i32 5, i32* @mnoznik
    %4 = getelementptr inbounds [3 x i32], [3 x i32]* @globalnaTablica, i32 0, i32 0
    store i32 1, i32* %4
    %5 = getelementptr inbounds [3 x i32], [3 x i32]* @globalnaTablica, i32 0, i32 1
    store i32 2, i32* %5
    %6 = getelementptr inbounds [3 x i32], [3 x i32]* @globalnaTablica, i32 0, i32 2
    store i32 3, i32* %6
    %7 = getelementptr inbounds [2 x [2 x i32]], [2 x [2 x i32]]* @globalnaMacierz, i32 0, i32 0, i32 0
    store i32 10, i32* %7
    %8 = getelementptr inbounds [2 x [2 x i32]], [2 x [2 x i32]]* @globalnaMacierz, i32 0, i32 0, i32 1
    store i32 20, i32* %8
    %9 = getelementptr inbounds [2 x [2 x i32]], [2 x [2 x i32]]* @globalnaMacierz, i32 0, i32 1, i32 0
    store i32 30, i32* %9
    %10 = getelementptr inbounds [2 x [2 x i32]], [2 x [2 x i32]]* @globalnaMacierz, i32 0, i32 1, i32 1
    store i32 40, i32* %10
    %str2 = alloca [34 x i8]
    %11 = bitcast [34 x i8]* %str2 to i8*
    call void @llvm.memcpy.p0i8.p0i8.i64(i8* align 1 %11, i8* align 1 getelementptr inbounds ([34 x i8], [34 x i8]* @str2, i32 0, i32 0), i64 34, i1 false)
    %12 = getelementptr inbounds [34 x i8], [34 x i8]* %str2, i32 0, i32 0
    %13 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %12)
    %str7 = alloca [36 x i8]
    %71 = bitcast [36 x i8]* %str7 to i8*
    call void @llvm.memcpy.p0i8.p0i8.i64(i8* align 1 %71, i8* align 1 getelementptr inbounds ([36 x i8], [36 x i8]* @str7, i32 0, i32 0), i64 36, i1 false)
    %72 = getelementptr inbounds [36 x i8], [36 x i8]* %str7, i32 0, i32 0
    %73 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %72)
    %str8 = alloca [34 x i8]
    %74 = bitcast [34 x i8]* %str8 to i8*
    call void @llvm.memcpy.p0i8.p0i8.i64(i8* align 1 %74, i8* align 1 getelementptr inbounds ([34 x i8], [34 x i8]* @str8, i32 0, i32 0), i64 34, i1 false)
    %75 = getelementptr inbounds [34 x i8], [34 x i8]* %str8, i32 0, i32 0
    %76 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %75)
    %77 = call i32 @pomnoz(i32 10)
    store i32 %77, i32* @x
    %78 = load i32, i32* @x
    %79 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strp, i32 0, i32 0), i32 %78)
    %str9 = alloca [54 x i8]
    %80 = bitcast [54 x i8]* %str9 to i8*
    call void @llvm.memcpy.p0i8.p0i8.i64(i8* align 1 %80, i8* align 1 getelementptr inbounds ([54 x i8], [54 x i8]* @str9, i32 0, i32 0), i64 54, i1 false)
    %81 = getelementptr inbounds [54 x i8], [54 x i8]* %str9, i32 0, i32 0
    %82 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %81)
    %83 = call double @magicznaKalkulacja(i32 10, double 2.5)
    store double %83, double* @wynikMagii
    %84 = load double, double* @wynikMagii
    %85 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strp_real, i32 0, i32 0), double %84)
    %str10 = alloca [50 x i8]
    %86 = bitcast [50 x i8]* %str10 to i8*
    call void @llvm.memcpy.p0i8.p0i8.i64(i8* align 1 %86, i8* align 1 getelementptr inbounds ([50 x i8], [50 x i8]* @str10, i32 0, i32 0), i64 50, i1 false)
    %87 = getelementptr inbounds [50 x i8], [50 x i8]* %str10, i32 0, i32 0
    %88 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %87)
    %89 = getelementptr inbounds [3 x i32], [3 x i32]* @globalnaTablica, i32 0, i32 0
    %90 = load i32, i32* %89
    %91 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strp, i32 0, i32 0), i32 %90)
    %92 = getelementptr inbounds [3 x i32], [3 x i32]* @globalnaTablica, i32 0, i32 1
    %93 = load i32, i32* %92
    %94 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strp, i32 0, i32 0), i32 %93)
    %95 = getelementptr inbounds [3 x i32], [3 x i32]* @globalnaTablica, i32 0, i32 2
    %96 = load i32, i32* %95
    %97 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strp, i32 0, i32 0), i32 %96)
    %str11 = alloca [25 x i8]
    %98 = bitcast [25 x i8]* %str11 to i8*
    call void @llvm.memcpy.p0i8.p0i8.i64(i8* align 1 %98, i8* align 1 getelementptr inbounds ([25 x i8], [25 x i8]* @str11, i32 0, i32 0), i64 25, i1 false)
    %99 = getelementptr inbounds [25 x i8], [25 x i8]* %str11, i32 0, i32 0
    %100 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %99)
    %101 = getelementptr inbounds [2 x [2 x i32]], [2 x [2 x i32]]* @globalnaMacierz, i32 0, i32 0, i32 0
    %102 = load i32, i32* %101
    %103 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strp, i32 0, i32 0), i32 %102)
    %104 = getelementptr inbounds [2 x [2 x i32]], [2 x [2 x i32]]* @globalnaMacierz, i32 0, i32 0, i32 1
    %105 = load i32, i32* %104
    %106 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strp, i32 0, i32 0), i32 %105)
    %107 = getelementptr inbounds [2 x [2 x i32]], [2 x [2 x i32]]* @globalnaMacierz, i32 0, i32 1, i32 0
    %108 = load i32, i32* %107
    %109 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strp, i32 0, i32 0), i32 %108)
    %110 = getelementptr inbounds [2 x [2 x i32]], [2 x [2 x i32]]* @globalnaMacierz, i32 0, i32 1, i32 1
    %111 = load i32, i32* %110
    %112 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strp, i32 0, i32 0), i32 %111)
    %str12 = alloca [42 x i8]
    %113 = bitcast [42 x i8]* %str12 to i8*
    call void @llvm.memcpy.p0i8.p0i8.i64(i8* align 1 %113, i8* align 1 getelementptr inbounds ([42 x i8], [42 x i8]* @str12, i32 0, i32 0), i64 42, i1 false)
    %114 = getelementptr inbounds [42 x i8], [42 x i8]* %str12, i32 0, i32 0
    %115 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %114)
    %116 = call i32 @testujKolekcje()
    store i32 %116, i32* @smieci
    %str13 = alloca [26 x i8]
    %117 = bitcast [26 x i8]* %str13 to i8*
    call void @llvm.memcpy.p0i8.p0i8.i64(i8* align 1 %117, i8* align 1 getelementptr inbounds ([26 x i8], [26 x i8]* @str13, i32 0, i32 0), i64 26, i1 false)
    %118 = getelementptr inbounds [26 x i8], [26 x i8]* %str13, i32 0, i32 0
    %119 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %118)
    %str14 = alloca [56 x i8]
    %120 = bitcast [56 x i8]* %str14 to i8*
    call void @llvm.memcpy.p0i8.p0i8.i64(i8* align 1 %120, i8* align 1 getelementptr inbounds ([56 x i8], [56 x i8]* @str14, i32 0, i32 0), i64 56, i1 false)
    %121 = getelementptr inbounds [56 x i8], [56 x i8]* %str14, i32 0, i32 0
    %122 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %121)
    %123 = getelementptr inbounds [3 x i32], [3 x i32]* @globalnaTablica, i32 0, i32 0
    %124 = load i32, i32* %123
    %125 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strp, i32 0, i32 0), i32 %124)
    %126 = getelementptr inbounds [3 x i32], [3 x i32]* @globalnaTablica, i32 0, i32 1
    %127 = load i32, i32* %126
    %128 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strp, i32 0, i32 0), i32 %127)
    %129 = getelementptr inbounds [3 x i32], [3 x i32]* @globalnaTablica, i32 0, i32 2
    %130 = load i32, i32* %129
    %131 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strp, i32 0, i32 0), i32 %130)
    %str15 = alloca [15 x i8]
    %132 = bitcast [15 x i8]* %str15 to i8*
    call void @llvm.memcpy.p0i8.p0i8.i64(i8* align 1 %132, i8* align 1 getelementptr inbounds ([15 x i8], [15 x i8]* @str15, i32 0, i32 0), i64 15, i1 false)
    %133 = getelementptr inbounds [15 x i8], [15 x i8]* %str15, i32 0, i32 0
    %134 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %133)
    ret i32 0
}

