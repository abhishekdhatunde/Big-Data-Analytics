/* Q15. Input a string from the user. Count occurrences (case insensitive) of
each alphabet in the string.
Sample output:
Input: Welcome to SunBeam.
Output:
A : 1
B : 1
C : 1
E : 3
L : 1
M : 2
N : 1
O : 2
S : 1
T : 1
U : 1
W : 1 */

#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main(int argc, char *argv[]){
     int a[52]={0};
     printf("Enter a String : ");
     char *name = malloc(100);
     char an='a';
     fgets(name,100,stdin);
     int Length = strlen(name)-1;
     printf("Length of the string is : %d\n",Length);
     printf("Input : %s",name);
     int i=0;
     while (name[i]) {
        an = name[i];
        name[i]=toupper(an);
        i++;
    }
     for (i=0; i<Length; i++){
        an = *(name +i);
        if (an >= 'A' && an <= 'Z'){
            a[an - 65] += 1;
        }
        else if (an >='a' && an <= 'z'){
            a[an - 71] += 1;
        }
     }
     for (i=0; i<52; i++){
         if (a[i] > 0 && i<26){
            printf("%c : %d\n",i+65,a[i]);
         }
         else if (a[i] > 0 && i>25){
            printf("%c : %d\n",i+71,a[i]);
         }

     }

}
