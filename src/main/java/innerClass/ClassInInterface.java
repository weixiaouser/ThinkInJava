package innerClass;

/**
 * Created by weixiao on 2018/9/18.
 * innerclasses/ClassInInterface.java
 */
public interface ClassInInterface {
    void howdy();
    class Test implements ClassInInterface {
        public void howdy(){
            System.out.println("Howdy!");
        }

        public static void main(String[] args) {
            new Test().howdy();
        }
    }
}/*output:
Howdy!
*/
