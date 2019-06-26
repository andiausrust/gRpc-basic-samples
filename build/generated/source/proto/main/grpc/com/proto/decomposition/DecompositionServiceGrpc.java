package com.proto.decomposition;

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
    value = "by gRPC proto compiler (version 1.21.0)",
    comments = "Source: decomposition/decomposition.proto")
public final class DecompositionServiceGrpc {

  private DecompositionServiceGrpc() {}

  public static final String SERVICE_NAME = "decomposition.DecompositionService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.proto.decomposition.DecompositionRequest,
      com.proto.decomposition.DecompositionResponse> getDecompositionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Decomposition",
      requestType = com.proto.decomposition.DecompositionRequest.class,
      responseType = com.proto.decomposition.DecompositionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.proto.decomposition.DecompositionRequest,
      com.proto.decomposition.DecompositionResponse> getDecompositionMethod() {
    io.grpc.MethodDescriptor<com.proto.decomposition.DecompositionRequest, com.proto.decomposition.DecompositionResponse> getDecompositionMethod;
    if ((getDecompositionMethod = DecompositionServiceGrpc.getDecompositionMethod) == null) {
      synchronized (DecompositionServiceGrpc.class) {
        if ((getDecompositionMethod = DecompositionServiceGrpc.getDecompositionMethod) == null) {
          DecompositionServiceGrpc.getDecompositionMethod = getDecompositionMethod = 
              io.grpc.MethodDescriptor.<com.proto.decomposition.DecompositionRequest, com.proto.decomposition.DecompositionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "decomposition.DecompositionService", "Decomposition"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.decomposition.DecompositionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.decomposition.DecompositionResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new DecompositionServiceMethodDescriptorSupplier("Decomposition"))
                  .build();
          }
        }
     }
     return getDecompositionMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DecompositionServiceStub newStub(io.grpc.Channel channel) {
    return new DecompositionServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DecompositionServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new DecompositionServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DecompositionServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new DecompositionServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class DecompositionServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void decomposition(com.proto.decomposition.DecompositionRequest request,
        io.grpc.stub.StreamObserver<com.proto.decomposition.DecompositionResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDecompositionMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getDecompositionMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.proto.decomposition.DecompositionRequest,
                com.proto.decomposition.DecompositionResponse>(
                  this, METHODID_DECOMPOSITION)))
          .build();
    }
  }

  /**
   */
  public static final class DecompositionServiceStub extends io.grpc.stub.AbstractStub<DecompositionServiceStub> {
    private DecompositionServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DecompositionServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DecompositionServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DecompositionServiceStub(channel, callOptions);
    }

    /**
     */
    public void decomposition(com.proto.decomposition.DecompositionRequest request,
        io.grpc.stub.StreamObserver<com.proto.decomposition.DecompositionResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getDecompositionMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class DecompositionServiceBlockingStub extends io.grpc.stub.AbstractStub<DecompositionServiceBlockingStub> {
    private DecompositionServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DecompositionServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DecompositionServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DecompositionServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public java.util.Iterator<com.proto.decomposition.DecompositionResponse> decomposition(
        com.proto.decomposition.DecompositionRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getDecompositionMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class DecompositionServiceFutureStub extends io.grpc.stub.AbstractStub<DecompositionServiceFutureStub> {
    private DecompositionServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DecompositionServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DecompositionServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DecompositionServiceFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_DECOMPOSITION = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final DecompositionServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(DecompositionServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_DECOMPOSITION:
          serviceImpl.decomposition((com.proto.decomposition.DecompositionRequest) request,
              (io.grpc.stub.StreamObserver<com.proto.decomposition.DecompositionResponse>) responseObserver);
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

  private static abstract class DecompositionServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    DecompositionServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.proto.decomposition.Decomposition.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("DecompositionService");
    }
  }

  private static final class DecompositionServiceFileDescriptorSupplier
      extends DecompositionServiceBaseDescriptorSupplier {
    DecompositionServiceFileDescriptorSupplier() {}
  }

  private static final class DecompositionServiceMethodDescriptorSupplier
      extends DecompositionServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    DecompositionServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (DecompositionServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DecompositionServiceFileDescriptorSupplier())
              .addMethod(getDecompositionMethod())
              .build();
        }
      }
    }
    return result;
  }
}
