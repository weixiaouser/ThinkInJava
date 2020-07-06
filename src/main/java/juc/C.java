package juc;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author :weixiao
 * @description :
 * @date :2020/3/11 19:55
 *
 * 多个线程启动 A--B--C
 * 三个线程依次打印
 * A  5次
 * B  10次
 * C  15次
 * 依次循环
 *
 * 精确通知线程消费
 */
public class C {

    public static void main(String[] args) {
        Data3 data3 = new Data3();
        new Thread(()->{
            for (int i = 0; i < 10; i++) {
                data3.print5();
            }
        },"A").start();
        new Thread(()->{
            for (int i = 0; i < 10; i++) {
                data3.print10();
            }
        },"B").start();
        new Thread(()->{
            for (int i = 0; i < 10; i++) {
                data3.print15();
            }
        },"C").start();

    }
}


//资源类
class Data3{
    //A1 B2 C3
    public int num =1;

    Lock lock = new ReentrantLock();

    private Condition condition1 = lock.newCondition();
    private Condition condition2 = lock.newCondition();
    private Condition condition3 = lock.newCondition();

    public void print5(){
        lock.lock();
        try{
            //此处使用while是防止假唤醒
            while(num != 1){
                //等待
                condition1.await();
            }
            //干活
            for (int i = 0; i < 5; i++) {
                System.out.println(Thread.currentThread().getName()+" "+i);
            }
            //第一个线程通知第二个线程，第二个线程通知第三个.... 计数器
            num = 2;
            //通知
            condition2.signal();

        }catch(Exception e){
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }
    public void print10(){
        lock.lock();
        try{
            //此处使用while是防止假唤醒
            while(num != 2){
                //等待
                condition2.await();
            }
            //干活
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName()+" "+i);
            }
            //第一个线程通知第二个线程，第二个线程通知第三个.... 计数器
            num = 3;
            //通知
            condition3.signal();

        }catch(Exception e){
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }
    public void print15(){
        lock.lock();
        try{
            //此处使用while是防止假唤醒
            while(num != 3){
                //等待
                condition3.await();
            }
            //干活
            for (int i = 0; i < 15; i++) {
                System.out.println(Thread.currentThread().getName()+" "+i);
            }
            //第一个线程通知第二个线程，第二个线程通知第三个.... 计数器
            num = 1;
            //通知
            condition1.signal();

        }catch(Exception e){
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }

}
