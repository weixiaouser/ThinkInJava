package holding;

import net.mindview.util.CountingGenerator;
import net.mindview.util.RandomGenerator;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

/**
 * Created by weixiao on 2018/10/10.
 * Upcasting to a Queue from a linkedList
 */
public class QueueDemo {
    public static void printQ(Queue queue){
       while(queue.peek()!= null){
           System.out.print(queue.remove() + " ");
       }
        System.out.println();
    }

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<Integer>();
        Random rand = new Random(47);
        for(int i=0;i<10;i++){
            queue.offer(rand.nextInt(i+10));
        }
        printQ(queue);
        Queue<Character> qc = new LinkedList<Character>();
        for(char c:"Brontosaurus".toCharArray()){
            qc.offer(c);
        }
        printQ(qc);
    }/*output:
8 1 1 1 5 14 3 1 0 1
B r o n t o s a u r u s
    */
}
