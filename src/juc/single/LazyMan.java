package juc.single;

/**
 * @author :weixiao
 * @description :懒汉式单例模式
 * @date :2020/4/2 21:14
 */
public class LazyMan {

    private  volatile static  LazyMan lazyMan;

    private LazyMan(){
        //构造器私有
        System.out.println("构造方法");
    }

    public static LazyMan getInstance(){
        if(lazyMan == null){
            //加锁，双重检测
            synchronized (LazyMan.class) {
                if(lazyMan == null) {
                    //下面语句可能存在指令重排  解决指令重排可以加volitle
                    lazyMan = new LazyMan();
                    /**
                     * 1.分配对象的内存空间
                     * 2.执行构造方法初始化对象
                     * 3.设置实例对象指向刚分配的内存地址
                     */
                }
            }
        }
        return lazyMan;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            //多线程情况下单例是不安全的
            new Thread (()->{
                LazyMan.getInstance();
            }).start();
        }
    }
}
