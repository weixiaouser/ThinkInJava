package juc.design;

/**
 * @author :weixiao
 * @description :普通会员
 * @date :2020/3/16 21:51
 */
public class NormalStrategy implements CalculateStrategy{
    @Override
    public String userType() {
        return "normal";
    }

    @Override
    public double discount(double fee) {
        return fee * 0.9;
    }
}
