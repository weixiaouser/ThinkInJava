package juc.lock;

/**
 * @author :weixiao
 * @description :可重入锁 （递归锁就是可重入锁）
 * @date :2020/4/7 13:56
 */
public class RTLock {

    public static void main(String[] args) {
        Phone phone = new Phone();


        new Thread(()->{
            phone.sendSms();
        },"T1").start();

        new Thread(()->{
            phone.sendMail();
        },"T2").start();
    }



}

class Phone{

    public synchronized void sendSms(){
        System.out.println("Send Sms");
        sendMail();
    }

    public synchronized void sendMail(){
        System.out.println("Send Mail");
    }
}