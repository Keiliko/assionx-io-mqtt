package com.assionx.io.commons.core;

/**
 * <em>channel  通道</em>
 * @author assionx
 * @date 2023-07-16
 **/
public interface Channel {


    /**
     * <em>是否激活</em>
     * @return
     */
    boolean isActive() throws ;

    /**
     * <em>关闭通道</em>
     */
    void close();
}
