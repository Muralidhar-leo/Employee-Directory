Welcome Come!

In this Project I Developed a Employee Directory using SpringBoot and Mongodb database Atlas. I used POSTMAN for testing my application.

I have added the following endpoints in this project

a)Add Employee to the Database

Suppose when we add an employee and send a post request(end point =   "http://localhost:8080/employee" ) data base will be updated and we get a message a            "Employee Added Successfully"

JSON DATA:  
{   
    
    "employeeName":"S CH DEvi",
    "phoneNumber":"9177542986",
    "email":"Schdevi9321@gmail.com",
    "reportsTo":"45f50129-bbaa-4f33-9d46-c0e398306d5c",
    "profileImage":"https://filmfare.wwmindia.com/content/2021/jan/maheshbabu31611209646.jpg"
}
![image](https://github.com/Muralidhar-leo/Emoployee-Directory/assets/129084859/bf089d76-0ebd-4394-9980-ae615c46df59)

In database inside the Employe Collection the data is added:
![image](https://github.com/Muralidhar-leo/Emoployee-Directory/assets/129084859/cfe18fb9-1b8d-45e8-9c98-6c2f6ceb25ff)


![image](https://github.com/Muralidhar-leo/Emoployee-Directory/assets/129084859/11b9dee5-ac09-4cab-9f6a-e6be7e4751c8)




b)Get the Employee by Id and All employees from database.

The end point to get all the employees is   "http://localhost:8080/Employee"

![image](https://github.com/Muralidhar-leo/Emoployee-Directory/assets/129084859/25543416-69c4-41c4-a8e4-723af9e5b9c9) ![image](https://github.com/Muralidhar-leo/Emoployee-Directory/assets/129084859/91582015-cfed-4944-b8a1-9568f4b09ecc)


c)Delete Employee by ID and DeleteALL Employee from database.
d)Update the Employee by Id.
e)Get the Level Manager by Id from database.
f)Implemented the Pagination and Sorting based on Specific detail.


