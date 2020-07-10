package reference;

import java.lang.ref.SoftReference;

/**
 * @author :weixiao
 * @description :软引用
 * 先生成一个软引用10m 然后能获取到这个引用，再创建一个12m的强引用，
 * 设置jvm用的最大的内存使用是20m  ,程序执行时如果生成的12m的强引用空间不够则垃圾收集器会把软引用回收掉
 * 先配置最大内存使用-Xmx30m
 * @date :2020/7/10 11:09
 */
public class SoftReferenceTest {

    public static void main(String[] args) {
        SoftReference<byte[]> m = new SoftReference<>(new byte[1024*1024*10]);
        System.out.println(m.get());
        System.gc();

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(m.get());

        //强引用
        byte[] b = new byte[1024*1024*15];
        System.out.println(m.get());
    }
}
