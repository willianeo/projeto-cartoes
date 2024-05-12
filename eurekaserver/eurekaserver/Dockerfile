FROM maven:3.9.6-sapmachine-17 as build
WORKDIR /app
copy . .
RUN mvn clean package -DskypTests

FROM openjdk:17
WORKDIR /APP
COPY --from=build ./app/target/*.jar ./app.jar
# a instrução abaixo era usada antes do IMG - Build
# COPY ./target/eurekaserver-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8761
ENTRYPOINT java -jar app.jar

