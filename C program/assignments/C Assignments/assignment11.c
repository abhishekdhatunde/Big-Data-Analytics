/* Q11. Create a structure called Employee that includes three fields - a first
name (type String), a last name (type String) and a monthly salary (double).
Write functions to initialize the fields, print them and modify the values in
the given object. Example methods:*/


void emp_init(struct emp* e);
void set_salary(struct emp *e, double sal);
void emp_display(struct emp *e);

#include <stdio.h>
#include <stdlib.h>
#include <ctype.h>
#include <string.h>
struct Employee{
    char *first_name;
    char *last_name;
    double salary;
}*e1;

void emp_init(struct Employee *e)
{
    e->first_name = "Akash";
    e->last_name = "More";
    e->salary = 4343.4;
}
void set_salary(struct Employee *e ,double sal)
{
    e->salary = sal;
}
void emp_display(struct Employee *e)
{
    printf("Employee's Fist name : %s \n",e->first_name);
    printf("Employee's Last name : %s \n",e->last_name);
    printf("Employee's salary : %f \n",e->salary);
}
int main(int argc, char *argv[])
{
    struct Employee *e1 = malloc(sizeof(*e1));
    emp_init(e1);
    set_salary(e1,4121.1);
    emp_display(e1);
}
