'''
2. Display following menu and write required function for it
A. Display characters from even position
B. Display characters from odd position
C. Display length of a string
D. Add a at the end of string length times
'''


def menu():

    def menudriven():
        print("1.Display characters from even position")
        print("2.Display characters from odd position")
        print("3.Display length of a string")
        print("4. add a at the end of string length times")
        print(" 5. exit ")

        return int(input("please choose a number"))

    choice = menudriven()
    while True:
        if choice == 1:
            sent = input("please enter sentence")
            sen1 = sent.replace(" ", "")
            even = sen1[1::2]
            print(f" even position characters are {even}")
            break
        elif choice == 2:
            sent = input("please enter sentence")
            sen2 = sent.replace(" ", "")
            odd = sen2[::2]
            print(f" odd position characters are { odd }")
            break
        elif choice == 3:
            sent = input("please enter sentence")
            sen3 = sent.replace(" ", "")
            length = len(sen3)
            print(f" length of string {length}")

        elif choice == 4:
            sent = input("please enter sentence")
            sen4 = sent.replace(" ", "")
            length = len(sen4)
            add = (length * 'a')
            print(f" sentence is {sent} and count times {add}")
            break

        else:
            print("thank you")
            break
menu()
