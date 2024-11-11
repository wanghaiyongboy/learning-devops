FROM openjdk:21-slim

WORKDIR /app
COPY ./target/dev-ops-0.0.1-SNAPSHOT.jar /app/demo-java.jar

EXPOSE 8000

CMD ["java","-jar","/app/demo-java.jar"]