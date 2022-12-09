FROM openjdk:11
EXPOSE 9090
ADD ./target/ashish-0.0.1-SNAPSHOT-jar-with-dependencies.jar server.jar
ENTRYPOINT ["java","-jar", "server.jar"]
