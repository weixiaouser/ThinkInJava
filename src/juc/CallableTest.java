package juc;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @author :weixiao
 * @description :
 * @date :2020/3/13 10:45
 */
public class CallableTest {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //Thread (Runnable)
        //Thread(RunnableFuture)
        //Thread(FutureTask)
        MyThread myThread = new MyThread();
        FutureTask task = new FutureTask(myThread);
        new Thread(task,"A").start();//执行线程

        new Thread(task,"B").start();//
        System.out.println(task.get());


    }
}

class MyThread implements Callable<Integer>{

    @Override
    public Integer call() {
        System.out.println("end");
        return 1024;
    }
}
