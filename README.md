# MeetUpManagement
This project is a spring boot project and has been developed to produce rest apis.
This is a project where all registered user can meet together to discuss about their technical view 
in todays fast forward life and in the age of cutting edge.

Thing is very simple:
A user has to register himself on the server using api registerUser. For this simply send a json data in the JSON format as follows:
url: localhost:port/user
method: POST
content/type: application/JSON
Data: {
  "emailID": "abc@abc.com",
  "password": "1234qwer",
  "company": "XYZ",
  "companyAddress": "XYZ",
  "technicalCapabilities": string/optional,
  "mobileNumber": integer,
  "userName": "string",
  "yearsOfExperience": double/optional
}

A user can update or delete or get different resources(Please go through the source code).

In a similar fashion a Meetup can be creted as follows:
url: localhost:port/meetup
method: POST
content/type: application/JSON
Data:{
	"location": "string",
	"guest": "string",
	"presenter": "string",
	"title": "string",
	"date": "yyyy-mm-dd",
	"startTime": "hh:mm:ss",
	"endTime": "hh:mm:dd",
	"description":"string" 
}

As soon as a meetup is created by the admin, it will be available for all the registered user.
User has to simply register for that specific meetup and then go and attend that meetup.
Discuss in the meetup and thereafter give their feedback to that specific meetup.
Based on the feedback rating will be given to the presenter of the meetup and will be reflected in her further meetups.
