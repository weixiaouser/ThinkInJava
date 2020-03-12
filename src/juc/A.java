package juc;

/**
 * @author :weixiao
 * @description : 普通版的生产者和消费者
 * @date :2020/3/11 11:11
 *
 * 题目：现在有两个线程，操作一个初始值为0的变量
 * 一个线程+1 ,一个线程 -1 判断什么时候+1，什么时候-1 交替10次
 *
 *
 *生产者消费者模型 判断，干活，通知
 */
public class A {

    public static void main(String[] args) {
        Data data = new Data();
        new Thread(()->{
            for(int i=1 ;i<=10;i++){
                try {
                    data.increment();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

        },"A").start();

        new Thread(()->{
            for(int i=1 ;i<=10;i++){
                try {
                    data.decrement();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

        },"B").start();

    }
}

//资源类 属性 方法
class Data{

    private int num = 0;

    public synchronized void increment()throws Exception{
        //判断
        while(num!=0){
            //等待
            this.wait();
        }
        num ++;
        System.out.println(Thread.currentThread().getName()+" "+num);

        //通知
        this.notifyAll();
    }

    public synchronized void decrement()throws Exception{
        //使用while 以防虚假等待
        while(num==0){
            this.wait();
        }
        num --;
        System.out.println(Thread.currentThread().getName()+" "+num);
        //通知
        this.notifyAll();

    }



}
