package holding;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * Created by weixiao on 2018/10/10.
 * Simple demonstration of HashMap
 */
public class Statistics {
    public static void main(String[] args) {
       /* Random rand = new Random(47);
        Map<Integer,Integer> m = new HashMap<Integer,Integer>();
        for(int i = 0;i<10000;i++){
            int r = rand.nextInt(20);
            Integer freq = m.get(r);
            m.put(r,freq == null ?1:freq+1);
        }
        System.out.println(m);*/

        Map<String ,String> map = new HashMap<String,String>();
        map.put("1","A");
        map.put("2","B");
        map.put("1","C");
        System.out.println(map);

    }
}/*output:
{0=481, 1=502, 2=489, 3=508, 4=481, 5=503, 6=519, 7=471, 8=468, 9=549, 10=513, 11=531, 12=521, 13=506, 14=477, 15=497, 16=533, 17=509, 18=478, 19=464}
*/
