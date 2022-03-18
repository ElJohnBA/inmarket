# REST API InMarket

Api rest for students and courses

Stack tech: Java 11, Spring boot, hibernate JPA

# REST API -STUDENTS

Please follow next steps

## Get a student

### Request

`GET api/student/{id}`

    curl -i -H 'Accept: application/json' localhost:8080/api/student/1

### Response

    {
    "id": 1,
    "firstName": "JOHN",
    "lastName": "BENITEZ",
    "courses": [
        {
            "code": 2,
            "title": "MUSIC",
            "description": "music classes"
        },
        {
            "code": 1,
            "title": "MATH",
            "description": "math classes"
        }
    ]
    }

## Get all students

### Request

`GET api/students`

    curl -i -H 'Accept: application/json' localhost:8080/api/students

### Response

    {
    "id": 1,
    "firstName": "JOHN",
    "lastName": "BENITEZ",
    "courses": [
        {
            "code": 2,
            "title": "MUSIC",
            "description": "music classes"
        },
        {
            "code": 1,
            "title": "MATH",
            "description": "math classes"
        }
    ]
    }

## create students

### Request

`POST api/student`

    curl -X POST 'Accept: application/json' localhost:8080/api/student

### Request

    {
    "firstName": "MICHAEL",
    "lastName": "JACKSON"
    }

### Response

nothing


## delete students

### Request

`DELETE api/student/{id}`

    curl -X DELETE 'Accept: application/json' localhost:8080/api/student/4

### Response

nothing

