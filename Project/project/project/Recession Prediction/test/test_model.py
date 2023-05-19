import pickle

model_file = open('recession_model.pk', 'rb')

model = pickle.load(model_file)
test_sample = [[94.4,8.9,13.00,95.5,0.15234,1.666,105,30,99,1.5]]

prediction = model.predict(test_sample)

print(prediction)