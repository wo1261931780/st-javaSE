package c2stage_20220306x.ccc87Multicast;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:c2stage_20220306.ccc87Multicast
 * User:  wo1261931780@gmail.com
 * Time:  2022-03-11-30  ÐÇÆÚÒ»
 */
public class ccc001client {
    public static void main(String[] args) throws IOException {
        DatagramSocket demo_s = new DatagramSocket(8888);
        byte[] demo_st = "123456".getBytes();
        DatagramPacket demo_p = new DatagramPacket(demo_st, demo_st.length, InetAddress.getByName("224.0.1.1"), 8080);
        demo_s.send(demo_p);
    }
}
