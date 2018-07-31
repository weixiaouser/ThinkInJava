package accessControl;

import java.io.PrintStream;

/**
 * Created by weixiao on 2018/7/24.
 * Print methods that can be used without
 * qualifiers.using java se5 static imports
 */
public class Print {
    public static void print(Object obj){
        System.out.println(obj);
    }
    public static void print(){
        System.out.println();
    }
    public void printnb(Object obj){
        System.out.println(obj);
    }
    public static PrintStream
    printf(String format,Object... args){
        return System.out.printf(format,args);
    }
}
