package DesignPattern.simpleFactory;

/**
 * @author :weixiao
 * @description :
 * @date :2020/5/19 11:28
 */
public class FactoryTest {

    public static void main(String[] args) throws BadFruitException {
         FruitGardener.factory("grape");
         FruitGardener.factory("apple");
         FruitGardener.factory("strawberry");
         FruitGardener.factory("aaa");
        System.out.println("已创建完成");
    }
}
