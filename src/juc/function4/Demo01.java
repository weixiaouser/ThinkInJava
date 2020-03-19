package juc.function4;

import java.util.function.Function;

/**
 * @author :weixiao
 * @description : Function 函数式接口
 * @date :2020/3/19 17:50
 */
public class Demo01 {
    public static void main(String[] args) {

       /*Function<String,Integer> function = new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return 1024;
            }
        };*/

       //链式编程  流式计算，lambok
        Function<String,Integer> function = (s)->{return 1024;};
        System.out.println(function.apply("abc"));
    }
}
