package com.shuofxz.protobuf_rpc.client;

import com.google.protobuf.ServiceException;
import com.shuofxz.protobuf_rpc.proto.MyResourceTrackerMessageProto;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.ipc.ProtobufRpcEngine;
import org.apache.hadoop.ipc.RPC;
import com.shuofxz.protobuf_rpc.interf.MyResourceTrackerPB;

import java.io.IOException;
import java.net.InetSocketAddress;

public class ProtobufRpcClient {
    public static void main(String[] args) throws IOException {
        // 设置 RPC 引擎为 ProtobufRpcEngine
        Configuration conf = new Configuration();
        String hostname = "localhost";
        int port = 9998;
        RPC.setProtocolEngine(conf, MyResourceTrackerPB.class, ProtobufRpcEngine.class);

        // 获取代理
        MyResourceTrackerPB protocolProxy = RPC
                .getProxy(MyResourceTrackerPB.class, 1, new InetSocketAddress(hostname, port), conf);

        // 构建请求对象
        MyResourceTrackerMessageProto.MyRegisterNodeManagerRequestProto.Builder builder =
                MyResourceTrackerMessageProto.MyRegisterNodeManagerRequestProto.newBuilder();
        MyResourceTrackerMessageProto.MyRegisterNodeManagerRequestProto bigdata02 =
                builder.setHostname("bigdata02").setCpu(64).setMemory(128).build();

        // 发送 RPC 请求，获取响应
        MyResourceTrackerMessageProto.MyRegisterNodeManagerResponseProto response = null;
        try {
            response = protocolProxy.registerNodeManager(null, bigdata02);
        } catch (ServiceException e) {
            e.printStackTrace();
        }

        // 处理响应
        String flag = response.getFlag();
        System.out.println("最终注册结果： flag = " + flag);
    }
}
