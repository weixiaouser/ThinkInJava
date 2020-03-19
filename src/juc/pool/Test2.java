package juc.pool;

import java.util.concurrent.*;

/**
 * @author :weixiao
 * @description :拒绝策略
 * @date :2020/3/16 11:57
 */
public class Test2 {

    public static void main(String[] args) {
        //获取最大池大小
        System.out.println(Runtime.getRuntime().availableProcessors());


        ExecutorService threadPool = new ThreadPoolExecutor(
                2,//核心池大小
                5,//最大池大小
                2L,//空闲线程的保留时间
                TimeUnit.SECONDS,//时间单位
                new LinkedBlockingDeque<>(3),//队列   根据业务设置队列大小
                Executors.defaultThreadFactory(),//工厂不用变
                new ThreadPoolExecutor.CallerRunsPolicy()//拒绝策略
        );

        //拒绝策略说明
        //1.AbortPolicy (默认的，队列满了，就丢弃任务抛出异常)
        //2.CallerRunsPolicy(哪来的回哪去，谁叫你来的，你就去哪里处理)
        //3.DiscardOldestPolicy(尝试将最早进入队列的任务删除，尝试加入队列)
        //4.DiscardPolicy(队列满了任务也会丢弃，不抛出异常)



        try {
            //异常java.util.concurrent.RejectedExecutionException
            for (int i = 1; i <=10; i++) {
                threadPool.execute(()->{
                    System.out.println(Thread.currentThread().getName()+"running....");
                });
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            threadPool.shutdown();
        }

    }
}
