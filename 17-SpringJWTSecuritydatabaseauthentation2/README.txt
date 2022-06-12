Http Status Codes

200   OK

401 UNAUTHORISED(UserName,password not sent OR not correct)
403 FORBIDDEN (Authenticated but not allowed to access a resource)


This project uses DataBase Authentication 

Steps for applying Spring Security
---------------------------------------------
1) To add dependency in pom.xml
		<dependency>
		<groupId>org.springframework.boot</groupId>
		<artifactId>spring-boot-starter-security</artifactId>
		</dependency>
		
By default one user with userName :user
and password : displayed on console : 1e241823-4234-4ea1-8928-ea813e5813d2

problem ?
	
	Every time you run application new password is generated

Above is default behaviour(functionality) we are getting Spring security

we want to have  custom userName and password

2)To write configuration  class


Spring Security is giving implicit support for an attack known as -CSRF(Cross Site Request Forgery) 
POST request doesn't work
SO we need to additional configuration as follows- 
JWT 
JWT stands for JSON web token

JWT consists of  three parts 

header.payload.signature.

header -  consist of algorithm used  to generate the token

payload - consist of claims.Claim is additional data about user entity.
			e.g, username,expiration time etc.
			
signature - it is typically secret key(String which is known only to server to server to validate the token)
eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzUxMiJ9.
eyJuYW1lIjoiemVuc2FyIiwiZXhwIjoxNjUzODk0Nzk4fQ.mPh4Fav33Utkyc8zw6M56Nd5IAyifIscEwH_50Uu6teVfPRSf7gPB0f6WB_7m-KpRZ-V8cdrCu5o7i8wPxHVMQ

 
		
		