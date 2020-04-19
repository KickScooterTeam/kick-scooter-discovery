FROM openjdk:9
ADD target/kick-scooter-discovery-0.0.1-SNAPSHOT.jar kick-scooter-discovery-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "kick-scooter-discovery-0.0.1-SNAPSHOT.jar"]
