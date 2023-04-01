FROM openjdk:19 AS build

COPY pom.xml mvnw ./
COPY .mvn .mvn
RUN ./mvnw dependency:resolve

COPY src src
RUN ./mvnw package

FROM openjdk:19
WORKDIR /account_assesment
COPY --from=build target/*.jar account_assesment.jar
ENTRYPOINT ["java", "-jar", "account_assesment.jar"]