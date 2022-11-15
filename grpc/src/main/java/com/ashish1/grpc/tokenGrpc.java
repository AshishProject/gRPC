package com.ashish1.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: token.proto")
public final class tokenGrpc {

  private tokenGrpc() {}

  public static final String SERVICE_NAME = "token";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.ashish1.grpc.Token.TokenRequest,
      com.ashish1.grpc.Token.TokenResponse> getGetTokenMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getToken",
      requestType = com.ashish1.grpc.Token.TokenRequest.class,
      responseType = com.ashish1.grpc.Token.TokenResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ashish1.grpc.Token.TokenRequest,
      com.ashish1.grpc.Token.TokenResponse> getGetTokenMethod() {
    io.grpc.MethodDescriptor<com.ashish1.grpc.Token.TokenRequest, com.ashish1.grpc.Token.TokenResponse> getGetTokenMethod;
    if ((getGetTokenMethod = tokenGrpc.getGetTokenMethod) == null) {
      synchronized (tokenGrpc.class) {
        if ((getGetTokenMethod = tokenGrpc.getGetTokenMethod) == null) {
          tokenGrpc.getGetTokenMethod = getGetTokenMethod = 
              io.grpc.MethodDescriptor.<com.ashish1.grpc.Token.TokenRequest, com.ashish1.grpc.Token.TokenResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "token", "getToken"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ashish1.grpc.Token.TokenRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ashish1.grpc.Token.TokenResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new tokenMethodDescriptorSupplier("getToken"))
                  .build();
          }
        }
     }
     return getGetTokenMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static tokenStub newStub(io.grpc.Channel channel) {
    return new tokenStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static tokenBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new tokenBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static tokenFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new tokenFutureStub(channel);
  }

  /**
   */
  public static abstract class tokenImplBase implements io.grpc.BindableService {

    /**
     */
    public void getToken(com.ashish1.grpc.Token.TokenRequest request,
        io.grpc.stub.StreamObserver<com.ashish1.grpc.Token.TokenResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetTokenMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetTokenMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.ashish1.grpc.Token.TokenRequest,
                com.ashish1.grpc.Token.TokenResponse>(
                  this, METHODID_GET_TOKEN)))
          .build();
    }
  }

  /**
   */
  public static final class tokenStub extends io.grpc.stub.AbstractStub<tokenStub> {
    private tokenStub(io.grpc.Channel channel) {
      super(channel);
    }

    private tokenStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected tokenStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new tokenStub(channel, callOptions);
    }

    /**
     */
    public void getToken(com.ashish1.grpc.Token.TokenRequest request,
        io.grpc.stub.StreamObserver<com.ashish1.grpc.Token.TokenResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetTokenMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class tokenBlockingStub extends io.grpc.stub.AbstractStub<tokenBlockingStub> {
    private tokenBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private tokenBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected tokenBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new tokenBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.ashish1.grpc.Token.TokenResponse getToken(com.ashish1.grpc.Token.TokenRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetTokenMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class tokenFutureStub extends io.grpc.stub.AbstractStub<tokenFutureStub> {
    private tokenFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private tokenFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected tokenFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new tokenFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ashish1.grpc.Token.TokenResponse> getToken(
        com.ashish1.grpc.Token.TokenRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetTokenMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_TOKEN = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final tokenImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(tokenImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_TOKEN:
          serviceImpl.getToken((com.ashish1.grpc.Token.TokenRequest) request,
              (io.grpc.stub.StreamObserver<com.ashish1.grpc.Token.TokenResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class tokenBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    tokenBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.ashish1.grpc.Token.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("token");
    }
  }

  private static final class tokenFileDescriptorSupplier
      extends tokenBaseDescriptorSupplier {
    tokenFileDescriptorSupplier() {}
  }

  private static final class tokenMethodDescriptorSupplier
      extends tokenBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    tokenMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (tokenGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new tokenFileDescriptorSupplier())
              .addMethod(getGetTokenMethod())
              .build();
        }
      }
    }
    return result;
  }
}
