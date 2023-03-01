package wo1261931780.stjavaSE.history.c2stage_20220501.ccc161udp;

import java.io.IOException;
import java.net.*;

/**
 * Created by Intellij IDEA.
 * Project:st-java.github.io
 * Package:c2stage_20220501.ccc161udp
 * User:  wo1261931780@gmail.com
 * Time:  2022-05-14-13  星期日
 */
public class ccc003 {
    public static void main(String[] args) throws IOException {
        byte[] demobyte = "123asd".getBytes();
        DatagramPacket p=new DatagramPacket(demobyte,demobyte.length, InetAddress.getLocalHost(),999);
        DatagramSocket soc=new DatagramSocket();
        soc.send(p);
    }
}
