db.persons.aggregate(
    [
        {
            $match:{
                gender:'female'
            }
        },
        {
            $group:{
                _id: {
                    state: "$location.state"
                },
                totalPersons: {
                     $sum : 1
                }
            }
        },
        {
            $sort:{
                totalPersons:-1
            }
        }
    ]
)
db.persons.aggregate(
    [
        {
            $match:{
                "dob.age":{
                    $gt:50
                }
            }
        },
        {
            $group:{
                _id:{gender:'$gender'},
                avg:{$avg: "$dob.age"},
                totalPersons:{$sum:1}
            }
        },
        {
            $sort:{
                totalPersons:1
            }
        }
    ]
)