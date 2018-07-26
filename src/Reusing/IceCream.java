package Reusing;

/**
 * Created by weixiao on 2018/7/26.
 * Demonstrates "private" keyword
 */

class Sundae{
    private Sundae(){}
    static Sundae makeASundae(){
        return new Sundae();
    }
}
public class IceCream {
    public static void main(String[] args) {
        Sundae x = Sundae.makeASundae();
    }
}
