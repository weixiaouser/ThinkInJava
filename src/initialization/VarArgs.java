package initialization;

/**
 * Created by weixiao on 2018/7/22.
 * initialization/VarArgs.java
 * Using array syntax to create variable argument lists.
 */

class A{}

public class VarArgs {
    static void printArray(Object[] args){
        for(Object obj:args){
            System.out.println(obj+" ");

        }
        System.out.println();
    }

    public static void main(String[] args) {
        printArray(new Object[]{new Integer(47),new Float(3.14),
        new Double(11.11)});
        printArray(new Object[]{"one","two","three"});
        printArray(new Object[]{new A(),new A(),new A()});
    }

}/*
47
3.14
11.11

one
two
three

initialization.A@45ee12a7
initialization.A@330bedb4
initialization.A@2503dbd3
*/
