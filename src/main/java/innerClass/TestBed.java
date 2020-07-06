package innerClass;

/**
 * Created by weixiao on 2018/9/18.
 * Putting test code in a nested class
 */
public class TestBed {
    public void f(){
        System.out.println("f()");
    }
    public static class Tester {
        public static void main(String[] args){
            TestBed t = new TestBed();
            t.f();
        }
    }
}/*output:
f()
*/
