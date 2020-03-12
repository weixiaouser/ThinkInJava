package concurrency;

/**
 * Created by weixiao on 2019/4/15 8:52
 */
public class MoreBasicThreads {
    public static void main(String[] args) {
        for(int i = 0;i < 5;i++){
            new Thread(new LiftOff()).start();
            System.out.println("Waiting for LiftOff");
        }
    }
}/*output:
Waiting for LiftOff
Waiting for LiftOff
Waiting for LiftOff
Waiting for LiftOff
Waiting for LiftOff
#0(9).
#1(9).
#2(9).
#3(9).
#4(9).
#0(8).
#1(8).
#2(8).
#3(8).
#4(8).
#0(7).
#1(7).
#2(7).
#3(7).
#4(7).
#0(6).
#2(6).
#1(6).
#2(5).
#0(5).
#4(6).
#3(6).
#1(5).
#2(4).
#0(4).
#4(5).
#3(5).
#1(4).
#2(3).
#4(4).
#3(4).
#0(3).
#1(3).
#4(3).
#0(2).
#3(3).
#2(2).
#1(2).
#4(2).
#0(1).
#3(2).
#2(1).
#1(1).
#4(1).
#0(Liftoff!).
#3(1).
#2(Liftoff!).
#1(Liftoff!).
#4(Liftoff!).
#3(Liftoff!).
*/
