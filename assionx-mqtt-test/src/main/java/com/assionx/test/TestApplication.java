package com.assionx.test;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Arrays;
import java.util.List;

/**
 * @author assionx
 * @date 2023-07-16
 **/
public class TestApplication {

    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket=new ServerSocket(60023);
        Socket accept = serverSocket.accept();

        byte[] bytes=new byte[100];
        InputStream i = accept.getInputStream();

        i.read(bytes);

        for (byte aByte : bytes) {
            System.out.print(aByte);
            System.out.print(' ');
        }
        System.out.println("");
        System.out.println("报文长度"+bytes.length);
    }
}
