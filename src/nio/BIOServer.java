package nio;

import java.net.ServerSocket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author :weixiao
 * @description : 线程池机制
 * @date :2020/4/17 15:56
 */
public class BIOServer {
    public static void main(String[] args) throws Exception {
        //1.创建一个线程池
        //2.如果有客户端连接，就创建一个线程，与之通讯
        ExecutorService newCachedThreadPool = Executors.newCachedThreadPool();
        //ExecutorService newCachedThreadPool = Executors.newSingleThreadExecutor();
        //创建ServerSocket
        ServerSocket serverSocket = new ServerSocket(6666);
        System.out.println("服务器启动了。。。");
        while (true){
            System.out.println("线程信息id = "+Thread.currentThread().getId()+" 名字：");
        }
    }
}
