package juc.c_020;

import com.sun.xml.internal.bind.v2.runtime.output.SAXOutput;

import java.util.concurrent.Semaphore;

/**
 * @author :weixiao
 * @description :
 * @date :2020/6/22 10:05
 */
public class T11_TestSemaphore {

    public static void main(String[] args) {

        //Semaphore 默认是非公平锁，传入true 设置为公平
        Semaphore s = new Semaphore(2,true);

        new Thread(()->{
            try {
                s.acquire();
                System.out.println("T1 running...");
                Thread.sleep(200);
                System.out.println("T1 running2...");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }finally {
                s.release();
            }
        }).start();

        new Thread(()->{
            try {
                s.acquire();
                System.out.println("T2 running...");
                Thread.sleep(200);
                System.out.println("T2 running2...");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }finally {
                s.release();
            }
        }).start();

    }
}
