/* Q5. Write a program to check the input characters for uppercase,
lowercase, number of digits and other characters. Display appropriate
message. */


#include<stdio.h>
#include <stdlib.h>
#include <ctype.h>

int main(int argc, char *argv[]){
    char *cha=argv[1];
    int nod,uppercase, lowercase, schar,size;
    nod=uppercase=lowercase=schar=0;
    size = sizeof(argv[1]);
    for (int i=0; i<size; i++){

        if (*cha>'0' && *cha<='9')
            nod = nod + 1;
        else if (isalpha(*cha) == 1)
            uppercase++;
        else if (isalpha(*cha) ==2)
            lowercase++;
        else
            schar++;
        cha++;
    }
    printf("Uppercase : %d, Lowercase : %d, no. of digits : %d, Special characters : %d",uppercase,lowercase,nod,schar);

}
