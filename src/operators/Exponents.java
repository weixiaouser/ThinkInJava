package operators;

/**
 * Created by weixiao on 2018/5/31.
 */
//"e" means "10 to the power"
public class Exponents {
    public static void main(String[] args) {
        float expFloat = 1.39e-43f;
        expFloat = 1.39E-43f;
        System.out.println(expFloat);
        double expDouble = 47e47d;
        double expDouble2 = 47e47;
        System.out.println(expDouble);
    }
}/* Output:
1.39E-43
4.7E48
*/
