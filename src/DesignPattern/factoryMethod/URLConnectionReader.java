package DesignPattern.factoryMethod;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

/**
 * @author :weixiao
 * @description :
 * @date :2020/5/20 16:38
 */
public class URLConnectionReader {

    public static void main(String[] args) throws Exception {
        URL yahoo = new URL("http://www.yahoo.com");
        URLConnection yc = yahoo.openConnection();
        BufferedReader in = new BufferedReader(
                new InputStreamReader(
                        yc.getInputStream()
                )
        );
        String inputLine;
        while((inputLine = in.readLine())!= null){
            System.out.println(inputLine);
        }
        in.close();

    }
}
