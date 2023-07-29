package com.assionx.codec.mqtt.core;

import java.net.InetAddress;

/**
 * @author assionx
 * @date 2023-07-16
 **/
public interface MqttChannel {

    /**
     * <em>通道Id</em>
     * @return
     */
    String id();

    /**
     * <em>本地IP</em>
     * @param localAddress
     */
    void setLocalAddress(InetAddress localAddress);

    /**
     * <em>远程地址</em>
     * @param remoteAddress
     */
    void setRemoteAddress(InetAddress remoteAddress);

    /**
     * <em></em>
     * @param bytes
     */
    void write(byte[] bytes);
}
