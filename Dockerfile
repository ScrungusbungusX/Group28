FROM openjdk:latest
COPY ./target/Group28-SET08103-2024.jar /tmp
WORKDIR /tmp
ENTRYPOINT ["java", "-jar", "Group28-SET08103-2024.jar"]