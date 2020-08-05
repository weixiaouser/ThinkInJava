package innerClass;

/**
 * Created by weixiao on 2018/9/17.
 * Qualifying access to the outer-class object
 */
public class DotThis {
    void f(){
        System.out.println("DotThis.f()");
    }
    public class Inner{
        public DotThis outer(){
            return DotThis.this;
            //A plain "this" would be Inner's "this"
        }
    }
    public Inner inner(){
        return new Inner();
    }
    public static void main(String[] args){
        DotThis dt = new DotThis();
        DotThis.Inner dti = dt.inner();
        dti.outer().f();
    }
}/*output:
DotThis.f()
*/