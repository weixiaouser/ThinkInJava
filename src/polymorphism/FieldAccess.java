package polymorphism;

/**
 * Created by weixiao on 2018/8/29.
 * polymorphism/FieldAccess
 * direct field access is determined at compile time
 */
class Super{
    public int field = 0;
    public int getField(){
        return field;
    }

}
class Sub extends Super{
    public int field =1;
    public int getField(){
        return field;
    }
    public int getSuperField(){
        return super.field;
    }
}
public class FieldAccess {
    public static void main(String[] args) {
        Super sup = new Sub();
        System.out.println("sup.field = "+sup.field+"sup.getField()="+sup.getField());
        Sub sub =new Sub();
        System.out.println("sub.field = "+
                sub.field+"sub.getField)="+
                sub.getField()+"sub.getSuperField()="+
        sub.getSuperField());

    }
}/*Output:
sup.field = 0sup.getField()=1
sub.field = 1sub.getField)=1sub.getSuperField()=0
*/
