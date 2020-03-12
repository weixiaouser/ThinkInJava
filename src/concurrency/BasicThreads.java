package concurrency;

/**
 * Created by weixiao on 2019/4/15 8:46
 * The most basic use of the Thread class
 */
public class BasicThreads {
    public static void main(String[] args) {
        Thread t = new Thread(new LiftOff());
        t.start();
        System.out.println("Waiting for LiftOff");
    }

}/*output:
Waiting for LiftOff
#0(9).
#0(8).
#0(7).
#0(6).
#0(5).
#0(4).
#0(3).
#0(2).
#0(1).
#0(Liftoff!).
*/
