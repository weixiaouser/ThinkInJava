package juc.msbc001;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.sql.Time;
import java.util.concurrent.TimeUnit;

/**
 * @author :weixiao
 * @description :
 * @date :2020/6/3 15:40
 */
public class T04_ThreadState {

    static class MyThread extends Thread{
        @Override
        public void run() {
            System.out.println(this.getState());
            for (int i = 0; i < 10; i++) {
                try {
                    TimeUnit.SECONDS.sleep(5);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        Thread t = new MyThread();
        //NEW 状态  当我们new一个线程时，还没调用start()该线程处于新建状态
        System.out.println("线程状态："+t.getState());

        t.start();
        //调用start方法之后 是RUNNABLE状态
        System.out.println("线程状态start之后："+t.getState());
        try {
            t.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //join 之后结束了是TERMINATED
        System.out.println("线程状态join之后："+t.getState());
    }
}
