FROM openjdk:8-jdk-alpine
EXPOSE 8080
ADD /build/libs/serverdemo-0.0.1-SNAPSHOT.jar serverdemo.jar
ENTRYPOINT ["java", "-jar", "serverdemo.jar"]