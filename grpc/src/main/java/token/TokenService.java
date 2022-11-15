package token;

import com.ashish.grpc.User.APIResponse;
import com.ashish.grpc.User.LoginRequest;
import com.ashish.grpc.userGrpc;
import com.ashish.grpc.userGrpc.userBlockingStub;
import com.ashish1.grpc.Token.TokenRequest;
import com.ashish1.grpc.Token.TokenResponse;
import com.ashish1.grpc.tokenGrpc.tokenImplBase;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

public class TokenService extends tokenImplBase {

	@Override
	public void getToken(TokenRequest request, StreamObserver<TokenResponse> responseObserver) {

		System.out.println("Inside Token ");

		ManagedChannel channel1 = ManagedChannelBuilder.forAddress("localhost", 9090).usePlaintext().build();
		userBlockingStub userStub = userGrpc.newBlockingStub(channel1);
		LoginRequest loginrequest = LoginRequest.newBuilder().setUsername(request.getUsername())
				.setPassword(request.getPassword()).build();
		APIResponse response = userStub.login(loginrequest);

		TokenResponse.Builder response1 = TokenResponse.newBuilder();

		if (response.getResponsemessage().equals("SUCCESS")) {
			response1.setResponseCode(0).setResponsemessage("Token 123");
		} else {
			response1.setResponseCode(1).setResponsemessage("Failure 0");
		}
		responseObserver.onNext(response1.build());
		responseObserver.onCompleted();
	}
}
