FROM openjdk:8-jdk-alpine

VOLUME /tmp

COPY ./target/springboot-actions-test-0.0.1-SNAPSHOT.jar /root/app.jar

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/root/app.jar"]