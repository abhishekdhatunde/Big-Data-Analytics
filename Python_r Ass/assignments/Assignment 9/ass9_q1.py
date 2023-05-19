'''
Create a class 'Student' with rollno, studentName, course ,dictionary of marks(subjectName - marks [5]).
Provide following functionalities
A. initializer
B. override __str__ method
C. accept student data
D. Print student data
E. accept records of 5 students and Print it
'''


class Student:
    def __init__(self, name, rollno, course):
        self.name = name
        self.rollno = rollno
        self.course = course
        self.dictionary = {}

    def __str__(self):
        name = self.name
        rollno = self.rollno
        course = self.course
        return name, rollno, course

name = input(" please enter your name")
rollno = input(" please enter your rollno")
course = input(" please enter your course")
s1 = Student(name, rollno, course)
for index in range(5):
    subject = input(" please enter your subjectname")
    marks = input(" please enter your marks")
    s1.dictionary[subject] = marks

name = input(" please enter your name")
rollno = input(" please enter your rollno")
course = input(" please enter your course")
s2 = Student(name, rollno, course)
for index in range(5):
    subject = input(" please enter your subjectname")
    marks = input(" please enter your marks")
    s2.dictionary[subject] = marks

name = input(" please enter your name")
rollno = input(" please enter your rollno")
course = input(" please enter your course")
s3 = Student(name, rollno, course)
for index in range(5):
    subject = input(" please enter your subjectname")
    marks = input(" please enter your marks")
    s3.dictionary[subject] = marks

name = input(" please enter your name")
rollno = input(" please enter your rollno")
course = input(" please enter your course")
s4 = Student(name, rollno, course)
for index in range(5):
    subject = input(" please enter your subjectname")
    marks = input(" please enter your marks")
    s4.dictionary[subject] = marks

name = input(" please enter your name")
rollno = input(" please enter your rollno")
course = input(" please enter your course")
s5 = Student(name, rollno, course)
for index in range(5):
    subject = input(" please enter your subjectname")
    marks = input(" please enter your marks")
    s5.dictionary[subject] = marks

print(s1.__dict__)

print(s2.__dict__)

print(s3.__dict__)

print(s4.__dict__)

print(s5.__dict__)

