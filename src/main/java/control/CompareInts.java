package control;

import java.util.Random;

/**
 * Created by weixiao on 2018/6/5.
 */
//control /CompareInts.java
/* Write a program that generates 25 random int values. For each value,use an
*if-else statement to classify it as greater than,less that or equal to a
* second randomly generated value
* */
public class CompareInts {
    public static void main(String[] args) {
        Random rand1 = new Random();
        Random rand2 = new Random();
        for(int i = 0;i< 25;i++){
            int x = rand1.nextInt();
            int y = rand2.nextInt();
            if(x<y){
                System.out.println(x + "<" +y);
            }else if(x > y){
                System.out.println(x +">" +y);
            }else{
                System.out.println(x +"="+y);
            }

        }
        Random rand3 = new Random();
        Random rand4 = new Random();
        for(int i = 0;i<25;i++){
            int x = rand3.nextInt();
            int y = rand4.nextInt();
            if(x<y){
                System.out.println(x+"<"+y);
            }else if(x>y){
                System.out.println(x+">"+y);
            }else{
                System.out.println(x+"="+y);
            }
        }
    }
}
