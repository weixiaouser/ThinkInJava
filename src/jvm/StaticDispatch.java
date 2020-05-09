package jvm;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

/**
 * @author :weixiao
 * @description :方法静态分派演示
 * @date :2020/4/24 15:53
 */
public class StaticDispatch {

    static abstract class Human{
    }
    static class Man extends Human{

    }
    static class Women extends Human{

    }
    public void sayHello(Human guy){
        System.out.println("Hello,guy!");
    }
    public void sayHello(Man guy){
        System.out.println("hello,gentleman!");
    }
    public void sayHello(Women guy){
        System.out.println("hello,lady!");
    }

    public static void main(String[] args) {
        Human man = new Man();
        Human women = new Women();
        StaticResolution sr = new StaticResolution();
        /*sr.sayHello(man);
        sr.sayHello(women);*/
    }
}
