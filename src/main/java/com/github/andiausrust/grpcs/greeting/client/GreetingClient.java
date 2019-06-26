package com.github.andiausrust.grpcs.greeting.client;

import com.proto.greet.GreetManyTimesRequest;
import com.proto.greet.GreetServiceGrpc;
import com.proto.greet.Greeting;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class GreetingClient {

    public static void main(String[] args) {

        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50051)
                .usePlaintext()
                .build();

        System.out.println("creating stub");
        GreetServiceGrpc.GreetServiceBlockingStub greetClient = GreetServiceGrpc.newBlockingStub(channel);

        // unary
//        Greeting greeting = Greeting.newBuilder()
//                .setFirstName("Andi")
//                .setLastName("Mayer")
//                .build();
//
//        GreetRequest request = GreetRequest.newBuilder()
//                .setGreeting(greeting)
//                .build();
//
//        GreetResponse response = greetClient.greet(request);
//
//        System.out.println(response.getResult());

        // server streaming

        GreetManyTimesRequest greetManyTimesRequest =
                GreetManyTimesRequest.newBuilder()
                .setGreeting(Greeting.newBuilder().setFirstName("andi"))
                .build();

        greetClient.greetManyTimes(greetManyTimesRequest)
                .forEachRemaining( greetManyTimesResponse -> {
                    System.out.println(greetManyTimesResponse.getResult());
                        });

        System.out.println("shutting down channel");
        channel.shutdown();
    }
}
