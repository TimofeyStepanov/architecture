package ru.stepanoff.score;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.52.1)",
    comments = "Source: score.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ScoreServiceGrpc {

  private ScoreServiceGrpc() {}

  public static final String SERVICE_NAME = "ScoreService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ru.stepanoff.score.ScoreRequest,
      ru.stepanoff.score.ScoreResponse> getGetScoreMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getScore",
      requestType = ru.stepanoff.score.ScoreRequest.class,
      responseType = ru.stepanoff.score.ScoreResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ru.stepanoff.score.ScoreRequest,
      ru.stepanoff.score.ScoreResponse> getGetScoreMethod() {
    io.grpc.MethodDescriptor<ru.stepanoff.score.ScoreRequest, ru.stepanoff.score.ScoreResponse> getGetScoreMethod;
    if ((getGetScoreMethod = ScoreServiceGrpc.getGetScoreMethod) == null) {
      synchronized (ScoreServiceGrpc.class) {
        if ((getGetScoreMethod = ScoreServiceGrpc.getGetScoreMethod) == null) {
          ScoreServiceGrpc.getGetScoreMethod = getGetScoreMethod =
              io.grpc.MethodDescriptor.<ru.stepanoff.score.ScoreRequest, ru.stepanoff.score.ScoreResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getScore"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ru.stepanoff.score.ScoreRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ru.stepanoff.score.ScoreResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ScoreServiceMethodDescriptorSupplier("getScore"))
              .build();
        }
      }
    }
    return getGetScoreMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ScoreServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ScoreServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ScoreServiceStub>() {
        @java.lang.Override
        public ScoreServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ScoreServiceStub(channel, callOptions);
        }
      };
    return ScoreServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ScoreServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ScoreServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ScoreServiceBlockingStub>() {
        @java.lang.Override
        public ScoreServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ScoreServiceBlockingStub(channel, callOptions);
        }
      };
    return ScoreServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ScoreServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ScoreServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ScoreServiceFutureStub>() {
        @java.lang.Override
        public ScoreServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ScoreServiceFutureStub(channel, callOptions);
        }
      };
    return ScoreServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class ScoreServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getScore(ru.stepanoff.score.ScoreRequest request,
        io.grpc.stub.StreamObserver<ru.stepanoff.score.ScoreResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetScoreMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetScoreMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                ru.stepanoff.score.ScoreRequest,
                ru.stepanoff.score.ScoreResponse>(
                  this, METHODID_GET_SCORE)))
          .build();
    }
  }

  /**
   */
  public static final class ScoreServiceStub extends io.grpc.stub.AbstractAsyncStub<ScoreServiceStub> {
    private ScoreServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ScoreServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ScoreServiceStub(channel, callOptions);
    }

    /**
     */
    public void getScore(ru.stepanoff.score.ScoreRequest request,
        io.grpc.stub.StreamObserver<ru.stepanoff.score.ScoreResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetScoreMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ScoreServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<ScoreServiceBlockingStub> {
    private ScoreServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ScoreServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ScoreServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public ru.stepanoff.score.ScoreResponse getScore(ru.stepanoff.score.ScoreRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetScoreMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ScoreServiceFutureStub extends io.grpc.stub.AbstractFutureStub<ScoreServiceFutureStub> {
    private ScoreServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ScoreServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ScoreServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ru.stepanoff.score.ScoreResponse> getScore(
        ru.stepanoff.score.ScoreRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetScoreMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_SCORE = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ScoreServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ScoreServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_SCORE:
          serviceImpl.getScore((ru.stepanoff.score.ScoreRequest) request,
              (io.grpc.stub.StreamObserver<ru.stepanoff.score.ScoreResponse>) responseObserver);
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

  private static abstract class ScoreServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ScoreServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ru.stepanoff.score.ScoreProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ScoreService");
    }
  }

  private static final class ScoreServiceFileDescriptorSupplier
      extends ScoreServiceBaseDescriptorSupplier {
    ScoreServiceFileDescriptorSupplier() {}
  }

  private static final class ScoreServiceMethodDescriptorSupplier
      extends ScoreServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ScoreServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ScoreServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ScoreServiceFileDescriptorSupplier())
              .addMethod(getGetScoreMethod())
              .build();
        }
      }
    }
    return result;
  }
}
