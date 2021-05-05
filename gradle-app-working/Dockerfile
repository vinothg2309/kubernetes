FROM gradle:4.7.0-jdk8-alpine AS gradleBuild
COPY --chown=gradle:gradle . /home/gradle/src
WORKDIR /home/gradle/src
RUN ./gradlew clean build --no-daemon

From tomcat:8.0.51-jre8-alpine
RUN sed -i 's/port="8080"/port="9000"/' ${CATALINA_HOME}/conf/server.xml
RUN rm -rf /usr/local/tomcat/webapps/*
COPY --from=gradleBuild /home/gradle/src/build/libs/*.war /usr/local/tomcat/webapps/demo.war
EXPOSE 9000
CMD ["catalina.sh","run"]
