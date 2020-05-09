package jvm;

/**
 * @author :weixiao
 * @description :方法静态解析演示
 * @date :2020/4/24 15:26
 */
public class StaticResolution {

    public static void sayHello(){
        System.out.println("hello world");
    }

    public static void main(String[] args) {
        StaticResolution.sayHello();

    }
}
