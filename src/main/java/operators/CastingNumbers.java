package operators;
import static net.mindview.util.Print.*;
/**
 * Created by weixiao on 2018/6/2.
 */
// operators/CastingNumbers.java
// what happens when you cast a float
// or double to an integral value
public class CastingNumbers {
    public static void main(String[] args) {
        double above = 0.7,below = 0.4;
        float fabove = 0.7f,fbelow = 0.4f;
        print("(int)above:"+(int)above);
        print("(int)below:"+(int) below);
        print("(int)fabove:"+(int)fabove);
        print("(int)fbelow:"+(int) fbelow);
    }
}/*Output:
(int)above:0
(int)below:0
(int)fabove:0
(int)fbelow:0
*/
