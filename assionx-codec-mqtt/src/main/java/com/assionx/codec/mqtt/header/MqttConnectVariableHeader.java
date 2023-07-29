package com.assionx.codec.mqtt.header;

/**
 *
 * <em>VariableHeader 可变报头</em>
 * @author xiaingxin
 * @date 2023-07-16
 **/
public class MqttConnectVariableHeader implements MqttMessageHeader {


    /**
     * <em>协议名称 通常为 MQTT 固定写法 </em>
     */
    private final byte[] protocolName;
    /**
     *  <em>是否含有用户名标志位 </em>
     */
    private final boolean hasUserName;
    /**
     *  <em>是否含有密码名标志位 </em>
     */
    private final boolean hasPassword;
    /**
     * <em>遗嘱消息标志位 1 存储在服务器中 0不进行存储</em>
     */
    private final boolean willRetain;
    /**
     * <em> Will 服务质量</em>
     */
    private final boolean willQos;
    /**
     * <em>willFlag  Will 标志</em>
     */
    private final boolean willFlag;
    /**
     * <em> cleanSession 清理会话 1清理会话 0不清理</em>
     */
    private final boolean cleanSession;
    /**
     * <em> keepAliveMsb msb保持在线时常</em>
     */
    private final int keepAliveMsb;
    /**
     *  <em> keepAlive lsb保持在线时常</em>
     */
    private final int keepAliveLsb;

    public MqttConnectVariableHeader(byte[] protocolName,
                                     boolean hasUserName,
                                     boolean hasPassword,
                                     boolean willRetain,
                                     boolean willQos,
                                     boolean willFlag,
                                     boolean cleanSession,
                                     int keepAliveMsb,
                                     int keepAliveLsb) {
        this.protocolName = protocolName;
        this.hasUserName = hasUserName;
        this.hasPassword = hasPassword;
        this.willRetain = willRetain;
        this.willQos = willQos;
        this.willFlag = willFlag;
        this.cleanSession = cleanSession;
        this.keepAliveMsb = keepAliveMsb;
        this.keepAliveLsb = keepAliveLsb;
    }

    @Override
    public MqttMessageHeader getHeader() {
        return this;
    }
}
