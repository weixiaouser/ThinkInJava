package concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author :weixiao
 * @description :
 * @date :2020/1/6 9:51
 */
public class SingleThreadExecutor {

    public static void main(String[] args) {
        ExecutorService exec = Executors.newSingleThreadExecutor();
        for(int i=0;i<5;i++){
            exec.execute(new LiftOff());
        }
        exec.shutdown();
    }
}
