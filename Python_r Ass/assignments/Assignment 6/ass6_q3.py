'''
3. Create a class named Mobile with attributes ModelName,Company,Price and with methods:
set_attributes, print_details and can_afford
'''

class Mobile:
    def __init__(self,modelname = '',company = '',price = 0):
        setattr(self, 'modelname',modelname)
        setattr(self, 'company', company)
        setattr(self, 'price', price)

    def print_details(self):
        print(getattr(self, 'modelname'))
        print(getattr(self, 'company'))
        print(getattr(self, 'price'))

    def can_afford(self):
        iniprice = getattr(self, 'price')
        if price1 > 200000:
            print(f"{modelname1} is not affordable" )
        else:
            print(f"{modelname1} is affordable")

modelname1 = input("Please enter modelname")
company1 = input("Please enter company")
price1 = int(input("Please enter price"))

m1 = Mobile(modelname1,company1, price1)
m1.print_details()
m1.can_afford()

