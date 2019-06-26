package com.github.andiausrust.grpcs.greeting.server.decomposition;

import com.proto.decomposition.DecompositionRequest;
import com.proto.decomposition.DecompositionResponse;
import com.proto.decomposition.DecompositionServiceGrpc;
import io.grpc.stub.StreamObserver;

public class DecompositionServiceImpl extends DecompositionServiceGrpc.DecompositionServiceImplBase {

    @Override
    public void decomposition(DecompositionRequest request, StreamObserver<DecompositionResponse> responseObserver) {
        int decomposition = request.getNumber();

        int divider = 2;

        while (decomposition > 1){
            if(decomposition % divider == 0) {
                decomposition = decomposition/divider;
                DecompositionResponse response = DecompositionResponse.newBuilder()
                        .setNumber(divider)
                        .build();
                responseObserver.onNext(response);
            } else {
                divider += 1;
            }
        }
        responseObserver.onCompleted();
    }
}
