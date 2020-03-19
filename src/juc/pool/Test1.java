package juc.pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author :weixiao
 * @description :线程池三大方法
 * @date :2020/3/16 11:02
 */
public class Test1 {

    public static void main(String[] args) {

        // ExecutorService threadPool1 = Executors.newFixedThreadPool(5);//固定线程大小
        ExecutorService threadPool2 = Executors.newCachedThreadPool();//可以弹性伸缩，遇强则强
        ExecutorService threadPool3 = Executors.newSingleThreadExecutor();//只有一个


        try {
            for (int i = 0; i < 10; i++) {
                threadPool3.execute(() -> {
                    System.out.println(Thread.currentThread().getName() + " running...");
                });
            }


        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            threadPool3.shutdown();
        }


    }
}
