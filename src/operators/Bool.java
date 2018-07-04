package operators;

import java.util.Random;
import static net.mindview.util.Print.*;
/**
 * Created by weixiao on 2018/5/31.
 */
//:operators /Bool.java
//Relational and logical operators
public class Bool {
    public static void main(String[] args) {
        Random rand = new Random();
        int i = rand.nextInt(100);
        int j = rand.nextInt(100);
        print("i = "+ i);
        print("j = "+ j);
        print("i > j is "+(i > j));
        print("i < j is "+(i < j));
        print("i >= j is "+(i >= j));
        print("i <= j is "+(i <= j));
        print("i == j is "+(i == j));
        print("i != j is "+(i != j));
        print("(i <10) && (j < 10) is "+ ((i <10) &&(j <10)));
        print("(i <10) || (j < 10) is "+ ((i <10) ||(j <10)));

    }
}/* Output:
i = 26
j = 15
i > j is true
i < j is false
i >= j is true
i <= j is false
i == j is false
i != j is true
(i <10) && (j < 10) is false
(i <10) || (j < 10) is false

*/
