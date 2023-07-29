package com.assionx.codec.mqtt.analyze;

import com.assionx.codec.mqtt.header.MqttMessageHeader;

import java.io.Serializable;

/**
 *
 * <em>固定报文头解析器</em>
 * @author xiaingxin
 * @date 2023/7/17-9:03
 **/
public class MqttFixedHeaderAnalyze implements MqttHeaderAnalyze, Serializable {

    @Override
    public Object parse(byte[] bytes) {
        return null;
    }

    @Override
    public MqttMessageHeader parseHeader(byte[] bytes) {
        return null;
    }
}
