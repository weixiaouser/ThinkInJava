package juc.jmm;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author :weixiao
 * @description : volatile不保证原子性
 * @date :2020/3/30 11:17
 */
public class Test02 {

    //第二种方式是替换int类型为 AtomicInteger
    private static AtomicInteger num = new AtomicInteger();

    //第一种方式在add 方法上添加synchronized 加锁 可以解决此问题
    public  static void add(){
        //num++ ;
        num.getAndIncrement();//等价于num++
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            new Thread(()->{
                for (int j = 1; j <= 1000; j++) {
                    add();
                }
            },String.valueOf(i)).start();
        }
        //main 线程等待上面执行完成，判断线程存活数 2 main gc线程
        while (Thread.activeCount() >2){
            Thread.yield();
        }
        System.out.println(Thread.currentThread().getName()+" "+num);
    }
}
