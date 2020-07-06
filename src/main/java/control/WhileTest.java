package control;

/**
 * Created by weixiao on 2018/6/5.
 */
//control /WhileTest.java
public class WhileTest {
    static boolean condition() {
        boolean result = Math.random() < 0.99;
        System.out.println(result + ".");
        return result;
    }

    public static void main(String[] args) {
        while (condition()){
            System.out.println("Inside 'while'");
            System.out.println("Exited 'while'");
        }
    }
}
