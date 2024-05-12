FROM maven:3.9.6-sapmachine-17 as build
WORKDIR /app
copy . .
RUN mvn clean package -DskypTests

FROM openjdk:17
WORKDIR /APP
COPY --from=build ./app/target/*.jar ./app.jar

ARG EUREKA_SERVER=localhost

ENTRYPOINT java -jar -Dspring.profiles.active=production app.jar

