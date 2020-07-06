package vmClassLoad;

/**
 * @author :weixiao
 * @description :
 * @date :2020/4/23 15:00
 */
public class Parent {

    public static int A = 1;

    static {A =2;}


    public static void main(String[] args) {
        System.out.println(Sub.B);
    }
}

 class Sub extends Parent{
    public static int B = A;
}

