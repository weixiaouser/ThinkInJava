package accessControl;

/**
 * Created by weixiao on 2018/7/29.
 * access/Lunch.java
 * Demonstrates class access specifiers. Make a class
 * effectively private with private constructors;
 */

class Soup1 {
    private Soup1() {
    }

    public static Soup1 makeSoup() {
        return new Soup1();
    }
}

class Soup2{
private Soup2(){}
private static Soup2 ps1=new Soup2();
public static Soup2 access(){
        return ps1;
        }
public void f(){}
        }

public class Lunch {
    void testPrivate() {

    }

    void testStatic() {
        Soup1 soup = Soup1.makeSoup();
    }

    void testSingleton() {
        Soup2.access().f();
    }
}
