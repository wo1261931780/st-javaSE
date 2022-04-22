package c2stage_20220306x.ccc87Multicast;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.MulticastSocket;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:c2stage_20220306.ccc87Multicast
 * User:  wo1261931780@gmail.com
 * Time:  2022-03-11-30  星期一
 */
public class ccc002service {
    public static void main(String[] args) throws IOException {
        // DatagramSocket demo_s = new DatagramSocket(8080);
        DatagramSocket demo_s = new MulticastSocket(8080);// 多态的方式修改组播
        // demo_s.joinGroup(InetAddress.getByName("224.0.1.1"));
        // demo_s.joinGroup(new InetSocketAddress(InetAddress.getByName("224.0.1.1",8080)),
        //         NetworkInterface.getByInetAddress(InetAddress.getLocalHost()));
        // jdk版本不对，这里无法对应17


        byte[] demo_st = new byte[1024 * 64];
        DatagramPacket demo_p = new DatagramPacket(demo_st, demo_st.length);
        demo_s.receive(demo_p);
        String x = new String(demo_st, 0, demo_p.getLength());
        System.out.println("结果为：" + x);
    }
}
