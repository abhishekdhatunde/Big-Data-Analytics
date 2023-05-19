'''
2. Given a dictionary of students and their favourite colours:
people={'Arham':'Blue','Lisa':'Yellow',''Vinod:'Purple','Jenny':'Pink'}
A. Find out how many students are in the list
B. Change Lisa’s favourite colour
C. Remove 'Jenny' and her favourite colour
D. Sort and print students and their favourite colours alphabetically by name
'''

def dictionary():

    people = {'Arham': 'Blue', 'Lisa': 'Yellow', 'Vinod':'Purple', 'Jenny': 'Pink'}

    print(len(people))

    people['Lisa'] = 'red'
    print(people['Lisa'])

    for i in people:
        if 'Lisa' == 'Lisa':
            people.pop('Lisa')
            dict(people)

    list1 = []

    a = people.keys()
    list1.append(a)
    list1.sort()

    for i in range(len(list1)):
        print(f"{list1[i]}: {people[list1[i]]}")




dictionary()