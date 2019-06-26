package com.github.andiausrust.grpcs.greeting.server.greeting;

import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class GreetingServer {

    public static void main(String[] args) throws IOException, InterruptedException {
        System.out.println("Hello gRpc");

        Server server = ServerBuilder.forPort(50051)
                .addService(new GreetServiceImpl())
                .build();
        server.start();

        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            System.out.println("received shutdown request");
            server.shutdown();
            System.out.println("successfully stopped the server");
        }));

        server.awaitTermination();


    }
}
