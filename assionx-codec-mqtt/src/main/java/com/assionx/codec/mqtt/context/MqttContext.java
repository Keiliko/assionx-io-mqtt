package com.assionx.codec.mqtt.context;

import com.assionx.codec.mqtt.core.MqttCodec;

import java.net.Socket;
import java.nio.channels.Channel;
import java.util.List;

/**
 * mqtt
 * @author assionx
 * @date 2023-07-16
 **/
public class MqttContext {

    private List<Socket > channels;
    private MqttCodec mqttCodec;
}
