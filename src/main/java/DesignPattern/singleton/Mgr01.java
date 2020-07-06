package DesignPattern.singleton;

/**
 * @author :weixiao
 * @description :
 * @date :2020/5/26 10:29
 *
 * 饿汉式单例  进来先new 一个  JVM保证线程安全
 */
public class Mgr01 {

    private static final Mgr01 INSTANCE = new Mgr01();

    private Mgr01(){}

    public static Mgr01 getInstance(){
        return INSTANCE;
    }

    public static void main(String[] args) {
        Mgr01 m1 = Mgr01.getInstance();
        Mgr01 m2 = Mgr01.getInstance();
        System.out.println(m1 == m2);
    }
}
