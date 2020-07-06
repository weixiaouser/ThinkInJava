package juc;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author :weixiao
 * @description : Lock锁实现生产者与消费者
 * @date :2020/3/11 17:50
 */
public class B {
    public static void main(String[] args) {
        Data2 data2 = new Data2();
        new Thread(()->{
            for (int i = 0; i < 10; i++) {
                data2.increment();
            }

        },"A").start();
        new Thread(()->{
            for (int i = 0; i < 10; i++) {
                data2.decrement();
            }

        },"B").start();

    }
}

//资源类 属性，方法
class Data2 {

    private int num = 0;

    Lock lock = new ReentrantLock();
    Condition condition = lock.newCondition();

    public void increment(){
        //加锁
        lock.lock();
        try{
            while(num != 0){
                //等待
                condition.await();
            }
            //干活
             num ++;
            System.out.println(Thread.currentThread().getName()+"\t"+num);
            //通知
            condition.signalAll();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }

    public void decrement(){
        //加锁
        lock.lock();
        try{
            while(num == 0){
                //等待
                condition.await();
            }
            //干活
            num --;
            System.out.println(Thread.currentThread().getName()+"\t"+num);
            //通知
            condition.signalAll();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }

}
