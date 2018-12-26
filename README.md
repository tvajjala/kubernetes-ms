# Running as Docker container

This is a simple spring boot application that runs as docker container.


Register at https://hub.docker.com and login with below common

`docker login`

Build local docker image

`./gradlew clean build` to build binary jar file of your application.

`docker build -t kubernetes-ms .` to create docker image

List all local docker images

`docker images`

Run docker image in local machine

`docker run -d -p 80:8080 kubernetes-ms`

###### -d :- run as Deamon
###### 80 :- host port
###### 8080 :- container exposed port always keep 8080

List all running containers

`docker ps -as`



To push a local image to docker registry, you need to associate the local image with a repository on the docker registry. 
The notation for the repository on docker registry is username/repository:tag.

`docker tag {image-id} {username}/{image-id-on-docker-repo}:{version}`

`docker tag kubernetes-ms tvajjala/kubernetes-ms:1.0-SNAPSHOT`


----
`$tvajjala$ docker images`

REPOSITORY               TAG                 IMAGE ID            CREATED             SIZE
tvajjala/kubernetes-ms   1.0-SNAPSHOT        952d49830b27        6 days ago          121MB
kubernetes-ms            latest              952d49830b27        6 days ago          121MB
openjdk                  8-jdk-alpine        97bc1352afde        2 months ago        103MB

`$tvajjala$ docker push tvajjala/kubernetes-ms:1.0-SNAPSHOT`

The push refers to repository [docker.io/tvajjala/kubernetes-ms]
-----