package DesignPattern.strategy;

/**
 * @author :weixiao
 * @description : 自己定义的Comparator 类  参考java.util.Comparator
 * @date :2020/5/26 15:31
 */
public interface Comparator<T> {

    int compare(T o1,T o2);
}
