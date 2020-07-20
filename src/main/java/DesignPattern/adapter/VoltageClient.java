package DesignPattern.adapter;

/**
 * @author :weixiao
 * @description :220v电压转换成5v电压适配器模式应用
 * @date :2020/7/20 14:59
 */
public class VoltageClient {

    public static void main(String[] args) {

        Voltage220V v = new Voltage220V();
        VoltageAdapter adapter = new VoltageAdapter(v);
        int result = adapter.output();
        System.out.println(result);

    }
}
