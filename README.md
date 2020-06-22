# senpiper assignment task



# Framework used :- Spring Boot STS
# Language used :- java
# Database used :- mysql

# Import the postman api from "https://www.getpostman.com/collections/fb0c5c1583fde254d979"
 In the get request it'll show the all db values and the address of this api is : "http://localhost:8080/senpiper/tc"

Similarly for adding into db the address of this api is "http://localhost:8080/senpiper/addtc"

# sample json file for the post request

```
{
	"centerName":"NIT Hamirpur",
	"centerCode":"zserdxcftg",
	"address":{
		"detailedAddress":"Hamipur,Himachal Pradesh",
		"city":"Hamirpur",
		"state":"Himachal Pradesh",
		"pincode":"170005"
	},
	"studentCapacity":60000,
	"coursesOffered":["cse","ece","eee","me"],
	"createdOn":"23-06-2020",
	"contactEmail":"abc@xyz.com",
	"contactPhone":"1234567890"
}
```

