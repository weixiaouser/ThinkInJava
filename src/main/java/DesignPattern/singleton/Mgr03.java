package DesignPattern.singleton;

/**
 * @author :weixiao
 * @description : 静态内部类方式单例
 * JVM保证单例
 * 加载外部类时不会加载内部类，这样可以实现懒加载
 * @date :2020/5/26 11:27
 */
public class Mgr03 {

    private Mgr03(){}

    private static class Mgr03Holder{//静态内部类方式创建实例
        private final static Mgr03 INSTANCE = new Mgr03();
    }

    public static Mgr03 getInstance(){
        return Mgr03Holder.INSTANCE;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Thread(()->{
                System.out.println(Thread.currentThread().getName()+" "+Mgr03.getInstance().hashCode());
            }).start();
        }
    }
}
