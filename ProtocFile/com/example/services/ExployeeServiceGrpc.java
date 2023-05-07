package com.example.services;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.54.1)",
    comments = "Source: Employee.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ExployeeServiceGrpc {

  private ExployeeServiceGrpc() {}

  public static final String SERVICE_NAME = "example.ExployeeService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.example.services.EmployeeRequest,
      com.example.services.EmployeeResponse> getGetEmployeeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getEmployee",
      requestType = com.example.services.EmployeeRequest.class,
      responseType = com.example.services.EmployeeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.services.EmployeeRequest,
      com.example.services.EmployeeResponse> getGetEmployeeMethod() {
    io.grpc.MethodDescriptor<com.example.services.EmployeeRequest, com.example.services.EmployeeResponse> getGetEmployeeMethod;
    if ((getGetEmployeeMethod = ExployeeServiceGrpc.getGetEmployeeMethod) == null) {
      synchronized (ExployeeServiceGrpc.class) {
        if ((getGetEmployeeMethod = ExployeeServiceGrpc.getGetEmployeeMethod) == null) {
          ExployeeServiceGrpc.getGetEmployeeMethod = getGetEmployeeMethod =
              io.grpc.MethodDescriptor.<com.example.services.EmployeeRequest, com.example.services.EmployeeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getEmployee"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.services.EmployeeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.services.EmployeeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ExployeeServiceMethodDescriptorSupplier("getEmployee"))
              .build();
        }
      }
    }
    return getGetEmployeeMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ExployeeServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ExployeeServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ExployeeServiceStub>() {
        @java.lang.Override
        public ExployeeServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ExployeeServiceStub(channel, callOptions);
        }
      };
    return ExployeeServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ExployeeServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ExployeeServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ExployeeServiceBlockingStub>() {
        @java.lang.Override
        public ExployeeServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ExployeeServiceBlockingStub(channel, callOptions);
        }
      };
    return ExployeeServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ExployeeServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ExployeeServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ExployeeServiceFutureStub>() {
        @java.lang.Override
        public ExployeeServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ExployeeServiceFutureStub(channel, callOptions);
        }
      };
    return ExployeeServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void getEmployee(com.example.services.EmployeeRequest request,
        io.grpc.stub.StreamObserver<com.example.services.EmployeeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetEmployeeMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service ExployeeService.
   */
  public static abstract class ExployeeServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return ExployeeServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service ExployeeService.
   */
  public static final class ExployeeServiceStub
      extends io.grpc.stub.AbstractAsyncStub<ExployeeServiceStub> {
    private ExployeeServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ExployeeServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ExployeeServiceStub(channel, callOptions);
    }

    /**
     */
    public void getEmployee(com.example.services.EmployeeRequest request,
        io.grpc.stub.StreamObserver<com.example.services.EmployeeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetEmployeeMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service ExployeeService.
   */
  public static final class ExployeeServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<ExployeeServiceBlockingStub> {
    private ExployeeServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ExployeeServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ExployeeServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.example.services.EmployeeResponse getEmployee(com.example.services.EmployeeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetEmployeeMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service ExployeeService.
   */
  public static final class ExployeeServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<ExployeeServiceFutureStub> {
    private ExployeeServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ExployeeServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ExployeeServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.services.EmployeeResponse> getEmployee(
        com.example.services.EmployeeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetEmployeeMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_EMPLOYEE = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_EMPLOYEE:
          serviceImpl.getEmployee((com.example.services.EmployeeRequest) request,
              (io.grpc.stub.StreamObserver<com.example.services.EmployeeResponse>) responseObserver);
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

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getGetEmployeeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.example.services.EmployeeRequest,
              com.example.services.EmployeeResponse>(
                service, METHODID_GET_EMPLOYEE)))
        .build();
  }

  private static abstract class ExployeeServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ExployeeServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.example.services.Employee.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ExployeeService");
    }
  }

  private static final class ExployeeServiceFileDescriptorSupplier
      extends ExployeeServiceBaseDescriptorSupplier {
    ExployeeServiceFileDescriptorSupplier() {}
  }

  private static final class ExployeeServiceMethodDescriptorSupplier
      extends ExployeeServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ExployeeServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ExployeeServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ExployeeServiceFileDescriptorSupplier())
              .addMethod(getGetEmployeeMethod())
              .build();
        }
      }
    }
    return result;
  }
}
