package user;

import com.ashish.grpc.User.APIResponse;
import com.ashish.grpc.User.Empty;
import com.ashish.grpc.User.LoginRequest;
import com.ashish.grpc.userGrpc.userImplBase;

import dao.UserDao;
import io.grpc.stub.StreamObserver;

public class UserService extends userImplBase {

	@Override
	public void login(LoginRequest request, StreamObserver<APIResponse> responseObserver) {
		System.out.println("Inside login");

		String username = request.getUsername();
		String password = request.getPassword();
		
		UserDao ud = new UserDao();
		ud.save(username,password);
		
		APIResponse.Builder response = APIResponse.newBuilder();
		if (username.equals(password)) {
			response.setResponseCode(0).setResponsemessage("SUCCESS");
		} else {
			response.setResponseCode(100).setResponsemessage("INVALID PASSWORD");
		}

		responseObserver.onNext(response.build());
		responseObserver.onCompleted();
	}

	@Override
	public void logout(Empty request, StreamObserver<APIResponse> responseObserver) {
		super.logout(request, responseObserver);
	}

}
