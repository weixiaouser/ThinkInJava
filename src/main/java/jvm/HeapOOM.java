package jvm;

import java.util.ArrayList;
import java.util.List;

/**
 * @author :weixiao
 * @description :Java 堆内存溢出异常测试
 * vm Args:-Xms20m -Xmx20m -XX:+HeapDumpOnOutOfMemoryError
 * @date :2020/7/16 9:55
 */
public class HeapOOM {

    static class OOMObject{

    }

    public static void main(String[] args) {
        List<OOMObject> list = new ArrayList<OOMObject>();
        while(true){
            list.add(new OOMObject());
        }
    }
}
