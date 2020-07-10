package reference;

import java.io.IOException;

/**
 * @author :weixiao
 * @description :强引用
 * @date :2020/7/10 10:42
 */
public class StrongReferenceTest {

    public static void main(String[] args) throws IOException {
        M m = new M();
        m = null;
        System.gc();
        System.in.read();
    }

}


