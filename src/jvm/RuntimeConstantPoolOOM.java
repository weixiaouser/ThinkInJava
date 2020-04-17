package jvm;

import java.util.ArrayList;
import java.util.List;

/**
 * @author :weixiao
 * @description :运行时常量池异常
 * VM Args:-XX:PermSize=10M -XX:MaxPermSize=10M
 * @date :2020/4/8 11:19
 */
public class RuntimeConstantPoolOOM {

    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        int i = 0;
        while (true){
            System.out.println("i"+i);
            list.add(String.valueOf(i++).intern());
        }
    }

}
