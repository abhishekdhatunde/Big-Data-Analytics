'''
3. A pangram is a sentence that contains all the letters of the English alphabet at least once, for
example: The quick brown fox jumps over the lazy dog. Your task here is to write a function to
check a sentence to see if it is a pangram or not.
'''

# def pangram():
#
#     a = ['a', 'b', 'c', 'd', 'e', 'f', 'g', 'h','i', 'j', 'k', 'l', 'm', 'n', 'o', 'p','q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z']
#
#     b = input("please write a sentence")
#     b.lower()
#     print(b)
#
#     c = 0
#     for i in a:
#             if i not in b :
#                     print("it is not pangram")
#                     c=5
#                     break
#
#     if c !=5 :
#         print("its pangram")
#
# pangram()

def pangram():

    a = ['a', 'b', 'c', 'd', 'e', 'f', 'g', 'h','i', 'j', 'k', 'l', 'm', 'n', 'o', 'p','q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z']

    b = input("please write a sentence")
    b.lower()
    print(b)

    c = 0
    for i in a:
            if i in b :
                c+=1

    if c == 26 :
        print("it is pangram")

    else :
        print("its not pangram")

pangram()

