FROM openjdk:8
VOLUME \tmp
EXPOSE 5555
ADD ./target/service-login-0.0.1-SNAPSHOT.jar Microservice-User.jar
ENTRYPOINT ["java","-jar","/Microservice-User.jar"]