package operators;

/**
 * Created by weixiao on 2018/5/30.
 */

class Value{
    int i;
}

public class EqualsMethod2 {
    public static void main(String[] args) {
        Value v1 = new Value();
        Value v2 = new Value();
        v1.i = v2.i = 100;
        System.out.println(v1.equals(v2));
        System.out.println(v1 == v2);
    }
}/* Output :
false
false
*/
