package c2stage_20220306x.ccc84udp;

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
        DatagramSocket client_s = new DatagramSocket();
        // 甚至内部都不需要创建端口号，因为自带端口
        byte[] client_pack = "1324564".getBytes();// 封装数据
        DatagramPacket client_p = new DatagramPacket(client_pack, client_pack.length, InetAddress.getLocalHost(), 999);
        client_s.send(client_p);// 发送端发送数据给接收端
        client_s.close();
    }
}
