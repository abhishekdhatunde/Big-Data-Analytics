from flask import Flask, render_template, request

app = Flask(__name__)


@app.route("/", methods=["GET"])
def root():
    return render_template("index.html")

@app.route("/predict", methods=["GET"])
def predict():
    # user input
    engine_size = int(request.args.get("Engine Size"))
    no_of_cylinder = int(request.args.get("Number of Cylinder"))
    fuel_consumption = float(request.args.get("Fuel consumption"))

    import pickle
    model_file = open("co2_emission_prediction.pk","rb")
    model = pickle.load(model_file)
    model_file.close()
    co2_emission = model.predict([[engine_size, no_of_cylinder, fuel_consumption]])
    return f"your Engine CO2 emission is: {co2_emission[0]}"

app.run(port= 8080, debug=True, host= "0.0.0.0")



