/* Q9. Accept an integer number and when the program is executed print the
binary, octal and hexadecimal equivalent of the given number.
Sample Output:
Enter Number : 20
Given Number :20
Binary equivalent :10100
Octal equivalent :24
Hexadecimal equivalent :14 */

#include <stdio.h>
#include <stdlib.h>
#include <ctype.h>

void conversion_binary(int a){
    while(a){
        if (a & 1)
            printf("1");
        else
            printf("0");

        a >>= 1;
    }
}
int main(int argc, char *argv[]){
    int num;
    printf(" Enter Number : ");
    scanf("%d",&num);
    printf(" Given Number : %d \n",num);
    printf(" Binary Equivalent : ");
    conversion_binary(num);
    printf("\n");
    printf(" Hexadecimal Equivalent : %x \n",num);
    printf(" Octal Equivalent : %o",num);

}
