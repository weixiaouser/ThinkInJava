package generics;

/**
 * @author :weixiao
 * @description :
 * @date :2020/7/1 16:51
 */
public class GenericMethods {

    public <T> void f(T x){
        System.out.println(x.getClass().getName());
    }

    public static void main(String[] args) {
        GenericMethods gm = new GenericMethods();
        gm.f("");
        gm.f(1);
        gm.f(1.0);
        gm.f(1.0F);
        gm.f('c');
        gm.f(gm);
        System.out.println(gm);

    }
}
