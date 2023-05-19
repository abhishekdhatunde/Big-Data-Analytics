/* Q12. Write a Program to reverse the letters present in the given String. Do
not use strrev() function. */

#include <stdio.h>
#include <stdlib.h>
#include <ctype.h>
#include <string.h>
char *reverse_str(char *str){
    int length = strlen(str);
    printf("%d\n",length);
    char a;
    printf("Before reversing : %s \n",str);
    for(int i=0; i<length/2; i++){
        a = str[i];
        str[i] = str[length-1-i];
        str[length-1-i] = a;
    }
    return str;
}
int main(int argc, char *argv[]){
    char str[] = "Akash";
    printf("Input : %s ",str);
    reverse_str(str);
    printf("Output : %s ",str);
}
