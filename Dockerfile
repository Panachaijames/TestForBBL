
FROM eclipse-temurin:21-jdk-alpine

# Working directory -> the container
WORKDIR /app

# Copy jar file
COPY target/my-banking-api-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]
