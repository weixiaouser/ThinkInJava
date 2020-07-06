package juc.msbc001.synchtest;

import java.util.concurrent.TimeUnit;

/**
 * @author :weixiao
 * @description :同步方法和非同步方法是否可以同时调用？可以同时调用
 * @date :2020/6/5 10:21
 */
public class SynchTest2 {

    public synchronized void m1(){
        System.out.println(Thread.currentThread().getName()+" m1 start...");
        try {
            TimeUnit.SECONDS.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+" m1 end.");
    }

    public void m2(){
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+" m2 ");
    }

    public static void main(String[] args) {
        SynchTest2 t = new SynchTest2();
       /* new Thread(()->{t.m1();},"t1").start();
        new Thread(()->{t.m2();},"t2").start();*/

        new Thread(t::m1,"t1").start();
        new Thread(t::m2,"t2").start();
    }
}
