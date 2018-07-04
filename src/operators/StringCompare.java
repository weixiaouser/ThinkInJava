package operators;

/**
 * Created by weixiao on 2018/6/4.
 */
//operators/String compare.java
/*
* Write a method that takes tow String arguments uses all the boolean
* comparisons to compare the tow stings and print the results.
* for the == and !=,also perform the equals() test.In main(),test your method with some
* different String object*/
public class StringCompare {
    static void f(boolean b) {
        if (b == true) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
        static void stringTest(String s,String t){
        f(s == t);
        f(s.equals(t));
        f(t.equals(s));
        f(s != t);


    }

    public static void main(String[] args){
    String s = "one",t = "one";
    StringCompare.stringTest(s,t);
    }


}
