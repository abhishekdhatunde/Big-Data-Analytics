// Q6. Write a program to perform matrix multiplication.

#include <stdio.h>
#include <stdlib.h>
#include <ctype.h>

int main(int argc, char *argv[]){
    int a[2][2] = {2,3,4,4}, b[2][2] = {3,2,3,4}, c[2][2]={0};
    for (int i=0; i<2; i++){
        for (int j=0; j<2; j++){
            c[i][j] = a[i][j] * b[j][i];
        }
    }
    int i=0;
    for (int j=0; j<2; j++){
        printf(" %d ",c[i][j]);
        if (j == 1){
            if (i==1){
                break;
            }
            else{
                i++;
                j=-1;
            }
        }
    }
}
