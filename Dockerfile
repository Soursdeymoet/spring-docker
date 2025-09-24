# 第二阶段: 运行 jar
FROM openjdk:17-jdk-alpine
WORKDIR /app
COPY target/my-tutorial-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]