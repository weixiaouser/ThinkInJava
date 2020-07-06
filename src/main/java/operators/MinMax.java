package operators;

/**
 * Created by weixiao on 2018/5/31.
 */
//operators/MinMax.java
//Display the largest and smallest numbers for both float and double
public class MinMax {
    public static void main(String[] args) {
        double max = Double.MAX_VALUE;
        System.out.println("Max double = "+max);
        double min = Double.MIN_VALUE;
        System.out.println("Min double = "+min);
        float maxf = Float.MAX_VALUE;
        System.out.println("Max float = "+maxf);
        float minf = Float.MIN_VALUE;
        System.out.println("Min float = "+minf);
    }
}/* Output:
Max double = 1.7976931348623157E308
Min double = 4.9E-324
Max float = 3.4028235E38
Min float = 1.4E-45
*/
