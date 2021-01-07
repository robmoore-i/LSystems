FROM openjdk:11
ARG JAR_FILE=build/libs/*.jar
COPY ${JAR_FILE} lsystems.jar
ENTRYPOINT ["java","-jar","/lsystems.jar"]
