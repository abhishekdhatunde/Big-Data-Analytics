'''
6. Write a Python program to read the admission number and names of 10 students from the
keyboard. Create a dictionary of these admission number and names and then display them
on the screen
'''

def school():
    student = {}
    for i in range(0, 10):
        admission_num = input(" please write your number")
        name = input(" please write your name")
        student[admission_num]=name
    print(student)
school()