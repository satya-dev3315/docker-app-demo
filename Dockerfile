FROM openjdk:17-jdk-slim

ADD target/docker-demo.jar docker-demo.jar

ENTRYPOINT [ "java","-jar","docker-demo.jar" ]