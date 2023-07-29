package com.assionx.codec.mqtt.resolver;

/**
 * <em>有效载荷解析器</em>
 * @author xiaingxin
 * @date 2023/7/17-9:18
 **/
public interface PayLoadResolver<T> {

    /**
     * <em>有效载荷解析器</em>
     * @param bytes
     * @return
     */
    T payLoadAnalysis(byte[] bytes);
}
