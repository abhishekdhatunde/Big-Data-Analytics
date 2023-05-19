// Q14 Write a program to check if the given string is palindrome.

#include <stdio.h>
#include <stdlib.h>
#include <ctype.h>
#include <string.h>
void palindrome_str(char *str){
    int length = strlen(str),a=0;
    for(int i=0; i<length/2; i++){
        if ( str[i] != str[length-i-1]){
            printf("Given String is not palindrome!");
            break;
        }
        else{
            a++;
        }
    }
    if (a == length/2)
        printf("Given String is palindrome!");
}
int main(int argc, char *argv[]){
    char str[] = "aka";
    printf("Input : %s \n",str);
    palindrome_str(str);
}
