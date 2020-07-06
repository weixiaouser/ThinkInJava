package juc.msbc001.synchtest;

import java.util.concurrent.TimeUnit;

/**
 * @author :weixiao
 * @description :
 * @date :2020/6/5 14:25
 */
public class SynchTest5 {
    int count = 0;

    synchronized void m(){
        System.out.println(Thread.currentThread().getName() + " start");
        while (true){
            count++ ;
            System.out.println(Thread.currentThread().getName()+" count = "+count);
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if(count == 5){
                //此处抛出异常，锁将被释放，要想不释放锁，可以在这里进行catch,然后让循环继续
                int i = 1/0;
                System.out.println(i);
            }
        }

    }

    public static void main(String[] args) {
        SynchTest5 t = new SynchTest5();
        Runnable r = new Runnable() {
            @Override
            public void run() {
                t.m();
            }
        };

        new Thread(r,"t1").start();

        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        new Thread(r,"t2").start();
    }
}
