package juc.msbc001.synchtest;

import java.util.concurrent.TimeUnit;

/**
 * @author :weixiao
 * @description :
 * @date :2020/6/5 11:02
 *
 * 面试题：模拟银行账户
 * 对业务写方法加锁，对业务读方法加锁，这样行不行？
 * 容易产生脏读问题，如果业务允许脏读，可以读方法不加锁
 */
public class Account {

    private String name;

    private double balance;

    public synchronized void set(String name,double balance) {
        this.name = name;

        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.balance = balance;
    }

    public synchronized double getBalance(String name) {
        return this.balance;
    }

    public static void main(String[] args) {
        Account a = new Account();
        new Thread(()->a.set("zhangsan",100.00)).start();

        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(a.getBalance("zhangsan"));

        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(a.getBalance("zhangsan"));

    }
}
