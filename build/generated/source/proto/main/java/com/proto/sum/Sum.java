// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sum/sum.proto

package com.proto.sum;

public final class Sum {
  private Sum() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_sum_SumRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_sum_SumRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_sum_SumResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_sum_SumResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\rsum/sum.proto\022\003sum\".\n\nSumRequest\022\017\n\007nu" +
      "mber1\030\001 \001(\003\022\017\n\007number2\030\002 \001(\003\"\035\n\013SumRespo" +
      "nse\022\016\n\006result\030\001 \001(\00328\n\nSumService\022*\n\003Sum" +
      "\022\017.sum.SumRequest\032\020.sum.SumResponse\"\000B\021\n" +
      "\rcom.proto.sumP\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_sum_SumRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_sum_SumRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_sum_SumRequest_descriptor,
        new java.lang.String[] { "Number1", "Number2", });
    internal_static_sum_SumResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_sum_SumResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_sum_SumResponse_descriptor,
        new java.lang.String[] { "Result", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
