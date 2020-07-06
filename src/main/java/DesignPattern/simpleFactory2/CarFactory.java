package DesignPattern.simpleFactory2;

/**
 * @author :weixiao
 * @description :
 * @date :2020/5/26 21:10
 */
public class CarFactory {

    public Moveable create(){
        System.out.println("a car created!");
        return new Car();
    }
}
