# docker-with-springboot
This is a simple Spring Boot project to generate a Docker image, and it also demonstrates how to run different environments using Docker commands.


1.mvn clean
2.mvn install
3.spring-boot:build-image -DskipTests / docker build -t imageName:version . - we can build in either way.

4.docker images -  Get all the images in your docker

5.docker ps - This command will show a list of all currently running containers

6.docker ps -a: This command lists all containers, including running, stopped, and exited containers.

7.docker run -p 8585:8585 docker-with-springboot:0.0.1-snapshot  - with port,name and tag

a. First 8585 (Host Port): This is the port on the host (your local machine or server) where the application will be accessible. When you access http://localhost:8585, you're hitting this port.

b. Second 8585 (Container Port): This is the port inside the Docker container where the Spring Boot application is running. In your Spring Boot application, you probably have the server configured to listen on port 8585 (via server.port=8585 in the application.properties or application.yml).

8.docker run --name containername -p 8520:8520 -e SPRING_PROFILES_ACTIVE=envname imagename:versionNumber - With these cmd we can name our container,envname,imagename and tag

a.example to run prod env image :- docker run --name dockerspring -p 8686:8686 -e SPRING_PROFILES_ACTIVE=prod docker-with-springboot:0.0.1-snapshot

b.example to run dev env image :- docker run --name dockerspring -p 8585:8585 -e SPRING_PROFILES_ACTIVE=prod docker-with-springboot:0.0.1-snapshot

9.docker stop imageId




