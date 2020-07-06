package initialization;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by weixiao on 2018/7/22.
 * initialization/ArrayNew.java
 * Creating arrays with new.
 */
public class ArrayNew {
    public static void main(String[] args) {
        int[] a;
        Random rand = new Random(47);
        System.out.println(rand);
        a = new int[rand.nextInt(20)];
        System.out.println("length of a = " +a.length);
        System.out.println(Arrays.toString(a));
    }
}/*Output:
length of a = 18
[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
*/
