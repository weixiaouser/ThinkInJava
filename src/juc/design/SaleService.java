package juc.design;

import java.util.HashMap;
import java.util.List;

/**
 * @author :weixiao
 * @description :
 * @date :2020/3/16 21:54
 */
public class SaleService {

    HashMap<String,CalculateStrategy> calcMap = new HashMap<>();

    public SaleService(List<CalculateStrategy> calcList){
        for(CalculateStrategy calculateStrategy :calcList){
            calcMap.put(calculateStrategy.userType(),calculateStrategy);
        }
    }

    public double sale(String userType,double fee){
        CalculateStrategy calculateStrategy = calcMap.get(userType);
        fee = calculateStrategy.discount(fee);
        return fee;
    }













}
