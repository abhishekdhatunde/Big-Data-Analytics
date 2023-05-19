db.restaurants.aggregate([
    {
        $match: {
            "grades.1.date":'ISODate("2014-08-11T00:00:00Z")'
        }
    }
])