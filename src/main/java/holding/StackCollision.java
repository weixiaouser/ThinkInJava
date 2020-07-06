package holding;

/**
 * Created by weixiao on 2018/10/9.
 */
public class StackCollision {
    public static void main(String[] args) {
        net.mindview.util.Stack<String> stack = new net.mindview.util
                .Stack<String>();
        for(String s :"My dog has fleas".split(" ")){
            stack.push(s);
        }
        while(!stack.empty()){
            System.out.println(stack.pop()+" ");
        }
        System.out.println();
        java.util.Stack<String> stack2 = new java.util.Stack<String>();
        for(String s:"My dog has fleas".split(" ")){
            stack2.push(s);
        }
        while (!stack2.empty()){
            System.out.println(stack2.pop()+" ");
        }
    }
}/*output
fleas
has
dog
My

fleas
has
dog
My
*/
