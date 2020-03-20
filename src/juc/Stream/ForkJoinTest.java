package juc.Stream;

import java.util.concurrent.ForkJoinPool;
import java.util.stream.LongStream;

/**
 * @author :weixiao
 * @description :
 * @date :2020/3/20 10:21
 */
public class ForkJoinTest {
    public static void main(String[] args) {
        test1();//时间：638结果：500000000500000000
        test2(); //时间：4577结果：500000000500000000
        test3();//时间：561结果：500000000500000000
    }

    //普通计算方式
    public static void test1(){

        long start = System.currentTimeMillis();
        long sum = 0L;
        for (long i = 0L; i <= 1000000000L; i++) {
            sum += i;
        }
        long end = System.currentTimeMillis();
        System.out.println("时间："+(end-start)+"结果："+sum);

    }
    //fork join 方式
    public static void test2(){
        long start = System.currentTimeMillis();
        ForkJoinPool forkJoinPool = new ForkJoinPool();
        ForkJoinDemo forkJoinDemo = new ForkJoinDemo(0, 1000000000L);
        Long sum = forkJoinPool.invoke(forkJoinDemo);
        long end = System.currentTimeMillis();
        System.out.println("时间："+(end-start)+"结果："+sum);
    }

    //stream 流式计算
    public static  void test3(){

        long start = System.currentTimeMillis();
        long sum = LongStream.rangeClosed(0L,1000000000L).parallel().reduce(0,Long :: sum);
        long end = System.currentTimeMillis();
        System.out.println("时间："+(end-start) +"结果："+sum);

    }
}
