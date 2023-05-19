from pymongo import MongoClient
client=MongoClient("mongodb://127.0.0.1:27017")
db=client['dbda']
emp=db['emp']

emps=emp.find()



# for emp in emps:
#     print(emp['ename'])

# emp.insert_one({'_id':545157,'ename':'vef','sal':4548})

# emp.update_one({'ename':'vef'}, {'$set':{'sal':7845}})

# emp.delete_one({'ename':'vef'})
# for emp in emps:
#     print(emp)

print(emps)