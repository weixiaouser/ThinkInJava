package concurrency;

/**
 * Created by weixiao on 2019/4/11 17:26
 */
public class MainThread {
    public static void main(String[] args) {
        LiftOff launch = new LiftOff();
        launch.run();
    }
}/*output
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
