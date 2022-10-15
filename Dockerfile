FROM eclipse-temurin
EXPOSE 8080
ADD target/esporte-0.0.1-SNAPSHOT.jar esporte.jar
ENTRYPOINT [ "java", "-jar", "esporte.jar" ]