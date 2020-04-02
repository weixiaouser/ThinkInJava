package juc.single;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/**
 * @author :weixiao
 * @description :懒汉式单例模式
 * 通过反射破解单例模式
 * @date :2020/4/2 21:14
 */
public class LazyMan2 {

    private  volatile static LazyMan2 lazyMan;

    private static boolean flag = false;

    private LazyMan2(){
        //构造器私有
        synchronized (LazyMan2.class){
            if(flag == false){
                flag = true;
            }else{
                throw new RuntimeException("不要试图破坏单例");
            }
        }
    }

    public static LazyMan2 getInstance(){
        if(lazyMan == null){
            //加锁，双重检测
            synchronized (LazyMan2.class) {
                if(lazyMan == null) {
                    //下面语句可能存在指令重排  解决指令重排可以加volitle
                    lazyMan = new LazyMan2();
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

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {
        //获取单例对象
       // LazyMan instance1 = LazyMan.getInstance();
        //通过反射获取
        Constructor<LazyMan2> declaredConstructors = LazyMan2.class.getDeclaredConstructor(null);
        declaredConstructors.setAccessible(true);


        Field flag = LazyMan2.class.getDeclaredField("flag");
        flag.setAccessible(true);

        LazyMan2 instance1 = declaredConstructors.newInstance();
        flag.set(instance1,false);

        //通过反射获取对象
        LazyMan2 instance2 = declaredConstructors.newInstance();

        System.out.println(instance1);
        System.out.println(instance2);
    }
}
