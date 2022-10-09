package com.shuofxz.protobuf_rpc.server;

import com.shuofxz.protobuf_rpc.interf.MyResourceTracker;
import com.shuofxz.protobuf_rpc.proto.MyResourceTrackerMessageProto;

public class MyResourceTrackerImpl implements MyResourceTracker {
    @Override
    public MyResourceTrackerMessageProto.MyRegisterNodeManagerResponseProto registerNodeManager(
            MyResourceTrackerMessageProto.MyRegisterNodeManagerRequestProto request) {

        // 输出注册的消息
        String hostname = request.getHostname();
        int cpu = request.getCpu();
        int memory = request.getMemory();
        System.out.println("NodeManager 的注册消息： hostname = " + hostname + ", cpu = " + cpu + ", memory = " + memory);

        // 省略处理逻辑
        // 构建一个响应对象，用于返回
        MyResourceTrackerMessageProto.MyRegisterNodeManagerResponseProto.Builder builder =
                MyResourceTrackerMessageProto.MyRegisterNodeManagerResponseProto.newBuilder();
        // 直接返回 True
        builder.setFlag("true");
        MyResourceTrackerMessageProto.MyRegisterNodeManagerResponseProto response = builder.build();
        return response;
    }
}
