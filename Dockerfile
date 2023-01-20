FROM openjdk:17
EXPOSE 8080
ADD target/docker-1.0.0.jar docker-1.0.0.jar
ENTRYPOINT ["java","-jar","/docker-1.0.0.jar"]