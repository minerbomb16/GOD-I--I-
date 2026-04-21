@echo off

cls

echo --- 1. Generowanie parsera ANTLR ---
java -jar antlr-4.13.2-complete.jar -o output LangX.g4

echo --- 2. Kompilacja kodu Java ---
javac -cp "antlr-4.13.2-complete.jar;output;." output\*.java *.java

echo --- 3. Uruchamianie kompilatora LangX ---
java -cp "antlr-4.13.2-complete.jar;output;." Main test.x > test.ll

if %errorlevel% neq 0 (
    echo.
    echo [!] Kompilacja przerwana z powodu bledu w kodzie zrodlowym.
    exit /b %errorlevel%
)

echo --- 4. Generowanie pliku wykonywalnego ---
clang test.ll runtime.c -Wno-override-module -o test.exe

if %errorlevel% neq 0 (
    echo.
    echo [!] Blad linkera/kompilatora C.
    exit /b %errorlevel%
)

echo --- 5. Uruchamianie programu test.exe ---
.\test.exe