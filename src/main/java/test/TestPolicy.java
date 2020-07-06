package test;

import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by weixiao on 2018/10/25.
 */
public class TestPolicy {
    public static void main(String[] args) {
        FileWriter writer;
        try {
            writer = new FileWriter("d:/testPolicy.txt");
            writer.write("hello1");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
