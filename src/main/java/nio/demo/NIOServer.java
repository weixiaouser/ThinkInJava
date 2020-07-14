package nio.demo;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;

/**
 * @author :weixiao
 * @description :
 * @date :2020/7/14 14:05
 */
public class NIOServer {

    //创建缓冲区
    static ByteBuffer byteBuffer = ByteBuffer.allocate(1024);

    public static void main(String[] args) throws IOException {
        //获得服务器端点的服务管道
        ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
        //绑定端口
        serverSocketChannel.socket().bind(new InetSocketAddress(6666));
        //设置成异步
        serverSocketChannel.configureBlocking(false);
        //获得客户端连接过来的管道
        while(true) {
            SocketChannel socketChannel = serverSocketChannel.accept();
            if (socketChannel != null) {
                socketChannel.configureBlocking(false);
                int length = socketChannel.read(byteBuffer);
                if (length != -1) {
                    System.out.println("接收到的数据是：" + new String(byteBuffer.array(), 0, length));
                }
            }
        }
    }
}
