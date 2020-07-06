package initialization;

/**
 * Created by weixiao on 2018/7/23.
 * initialization/OverloadingVarargs2.java
 */
//{CompileTimeError} (Won't compile)
public class OverloadingVarargs2 {
    static void f(float f,Character... args){
        System.out.println("first");
    }
    static void f(char c,Character... args){
        System.out.print("second");
    }

    public static void main(String[] args) {
        f(1,'a');
        f('a','b');
    }
}/*output:
first
second
*/
