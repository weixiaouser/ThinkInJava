package concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author :weixiao
 * @description :
 * @date :2020/1/3 11:28
 */
public class FixedThreadPool {
    public static void main(String[] args) {
        ExecutorService exec = Executors.newFixedThreadPool(5);
        for(int i=0;i<5;i++){
            exec.execute(new LiftOff());
        }
        exec.shutdown();
    }
}/*output
#0(9).
#1(9).
#2(9).
#3(9).
#0(8).
#1(8).
#2(8).
#4(9).
#3(8).
#0(7).
#3(7).
#4(8).
#2(7).
#1(7).
#4(7).
#3(6).
#0(6).
#1(6).
#2(6).
#4(6).
#3(5).
#0(5).
#2(5).
#1(5).
#0(4).
#3(4).
#4(5).
#2(4).
#1(4).
#0(3).
#4(4).
#3(3).
#2(3).
#0(2).
#1(3).
#2(2).
#3(2).
#4(3).
#2(1).
#1(2).
#0(1).
#2(Liftoff!).
#4(2).
#3(1).
#1(1).
#0(Liftoff!).
#4(1).
#3(Liftoff!).
#1(Liftoff!).
#4(Liftoff!).
*/
