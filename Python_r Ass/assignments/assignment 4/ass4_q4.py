'''
4. Write a function translate() that will translate a text into "rövarspråket"
(Swedish for "robber's language"). That is, double every consonant and place an occurrence of "o" in between.
 For example, translate("this is fun") should return the string "tothohisos isos fofunon".
'''

def translate():
    v = "aeiou"
    user = input("enter the sentence")
    user = user.lower()
    print(user)
    str = ""

    for i in (user):
         if i in v:
             str += i
         elif ( i not in v) and i != " ":
            str += i
            str += "o"
            str += i
         if i == " ":
            str += " "

    print(str)

translate()
