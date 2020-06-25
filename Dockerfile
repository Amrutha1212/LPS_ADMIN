FROM openjdk:8-jdk-alpine
ARG JAR_FILE=target/*.jar
COPY original-loan-processing-system-sprint2-0.0.1-SNAPSHOT app.jar
ENTRYPOINT ["java","-jar","/app.jar"]