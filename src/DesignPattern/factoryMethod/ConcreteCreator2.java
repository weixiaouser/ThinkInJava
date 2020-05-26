package DesignPattern.factoryMethod;

/**
 * @author :weixiao
 * @description :
 * @date :2020/5/20 10:25
 */
public class ConcreteCreator2 implements Creator {
    @Override
    public Product factory() {
        return new ConcreteProduct2();
    }
}
