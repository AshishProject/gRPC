package Server;

import java.io.IOException;

import interseptors.AuthorizationInterceptor;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import user.UserService;

public class GrpcServer {

	public static void main(String args[]) throws IOException, InterruptedException {

		System.out.println("starting GRPC Server");
		Server server = ServerBuilder.forPort(9090).addService(new UserService()).intercept(new AuthorizationInterceptor()).build();

		server.start();
		System.out.println("server started at " + server.getPort());
	
		server.awaitTermination();
	}
}