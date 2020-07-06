package juc.jmm;

import java.util.concurrent.TimeUnit;

/**
 * @author :weixiao
 * @description :
 * @date :2020/3/25 19:27
 */
public class Test01 {

    private volatile static int num = 0;

    public static void main(String[] args) throws InterruptedException {

        new Thread(()->{
            while (num == 0){

            }
        }).start();

        num = 1;
        TimeUnit.SECONDS.sleep(1);

        System.out.println(num);

    }
}
