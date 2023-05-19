/* Q13. Declare an Array of type char* and initialize it with a few strings (hard-
coded). Display the strings which are duplicated in that array. (Hint: use
strcmp()) */


#include <stdio.h>
#include <stdlib.h>
#include <ctype.h>
#include <string.h>


int main(int argc, char *argv[]){
    char *names[] = {"Aksh","shbsh","gaurav","Aksh"};
    int length = sizeof(names)/sizeof(names[0]),j;
    printf("%d\n",length);
    for(int i=0; i<length; i++){
        for(j=i+1; j<length; j++){
            if (strcmp(names[i],names[j])==0)
                printf("%s \n",names[i]);
        }
        j++;
    }
}
