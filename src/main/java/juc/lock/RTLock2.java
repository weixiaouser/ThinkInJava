package juc.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author :weixiao
 * @description :
 * @date :2020/4/7 14:04
 */
public class RTLock2 {

    public static void main(String[] args) {
        Phone2 phone2 = new Phone2();

        new Thread(phone2,"T1").start();
        new Thread(phone2,"T2").start();

    }


}

class Phone2 implements Runnable {

    Lock lock = new ReentrantLock();

    public void get(){
        lock.lock();
        try {

            System.out.println(Thread.currentThread().getName()+"==>get");
            set();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void set(){
        lock.lock();
        try {

            System.out.println(Thread.currentThread().getName()+"==>set");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    @Override
    public void run() {
        get();
    }
}
