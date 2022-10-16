FROM eclipse-temurin
EXPOSE 8080
ADD target/syminate-0.0.1-SNAPSHOT.jar syminate.jar
ENTRYPOINT [ "java", "-jar", "syminate.jar" ]