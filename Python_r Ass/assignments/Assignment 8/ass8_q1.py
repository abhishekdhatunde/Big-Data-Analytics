'''
Que1.
Write a Python program to create a Vehicle class with max_speed and mileage instance attributes.
Write a python program to Create a child class Bus that will inherit all of the
 variables and methods of the Vehicle class
'''

class Vehicle:
    def __init__(self, max_speed, mileage_instance):
        self.max_speed = max_speed
        self.mileage_instance=mileage_instance

    def print(self):
        print(F"max_speed is {self.max_speed}")
        print(F"mileage_instance is {self.mileage_instance}")

class Bus(Vehicle):
    def __init__(self,max_speed, mileage_instance):
        Vehicle.__init__(self,max_speed, mileage_instance)

    def print_details(self):
        print(F"------ vehicles details -------- ")
        Vehicle.print(self)

max_speed= input("please enter max_speed")
mileage_instance = input("please enter mileage_instance")

b1 =  Bus(max_speed, mileage_instance)
b1.print_details()
