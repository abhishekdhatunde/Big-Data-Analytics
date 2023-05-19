// Q3. Write a program to calculate Fibonacci Series up to n numbers.

 
#include <stdio.h>
#include <stdlib.h>

int main(int argc, char *argv[]){
    if (argc>2)
        printf("Please only enter one number!");
    else {
        int a1=0, a2=1, a3=0;
        for(int i=0; i<atoi(argv[1]); i++){
            printf(" %d, ",a3);
            a1 = a2;
            a2=a3;
            a3=a1+a2;
        }

    }
}
