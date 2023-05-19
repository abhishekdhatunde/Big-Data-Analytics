import pickle

# create empty binary file
model_file = open('co2_emission_prediction.pk','rb')

model = pickle.load(model_file)

prediction = model.predict([[2,4,8]])
print(prediction)