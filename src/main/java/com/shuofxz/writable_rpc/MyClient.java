package com.shuofxz.writable_rpc;

import org.apache.hadoop.ipc.RPC;
import org.apache.hadoop.conf.Configuration;

import java.io.IOException;
import java.net.InetSocketAddress;

public class MyClient {
    public static void main(String[] args) {
        try {
            // 获取代理类实例，也就是 Stub
            BusinessProtocol proxy = RPC.getProxy(BusinessProtocol.class, BusinessProtocol.versionID,
                    new InetSocketAddress("localhost", 6789), new Configuration());

            // 通过 Stub 发送请求，实际使用就像调用本地方法一样
            proxy.mkdir("/tmp/ABC");
            String res = proxy.getName("Simon");
            System.out.println("从 RPC 服务端接收到的返回值：" + res);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
