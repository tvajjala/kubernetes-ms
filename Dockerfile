# Start with a base image containing Java runtime
FROM openjdk:8-jdk-alpine

# Add Maintainer Info
LABEL maintainer="tvajjala@gmail.com"

# Add a volume pointing to /tmp
VOLUME /tmp

# Make port 8080 available to the world outside this container
EXPOSE 8080

# The application's jar file
ARG JAR_FILE=build/libs/kubernetes-ms-1.0-SNAPSHOT.jar

# Add the application's jar to the container
ADD ${JAR_FILE} kubernetes-ms.jar

# Run the jar file
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./tvajjala","-jar","/kubernetes-ms.jar"]

