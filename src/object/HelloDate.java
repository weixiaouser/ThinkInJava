package object;
//: object/HelloDate.java
import java.util.*;

/**
 * Created by weixiao on 2018/5/23.
 *  The first Thinking in Java example program
 *  Displays a string and today's date.
 *  @author weixiao
 *  @auth www.MindView.net
 *  @version 4.0
 */
public class HelloDate {
    /**
     * Entry point to class & application
     * @param args array of string auguments
     * @throws exceptions No exceptions thrown
     */
    public static void main(String[] args) {
        System.out.println("Hello, it's: ");
        System.out.println(new Date());
    }
    /*
     Output:(55% match)
     Hello,it's:
    Thu May 24 21:56:36 CST 2018
    *///:~
}
