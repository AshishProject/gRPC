package Server;

import java.io.IOException;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import token.TokenService;

public class GrpcServer {

	public static void main(String args[]) throws IOException, InterruptedException {

		System.out.println("Starting GRPC Server");
		Server server = ServerBuilder.forPort(9091).addService(new TokenService()).build();

		server.start();
		System.out.println("server started at " + server.getPort());
		server.awaitTermination();
	}
}