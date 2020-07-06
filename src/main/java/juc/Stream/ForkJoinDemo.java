package juc.Stream;

import java.util.concurrent.RecursiveTask;

/**
 * @author :weixiao
 * @description : 分支合并
 * @date :2020/3/20 10:04
 */
public class ForkJoinDemo extends RecursiveTask<Long> {

    private long start;
    private long end;
    private final long temp = 10000L;//临界值

    public ForkJoinDemo(long start, long end) {
        this.start = start;
        this.end = end;
    }

    @Override
    protected Long compute() {//计算方法
        //普通方式计算
        long sum = 0L;
        if(end-start <= temp){
            for (Long i = start; i <= end; i++) {
                sum += i;
            }
            return sum;
        }else{
            //fork join 分支合并方式计算
            long middle = (end + start)/2;
            ForkJoinDemo left = new ForkJoinDemo(start, middle);
            left.fork();
            ForkJoinDemo right = new ForkJoinDemo(middle + 1, end);
            right.fork();

            return left.join()+right.join();
        }
    }
}
