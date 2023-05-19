db.createCollection('emps', {
    validator: {
        $jsonSchema: {
            required: ['name','age','mobile'],
            properties: {
                name: {
                    bsonType: 'string'
                },
                age: {
                    bsonType: 'int',
                    minimum: 18
                },
                mobile: {
                    bsonType: 'string'
                }
            }
        }

    }
})
db.createCollection('emps2', {
    validator: {
        $and: [
                {
                    $jsonSchema: {
                        required: ['name','age','mobile'],
                        properties: {
                            name: {
                                bsonType: 'string'
                            },
                            age: {
                                bsonType: 'int',
                                minimum: 18
                            }
                        }
                    }
                },
                {
                    
                    mobile: {
                        $exists: {
                            true
                        }
                        $regex: /^[0-9]{10}/
                    }
                }
            ]
    }
})
