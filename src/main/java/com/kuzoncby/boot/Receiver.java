package com.kuzoncby.boot;

import java.util.concurrent.CountDownLatch;

/**
 * Created by Kuzon on 7/25/2016.
 */
public class Receiver {

    private CountDownLatch latch = new CountDownLatch(1);

    public void receiveMessage(String message) {
        System.out.println("客户端收到了：<" + message + ">");
        latch.countDown();
    }

    public CountDownLatch getLatch() {
        return latch;
    }

}
