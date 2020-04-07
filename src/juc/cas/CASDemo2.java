package juc.cas;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicStampedReference;

/**
 * @author :weixiao
 * @description :解决CAS 的ABA问题 原子引用
 * @date :2020/4/7 10:37
 */
public class CASDemo2 {

   static AtomicStampedReference<Integer> stampedReference = new AtomicStampedReference(100,1);

    public static void main(String[] args) {
        new Thread(()->{
            //获取版本号
            int stamp = stampedReference.getStamp();
            System.out.println("T1 Stamp 01版本号："+stampedReference.getStamp());
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            stampedReference.compareAndSet(100,101 ,stamp,stamp+1);
            System.out.println("T1 Stamp 02=>"+stampedReference.getReference()+" "+stampedReference.getStamp());

            stampedReference.compareAndSet(101,100,stampedReference.getStamp(),stampedReference.getStamp()+1);
            System.out.println("T1 Stamp 03=>"+stampedReference.getStamp());
        },"T1").start();

        new Thread(()->{
            //获取版本号
            int stamp = stampedReference.getStamp();
            System.out.println("T2 Stamp 01版本号："+stampedReference.getStamp());
            try {
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            boolean b = stampedReference.compareAndSet(100,2020,stamp,stamp+1);
            System.out.println("b"+b+" "+stampedReference.getStamp()+" "+stampedReference.getReference());

        },"T2").start();
    }
}
