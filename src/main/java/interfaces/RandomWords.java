package interfaces;

import java.nio.CharBuffer;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by weixiao on 2018/9/11.
 */
public class RandomWords implements Readable {
    private static Random rand = new Random(47);
    private static final char[] capitals = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
    private static final char[] lowers = "abcdefghijklmnopqrstuvwxyz".toCharArray();
    private static final char[] vowels = "aeiou".toCharArray();
    private int count;
    public int read(CharBuffer cb) {
        if (count-- == 0) {
            return -1;
        }
       cb.append(capitals[rand.nextInt(capitals.length)]);
        for(int i =0 ;i <4;i++){
            cb.append(vowels[rand.nextInt(vowels.length)]);
            cb.append(lowers[rand.nextInt(lowers.length)]);
        }
        cb.append(" ");
        return 10;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(new RandomWords());
        while (s.hasNext()){
            System.out.println(s.next());
        }
    }/*output:

    */








}
