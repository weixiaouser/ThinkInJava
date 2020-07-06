package juc.single;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author :weixiao
 * @description : 枚举最安全
 * @date :2020/4/2 21:54
 */
public enum EnumSingle {
    INSTANCE;

    public EnumSingle getInstance(){
        return INSTANCE;
    }

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        EnumSingle enumSingle = EnumSingle.INSTANCE;

        Constructor<EnumSingle> declaredConstructor = EnumSingle.class.getDeclaredConstructor(String.class,int.class);
        declaredConstructor.setAccessible(true);
// 期望的异常 throw new IllegalArgumentException("Cannot reflectively create enum objects");
// Exception in thread "main" java.lang.IllegalArgumentException: Cannot reflectively create enum objects
// java.lang.NoSuchMethodException: com.coding.single.EnumSingle.<init>() 造成这个异常的原因是因为枚举构造方法是有参数的
        declaredConstructor.newInstance();

    }
}
