package object;

/**
 * Created by weixiao on 2018/5/28.
 */
//TIJ4 Chapter Oject exericlse 3 page 90
    //ojbect /ATNTest.java
    //Find the code fragments involving ATypeName and turn them into a program
    //that compiles and run
public class ATNTest {
    public static void main(String[] args) {
        class ATypeName{
            int i;
            double d;
            boolean b;
            void show(){
                System.out.println(i);
                System.out.println(d);
                System.out.println(b);

            }
        }
        ATypeName a = new ATypeName();
        a.i = 3;
        a.d = 2.71828;
        a.b = false;
        a.show();
    }
}
