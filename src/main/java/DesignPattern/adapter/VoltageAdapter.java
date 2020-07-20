package DesignPattern.adapter;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author :weixiao
 * @description :
 * @date :2020/7/20 14:55
 */
public class VoltageAdapter implements Voltage5V {

    //使用聚合实现对象适配器
    private Voltage220V voltage220V;

    public VoltageAdapter(Voltage220V voltage220V){
        this.voltage220V = voltage220V;
    }


    @Override
    public int output()  {
        if(voltage220V == null){
            throw new RuntimeException("220V is null");
        }
        int output = voltage220V.output();
        int result = output/44;

        return result;
    }
}
