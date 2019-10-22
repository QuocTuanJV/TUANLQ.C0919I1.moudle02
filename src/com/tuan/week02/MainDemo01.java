package com.tuan.week02;

public class MainDemo01 {
    public static void main(String[] args) throws InterruptedException {
        Demo01 watch = new Demo01();
        long i= 0;
// do something
        watch.start();
        while(true){
            i = i + 1;
            if(i == 100000000){
                break;
            }
        }

        watch.stop();
        System.out.println(watch.getElapsedTimeSecs());
    }
}
