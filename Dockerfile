FROM openjdk:latest
COPY ./target/Group28-SET08103-2024-5-1.0-SNAPSHOT-jar-with-dependencies.jar /tmp
WORKDIR /tmp
ENTRYPOINT ["java", "-jar", "Group28-SET08103-2024-5-1.0-SNAPSHOT-jar-with-dependencies.jar"]