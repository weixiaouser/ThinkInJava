package holding;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * Created by weixiao on 2018/10/9.
 */
public class SetOfInteger {
    public static void main(String[] args) {
        Random rand = new Random(47);
        Set<Integer> intset = new HashSet<Integer>();
        for(int i = 0 ;i<10000;i++){
            intset.add(rand.nextInt(30));
        }
        System.out.println(intset);
    }
}/*output:
[0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29]
*/
