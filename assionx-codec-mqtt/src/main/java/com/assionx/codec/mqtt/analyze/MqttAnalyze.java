package com.assionx.codec.mqtt.analyze;

/**
 *
 * @author xiaingxin
 * @date 2023/7/17-9:07
 **/
public interface MqttAnalyze {

    /**
     * <em>解析器 </em>
     * @param bytes
     * @return
     */
    Object parse(byte[] bytes);
}
