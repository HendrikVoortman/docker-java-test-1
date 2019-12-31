FROM openjdk:11  
COPY . /var/www/java  
COPY target/classes /var/www/java  
WORKDIR /var/www/java  
RUN javac src/main/java/dockertest/DockerTest.java  
CMD ["java", "dockertest.DockerTest"]  
