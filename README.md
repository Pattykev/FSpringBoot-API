# SpringBoot API
## Maven Goals to run

+ **mvn install**: install all packages
+ **mvn package**: package the compile code to a shareable format JAR
+ **mvn compile**: create the target directory
+ **mvn clean**: clean the target directory
+ **mvn test**: run tests

## Usage

The server will start at the port `9000`. Available at this URL `http://localhost:9000`

## Endpoints

+ **GET /employees**: get all the employees

example:

    
   
    [{
        "id": 1,
        "firstName": "Laurent",
        "lastName": "GINA",
        "mail": "laurentgina@mail.com",
        "password": "laurent"
    },
    
    {
        "id": 2,
        "firstName": "Sophie",
        "lastName": "FONCEK",
        "mail": "sophiefoncek@mail.com",
        "password": "sophie"
    },
    
    {
        "id": 3,
        "firstName": "Agathe",
        "lastName": "FEELING",
        "mail": "agathefeeling@mail.com",
        "password": "agathe"
    },
    
    {
        "id": 4,
        "firstName": "Morice",
        "lastName": "Tagne",
        "mail": "tagne@gmail.com",
        "password": "TM-Cut@e03"
    }]
    


+ **GET /employee/{id}**: get an employee with the id `{id}`

example: `{
    "id": 3,
    "firstName": "Agathe",
    "lastName": "FEELING",
    "mail": "agathefeeling@mail.com",
    "password": "agathe"
}`

+ **POST /employee**: create an employee

example: `{
    "id": 6,
    "firstName": "Mounir",
    "lastName": "TOUNDJI",
    "mail": "mtoun@gmail.com",
    "password": "mM-23!WER"
}`

+ **PUT /employee/{id}**: modify an employee informations with the id `{id}`

example: `{
    "id": 4,
    "firstName": "Morice",
    "lastName": "Tagne",
    "mail": "tagne@gmail.com",
    "password": "mM-23!23455"
}`

+ **DELETE /employee/{id}**: delete an employee with the id `{id}`


