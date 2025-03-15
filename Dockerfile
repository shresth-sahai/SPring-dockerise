#FROM ubuntu:latest
#LABEL authors="shresthsahai"
# use an openjdk for dev
FROM openjdk:11-jre-slim

VOLUME /tmp
# copy the jar file into container
COPY target/demo-0.0.1-SNAPSHOT.jar app.jar

# run jar file
ENTRYPOINT ["java","-jar","/app.jar"]













