package juc;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author :weixiao
 * @description : 卖票
 * @date :2020/3/10 11:36
 */
public class SaleTicketTest2 {

    public static void main(String[] args) {
        SaleTicket2 saleTicket2 = new SaleTicket2();
        new Thread(()->{ for(int i = 1;i<40;i++) saleTicket2.saleTicket(); },"A").start();
        new Thread(()->{ for(int i = 1;i<40;i++) saleTicket2.saleTicket(); },"B").start();
        new Thread(()->{ for(int i = 1;i<40;i++) saleTicket2.saleTicket(); },"C").start();

    }
}

class SaleTicket2{

    private int number = 30;
    Lock lock = new ReentrantLock();

    public void saleTicket(){
        lock.lock();
        try {
            if (number > 0) {
                System.out.println(Thread.currentThread().getName() + "卖出第" + (number--) + "张票，还剩" + number + "张");
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            lock.unlock();
        }




    }
}
