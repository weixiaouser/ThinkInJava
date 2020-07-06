package com.wx.ten;

import java.math.BigDecimal;

/**
 * Created by weixiao on 2018/7/24.
 */
public class Money {

    public static final  String CURRENCY_YUAN_REGEX="^(([0-9]|([1-9][0-9]{0,9}))((.[0-9]{1,2})?))$";
    /**
     * 将分为单位的转换为元 （除100）
     *
     * @param amount
     * @return
     * @throws Exception
     */
    /*public static String fen2YuanStr(String amount) {
        if (!amount.matches(CURRENCY_FEN_REGEX)) {
            throw new RuntimeException("金额格式错误|"+amount);
        }
        return BigDecimal.valueOf(Long.valueOf(amount)).divide(new BigDecimal(100)).toString();
    }*/


    /**
     * 将元为单位的参数转换为分 , 只对小数点前2位支持
     *
     * @param yuan
     * @return
     * @throws Exception
     */
    public static int yuan2FenInt(String yuan){
//        BigDecimal anmount = new BigDecimal(yuan);
//        int fen = (int)(anmount.doubleValue() * 100);
//        return fen;
        BigDecimal fenBd = new BigDecimal(yuan).multiply(new BigDecimal(100));
        fenBd = fenBd.setScale(0, BigDecimal.ROUND_HALF_UP);
        return fenBd.intValue();
    }

    public static void main(String[] args) {
        System.out.println(yuan2FenInt("10000"));
    }
}
