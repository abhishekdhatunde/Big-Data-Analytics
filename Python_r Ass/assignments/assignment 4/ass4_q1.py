'''
1. Write a version of a palindrome recognizer that also accepts phrase palindromes such as "Go
hanga salami I'm a lasagna hog.", "Was it a rat I saw?", "Step on no pets", "Sit on a potato pan,
Otis", "Lisa Bonet ate no basil", "Satan, oscillate my metallic sonatas", "I roamed under it as a
tired nude Maori","Rise to vote sir", or the exclamation "Dammit, I'm mad!". Note that
punctuation, capitalization, and spacing are usually ignored.
'''

def Palindrome():
    a = input("please write a sentence")
    a.lower()
    a.replace(" ", "").replace("?","").replace("'","").replace(".","")
    b = a[::-1]
    c= len(b)

    cout=0
    for i in range(len(a)):
        if a[i] == b[i]:
            cout +=1

    if c == c:
        print(" it is a palindrome")
    else:
        print(" it is not a palindrome")

Palindrome()