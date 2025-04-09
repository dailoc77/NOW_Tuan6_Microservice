# Sử dụng JDK 17 làm base image
FROM openjdk:17

# Gán biến môi trường để chỉ định file jar
ARG JAR_FILE=build/libs/*.jar

# Copy file jar vào container với tên app.jar
COPY ${JAR_FILE} app.jar

# Chạy ứng dụng
ENTRYPOINT ["java", "-jar", "/app.jar"]
