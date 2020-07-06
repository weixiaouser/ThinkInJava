package initialization;

/**
 * Created by weixiao on 2018/7/4.
 */
// Simple use of the "this" keyword.
public class Leaf {
    int i =0;
    Leaf increment(){
        i++;
        return this;
    }
    void print(){
        System.out.println("i = "+i);
    }

    public static void main(String[] args) {
        Leaf x = new Leaf();
        x.increment().increment().increment().print();
    }
}
