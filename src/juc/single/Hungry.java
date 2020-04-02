package juc.single;

/**
 * @author :weixiao
 * @description : 饿汉式单例模式
 * 饿汉式顾明司仪就是很饿所以要new出来
 * 缺点就是类一加载就会占用内存空间
 * @date :2020/4/2 20:53
 */
public class Hungry {

    private final static  Hungry hungry = new Hungry();
    //单例模式的核心思想就是构造器私有
    private Hungry(){

    }

    public static Hungry getInstance(){
        return hungry;
    }
}
