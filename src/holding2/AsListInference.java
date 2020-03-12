package holding2;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by weixiao on 2019/5/10 11:11
 */

class Snow{}
class Powder extends Snow{}
class Light extends Powder{}
class Heavy extends Powder{}
class Crusty extends Snow{}
class Slush extends Snow{}

public class AsListInference {
    public static void main(String[] args) {
        List<Snow> snow1 = Arrays.asList(new Crusty(),new Slush(),new Powder());
        List<Snow> snow2 = Arrays.asList(new Light(),new Heavy());
        //Collections.addAll();
        List<Snow> snow3 = new ArrayList<Snow>();
        Collections.addAll(snow3,new Light(),new Heavy());

        List<Snow> snow4 = Arrays.<Snow>asList(new Light(),new Heavy());
    }
}
