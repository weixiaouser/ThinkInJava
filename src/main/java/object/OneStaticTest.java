package object;

/**
 * Created by weixiao on 2018/5/29.
 */
//object /OneStaticTest.java
//TIJ4 Chapter Object, Exercise 8 page 90
    /*
    Write a program that demonstrates that,no matter how many objects you
    create of a particular class,there is only on instance of a particular
    static field of that class
     */
class StaticTest2{
    static int i = 47;
}
class Incrementable2{
    static void increment(){
        StaticTest.i++;
    }
}
public class OneStaticTest {
    public static void main(String[] args) {
        System.out.println("StaticTest2.i="+StaticTest2.i);
        StaticTest2 st1 = new StaticTest2();
        StaticTest2 st2 = new StaticTest2();
        System.out.println("st1.i="+st1.i);
        System.out.println("st2.i="+st2.i);
        Incrementable2.increment();
        System.out.println("After Incrementable.increment() called:");
        System.out.println("st1.i="+st1.i);
        System.out.println("st2.i="+st2.i);
        Incrementable.increment();
        System.out.println("After Incrementable.increment called:");
        System.out.println("st1.i="+st1.i);
        System.out.println("st2.i="+st2.i);
        st1.i = 3;
        System.out.println("After st1.i=3,");
        System.out.println("st1.i="+st1.i);
        System.out.println("st2.i="+st2.i);
        System.out.println("Create another StaticTest, st3.");
        StaticTest2 st3 = new StaticTest2();
        System.out.println("st3.i="+st3.i);
    }
}
