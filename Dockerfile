# Usar una imagen base con JDK 11 y Maven
FROM maven:3.9.2-amazoncorretto-17 AS build

# Establecer un directorio de trabajo
WORKDIR /app

# Copiar archivos de tu proyecto al directorio de trabajo
COPY . /app

# Ejecutar Maven para construir el proyecto
RUN mvn clean package

# Crear una nueva imagen basada en OpenJDK 11
FROM openjdk:17-ea-17

# Exponer el puerto que utilizará la aplicación
# 9001 esta en routes
EXPOSE 9001

# Copiar el archivo JAR construido desde la etapa anterior
COPY --from=build /app/target/ejercicio-1.0-SNAPSHOT-jar-with-dependencies.jar /app/ejercicio-1.0-SNAPSHOT-jar-with-dependencies.jar

# Establecer el punto de entrada para ejecutar la aplicación
ENTRYPOINT ["java", "-jar", "/app/ejercicio-1.0-SNAPSHOT-jar-with-dependencies.jar"]