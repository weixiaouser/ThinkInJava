package jvm;

/**
 * @author :weixiao
 * @description :
 * @date :2020/1/14 14:20
 */
public class NotInitialization {

    public static void main(String[] args) {
        //System.out.println(SubClass.value);
        //SuperClass[] sca = new SuperClass[10];
        System.out.println(ConstClass.HELLOWORLD);
    }
}
