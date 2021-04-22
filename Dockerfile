FROM openjdk:11-jdk-slim

RUN mkdir /var/circleci-with-springboot

ARG DEPENDENCY=build
ADD ${DEPENDENCY}/libs/aws-ecs-circle-ci-0.0.1-SNAPSHOT.jar /var/circleci-with-springboot/circleciwithspringboot.jar

EXPOSE 9999

ENTRYPOINT ["java", "--server.port=80", "-jar","/var/circleci-with-springboot/circleciwithspringboot.jar"]
