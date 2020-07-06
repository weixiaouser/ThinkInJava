package juc.msbc001.volatileTest;

import java.util.concurrent.TimeUnit;

/**
 * @author :weixiao
 * @description :
 * @date :2020/6/5 16:02
 */
public class T01_HelloVolatile {

    volatile boolean running = true;

    void m(){
        System.out.println("m start");
        while (running){
            //此处如果打印输出的话导致程序结束，可能是因为System.out.println中是synchronized的
           // System.out.println("循环中");
        }
        System.out.println("m end ");

    }

    public static void main(String[] args) {
        T01_HelloVolatile t = new T01_HelloVolatile();
        new Thread(()->t.m(),"t1").start();

        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t.running = false;
    }


}
