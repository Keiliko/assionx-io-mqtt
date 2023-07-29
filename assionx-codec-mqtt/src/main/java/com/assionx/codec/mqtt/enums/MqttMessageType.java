package com.assionx.codec.mqtt.enums;

/**
 * <em>MqttMessageType enums</em>
 * @author assionx
 * @date 2023-07-16
 **/
public enum MqttMessageType implements AssionxEnum{
    CONNECT(0x1),
    CONNECT_ACK(0x2),
    PUBLISH(0x3),
    PUBLISH_ACK(0x4),
    PUB_REC(0x5),
    PUB_REL(0x6),
    PUB_COMP(0x7),
    SUBSCRIBE(0x8),
    SUB_ACK(0x9),
    UNSUBSCRIBE(0xa),
    UNSUB_ACK(0xb),
    PING_REQ(0xc),
    PING_RESP(0xd),
    DISCONNECT(0xe);

    MqttMessageType(int value){
        this.value=value;
    }

    private int value;
    @Override
    public int getValue() {
        return value;
    }

    @Override
    public String getName() {
        return name();
    }
}
