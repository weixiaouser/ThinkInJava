package juc.msbc001.synchtest;

import java.util.concurrent.TimeUnit;

/**
 * @author :weixiao
 * @description :
 * @date :2020/6/5 13:48
 *
 * 一个同步方法可以调用另外一个同步方法，
 * 一个线程已经拥有某个对象的锁，再次申请的时候仍然会得到该对象的锁
 * 这就是说synchronized获得锁是可重入的
 */
public class SyncTest3 {

    synchronized void m1(){
        System.out.println(Thread.currentThread().getName()+" m1 start");
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        m2();
        System.out.println(Thread.currentThread().getName()+" m1 end");
    }

    synchronized void m2(){
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+" m2");
    }

    public static void main(String[] args) {
        new SyncTest3().m1();
    }

}
