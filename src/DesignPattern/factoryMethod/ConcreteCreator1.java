package DesignPattern.factoryMethod;

/**
 * @author :weixiao
 * @description :
 * @date :2020/5/20 10:13
 */
public class ConcreteCreator1 implements Creator {
    @Override
    public Product factory() {
        return new ConcreteProduct1();
    }
}
