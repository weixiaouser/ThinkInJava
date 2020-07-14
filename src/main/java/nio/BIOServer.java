package nio;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
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
            System.out.println("线程信息id = "+Thread.currentThread().getId()+" 名字："+Thread.currentThread().getName()+"等待连接。。。。");
            //监听，等待客户端连接，阻塞
            final Socket socket = serverSocket.accept();
            System.out.println("连接到一个客户端");
            //创建一个线程，与之通讯
            newCachedThreadPool.execute(()->{
                handler(socket);
            });
        }
    }

    public static void handler(Socket socket){

        try {
            byte[] bytes = new byte[1024];
            //通过socket 获取输入流
            InputStream inputStream = socket.getInputStream();
            while(true){
                //read 也是阻塞的
                int read = inputStream.read(bytes);
                if(read != -1){
                    System.out.println("线程信息 id=" + Thread.currentThread().getId()
                            +" 名字="+ Thread.currentThread().getName()
                            +"读到："+ new String(bytes,0,read));

                }else{
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            System.out.println("关闭client的连接");
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

}
