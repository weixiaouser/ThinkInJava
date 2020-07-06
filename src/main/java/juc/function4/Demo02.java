package juc.function4;

import java.util.function.Predicate;

/**
 * @author :weixiao
 * @description : Predicate 断定型接口
 * @date :2020/3/19 18:01
 */
public class Demo02 {

    public static void main(String[] args) {
        Predicate<String> predicate =  new Predicate<String>() {
            @Override
            public boolean test(String s) {
                if("abc".equals(s)){
                    return true;
                }
                return false;
            }
        };

        Predicate<String> predicate1 = s -> {
            if("abc".equals(s)){
                return true;
            }
            return false;
        };

        System.out.println(predicate1.test("abc"));
    }
}
