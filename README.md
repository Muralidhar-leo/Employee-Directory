Welcome Come!

In this Project I Developed a Employee Directory using SpringBoot and Mongodb database Atlas. I used POSTMAN for testing my application.

I have added the following endpoints in this project

\\\\\\   a)Add Employee to the Database  \\\\\\

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




\\\\\\   b)Get the Employee by Id and All employees from database.  \\\\\\

The end point to get all the employees is   "http://localhost:8080/Employee"

![image](https://github.com/Muralidhar-leo/Emoployee-Directory/assets/129084859/25543416-69c4-41c4-a8e4-723af9e5b9c9) ![image](https://github.com/Muralidhar-leo/Emoployee-Directory/assets/129084859/91582015-cfed-4944-b8a1-9568f4b09ecc)


Getting Employee details througn ID endpoint=             "  http://localhost:8080/Employee/fbf6be7e-1f09-4795-89d0-a4969e153e0c"

![image](https://github.com/Muralidhar-leo/Emoployee-Directory/assets/129084859/0a105c31-8c56-4887-bcb9-e569ed7971d4)


if the Employee Id is not Present this message will be displayed       "Emploployee with this id 12345 not present "


![image](https://github.com/Muralidhar-leo/Emoployee-Directory/assets/129084859/75c3086a-64f0-4566-a53a-4b7682aca128)





\\\\\\     c)Delete Employee by ID and DeleteALL Employee from database.   \\\\\\
All the employees in the data base will be deleted                    endpoint= "http://localhost:8080/Delete"

![image](https://github.com/Muralidhar-leo/Emoployee-Directory/assets/129084859/3c7f78b5-65cb-4dd6-87eb-f7f640614cfd)


![image](https://github.com/Muralidhar-leo/Emoployee-Directory/assets/129084859/89ab0f70-a6e3-49bf-a20e-b8db13c921be)

\\\\\\  d)Update the Employee by Id. \\\\\\

![image](https://github.com/Muralidhar-leo/Emoployee-Directory/assets/129084859/42f901a2-10eb-4eeb-bebc-dad399e4f51b)

\\\\\\   e)Get the Level Manager by Id from database. \\\\\\

End Point=    "http://localhost:8080/GetManager/45f50129-bbaa-4f33-9d46-c0e398306d5c/1"
![image](https://github.com/Muralidhar-leo/Emoployee-Directory/assets/129084859/1ffc7740-e228-41cd-8594-1ad56d2ff46c)
![image](https://github.com/Muralidhar-leo/Emoployee-Directory/assets/129084859/0a0b9575-a562-4434-982b-ae8fff4d6686)


\\\\\\ f)Implemented the Pagination and Sorting based on Specific detail.  \\\\\\

End Point=      "http://localhost:8080/employee?page=0&size=3&sortBy=phoneNumber"
![image](https://github.com/Muralidhar-leo/Emoployee-Directory/assets/129084859/6cc4e953-3fd7-4b50-b98b-1354f06bc117)

![image](https://github.com/Muralidhar-leo/Emoployee-Directory/assets/129084859/ebe0c487-7050-42c6-b054-b8d717a1b687)




