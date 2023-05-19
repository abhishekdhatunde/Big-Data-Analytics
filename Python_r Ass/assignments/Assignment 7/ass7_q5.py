'''
5. An Armstrong number of three digits is an integer such that the sum of the cubes of its digits is
equal to the number itself.
For example, 371 is an Armstrong number since 27+343+1 = 371.
Write a program to find all Armstrong number in the range of 0 and 999
'''

def armstrong():
    for index in range(1000):
        if index < 10:
            if index ** 3 == index:
                print(f"{index} is armstrong num")

        if index >= 10 and index < 100:
            str1 = str(index)
            num = int(str1[0]) ** 3 + int(str1[1]) ** 3
            if num == int(index):
                print(f"{index} is armstrong num")

        if index >= 100:
            str1 = str(index)
            num = int(str1[0]) ** 3 + int(str1[1]) ** 3 + int(str1[2]) ** 3
            if num == int(index):
                print(f"{index} is armstrong num")

armstrong()

