package initialization;

/**
 * Created by weixiao on 2018/6/20.
 */
//initialization/ConstructorTest.java
//create a class containing an unitialized String reference.

class Tester{
    String s;
}
public class ConstructorTest {
    public static void main(String[] args) {
        Tester t = new Tester();
        System.out.println(t.s);
    }
}
