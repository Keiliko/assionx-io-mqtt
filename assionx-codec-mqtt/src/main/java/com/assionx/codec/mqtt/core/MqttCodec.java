package com.assionx.codec.mqtt.core;

import com.assionx.codec.mqtt.analyze.MqttFixedHeaderAnalyze;
import com.assionx.codec.mqtt.analyze.MqttHeaderAnalyze;
import com.assionx.codec.mqtt.header.MqttFixedHeader;

/**
 * @author assionx
 * @date 2023-07-16
 **/
public class MqttCodec {

    private byte[] bytes;
    private MqttHeaderAnalyze mqttFixedHeaderAnalyze;
}
