package juc.design;

/**
 * @author :weixiao
 * @description : 计算金额
 * @date :2020/3/16 21:48
 */
public interface CalculateStrategy {

    public String userType();

    public double discount(double fee);
}
