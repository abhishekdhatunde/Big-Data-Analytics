'''
6. Define a function overlapping() that takes two lists and returns True if they
have at least one member in common, False otherwise.

'''

def overlapping(list1, list2):

        result = 'false'

        for i in list1:

                for j in list2:

                        if i == j :
                                result='True'

        return result

num=overlapping([ 1,2,3,4,5,7 ],[ 8,9,4,10,11,12])
print(num)

'''
def overlapping(list1, list2):

    result = { 'result1': 'true','result2': 'false'}

    for i in list1:

        for j in list2:

            if i == j:

                print('true')

    return 'false'

overlapping([1, 2, 3, 4, 5, 7], [8, 9, 4, 10, 11, 12])
'''