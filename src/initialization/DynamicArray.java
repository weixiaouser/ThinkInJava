package initialization;

/**
 * Created by weixiao on 2018/7/22.
 * initialization/DynamicArray.java
 * Array initialization.
 */

class Other{
    public static void main(String[] args) {
        for (String s:args){
            System.out.println(s+" ");
        }
    }
}
public class DynamicArray {
    public static void main(String[] args) {
        Other.main(new String[]{"fiddle","de","dum"});
    }
}
/* OutPut:
* fiddle
de
dum
* */
