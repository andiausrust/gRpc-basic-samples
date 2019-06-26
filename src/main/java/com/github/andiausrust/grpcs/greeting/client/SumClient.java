package com.github.andiausrust.grpcs.greeting.client;

import com.proto.sum.SumRequest;
import com.proto.sum.SumResponse;
import com.proto.sum.SumServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class SumClient {

    public static void main(String[] args) {

        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50052)
                .usePlaintext()
                .build();

        SumServiceGrpc.SumServiceBlockingStub sumClient = SumServiceGrpc.newBlockingStub(channel);

        SumRequest request = SumRequest.newBuilder()
                .setNumber1(2)
                .setNumber2(3)
                .build();

        SumResponse response = sumClient.sum(request);
        System.out.println(response);
    }
}
