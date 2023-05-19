/* Q4. Write a program to calculate the grade of a student. There are five
subjects. Marks in each subject are entered from keyboard. Assign grade
based on the following rule:
Total Marks >= 90            Grade: Ex
90 > Total Marks >= 80    Grade: A
80 > Total Marks >= 70    Grade: B
70 > Total Marks >= 60    Grade: C
60 > Total Marks              Grade: F

*/
 
#include <stdio.h>
#include <stdlib.h>

int main(int argc, char *argv[]){
    int sum=0;
    if (argc != 6)
        printf("Please enter five subject marks!");
    else {
        for(int i=1; i<argc; i++){
            sum += atoi(argv[i]);
        }
        sum = sum / 5;

    }
    if (sum >= 90)
        printf(" Grade : Ex ");
    else if (sum >= 80 && sum < 90)
        printf(" Grade : A ");
    else if (sum >= 70 && sum < 80)
        printf(" Grade : B ");
    else if (sum >= 60 && sum < 70)
        printf(" Grade : C ");
    else if (sum >= 60)
        printf(" Grade : F ");
}
