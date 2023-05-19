'''
Q2:-
Write a Python function student_data () which will print the id of a student (student_id).
 If the user passes an argument student_name or student_class(use **kwargs) the function will print the student name and class.
'''

def student_data(Standard, **kwargs):
    print(f" Standard : {Standard}")
    print(kwargs)

name = input("Please Enter Your Name ")
id1 = input("Please Enter Your ID")

student_data(Standard = 'DBDA', Name= name , ID= id1 )

