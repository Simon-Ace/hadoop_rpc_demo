package com.shuofxz.protobuf_rpc.interf;

import com.shuofxz.protobuf_rpc.proto.MyResourceTrackerMessageProto.MyRegisterNodeManagerResponseProto;
import com.shuofxz.protobuf_rpc.proto.MyResourceTrackerMessageProto.MyRegisterNodeManagerRequestProto;

public interface MyResourceTracker {
    MyRegisterNodeManagerResponseProto registerNodeManager(MyRegisterNodeManagerRequestProto request) throws Exception;
}
