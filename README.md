# Running as Docker container

This is a simple spring boot application that runs as docker container.


1. Register at https://hub.docker.com and login with below common

`docker login`

2. Use below command to build local image

`./gradlew clean build` to build binary jar file of your application.

`docker build -t kubernetes-ms .` to create docker image

3. below command gives you all the local images

`docker images`

4. Below command used to run docker image in local machine

`docker run -d -p 80:8080 kubernetes-ms`

###### -d :- run as Deamon
###### 80 :- host port
###### 8080 :- container exposed port always keep 8080

5. Below command gives you all the running containers

`docker ps -as`

