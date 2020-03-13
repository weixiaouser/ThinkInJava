package juc;

import java.util.concurrent.CountDownLatch;

/**
 * @author :weixiao
 * @description :
 * @date :2020/3/13 11:30
 */
public class CountDownLatchDemo {

    public static void main(String[] args) throws InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch(6);

        for (int i = 1; i <= 6; i++) {
            new Thread(()->{
                System.out.println(Thread.currentThread().getName()+"Start");
                countDownLatch.countDown();//出去一个人计数器减1
            },String.valueOf(i)).start();
        }
        countDownLatch.await();//阻塞等待计数器归零
        System.out.println(Thread.currentThread().getName()+"===END");
    }
}
