'''
Que 3
Person class and child Student class Create a class Person with attributes: name and age of type string.
Create a display() method that displays the name and age of an object created via the Person class. Create a child class Student which inherits from the Person class and which also has a section attribute.
Create a method displayStudent() that displays the name, age and section of an object created via the Student class.
Create a student object via an instantiation on the Student class and then test the displayStudent method
'''


class Person:
    def __init__(self, name, age):
        self.name = name
        self.mage = age

    def display(self):
        print(F"name is {self.name}")
        print(F"age is {self.age}")


class Student(Person):
    def __init__(self, name, age):
        Person.__init__(self, name, age)

    def displayStudent(self):
        print(F"------ studen details -------- ")
        Person.display(self)


name = input("please enter name")
age = input("please enter age")

s1 = Student(name, age)
s1.displayStudent()
