package c2stage_20220501.ccc161udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:c2stage_20220306.ccc84udp
 * User:  wo1261931780@gmail.com
 * Time:  2022-03-21-45  星期日
 */
public class ccc001client {
    public static void main(String[] args) throws IOException {
        // 甚至内部都不需要创建端口号，因为自带端口
        byte[] client_pack = "1324564".getBytes();// 封装数据
        // getbytes，将字符串转换为字节数组
        DatagramPacket client_p = new DatagramPacket(client_pack, client_pack.length, InetAddress.getLocalHost(), 999);
        // 长度可以使用默认的length，也可以自己指定需要的长度

        // DatagramSocket client_s = new DatagramSocket(8888);// 可以指定端口，也可以
        DatagramSocket client_s = new DatagramSocket();
        client_s.send(client_p);// 发送端发送数据给接收端
        client_s.close();
    }
}
