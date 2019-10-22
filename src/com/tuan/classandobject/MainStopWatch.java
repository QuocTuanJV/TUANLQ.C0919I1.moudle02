package com.tuan.classandobject;

public class MainStopWatch {
    public static void main(String[] args) throws InterruptedException {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        Thread.sleep(5000);
        stopWatch.stop();
    }
}
