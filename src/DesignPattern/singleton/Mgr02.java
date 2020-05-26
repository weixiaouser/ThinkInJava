package DesignPattern.singleton;

import java.util.concurrent.TimeUnit;

/**
 * @author :weixiao
 * @description :懒汉式单例
 * @date :2020/5/26 10:39
 */
public class Mgr02 {
    private static volatile Mgr02 INSTANCE ;//volatile 三个特性：保证可见性，不保证原子性，禁止指令重排（内存屏障）

    private Mgr02(){}

    public static  Mgr02 getInstance(){//synchronized在方法上添加  效率低
        if(INSTANCE == null) {
            synchronized (Mgr02.class) {//不能保证单实例  需要双重检测 DCL
                if(INSTANCE == null) {
                    try {
                        TimeUnit.SECONDS.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    INSTANCE = new Mgr02();
                }
            }
        }
        return INSTANCE;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Thread(()->{
                System.out.println(Thread.currentThread().getName()+" "+Mgr02.getInstance().hashCode());
            }).start();
        }

    }
}
