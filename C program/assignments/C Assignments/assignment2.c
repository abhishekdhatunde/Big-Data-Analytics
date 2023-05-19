/* Q2. Write a program to calculate a Factorial of a number.
*/

#include <stdio.h>
#include <stdlib.h>

int main(int argc, char *argv[]){
    int fact=1, num = atoi(argv[1]);
    if (argc>2)
        printf("Please only enter one number!");
    else {
        for (int i=num; i>=1; i--){
            fact = fact * i;
        }
    }
    if (fact>1)
        printf("Factorial of %d is %d ",num,fact);
}
