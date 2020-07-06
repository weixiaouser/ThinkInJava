package juc.cas;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author :weixiao
 * @description : CAS CompareAndSet 比较并交换
 * 容易产生ABA问题 也就是狸猫换太子，在两个
 * @date :2020/4/7 9:59
 */
public class CASDemo {

    public static void main(String[] args) {
        AtomicInteger atomicInteger = new AtomicInteger(5);
        //atomicInteger.compareAndSet();两个参数一个是期望的值，一个是更新的值
        System.out.println(atomicInteger.compareAndSet(5,2020)+" "+atomicInteger.get());

        //在执行的中间存在被别人更换
        System.out.println(atomicInteger.compareAndSet(2020,10)+" "+atomicInteger.get());


        //期望是10，如果是10的话则更新成2012
        System.out.println(atomicInteger.compareAndSet(10,2012)+" "+atomicInteger.get());
    }
}
