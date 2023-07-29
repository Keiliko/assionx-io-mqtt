package com.assionx.codec.mqtt.analyze;

import com.assionx.codec.mqtt.header.MqttMessageHeader;

/**
 *  mqtt解析器
 * @author xiaingxin
 * @date 2023/7/17-9:04
 **/
public interface MqttHeaderAnalyze extends MqttAnalyze {


    /**
     * <em> 请求头解析 </em>
     * @param bytes
     * @return
     */
    MqttMessageHeader parseHeader(byte[] bytes);


}
