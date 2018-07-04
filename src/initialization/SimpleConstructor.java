package initialization;

/**
 * Created by weixiao on 2018/6/20.
 */
//:initialization/SimpleConstructor.java
//Demonstration of a simple constructor


class Rock{
    Rock(){
        System.out.print("Rock ");
    }
}
public class SimpleConstructor {
    public static void main(String[] args) {
        for(int i = 0; i < 10;i++){
            new Rock();
        }
    }
}/*Output:
Rock Rock Rock Rock Rock Rock Rock Rock Rock Rock
*/
