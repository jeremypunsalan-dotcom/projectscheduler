FROM openjdk:8
ADD target/projectscheduler.jar projectscheduler.jar
EXPOSE 8081
ENTRYPOINT ["java", "-jar", "projectscheduler.jar"]