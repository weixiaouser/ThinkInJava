package concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author :weixiao
 * @description :
 * @date :2020/1/2 16:09
 */
public class CachedThreadPool {
    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool();
        for(int i = 0; i<5;i++){
            exec.execute(new LiftOff());
        }
        exec.shutdown();
    }
}
/*output:
#0(9).
#0(8).
#0(7).
#1(9).
#0(6).
#2(9).
#1(8).
#0(5).
#3(9).
#4(9).
#2(8).
#1(7).
#0(4).
#3(8).
#4(8).
#2(7).
#1(6).
#0(3).
#3(7).
#4(7).
#2(6).
#1(5).
#0(2).
#3(6).
#4(6).
#2(5).
#1(4).
#0(1).
#4(5).
#3(5).
#1(3).
#4(4).
#1(2).
#0(Liftoff!).
#2(4).
#1(1).
#4(3).
#3(4).
#2(3).
#4(2).
#3(3).
#1(Liftoff!).
#2(2).
#4(1).
#3(2).
#2(1).
#4(Liftoff!).
#3(1).
#2(Liftoff!).
#3(Liftoff!).
* */
