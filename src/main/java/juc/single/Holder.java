package juc.single;

import com.sun.org.apache.bcel.internal.classfile.InnerClass;

/**
 * @author :weixiao
 * @description : 静态内部类
 * @date :2020/4/2 21:32
 */
public class Holder {

    private Holder(){}

    public static Holder getInstance(){
        return InnerClass.holder;
    }

    private static class InnerClass{
        private static final Holder holder= new Holder();
    }
}
