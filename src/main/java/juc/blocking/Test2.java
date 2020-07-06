package juc.blocking;

import java.util.concurrent.ArrayBlockingQueue;

/**
 * @author :weixiao
 * @description : 队列
 * @date :2020/3/15 19:10
 *
 * 通常用
 */
public class Test2 {

    public static void main(String[] args) {
        ArrayBlockingQueue blockingQueue = new ArrayBlockingQueue<>(3);

        System.out.println(blockingQueue.offer("a"));
        System.out.println(blockingQueue.offer("b"));
        System.out.println(blockingQueue.offer("c"));
        System.out.println(blockingQueue.offer("d"));//false

        System.out.println(blockingQueue.peek());//检查对首


        System.out.println(blockingQueue.poll());
        System.out.println(blockingQueue.poll());
        System.out.println(blockingQueue.poll());
        System.out.println(blockingQueue.poll());//null

        System.out.println(blockingQueue.peek());
    }
}
