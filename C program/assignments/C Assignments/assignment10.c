/* Q10. Read at most 10 names of students and store them into an array of
char nameOfStudents[10][50]. Sort the array and display them back. Hint:
Use qsort() method. */

#include <stdio.h>
#include <stdlib.h>
#include <ctype.h>
#include <string.h>

int compareString(const void *a,const void *b){
    const char **str_a = (const char **)a;
    const char **str_b = (const char **)b;
    return (strcmp(*str_a,*str_b));
}

int main(int argc, char *argv[]){
    int i;
    char nameOfStudents[3][50];
    for (i=0; i<3; i++){
        printf("Enter name of the Student : ");
        fgets(nameOfStudents[i],50, stdin);
    }
    printf("sjaj");
    getchar();
    qsort(nameOfStudents,3,sizeof(nameOfStudents[0]),compareString);
    printf("sjaj");
    for(i=0; i<3; i++){
        printf("%s \n",nameOfStudents[i]);
    }
}
