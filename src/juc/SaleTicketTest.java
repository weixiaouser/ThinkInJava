package juc;

/**
 * @author :weixiao
 * @description :卖票 使用synchronize 实现
 * @date :2020/3/10 11:00
 *
 * 多线程编程的固定套路
 * 1.高内聚，低耦合
 * 2.线程 操作（调用对外暴露的方法） 资源类
 */
public class SaleTicketTest {

    public static void main(String[] args) {
        SaleTicket saleTicket = new SaleTicket();
        new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 1;i < 40;i++) {
                    saleTicket.saleTicket();
                }
            }
        },"A").start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 1;i < 40;i++) {
                    saleTicket.saleTicket();
                }
            }
        },"B").start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 1;i < 40;i++) {
                    saleTicket.saleTicket();
                }
            }
        },"C").start();

    }
}


class SaleTicket {
    //票张数
    private int number = 30;

    //售票方法
    public synchronized  void saleTicket(){
        if(number >0 ){
            System.out.println(Thread.currentThread().getName()+"卖出第 "+(number--)+" 张票，还剩 "+number+" 张票");
        }
    }

}