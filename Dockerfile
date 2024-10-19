FROM openjdk:17
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} docker-with-springboot.jar
EXPOSE 8520
# Set the environment variable to choose the profile
# The profile will load the respective application-{profile}.properties
#ENV SPRING_PROFILES_ACTIVE=default
ENTRYPOINT ["java","-jar","/docker-with-springboot.jar"]