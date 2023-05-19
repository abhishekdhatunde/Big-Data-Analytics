// Q8
db.restaurants.find({
    "grades.score": {
        $gt: 90
    }
})
// Q9
db.restaurants.find({
    "grades.score": {
        $between: [80,100]
    }
})
db.restaurants.find({
    "grades.score": {
        $in: [80,100]
    }
})
db.restaurants.find({
    grades: {
        $elemMatch: {
            score: {$in: [80,100]}
        }
    }
})
db.restaurants.find({
    grades: {
        $elemMatch: {
            score: {$gt:80,$lt:100}
        }
    }
})
// Q10
db.restaurants.find({
    "address.coord.0": {$lt:-95.754168}
})
// Q11
db.restaurants.find({
    cuisine: {$ne: 'American '},
})
db.restaurants.find({
    "grades.score":{$gt: 70}
})
db.restaurants.find({
    grades:{$elemMatch:{score:{$gt: 70}}}
})
db.restaurants.find({
    "address.coord.0": {
        $lt:-65.754168
    }
})
db.restaurants.find({
    cuisine: {$ne: 'American '},
    "grades.score":{$gt: 70},
    "address.coord.0": {
        $lt:-65.754168
    }
})
db.restaurants.find({
    $and: [
        {cuisine: {$ne: 'American '}},
        {"grades.score":{$gt:70}},
        {"address.coord.0":{$lt:-65}}
    ]
})
// Q12 Find the restaurants which do not prepare 
// any cuisine of American and achieved a grade 
// point A not belongs to the borough Brooklyn
db.restaurants.find({
    "grades.grade":"A"
})
db.restaurants.find({
    borough: {$ne: 'Bronx'}
})
db.restaurants.find({
    cuisine: {$ne: 'American '}
})
db.restaurants.find({
    "grades.grade":"A",
    cuisine: {$ne: 'American '},
    borough: {$ne: 'Bronx'}
}).count()
db.restaurants.find({
    cuisine: {$ne: 'American '},
    "grades.grade":"A",
    borough: {$ne: 'Bronx'}
}).count()
db.restaurants.find({
    $and: [
        {cuisine: {$ne: 'American '}},
        {"grades.grade": "A"},
        {borough: {$ne:'Bronx'}}
    ]
}).count()
// Q13 Find the restaurant Id, name, borough and 
// cuisine for those restaurants which 
// contain Wil as first three letters for its name
db.restaurants.find(
    {
    name: {$regex: /^Wil/}
    },
    {
        _id:0,
        restaurant_id:1,
        name:1,
        borough:1
    }
)
// Q14 Find the restaurant Id, name, borough and 
// cuisine for those restaurants which
// contain ces as last three letters for its name
db.restaurants.find(
    {
        name: {$regex: /ces$/}
    },
    {
        _id:0,
        name:1,
        borough:1,
        cuisine:1

    }
)
// Q15 Find the restaurant Id, name, borough and 
// cuisine for those restaurants which 
// contain Reg as three letters somewhere in its name
db.restaurants.find(
    {
        name: {$regex: /Reg/}
    },
    {
        _id:0,
        restaurant_id:1,
        name:1,
        borough:1,
        cuisine:1
    }
)
// Q16 Find the restaurant which belongs to 
// the borough 
// Bronx and prepared either American or Chinese dish
db.restaurants.find(
    {
        borough: 'Bronx',
        $or: [
            {cuisine: 'American '},
            {cuisine: 'Chinese'}
        ]
    },
    {
        _id:0,
        name:1,
        cuisine:1
    }
)
db.restaurants.find(
    {
        borough: 'Bronx',
        cuisine: {$in: ['American ','Chinese']}
    },
    {
        _id:0,
        name:1,
        cuisine:1
    }
)
// Q17 Find the restaurant Id, name, borough and 
// cuisine for those restaurants which belong to the 
// borough Staten Island or Queens or Bronx or Brooklyn
db.restaurants.find(
    {
        borough: {
            $in: ['Staten Island', 'Queens', 'Bronx', 'Brooklyn']
        }
    },
    {
        _id:0,
        restaurant_id:1,
        name:1,
        borough:1,
        cuisine:1
    }
)
// Q18
db.restaurants.find(
    {
        borough: {
            $nin: ['Staten Island', 'Queens', 'Bronx', 'Brooklyn']
        }
    },
    {
        _id:0,
        restaurant_id:1,
        name:1,
        borough:1,
        cuisine:1
    }
)
// Q19 Find the restaurant Id, name, borough and
// cuisine for those restaurants 
// which achieved a score which is not more than 10
db.restaurants.find(
    {
        "grades.score": {
            $lt: 10
        }
    }
)
db.restaurants.find(
    {
        "grades.score": {
            $not: {
                $gt:10
            }
        }
    }
)
// Q20
db.restaurants.find(
    {
    name: {
        $not:{$regex: /^Wil/}
        }
    },
    {
        _id:0,
        restaurant_id:1,
        name:1,
        borough:1
    }
)
db.restaurants.find(
    {
        $or: [
            {
                name:{
                    $regex: /^Wil/
                }
            },
            {
                cuisine: {
                    $nin: ['American ', 'Chinese']
                }
            }
        ]
    }
).count()
db.restaurants.find(
    {$or: [
        {name:{$regex: /^Wil/}},
        {$and: [
            {cuisine: {$ne:'American '}},
            {cuisine: {$ne:'Chinese'}}
            ]}
        ]}
).count()
// Q21 find the restaurant Id, name, and grades 
//for those restaurants which achieved a grade 
//of "A" and scored 11 on an ISODate 
//"2014-08-11T00:00:00Z" among many of survey dates.
db.restaurants.aggregate(
    [
        {$match:{
            $and: [
                {"grades.grade":"A"},
                {"grades.score":11},
                {"grades.date":ISODate("2014-08-11T00:00:00Z")}
            ]
            }
        }
    ]
)
db.restaurants.find(
    {$and: [{"grades.grade":"A"},
    {"grades.score":11},
    {"grades.date":ISODate("2014-08-11T00:00:00Z")}]}
).count()
db.restaurants.find({
    grades: {$elemMatch: 
    {$and: [{grade:"A"},
    {score:11},
    {date:ISODate("2014-08-11T00:00:00Z")}]}}}
).count()
db.restaurants.aggregate(
    [
        {$match:{
            grades: {$elemMatch: 
                {$and: [{grade:"A"},
                {score:11},
                {date:ISODate("2014-08-11T00:00:00Z")}]}}
            }
        }
    ]
)
//Write a MongoDB query to find the restaurant Id,
// name, and grades for those restaurants where the 
// 2nd element of grades array contains a grade of "A" 
//and score 9 on an ISODate "2014-08-11T00:00:00Z".
db.restaurants.aggregate([
    {$match:{
        grades:{
            $elemMatch:{
                $and: [
                    {grade:"A"},
                    {score:9},
                    {date:ISODate("2014-08-11T00:00:00Z")}
            ]
            }
        }
    }},
    {$project:{_id:0,name:1,grades:1}}
])
db.restaurants.aggregate([
    {$match:{
        "grades.0":{
            $elemMatch:{
                $and: [
                    {grade:"A"},
                    {score:9},
                    {date:ISODate("2014-08-11T00:00:00Z")}
            ]
            }
        }
    }},
    {$project:{_id:0,name:1,grades:1}}
])
db.restaurants.aggregate([
    {$match:{
            $and: [
                {"grades.1.grade":"A"},
                {"grades.1.score":9},
                {"grades.1.date":ISODate("2014-08-11T00:00:00Z")}
            ]
            }
        },
    {$project:{_id:0,name:1,grades:1}}
])
// restaurant Id, name, address and geographical 
//location for those restaurants where 2nd element 
//of coord array 
//contains a value which is more than 42 and upto 52.
db.restaurants.aggregate([
    {$match:{
        $and: [
        {"address.coord.1":{$gt:42}},
        {"address.coord.1":{$lt:52}}
        ]
    }},
    {$project:{_id:0,name:1}}
])
db.restaurants.find({$and: [
    {"address.coord.1":{$gt:42}},
    {"address.coord.1":{$lt:52}}
    ]}
).count()
db.restaurants.find({
    "address.coord.1":{$gt:42},
    "address.coord.1":{$lt:52}
    }
).count()
//arrange the name of the restaurants 
//in ascending order along with all the columns.
db.restaurants.aggregate([
    {$sort:{name:1}},
    {$project:{_id:0,name:1}}
])
db.restaurants.aggregate([
    {$sort:{name:-1}},
    {$project:{_id:0,name:1}}
])
//select the restaurant Id, name and grades for those 
//restaurants which returns
// 0 as a remainder after dividing the score by 7
db.restaurants.aggregate([
    {$match:{
        "grades.score": {
            $mod: [7,0]
        }
    }},
    {$project:{
        _id:0,
        name:1,
        "grades.score":1
    }}
])
//