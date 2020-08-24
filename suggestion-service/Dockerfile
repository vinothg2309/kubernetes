FROM openjdk:8-alpine

# Required for starting application up.
RUN apk update && apk add bash

RUN mkdir -p /opt/app
ENV PROJECT_HOME /opt/app
COPY target/suggestion-service-0.0.1-SNAPSHOT.jar $PROJECT_HOME/suggestion-service.jar
WORKDIR $PROJECT_HOME
EXPOSE 8000
CMD ["java","-jar","./suggestion-service.jar"]
