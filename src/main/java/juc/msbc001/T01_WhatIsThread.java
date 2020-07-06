package juc.msbc001;

import java.util.concurrent.TimeUnit;

/**
 * @author :weixiao
 * @description :  什么是线程
 * @date :2020/6/3 11:06
 */
public class T01_WhatIsThread {

    private static class T1 extends Thread{

        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+"  T1 Thread");
            }
        }
    }

    public static void main(String[] args) {
        new T1().start();
        //new T1().run();
        for (int i = 0; i < 10; i++) {
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"  main Thread!");
        }
    }
}
