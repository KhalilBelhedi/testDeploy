# Utiliser une image de base contenant une version de Java 17.0.8
FROM adoptopenjdk/openjdk17:alpine-jre

# Définir le répertoire de travail à l'intérieur du conteneur
WORKDIR /app

# Copier le jar de l'application Spring Boot dans le conteneur
COPY target/examenrev-0.0.1-SNAPSHOT.jar /app/examenrev-0.0.1-SNAPSHOT.jar

# Exposer le port sur lequel l'application Spring Boot écoute
EXPOSE 8099

# Commande à exécuter lorsque le conteneur démarre
CMD ["java", "-jar", "examenrev-0.0.1-SNAPSHOT.jar"]