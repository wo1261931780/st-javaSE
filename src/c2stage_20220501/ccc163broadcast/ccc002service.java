package c2stage_20220501.ccc163broadcast;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:c2stage_20220306.ccc86broadcast
 * User:  wo1261931780@gmail.com
 * Time:  2022-03-11-16  ÐÇÆÚÒ»
 */
public class ccc002service {
    public static void main(String[] args) throws IOException {
        DatagramSocket demo_s = new DatagramSocket(12356);
        byte[] demo_st = new byte[1024 * 64];
        // String x=demo_st.get
        DatagramPacket demo_p = new DatagramPacket(demo_st, demo_st.length);
        demo_s.receive(demo_p);
        String x = new String(demo_st, 0, demo_p.getLength());
        System.out.println(x);
        demo_s.close();

    }
}
