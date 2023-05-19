'''
5:- Write a program in python that accepts a string to setup a passwords.
 Your entered password must meet the following requirements:
  * The password must be at least eight characters long.
  * It must contain at least one uppercase letter.
   * It must contain at least one lowercase letter.
 * It must contain at least one numeric digit.
'''

def string():

    print('''   Your entered password must meet the following requirements:
                * The password must be at least eight characters long.
                * It must contain at least one uppercase letter.
                * It must contain at least one lowercase letter.
                * It must contain at least one numeric digit.''')

    check = input("please enter password with the above guidline")

    count_upper = 0
    count_lower = 0
    count_digit = 0
    length = len(check)
    for index in check:
        if index.isupper():
            count_lower += 1

        elif index.islower():
            count_upper += 1

        elif index.isdigit():
            count_digit += 1

    if length >= 8 and count_lower >= 1 and count_upper >= 1 and count_digit >= 1 :
        print(f"YOUR PASSWORD IS GOOD TO GO")
    else:
        print(f"WRONG PASSWORD!!! PLEASE CHECK GUIDLINES")

string()