package DesignPattern.simpleFactory;

/**
 * @author :weixiao
 * @description :
 * @date :2020/5/19 10:38
 */
public class Strawberry implements Fruit {
    @Override
    public void grow() {
        System.out.println("Strawberry is growing...");
    }

    @Override
    public void harvest() {
        System.out.println("Strawberry has been harvested..");

    }

    @Override
    public void plant() {
        System.out.println("Strawberry has been plated");
    }
}
