package jvm;

import java.util.Vector;

/**
 * @author :weixiao
 * @description :Vector线层安全的测试
 * @date :2020/5/7 10:27
 */
public class VectorTest {

    private static Vector<Integer> vector = new Vector<Integer>();

    public static void main(String[] args) {
        while(true){
            for (int i = 0; i < 10; i++) {
                vector.add(i);
            }

            Thread removeThread = new Thread(new Runnable() {
                @Override
                public void run() {
                    synchronized (vector) {
                        for (int i = 0; i < vector.size(); i++) {
                            vector.remove(i);
                        }
                    }
                }
            });

            Thread printThread = new Thread(()->{
                synchronized (vector) {
                    for (int i = 0; i < vector.size(); i++) {
                        System.out.println(vector.get(i));
                    }
                }
            });

            removeThread.start();
            printThread.start();

            while(Thread.activeCount() >20);
        }
    }
}
