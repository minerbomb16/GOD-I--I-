@echo off

cls

echo --- 1. Praying to ANTLR parser ---
java -jar antlr-4.13.2-complete.jar -o output LangX.g4

echo --- 2. Ritual of Java code ---
javac -cp "antlr-4.13.2-complete.jar;output;." output\*.java *.java

echo --- 3. Sacrificing LangX compiler ---
java -cp "antlr-4.13.2-complete.jar;output;." Main test.god > test.ll

if %errorlevel% neq 0 (
    echo.
    echo [!] Ritual interrupted by code error!
    exit /b %errorlevel%
)

echo --- 4. Resurrecting an executable file ---
clang test.ll runtime.c -Wno-override-module -o test.exe

if %errorlevel% neq 0 (
    echo.
    echo [!] Linker C error.
    exit /b %errorlevel%
)

echo --- 5. Executing test.exe ---
.\test.exe