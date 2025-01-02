# Étape 1 : Utiliser une image Maven officielle pour construire l'application
FROM maven:3.9.4-eclipse-temurin-17 AS build
WORKDIR /app

# Copier les fichiers de votre projet dans le conteneur
COPY pom.xml .
COPY src ./src

# Construire l'application (packaging en jar)
RUN mvn clean package -DskipTests

# Étape 2 : Utiliser une image JDK pour exécuter l'application
FROM eclipse-temurin:17-jdk-alpine
WORKDIR /app

# Copier le JAR généré depuis l'étape précédente
COPY --from=build /app/target/apiCloud-0.0.1-SNAPSHOT.jar app.jar

# Exposer le port 8080 (par défaut pour Spring Boot)
EXPOSE 8080

# Commande pour exécuter l'application
ENTRYPOINT ["java", "-jar", "app.jar", "--spring.profiles.active=dev"]
