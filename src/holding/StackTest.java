package holding;

import net.mindview.util.Stack;

/**
 * Created by weixiao on 2018/10/9.
 */
public class StackTest {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();
        for(String s :"My dog has fleas".split(" ")){
            stack.push(s);
        }
        while (!stack.empty()){
            System.out.println(stack.pop()+" ");
        }
    }
}/*output:
fleas
has
dog
My
*/
