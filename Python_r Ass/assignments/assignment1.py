#1. Python program to swap two numbers using function

def swap(number1, number2):
    print(f"number1 before swap {number1}")
    print(f"number2 before swap {number2}")

    number3 = number1
    number1 = number2
    number2 = number3

    print(f"number1 after swap {number1}")
    print(f"number2 after swap {number2}")

swap(2,3)

'''
number1 = 2
number2 = 3

print(f"number1 before swap {number1}")
print(f"number2 before swap {number2}")

temp = number1
number1 = number2
number2 = temp

print(f"number1 after swap {number1}")
print(f"number2 after swap {number2}")

'''