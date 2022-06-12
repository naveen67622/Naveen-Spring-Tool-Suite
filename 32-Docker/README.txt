Docker

1.Docker is a container management service
2.The whole idea of Docker is to to be able to ship applications along with their environment into images.
 Which then can be run anywhere.(Even on Cloud platform e.g AWS)
 
3.Docker image :-In docker image acts as set of instructions to build container.(Like template)
	
	Image can be built OR downloaded (From dockerhub)
	Once  you have image. You run it you  get container.
	Once  you run the container you get the  O/P

 4.Docker container :- It is running  instance of a image 


 How to create our own image?
 1) We need to create a file called as - "Dockerfile"


 e.g. To Run Java application

 Jdk + application + OS=Image 

 Provided - Docker is installed on that machine.
------------------------------
Use MobaXterm Application: MobaXterm is the SSH Client we need this to connect to AWS Virtual machine.

 sudo yum install docker
 docker --version
 sudo service docker start
 sudo chmod 777 /var/run/docker.sock

 --------------------------------
 There are commands to manage images and container.
 
 Command for managing images :- 
 1)docker image ls (This command shows all the images avaliable locally
 2)docker pull name of the image -(Download the image from dockerhub)
 3)docker container run name 
 
 #This command is used to create our own image from docker file from docker file
 4)docker image build -t <imagename> .
  
  To create image and push it to docker hub we must follow following steps while  using image name
  dockerhubid/imagename
  e.g, 
  5) docker image build -t naveenediga/naveen .
  6) docker image push nameofImage 
  
  docker container  run -p 8080:8080 naveenediga/naveen
  
 
 
 