package juc.c_020;

import com.sun.xml.ws.server.provider.SyncProviderInvokerTube;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

/**
 * @author :weixiao
 * @description :LockSupport 总结：
 * 1.LockSupport不需要Synchronized加锁就可以实现线程的阻塞和唤醒
 * 2.LockSupport的unpartk()可以先于LockSupport.park()执行，并且线程不会阻塞
 * 3.如果一个线程处于等待状态，连续调用了两次park方法，就会使该线程永远无法被唤醒
 * @date :2020/6/22 10:40
 */
public class T13_TestLockSupport {

    public static void main(String[] args) {
        Thread t = new Thread(()->{
            for (int i = 0; i < 10; i++) {
                System.out.println(i);
                if(i == 5){
                    //使用LockSupport的park()方法阻塞当前线程t
                    LockSupport.park();
                }
                if(i == 8){
                    LockSupport.park();
                }
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        //启动当前线程t
        t.start();
        //唤醒线程t
        LockSupport.unpark(t);
    }
}
