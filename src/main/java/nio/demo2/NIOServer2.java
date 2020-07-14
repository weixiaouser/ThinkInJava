package nio.demo2;

import net.mindview.util.RandomGenerator;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Iterator;
import java.util.Set;

/**
 * @author :weixiao
 * @description :
 * @date :2020/7/14 14:05
 */
public class NIOServer2 {



    public static void main(String[] args) throws IOException {
        //获得服务器端点的服务管道
        ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
        //绑定端口
        serverSocketChannel.socket().bind(new InetSocketAddress(6666));
        //设置成异步
        serverSocketChannel.configureBlocking(false);

        //创建Selector
        Selector selector = Selector.open();
        //注册
        serverSocketChannel.register(selector, SelectionKey.OP_ACCEPT);
        while (true){
            while(selector.select(2000) == 0){
                System.out.println("等待连接");
                continue;
            }
            //获得准备就绪的key
            Set<SelectionKey> keys = selector.selectedKeys();
            //遍历keys
            Iterator<SelectionKey> iterator = keys.iterator();
            while(iterator.hasNext()){
                //获得key
                SelectionKey key = iterator.next();
                if(key.isAcceptable()){
                    //获得通道
                    SocketChannel socketChannel = serverSocketChannel.accept();
                    if(socketChannel != null){
                        System.out.println(Thread.currentThread().getName()+"接收到一个连接："+socketChannel.getRemoteAddress());
                        socketChannel.configureBlocking(false);
                        socketChannel.register(selector,SelectionKey.OP_READ,ByteBuffer.allocate(1024));

                    }
                }
                if(key.isReadable()){
                    //获得通道
                    SocketChannel channel = (SocketChannel) key.channel();
                    ByteBuffer buffer = (ByteBuffer) key.attachment();
                    int length = channel.read(buffer);
                    if(length != -1){
                        System.out.println(Thread.currentThread().getName()+" 发送的数据是："+ new String(buffer.array(),0,length) +" 客户端的地址："+channel.getRemoteAddress());

                    }
                    buffer.clear();
                }
                iterator.remove();
            }
        }
    }
}
