package reusing;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

/**
 * Created by weixiao on 2018/8/1.
 * Composition for code reuse
 */

class WaterSource{
    private String s;
    WaterSource(){
        System.out.println("WaterSource()");
        s = "Constructed";
    }
    public String toString(){
        return s;
    }
}
public class SprinklerSystem {
    private String valve1,valve2,valve3,valve4;
    private WaterSource source = new WaterSource();
    private int i;
    private float f;
    public String toString(){
        return "valve1 = "+valve1+" "+
                "valve2 = "+valve2+" "+
                "valve3 = "+valve3+" "+
                "valve4 = "+valve4+"\n"+
                "i = " +i+" "+"f = "+f+" "+
                "source = "+source;

    }

    public static void main(String [] args){
        SprinklerSystem sprinklerSystem = new SprinklerSystem();
        System.out.println(sprinklerSystem);
    }
}/*output
WaterSource()
valve1 = null valve2 = null valve3 = null valve4 = null
i = 0 f = 0.0 source = Constructed
*/
