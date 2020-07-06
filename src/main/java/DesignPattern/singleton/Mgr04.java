package DesignPattern.singleton;

/**
 * @author :weixiao
 * @description : 枚举方式单例
 * 不仅可以解决线程同步，还可以防止反射破坏单例
 * @date :2020/5/26 11:39
 */
public enum Mgr04 {
    INSTANCE;

    public void m(){}

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Thread(()->{
                System.out.println(Thread.currentThread().getName()+" "+ Mgr04.INSTANCE.hashCode());
            }).start();
        }
    }
}
