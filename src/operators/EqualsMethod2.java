package operators;

/**
 * Created by weixiao on 2018/5/30.
 */

class Value{
    int i;
}
<<<<<<< HEAD

=======
>>>>>>> 08bd2968c394e45ee13bff8308dda5472f44689e
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
