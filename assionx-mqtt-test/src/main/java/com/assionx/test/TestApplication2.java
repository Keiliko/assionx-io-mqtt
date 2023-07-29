package com.assionx.test;

/**
 * @author assionx
 * @date 2023-07-16
 **/
public class TestApplication2 {

    public static void main(String[] args) {


        int in = Integer.parseInt("11000010");

        String format = String.format("%d", in);
        System.out.print(format);

    }

    public static void binaryTodecimal2(int n) {
        String res = Integer.toBinaryString(n);
        System.out.println(res);

        // 将字符串转换为数字进行打印，但不建议这么做，当为负数时，int型的表示不了32的一个整数，另外，int的位数有大小，打印的值超出范围就会报错
        int in = Integer.parseInt(res);
        System.out.print(in + "\n");
    }
}
