package juc;

import java.util.concurrent.TimeUnit;

/**
 * @author :weixiao
 * @description : 8锁现象
 * @date :2020/3/12 11:00
 * 2.邮件方法暂停4秒，请问是先打印邮件还是先打印短信
 */
public class Lock82 {
    public static void main(String[] args) {
        Phone phone = new Phone();
        //我们这里两个线程使用的是同一个对象，两个线程是一把锁，先调用的先执行
        new Thread(()->{phone.sendEmail();},"A").start();
        try {
            //睡眠
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        new Thread(()->{phone.sendMsg();},"B").start();
    }
}
//资源类 发邮件，发短信
class Phone2{
    //被synchronized修饰的方法，锁的对象是方法的调用者
    public synchronized void sendEmail() throws InterruptedException {
        TimeUnit.SECONDS.sleep(4);
        System.out.println("sendEmail");
    }
    public synchronized void sendMsg(){
        System.out.println("sendMsg");
    }
}
