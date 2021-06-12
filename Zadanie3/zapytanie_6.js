myData= {
        "sex" : "Male",
        "first_name" : "Pawel",
        "last_name" : "Szczepanik",
        "job" : "Job",
        "email" : "email@email.com",
        "location" : {
                "city" : "City",
                "address" : {
                        "streetname" : "StreetName",
                        "streetnumber" : "123"
                }
        },
        "description" : "Description",
        "height" : "198.76",
        "weight" : "98.76",
        "birth_date" : "1970-01-01T00:00:00Z",
        "nationality" : "Polish",
        "credit" : [
                {
                        "type" : "switch",
                        "number" : "1234567890123456789",
                        "currency" : "SOS",
                        "balance" : "9999.99"
                }
        ]
	};
printjson(db.people.insert(myData))