/* Q7. Write a program to accept a number from user using command line
argument and display its table. */

#include <stdio.h>
#include <stdlib.h>
#include <ctype.h>

int main(int argc, char *argv[]){
    if (argc>2)
        printf(" Enter Only one number!");
    else{
        for (int i=1; i<=10; i++)
            printf(" %d \n", atoi(argv[1]) * i);
    }
}
