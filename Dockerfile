# Step 1: Use a Java Runtime environment
FROM eclipse-temurin:21-jdk-alpine

# Step 2: Set the working directory inside the container
WORKDIR /app

# Step 3: Copy the JAR file from your target folder to the container
# (Make sure to run 'mvn clean package' in STS first to generate this JAR)
COPY target/*.jar app.jar

# Step 4: Run the application
ENTRYPOINT ["java", "-jar", "app.jar"]