package jvm;

/**
 * @author :weixiao
 * @description :
 * @date :2020/1/14 15:33
 */
public class ConstClass {

    static{
        System.out.println("ConstClass init!");
    }

    public static final String HELLOWORLD = "hello world";
}
