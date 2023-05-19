'''
6. Write a program that input a string and ask user to delete a given word from a string.
# Write a program that input a string and ask
# user to delete a given word from a string.
'''

def string():

    user_string = input("please enter a string")
    print(user_string)
    words = user_string.split()

    user_input = input(" which word you want to delete")
    check = False

    for index in words:
        if index == user_input:
            words.remove(index)
            check = True

        elif check:
            text = ' '.join(words)
            print(f'String after deletion {text}')
        else:
            print('Word not present in string')

string()


