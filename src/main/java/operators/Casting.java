package operators;

/**
 * Created by weixiao on 2018/6/2.
 */
// operators/Casting
public class Casting {
    public static void main(String[] args) {
        int i = 200;
        long lng = (long)i;
        lng = i;
        long lng2 = (long)200;
        lng2 = 200;
        i = (int)lng2;
    }
}
