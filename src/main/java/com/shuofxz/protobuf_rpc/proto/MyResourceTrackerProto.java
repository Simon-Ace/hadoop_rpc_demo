// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com/shuofxz/protobuf_rpc/proto/MyResourceTracker.proto

package com.shuofxz.protobuf_rpc.proto;

public final class MyResourceTrackerProto {
  private MyResourceTrackerProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * Protobuf service {@code MyResourceTrackerService}
   */
  public static abstract class MyResourceTrackerService
      implements com.google.protobuf.Service {
    protected MyResourceTrackerService() {}

    public interface Interface {
      /**
       * <code>rpc registerNodeManager(.MyRegisterNodeManagerRequestProto) returns (.MyRegisterNodeManagerResponseProto);</code>
       */
      public abstract void registerNodeManager(
          com.google.protobuf.RpcController controller,
          com.shuofxz.protobuf_rpc.proto.MyResourceTrackerMessageProto.MyRegisterNodeManagerRequestProto request,
          com.google.protobuf.RpcCallback<com.shuofxz.protobuf_rpc.proto.MyResourceTrackerMessageProto.MyRegisterNodeManagerResponseProto> done);

    }

    public static com.google.protobuf.Service newReflectiveService(
        final Interface impl) {
      return new MyResourceTrackerService() {
        @java.lang.Override
        public  void registerNodeManager(
            com.google.protobuf.RpcController controller,
            com.shuofxz.protobuf_rpc.proto.MyResourceTrackerMessageProto.MyRegisterNodeManagerRequestProto request,
            com.google.protobuf.RpcCallback<com.shuofxz.protobuf_rpc.proto.MyResourceTrackerMessageProto.MyRegisterNodeManagerResponseProto> done) {
          impl.registerNodeManager(controller, request, done);
        }

      };
    }

    public static com.google.protobuf.BlockingService
        newReflectiveBlockingService(final BlockingInterface impl) {
      return new com.google.protobuf.BlockingService() {
        public final com.google.protobuf.Descriptors.ServiceDescriptor
            getDescriptorForType() {
          return getDescriptor();
        }

        public final com.google.protobuf.Message callBlockingMethod(
            com.google.protobuf.Descriptors.MethodDescriptor method,
            com.google.protobuf.RpcController controller,
            com.google.protobuf.Message request)
            throws com.google.protobuf.ServiceException {
          if (method.getService() != getDescriptor()) {
            throw new java.lang.IllegalArgumentException(
              "Service.callBlockingMethod() given method descriptor for " +
              "wrong service type.");
          }
          switch(method.getIndex()) {
            case 0:
              return impl.registerNodeManager(controller, (com.shuofxz.protobuf_rpc.proto.MyResourceTrackerMessageProto.MyRegisterNodeManagerRequestProto)request);
            default:
              throw new java.lang.AssertionError("Can't get here.");
          }
        }

        public final com.google.protobuf.Message
            getRequestPrototype(
            com.google.protobuf.Descriptors.MethodDescriptor method) {
          if (method.getService() != getDescriptor()) {
            throw new java.lang.IllegalArgumentException(
              "Service.getRequestPrototype() given method " +
              "descriptor for wrong service type.");
          }
          switch(method.getIndex()) {
            case 0:
              return com.shuofxz.protobuf_rpc.proto.MyResourceTrackerMessageProto.MyRegisterNodeManagerRequestProto.getDefaultInstance();
            default:
              throw new java.lang.AssertionError("Can't get here.");
          }
        }

        public final com.google.protobuf.Message
            getResponsePrototype(
            com.google.protobuf.Descriptors.MethodDescriptor method) {
          if (method.getService() != getDescriptor()) {
            throw new java.lang.IllegalArgumentException(
              "Service.getResponsePrototype() given method " +
              "descriptor for wrong service type.");
          }
          switch(method.getIndex()) {
            case 0:
              return com.shuofxz.protobuf_rpc.proto.MyResourceTrackerMessageProto.MyRegisterNodeManagerResponseProto.getDefaultInstance();
            default:
              throw new java.lang.AssertionError("Can't get here.");
          }
        }

      };
    }

    /**
     * <code>rpc registerNodeManager(.MyRegisterNodeManagerRequestProto) returns (.MyRegisterNodeManagerResponseProto);</code>
     */
    public abstract void registerNodeManager(
        com.google.protobuf.RpcController controller,
        com.shuofxz.protobuf_rpc.proto.MyResourceTrackerMessageProto.MyRegisterNodeManagerRequestProto request,
        com.google.protobuf.RpcCallback<com.shuofxz.protobuf_rpc.proto.MyResourceTrackerMessageProto.MyRegisterNodeManagerResponseProto> done);

    public static final
        com.google.protobuf.Descriptors.ServiceDescriptor
        getDescriptor() {
      return com.shuofxz.protobuf_rpc.proto.MyResourceTrackerProto.getDescriptor().getServices().get(0);
    }
    public final com.google.protobuf.Descriptors.ServiceDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }

    public final void callMethod(
        com.google.protobuf.Descriptors.MethodDescriptor method,
        com.google.protobuf.RpcController controller,
        com.google.protobuf.Message request,
        com.google.protobuf.RpcCallback<
          com.google.protobuf.Message> done) {
      if (method.getService() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "Service.callMethod() given method descriptor for wrong " +
          "service type.");
      }
      switch(method.getIndex()) {
        case 0:
          this.registerNodeManager(controller, (com.shuofxz.protobuf_rpc.proto.MyResourceTrackerMessageProto.MyRegisterNodeManagerRequestProto)request,
            com.google.protobuf.RpcUtil.<com.shuofxz.protobuf_rpc.proto.MyResourceTrackerMessageProto.MyRegisterNodeManagerResponseProto>specializeCallback(
              done));
          return;
        default:
          throw new java.lang.AssertionError("Can't get here.");
      }
    }

    public final com.google.protobuf.Message
        getRequestPrototype(
        com.google.protobuf.Descriptors.MethodDescriptor method) {
      if (method.getService() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "Service.getRequestPrototype() given method " +
          "descriptor for wrong service type.");
      }
      switch(method.getIndex()) {
        case 0:
          return com.shuofxz.protobuf_rpc.proto.MyResourceTrackerMessageProto.MyRegisterNodeManagerRequestProto.getDefaultInstance();
        default:
          throw new java.lang.AssertionError("Can't get here.");
      }
    }

    public final com.google.protobuf.Message
        getResponsePrototype(
        com.google.protobuf.Descriptors.MethodDescriptor method) {
      if (method.getService() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "Service.getResponsePrototype() given method " +
          "descriptor for wrong service type.");
      }
      switch(method.getIndex()) {
        case 0:
          return com.shuofxz.protobuf_rpc.proto.MyResourceTrackerMessageProto.MyRegisterNodeManagerResponseProto.getDefaultInstance();
        default:
          throw new java.lang.AssertionError("Can't get here.");
      }
    }

    public static Stub newStub(
        com.google.protobuf.RpcChannel channel) {
      return new Stub(channel);
    }

    public static final class Stub extends com.shuofxz.protobuf_rpc.proto.MyResourceTrackerProto.MyResourceTrackerService implements Interface {
      private Stub(com.google.protobuf.RpcChannel channel) {
        this.channel = channel;
      }

      private final com.google.protobuf.RpcChannel channel;

      public com.google.protobuf.RpcChannel getChannel() {
        return channel;
      }

      public  void registerNodeManager(
          com.google.protobuf.RpcController controller,
          com.shuofxz.protobuf_rpc.proto.MyResourceTrackerMessageProto.MyRegisterNodeManagerRequestProto request,
          com.google.protobuf.RpcCallback<com.shuofxz.protobuf_rpc.proto.MyResourceTrackerMessageProto.MyRegisterNodeManagerResponseProto> done) {
        channel.callMethod(
          getDescriptor().getMethods().get(0),
          controller,
          request,
          com.shuofxz.protobuf_rpc.proto.MyResourceTrackerMessageProto.MyRegisterNodeManagerResponseProto.getDefaultInstance(),
          com.google.protobuf.RpcUtil.generalizeCallback(
            done,
            com.shuofxz.protobuf_rpc.proto.MyResourceTrackerMessageProto.MyRegisterNodeManagerResponseProto.class,
            com.shuofxz.protobuf_rpc.proto.MyResourceTrackerMessageProto.MyRegisterNodeManagerResponseProto.getDefaultInstance()));
      }
    }

    public static BlockingInterface newBlockingStub(
        com.google.protobuf.BlockingRpcChannel channel) {
      return new BlockingStub(channel);
    }

    public interface BlockingInterface {
      public com.shuofxz.protobuf_rpc.proto.MyResourceTrackerMessageProto.MyRegisterNodeManagerResponseProto registerNodeManager(
          com.google.protobuf.RpcController controller,
          com.shuofxz.protobuf_rpc.proto.MyResourceTrackerMessageProto.MyRegisterNodeManagerRequestProto request)
          throws com.google.protobuf.ServiceException;
    }

    private static final class BlockingStub implements BlockingInterface {
      private BlockingStub(com.google.protobuf.BlockingRpcChannel channel) {
        this.channel = channel;
      }

      private final com.google.protobuf.BlockingRpcChannel channel;

      public com.shuofxz.protobuf_rpc.proto.MyResourceTrackerMessageProto.MyRegisterNodeManagerResponseProto registerNodeManager(
          com.google.protobuf.RpcController controller,
          com.shuofxz.protobuf_rpc.proto.MyResourceTrackerMessageProto.MyRegisterNodeManagerRequestProto request)
          throws com.google.protobuf.ServiceException {
        return (com.shuofxz.protobuf_rpc.proto.MyResourceTrackerMessageProto.MyRegisterNodeManagerResponseProto) channel.callBlockingMethod(
          getDescriptor().getMethods().get(0),
          controller,
          request,
          com.shuofxz.protobuf_rpc.proto.MyResourceTrackerMessageProto.MyRegisterNodeManagerResponseProto.getDefaultInstance());
      }

    }

    // @@protoc_insertion_point(class_scope:MyResourceTrackerService)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n6com/shuofxz/protobuf_rpc/proto/MyResou" +
      "rceTracker.proto\032=com/shuofxz/protobuf_r" +
      "pc/proto/MyResourceTrackerMessage.proto2" +
      "z\n\030MyResourceTrackerService\022^\n\023registerN" +
      "odeManager\022\".MyRegisterNodeManagerReques" +
      "tProto\032#.MyRegisterNodeManagerResponsePr" +
      "otoB>\n\036com.shuofxz.protobuf_rpc.protoB\026M" +
      "yResourceTrackerProto\210\001\001\240\001\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.shuofxz.protobuf_rpc.proto.MyResourceTrackerMessageProto.getDescriptor(),
        });
    com.shuofxz.protobuf_rpc.proto.MyResourceTrackerMessageProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
