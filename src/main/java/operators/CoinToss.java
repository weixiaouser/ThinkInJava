package operators;
import org.greggordon.tools.*;

import java.util.Random;

/**
 * Created by weixiao on 2018/5/31.
 */
//Write a program that simulates coin-flipping
public class CoinToss {
    public static void main(String[] args) {
        Random rand = new Random();
        int coin = rand.nextInt();
        if(coin % 2 == 0){
            System.out.println("heads");
        }else{
            System.out.println("tails");
        }
    }
}
