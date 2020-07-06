package juc.msbc001.synchtest;

import jdk.management.resource.internal.inst.FileOutputStreamRMHooks;

/**
 * @author :weixiao
 * @description :Synchronized 关键字对某个对象加锁
 * 静态方法static 是没有this对象的  因为静态方法在初始化的时候this当前对象还不存在，对象还没初始化，所以 静态方法没有this对象
 * @date :2020/6/4 10:01
 */
public class SynchronTest implements Runnable{

    private /*volatile*/ int count =100;

    //Object o = new Object();

    /*public void m(){
        //通过new一个对象来加锁
        synchronized (o){
            count--;
            System.out.println(Thread.currentThread().getName() +" count= "+count);
        }
        //锁定当前对象
        synchronized (this){
            count--;
            System.out.println(Thread.currentThread().getName() +" count= "+count);
        }

        synchronized (SynchronTest.class){
            count--;
            System.out.println(Thread.currentThread().getName() +" count= "+count);
        }
    }*/

    /*public synchronized void m2(){
        count--;
        System.out.println(Thread.currentThread().getName()+" count= "+count);
    }*/

    @Override
    public synchronized void run() {
        count--;
        System.out.println(Thread.currentThread().getName()+" count= "+count);
    }

    public static void main(String[] args) {

        SynchronTest t = new SynchronTest();
        for (int i = 0; i < 100; i++) {
            new Thread(t,"Thread "+i).start();
        }

    }


}
