FROM openjdk:18-jdk-alpine
EXPOSE 8080
ADD target/jenkins-test-service.jar jenkins-test-service.jar
ENTRYPOINT ["java","-jar","/jenkins-test-service.jar"]