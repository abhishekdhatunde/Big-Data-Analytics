/* Q1. Write a program to input n numbers on command line argument and
calculate maximum of them. */

#include <stdio.h>
#include <stdlib.h>

int main(int argc, char *argv[]){
    int max = atoi(argv[1]),a;
    for(int i=2; i<argc; i++){
        a = atoi(argv[i]);
        if (a > max)
            max = a;
    }
    printf("Maximum Number from command line arguments is : %d ",max);
}
