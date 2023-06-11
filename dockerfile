FROM openjdk:17
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
EntryPoint ["java", "-jar", "/app.jar"] 