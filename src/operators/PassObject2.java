package operators;

/**
 * Created by weixiao on 2018/5/30.
 */
//:operators/PassObject2.java
//Create a class containint a float and use it to demonstrate aliasing during
//method calls
import static net.mindview.util.Print.*;

class Box{
    float a;
}
public class PassObject2 {
    static void f(Box y){
        y.a = 2.71828f;
    }

    public static void main(String[] args) {
        Box x = new Box();
        x.a = 3.1416f;
        print("1: x.a = "+x.a);
        f(x);
        print("2: x.a = "+x.a);
    }
}
/*Output:
1: x.a = 3.1416
2: x.a = 2.71828
* */
