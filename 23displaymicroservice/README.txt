Spring Cloud
--------------------------

It gives you many different libraries for implementing micro services using Spring
--------------------------------------------------------------------------------------------------
1] OpenFeign

  It is used to make REST calls 
  
  Steps to use OpenFeign
  
  1] Add dependency in pom.xml
  
  2] Create an interface with method matching  signature of remote method
  
  3]Enable  feign client
  ------------------------------

  we want to assign unique name to every microservice and use that name to refer that microservice.

It is by using



2)Eureka:it is service registry and discovery service  (8761)
Every microservice registers itself with Eureka.
Eureka server typically runs on port 8761
-----------------------------
3] API gateway(9090)
   This is used to navigate call to micerservice
   All calls are first made to this and then api gateway route call to respective microservice.
   
    Client should never ever call to any microservice directly.Call  should be routed through API gateway.
   
   ----------------------------------------------------------------
   4] Circuit breaker 
   
   	Circuit breaker is used in microservices to handle  failure of services.
   	It is implemented using a library by using spring cloud  are known as -  resilience4j
   -------------------------------------
   	
   	5] Cloud Config Server(8888)
   	
   	It is a centralized application that manages all the application related properties
   	#Following is common property for all microservices
 #If we need to change value of this commom property we need to go all the microservices and change
 # If there are hundreds of microservices it is difficult to do  so that time consuming 
 #Hence common properties shoud be done written using
 #company=zensar India
 
 6]
 There are many microservices communication with each other via apigateway.
 Hence there are many calls. Hence it is difficult to debug(To find how calls are executing)
 To know this we have to use
 
 7] Sleuth
 
 It is used for distributed tracing.
 
    APIgateway------> displayservice-------->messageservice.
    
    TraceID,spanId 
    
    
    [servicename, treceId,spanId]
    
    traceid - is unique for a request across all services
    spanId - is unique for a request within same service
    
    This log is generated by slueth
    
    But this is on console and going through all the logs for all the services on console is  difficult and time consuming task
    
    9] ZipKin
     It is server which shows logs  in GUI from are generated by sleuth
     
     -----------------------------------------------------------------
     @EnableEurekaClient - is an optional annotation on top of client
     
     
     Steps to run  
     1]Run  Eureka server (8761)
     2]Run  config server (8888)
     3]Run zipkin server (9411)
     4]Run  API gateway  (9090)
     5]Run bussiness microservices.
     
     
     
  
     
     
     
     
     
     
     