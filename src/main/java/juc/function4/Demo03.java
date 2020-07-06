package juc.function4;

import java.util.function.Consumer;

/**
 * @author :weixiao
 * @description :Consume 消费型接口
 * @date :2020/3/19 18:15
 */
public class Demo03 {

    public static void main(String[] args) {
        Consumer<String> consumer = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println("abc"+s);
            }
        };

        Consumer<String> consumer1 = s -> {
            System.out.println(s);
        };

        consumer1.accept("p");
    }
}
