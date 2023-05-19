/* Q8. Write a program to read the name of a student (studentName), roll
Number (rollNo) and marks (totalMarks) obtained. rollNo may be an
alphanumeric string. Display the data as read. Hint: Create a Student
structure and write appropriate functions. */

#include <stdio.h>
#include <stdlib.h>
#include <ctype.h>

struct student
    {
        char name[22];
        char roll_no[22];
        int total_marks;
    }s1;

void read_data(){
    printf("Enter name of student : ");
    fgets(s1.name,22, stdin);
    printf("Enter roll of student : ");
    scanf("%s",&s1.roll_no);
    printf("Enter total marks of student: ");
    scanf("%d",&s1.total_marks);
}
void display_data(char a[22], char c[22],int b){
    printf(" Name of student : %s \n",a);
    printf(" Roll no. of student :%s \n",c);
    printf(" Total marks of student :%d \n",b);
}
int main(int argc, char *argv[]){
    read_data();
    display_data(s1.name,s1.roll_no,s1.total_marks);
}
