package control;

/**
 * Created by weixiao on 2018/6/5.
 */
//control /IfElse.java
public class IfElse {
    static int result = 0;
    static void test(int testval,int target){
        if(testval > target){
            result  = 1;
        }else if(testval < target){
            result = -1;
        }else{
            result = 0;
        }
    }

    public static void main(String[] args) {
        test(10,5);
        System.out.println(result);
        test(5,10);
        System.out.println(result);
        test(5,5);
        System.out.println(result);
    }
}/* Output:
1
-1
0
*/
