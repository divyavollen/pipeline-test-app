FROM alpine/java:21-jdk
WORKDIR /app
COPY target/*.jar /app/pipeline-test-app.jar
EXPOSE 8080
ENTRYPOINT [ "java", "-jar", "/app/pipeline-test-app.jar" ]
