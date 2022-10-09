package com.shuofxz.protobuf_rpc.server;

import com.google.protobuf.RpcController;
import com.google.protobuf.ServiceException;
import com.shuofxz.protobuf_rpc.interf.MyResourceTracker;
import com.shuofxz.protobuf_rpc.proto.MyResourceTrackerMessageProto;
import com.shuofxz.protobuf_rpc.interf.MyResourceTrackerPB;

public class MyResourceTrackerServerSidePB implements MyResourceTrackerPB {
    final private MyResourceTracker server;

    public MyResourceTrackerServerSidePB(MyResourceTracker server) {
        this.server = server;
    }

    @Override
    public MyResourceTrackerMessageProto.MyRegisterNodeManagerResponseProto registerNodeManager(
            RpcController controller, MyResourceTrackerMessageProto.MyRegisterNodeManagerRequestProto request) throws ServiceException {
        try {
            return server.registerNodeManager(request);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
