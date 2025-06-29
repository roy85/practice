package com.example.grpc;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

import java.io.IOException;

public class GreeterServer {
  public static void main(String[] args) throws IOException, InterruptedException {
    Server server = ServerBuilder.forPort(9090)
        .addService(new GreeterImpl())
        .build();

    server.start();
    System.out.println("Server started on port 9090");
    server.awaitTermination();
  }

  static class GreeterImpl extends GreeterGrpc.GreeterImplBase {
    @Override
    public void sayHello(HelloRequest request, StreamObserver<HelloReply> responseObserver) {
      String message = "Hello, " + request.getName();
      HelloReply reply = HelloReply.newBuilder().setMessage(message).build();
      responseObserver.onNext(reply);
      responseObserver.onCompleted();
    }
  }
}
