package com.github.andiausrust.grpcs.greeting.server.calculator;

import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class CalculatorServer {

    public static void main(String[] args) throws InterruptedException, IOException {

        Server server = ServerBuilder.forPort(50052)
                .addService(new SumServiceImpl())
                .build();

        server.start();

        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            System.out.println("received shutdown hook");
            server.shutdown();
            System.out.println("successfully stopped server");
            }
        ));

        server.awaitTermination();
    }
}
