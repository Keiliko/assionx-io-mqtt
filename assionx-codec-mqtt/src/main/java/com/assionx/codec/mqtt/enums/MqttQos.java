package com.assionx.codec.mqtt.enums;

/**
 * @author assionx
 * @date 2023-07-16
 **/
public enum MqttQos implements AssionxEnum{

    AT_MOST_ONCE(0x00),
    AT_LEAST_ONCE(0x01),
    EXACTLY_ONCE(0x02),
    FAILURE(0x80);
    MqttQos(int value){
        this.value=value;
    }
    private int value;
    @Override
    public int getValue() {
        return value;
    }

    @Override
    public String getName() {
        return name();
    }
    public static MqttQos valueOf(int value) {
        switch (value) {
            case 0:
                return AT_MOST_ONCE;
            case 1:
                return AT_LEAST_ONCE;
            case 2:
                return EXACTLY_ONCE;
            case 0x80:
                return FAILURE;
            default:
                throw new IllegalArgumentException("invalid QoS: " + value);
        }
    }
}
