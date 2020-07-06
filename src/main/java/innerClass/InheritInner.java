package innerClass;

/**
 * Created by weixiao on 2018/9/20.
 */

class withInner {
    class Inner{}
}

public class InheritInner extends withInner.Inner {
    InheritInner(withInner wi){
        wi.super();
    }

    public static void main(String[] args) {
        withInner wi = new withInner();
        InheritInner ii = new InheritInner(wi);
    }
}
