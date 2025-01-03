FROM openjdk:17-jdk-slim

WORKDIR /app

COPY target/M3_CAOconfirmation-0.0.1-SNAPSHOT.jar /app

EXPOSE 8083

CMD ["java", "-jar", "M3_CAOconfirmation-0.0.1-SNAPSHOT.jar"]