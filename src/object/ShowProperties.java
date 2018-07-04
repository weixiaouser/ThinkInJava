package object;

/**
 * Created by weixiao on 2018/5/24.
 */
//: object/ShowProperties.java
public class ShowProperties {
    public static void main(String[] args){
        System.getProperties().list(System.out);
        System.out.println("名字:"+System.getProperty("user.name"));
        System.out.println("路径:"+System.getProperty("java.library.path"));
    }
} ///:~
