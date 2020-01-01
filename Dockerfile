FROM openjdk:11  
COPY . /var/www/java  
COPY target/classes /var/www/java  
WORKDIR /var/www/java  
#ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Dxyz=1234" ]
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Dxyz=1234 \"com.handf.dockertest.DockerTest\" \"AA\" 1234 'X' 1 2 3 4 5" ]
#ENTRYPOINT [ "sh", "-c", "java \"com.handf.dockertest.DockerTest\" \"AA\" 1234 'X' " ]
RUN javac src/main/java/com/handf/dockertest/DockerTest.java  
CMD ["java", "com.handf.dockertest.DockerTest"]  
