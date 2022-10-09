package com.shuofxz.writable_rpc;

public interface BusinessProtocol {
    void mkdir(String path);
    String getName(String name);
    long versionID = 345043000L;
}
