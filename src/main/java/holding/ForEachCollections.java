package holding;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

/**
 * Created by weixiao on 2018/10/15.
 */
public class ForEachCollections {
    public static void main(String[] args) {
        Collection<String> cs = new LinkedList<String>();
        Collections.addAll(cs,"Take the long way home".split(" "));
        for(String s :cs){
            System.out.println("'"+ s+ "'");
        }
    }
}/*output:
'Take'
'the'
'long'
'way'
'home'
*/
