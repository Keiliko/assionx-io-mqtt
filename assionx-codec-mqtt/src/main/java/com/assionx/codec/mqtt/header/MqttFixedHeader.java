package com.assionx.codec.mqtt.header;

import com.assionx.codec.mqtt.enums.MqttMessageType;
import com.assionx.codec.mqtt.enums.MqttQos;

/**
 *
 * <em>FixedHeader 固定报头</em>
 * @author xiaingxin
 * @date 2023-12-27
 */
public class MqttFixedHeader implements MqttMessageHeader {


    /**
     * <em>MQTT消息类型  TYPE : enum</em>
     */
    private final MqttMessageType messageType;
    /**
     * <em>MQTT消息类型  DUP 控制报文的重复分发标志</em>
     */
    private final boolean dup;
    /**
     * <em> qos  PUBLISH报文的服务质量等级</em>
     */
    private final MqttQos qos;
    /**
     * <em>isRetain  是否还有剩余长度</em>
     */
    private final boolean isRetain;
    /**
     * <em>remainingLength 剩余长度</em>
     */
    private final int remainingLength;

    public MqttFixedHeader(MqttMessageType messageType, boolean dup, MqttQos qos, boolean isRetain, int remainingLength) {
        this.messageType = messageType;
        this.dup = dup;
        this.qos = qos;
        this.isRetain = isRetain;
        this.remainingLength = remainingLength;
    }

    /**
     * <em> 获取消息头</em>
     * @return
     */
    @Override
    public MqttMessageHeader getHeader() {
        return this;
    }
}
