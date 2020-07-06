package DesignPattern.simpleFactory2;

/**
 * @author :weixiao
 * @description :
 * @date :2020/5/26 20:48
 */
public class Main {

    public static void main(String[] args) {
        /*Car c = new Car();
        c.go();*/
        Moveable m = new Car();
        m.go();
    }
}
