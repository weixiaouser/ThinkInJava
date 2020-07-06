package juc.msbc001;

import java.util.concurrent.*;

/**
 * @author :weixiao
 * @description :创建线程的几种方式
 * @date :2020/6/3 13:48
 */
public class T02_HowToCreateThread {

    static class myThread extends Thread{
        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName()+" 通过继承Thread 类启动线程");
        }
    }

    static class MyRun implements Runnable{

        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName()+" 通过实现Runnable接口启动线程");
        }
    }

    static class myCall implements Callable<String> {

        @Override
        public String call() throws Exception {
            System.out.println(Thread.currentThread().getName()+" 通过实现Callable接口启动线程");
            return "success";
        }
    }

    public static void main(String[] args) {
        new myThread().start();

        new Thread(new MyRun()).start();

        new Thread(()->{
            System.out.println(Thread.currentThread().getName()+" 通过lambda 表达式实现！");
        }).start();

        new Thread(new FutureTask<String>(new myCall())).start();

        ExecutorService threadPool = Executors.newCachedThreadPool();
        threadPool.execute(()->{
            System.out.println(Thread.currentThread().getName()+" ThreadPool 阿里编码规约不推荐使用此方式");
        });
        threadPool.shutdown();

        //ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor();

    }
}
