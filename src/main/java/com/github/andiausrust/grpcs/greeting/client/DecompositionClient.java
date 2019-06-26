package com.github.andiausrust.grpcs.greeting.client;

import com.proto.decomposition.DecompositionRequest;
import com.proto.decomposition.DecompositionServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class DecompositionClient {

    public static void main(String[] args) {

        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50053)
                .usePlaintext()
                .build();

        DecompositionServiceGrpc.DecompositionServiceBlockingStub blockingStub =
                DecompositionServiceGrpc.newBlockingStub(channel);

        DecompositionRequest request = DecompositionRequest.newBuilder()
                .setNumber(156)
                .build();

        blockingStub.decomposition(request)
                .forEachRemaining(
                        decompositionResponse -> {
                            System.out.println(decompositionResponse.getNumber());
                        }
                );
        channel.shutdown();
    }
}
