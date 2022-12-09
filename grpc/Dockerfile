FROM openjdk:11
EXPOSE 9091
ADD ./target/grpc-0.0.1-SNAPSHOT-jar-with-dependencies.jar client.jar
ENTRYPOINT ["java","-jar", "client.jar"]
