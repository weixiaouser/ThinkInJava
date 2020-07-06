package jvm;

/**
 * @author :weixiao
 * @description :
 * @date :2020/4/24 13:53
 */
public class SlotGc {
    public static void main(String[] args) {
        {
            byte[] placeholder = new byte[64 * 1024 * 1024];
        }
        int a = 0;
        System.gc();
    }
}
