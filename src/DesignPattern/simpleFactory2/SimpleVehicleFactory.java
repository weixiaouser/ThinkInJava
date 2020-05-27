package DesignPattern.simpleFactory2;

import DesignPattern.simpleFactory2.Car;
import DesignPattern.simpleFactory2.Plane;

/**
 * @author :weixiao
 * @description :简单工厂可扩展性不好
 * @date :2020/5/26 21:00
 */
public class SimpleVehicleFactory {

    public Car createCar(){
        return new Car();
    }

    public Plane createPlane(){
        return new Plane();
    }
}
