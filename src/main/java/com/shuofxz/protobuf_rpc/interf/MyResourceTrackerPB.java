package com.shuofxz.protobuf_rpc.interf;

import com.shuofxz.protobuf_rpc.proto.MyResourceTrackerProto;
import org.apache.hadoop.ipc.ProtocolInfo;

@ProtocolInfo(protocolName = "com.shuofxz.blablabla", protocolVersion = 1)
public interface MyResourceTrackerPB extends MyResourceTrackerProto.MyResourceTrackerService.BlockingInterface {
}

