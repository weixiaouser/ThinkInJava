package juc.msbc001.volatileTest;

/**
 * @author :weixiao
 * @description :java 8以后接口中可以有实现
 * @date :2020/6/8 13:53
 */
public interface AbrInterface {

     void say();
     default void sayhi(){
         System.out.println("hello world");
     }
}
