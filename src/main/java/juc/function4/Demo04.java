package juc.function4;

import java.util.function.Supplier;

/**
 * @author :weixiao
 * @description : Supplier 供给型接口
 * @date :2020/3/19 18:44
 */
public class Demo04 {

    public static void main(String[] args) {
        Supplier<String> supplier = new Supplier<String>() {
            @Override
            public String get() {
                return "abc";
            }
        };

        Supplier<String> supplier1 = ()->{return "bcd";};
        System.out.println(supplier1.get());
    }
}
