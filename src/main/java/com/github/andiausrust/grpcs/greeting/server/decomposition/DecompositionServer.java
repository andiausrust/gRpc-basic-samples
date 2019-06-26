package com.github.andiausrust.grpcs.greeting.server.decomposition;

import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class DecompositionServer {

    public static void main(String[] args) throws IOException, InterruptedException {

        Server server = ServerBuilder.forPort(50053)
                .addService(new DecompositionServiceImpl())
                .build();

        server.start();
        System.out.println("server started");

        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            server.shutdown();
            System.out.println("server stopped");
        }));


        server.awaitTermination();

    }
}
