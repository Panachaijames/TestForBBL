
FROM eclipse-temurin:21-jdk-alpine

# Working directory -> the container
WORKDIR /app

# Copy jar file
COPY target/*.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]
