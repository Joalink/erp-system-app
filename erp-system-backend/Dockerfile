FROM maven:3.9.8-eclipse-temurin-21 AS build
COPY . /app
WORKDIR /app
RUN mvn clean package

FROM eclipse-temurin:21

ENV DATABASE_URL jdbc:mysql://localhost:3306/erp_system_db
ENV DATABASE_USERNAME admin
ENV DATABASE_PASSWORD cl1n1c_1234
ENV DATABASE_PLATFORM org.hibernate.dialect.MySQL57Dialect
ENV DATABASE_DRIVER com.mysql.cj.jdbc.Driver

COPY --from=build /app/target/erp-system-backend-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]