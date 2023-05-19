'''
Q1:--
Create a short program that prompts the user for a list of grades separated by commas.
Split the string into individual grades and use a list comprehension to convert each string to an integer.
 Use a “try” statement to inform the user when the values they entered cannot be converted.
'''

def function():

    user = input("Please enter your grades (please use comma to seperate it): ").split(",")

    try:
        user1 = [int(users) for users in user]
        print(user)

    except ValueError:
        print("The grades you entered were in an invalid format.")

function()














# try:
#     pass
# except ValueError:
#     pass