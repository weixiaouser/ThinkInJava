package nio.demo;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * @author :weixiao
 * @description :
 * @date :2020/7/14 14:51
 */
public class NIOClient {

    public static void main(String[] args) throws Exception {
        InetSocketAddress socketAddress = new InetSocketAddress(InetAddress.getLocalHost(),6666);
        Socket socket = new Socket();
        socket.connect(socketAddress);
        socket.getOutputStream().write("hello".getBytes());
    }
}
