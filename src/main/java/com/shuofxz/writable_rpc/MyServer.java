package com.shuofxz.writable_rpc;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.ipc.RPC;

import java.io.IOException;

public class MyServer {
    public static void main(String[] args) {
        try {
            // 构建一个 RPC server 端，提供了一个 BussinessProtocol 协议的 BusinessIMPL 服务实现
            RPC.Server server = new RPC.Builder(new Configuration())
                    .setProtocol(BusinessProtocol.class)
                    .setInstance(new BusinessIMPL())
                    .setBindAddress("localhost")
                    .setPort(6789)
                    .build();

            server.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
