package concurrency;

/**
 * Created by weixiao on 2019/4/11 17:00
 */
public class LiftOff implements Runnable {
    protected int countDown = 10;
    private static int taskCount = 0;
    private final int id = taskCount++;
    public LiftOff(){}
    public LiftOff(int coountDown){
        this.countDown = countDown;
    }
    public String status(){
        return "#"+id+"("+(countDown>0?countDown:"Liftoff!")+").";
    }
    @Override
    public void run() {
        while (countDown-->0){
            System.out.println(status());
            Thread.yield();
        }
    }
}
