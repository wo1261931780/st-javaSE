package c2stage_20220430.ccc161udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:c2stage_20220306.ccc84udp
 * User:  wo1261931780@gmail.com
 * Time:  2022-03-09-01  星期一
 */
public class ccc002service {
    public static void main(String[] args) throws IOException {
        DatagramSocket demo_s = new DatagramSocket(999);// 服务端根据客户端确定端口――二者端口一致
        byte[] byte_pack = new byte[1024 * 64];// 一包数据64kb，我们就使用默认的大小和长度作为接收的标准
        DatagramPacket demo_p = new DatagramPacket(byte_pack, byte_pack.length);

        demo_s.receive(demo_p);// 通道去接收设置好的包
        // String x = new String(byte_pack);// 如果不设置接受的长度，默认按照接收器的长度去获取字符串，多余的补充
        // 进而导致服务端接收到的数据太长，实际数据很短
        String x = new String(byte_pack, 0, demo_p.getLength());// 设置字符串长度为0到字符串的末尾
        System.out.println("发送的数据为：" + x);
        System.out.println(demo_p.getAddress());// 获取客户端的地址：/192.168.3.115
        System.out.println(demo_p.getPort());// 获取客户端的端口59177

        demo_s.close();
        // 先启动服务端准备接收数据，然后启动客户端发送
    }
}
