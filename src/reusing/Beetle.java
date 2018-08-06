package reusing;

/**
 * Created by weixiao on 2018/8/6.
 * reusing/Beetle.java
 * The full process of initialization
 */

class Insect {
    private int i = 9;
    protected int j;
    Insect(){
        System.out.println("i = "+i+",j="+j);
        j = 39;
    }
    private static int x1 = printInit("static Insect.x1 initialized");
    static int printInit(String s){
        System.out.println(s);
        return 47;
    }
}
public class Beetle extends Insect {
    private int k = printInit("Bettle.k initialized");
    public Beetle() {
        System.out.println("k = "+k);
        System.out.println("j = "+j);
    }
    private static int x2 = printInit("static Beetle.x2 initialized");

    public static void main(String[] args) {
        System.out.println("Beetle constructor");
        Beetle b = new Beetle();
    }
}/*output:
static Insect.x1 initialized
static Beetle.x2 initialized
Beetle constructor
i = 9,j=0
Bettle.k initialized
k = 47
j = 39
*/
