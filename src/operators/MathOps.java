package operators;

import java.util.Random;
import static net.mindview.util.Print.*;

/**
 * Created by weixiao on 2018/5/30.
 */
//:operators/MathOps.java
//Demonstrates the mathematical operators.

public class MathOps {
    public static void main(String[] args) {
        //Create a seeded random number generator:
        Random rand = new Random();
        int i,j,k;
        //Choose value from 1 to 100:
        j = rand.nextInt(100)+1;
        print("j : "+j);
        k = rand.nextInt(100)+1;
        print("k : "+k);
        i = j+k;
        print("j + k : "+i);
        i = j - k;
        print(" j - k :"+i);
        i = k / j;
        print(" k / j : "+i);
        i = k * j;
        print("k * j : "+i);
        j %= k;
        print("j%=k : "+j);
        //Floating-point number tests:
        float u,v,w;//Applies to doubles,too
        v = rand.nextFloat();
        print("v : "+v);
        w = rand.nextFloat();
        print("w : "+w);
        u = v+w;
        print("v + w :"+u);
        u = v - w;
        print("v - w :"+u);
        u = v * w;
        print("v * w :"+u);
        u = v/w;
        print("v / w :"+u);
        //The following also works for char
        // byte,short,int,long,and double:
        u += v;
        print("u += v :"+u);
        u -= v;
        print("u -= v:"+u);
        u*=v;
        print("u*=v:"+u);
        u/=v;
        print("u /= v:"+u);
    }
}/*
j : 43
k : 88
j + k : 131
 j - k :-45
 k / j : 2
k * j : 3784
j%=k : 43
v : 0.8504706
w : 0.20544147
v + w :1.055912
v - w :0.6450291
v * w :0.17472194
v / w :4.139722
u += v :4.9901924
u -= v:4.139722
u*=v:3.5207117
u /= v:4.139722
*/
