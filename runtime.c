#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <errno.h>

void readInt(int* ptr) {
    char buf[256];
    if (scanf("%255s", buf) != 1) {
        printf("Error: Expected Mortal!\n");
        exit(1);
    }
    
    int c;
    while ((c = getchar()) != '\n' && c != EOF) {}

    char *endptr;
    errno = 0;
    long val = strtol(buf, &endptr, 10);

    if (endptr == buf || errno == ERANGE || val > 2147483647 || val < -2147483648LL) {
        printf("Error: Mortal value is too huge or invalid!\n");
        exit(1);
    }
    
    *ptr = (int)val;
}

void readReal(double* ptr) {
    char buf[256];
    if (scanf("%255s", buf) != 1) {
        printf("Error: Expected Divine!\n");
        exit(1);
    }
    
    int c;
    while ((c = getchar()) != '\n' && c != EOF) {}

    if (strlen(buf) > 17) {
        printf("Error: Divine value has too many digits!\n");
        exit(1);
    }

    char *endptr;
    errno = 0;
    double val = strtod(buf, &endptr);

    if (endptr == buf || errno == ERANGE) {
        printf("Error: Divine value is invalid!\n");
        exit(1);
    }
    
    *ptr = val;
}

void readFloat(float* ptr) {
    char buf[256];
    if (scanf("%255s", buf) != 1) {
        printf("Error: Expected SmallDivine!\n");
        exit(1);
    }
    
    int c;
    while ((c = getchar()) != '\n' && c != EOF) {}

    if (strlen(buf) > 9) {
        printf("Error: SmallDivine value has too many digits and will lose precision!\n");
        exit(1);
    }

    char *endptr;
    errno = 0;
    float val = strtof(buf, &endptr);

    if (endptr == buf || errno == ERANGE) {
        printf("Error: SmallDivine value is invalid!\n");
        exit(1);
    }
    
    *ptr = val;
}

void readString(char* ptr) {
    if (scanf("%255s", ptr) != 1) {
        printf("Error: Expected Eternal!\n");
        exit(1);
    }
    int c;
    while ((c = getchar()) != '\n' && c != EOF) {}
}

void printString(char* ptr) {
    printf("%s\n", ptr);
}

void copyString(char* dest, char* src) {
    strcpy(dest, src);
}

int readDogma() {
    char buffer[256];

    scanf("%255s", buffer);

    if (strcmp(buffer, "Heaven") == 0 || strcmp(buffer, "1") == 0) {
        return 1;
    }

    if (strcmp(buffer, "Hell") == 0 || strcmp(buffer, "0") == 0) {
        return 0;
    }

    printf("Runtime error: Dogma must be Heaven, Hell, 1 or 0.\n");
    exit(1);
}
