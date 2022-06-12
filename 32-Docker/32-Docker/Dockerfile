#Following command is used  to inherit docker file from "openjdk Docker file"
FROM openjdk:8

#Following command tell DevOps team  to  expose port 8080
EXPOSE 8080
#Following command is used to copy jar file from local computer to container

COPY /test.jar test.jar

#following command is used to run the jar file
CMD ["java","-jar","test.jar"]
