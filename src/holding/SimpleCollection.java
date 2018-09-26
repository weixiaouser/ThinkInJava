package holding;

import net.mindview.util.CountingGenerator;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by weixiao on 2018/9/26.
 */
public class SimpleCollection {
    public static void main(String[] args) {
        Collection<Integer> c = new ArrayList<Integer>();
        for(int i = 0 ;i<10;i++){
            c.add(i);
        }
        for(Integer i : c){
            System.out.print(i + ",");
        }
    }
}/*output:
0,1,2,3,4,5,6,7,8,9,
*/
