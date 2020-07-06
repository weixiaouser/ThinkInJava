package juc.msbc001.volatileTest;

/**
 * @author :weixiao
 * @description :
 * @date :2020/6/8 14:02
 */
public class InterImpl implements AbrInterface {
    @Override
    public void say() {
        System.out.println("say");
    }



    public static void main(String[] args) {
        InterImpl impl = new InterImpl();
        impl.sayhi();
    }
}
