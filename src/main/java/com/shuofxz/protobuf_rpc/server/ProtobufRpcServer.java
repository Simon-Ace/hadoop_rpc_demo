package com.shuofxz.protobuf_rpc.server;

import com.shuofxz.protobuf_rpc.interf.MyResourceTrackerPB;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.ipc.ProtobufRpcEngine;
import org.apache.hadoop.ipc.RPC;
import com.shuofxz.protobuf_rpc.proto.MyResourceTrackerProto;

import java.io.IOException;

public class ProtobufRpcServer {
    public static void main(String[] args) throws IOException {
        Configuration conf = new Configuration();

        RPC.setProtocolEngine(conf, MyResourceTrackerPB.class, ProtobufRpcEngine.class);

        // 构建 Rpc Server
        RPC.Server server = new RPC.Builder(conf)
                .setProtocol(MyResourceTrackerPB.class)
                .setInstance(MyResourceTrackerProto.MyResourceTrackerService
                        .newReflectiveBlockingService(new MyResourceTrackerServerSidePB(new MyResourceTrackerImpl())))
                .setBindAddress("localhost")
                .setPort(9998)
                .setNumHandlers(1)
                .setVerbose(true)
                .build();

        // Rpc Server 启动
        server.start();
    }
}
