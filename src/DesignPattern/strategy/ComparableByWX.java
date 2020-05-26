package DesignPattern.strategy;

/**
 * @author :weixiao
 * @description : 自定义的比较接口 类似java.lang包下的Comparable  使用泛型T 传入类型
 * @date :2020/5/26 14:40
 */
public interface ComparableByWX<T> {

    int compareTo(T o);
}
