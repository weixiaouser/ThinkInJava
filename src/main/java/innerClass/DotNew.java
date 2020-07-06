package innerClass;

/**
 * Created by weixiao on 2018/9/17.
 * Creating an inner class directly using the .new syntax
 */
public class DotNew {
    public class Inner{}

    public static void main(String[] args) {
        DotNew dn = new DotNew();
        DotNew.Inner dni = dn.new Inner();
    }
}
