package juc.msbc001.automic;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.LongAdder;

/**
 * @author :weixiao
 * @description :模拟多线程对一个数进行递增
 * @date :2020/6/9 11:00
 *
 * 1.我们一个long类型的数，递增的时候我们加锁 通过synchronized实现
 * 2.使用AtomicLong 原子类
 * 3.使用LongAdder
 * 执行结果：
 * AtomicLong :100000000 time 2069
 * Synchronized :100000000 time 3998
 * LongAdder :100000000 time 939
 */
public class T02_AtomiCvsLongAdder {

    static long count2 = 0L;
    static AtomicLong count1 = new AtomicLong(0L);
    static LongAdder count3 = new LongAdder();

    public static void main(String[] args) throws Exception {
        Thread [] threads = new Thread[1000];
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(()->{
                for(int k = 0;k<100000;k++){
                    count1.incrementAndGet();
                }
            });
        }
        long start = System.currentTimeMillis();
        for(Thread t:threads){
            t.start();
        }
        for (Thread t :threads){
            t.join();
        }
        long end = System.currentTimeMillis();
        System.out.println("AtomicLong :"+count1.get() +" time "+(end - start));
        
        Object lock = new Object();
        for(int i = 0;i<threads.length;i++){
            threads[i] = new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int k = 0; k < 100000; k++) {
                        synchronized (lock){
                            count2++;
                        }
                    }
                }
            });
        }

        start = System.currentTimeMillis();
        for (Thread t :threads){
            t.start();
        }
        for (Thread t: threads){
            t.join();
        }

        end = System.currentTimeMillis();
        System.out.println("Synchronized :"+count2 + " time "+ (end -start));


        for( int  i =0;i<threads.length;i++){
            threads[i] = new Thread(()->{
                for(int k = 0;k<100000; k++){
                    count3.increment();
                }
            });
        }

        start = System.currentTimeMillis();
        for (Thread t :threads){
            t.start();
        }
        for (Thread t:threads){
            t.join();
        }

        end = System.currentTimeMillis();

        System.out.println("LongAdder :"+ count3.longValue() +" time "+(end-start
        ));
    }
}
