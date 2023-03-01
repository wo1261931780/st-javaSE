package wo1261931780.stjavaSE.history.c2stage_20220501.ccc161udp;

import java.io.IOException;
import java.net.*;

/**
 * Created by Intellij IDEA.
 * Project:st-java.github.io
 * Package:c2stage_20220501.ccc161udp
 * User:  wo1261931780@gmail.com
 * Time:  2022-05-14-15  星期日
 */
public class ccc004 {
    public static void main(String[] args) throws IOException {
        DatagramSocket soc = new DatagramSocket(999);
        byte[] demo = new byte[1024 * 64];
        // DatagramPacket dap=new DatagramPacket(ccc038demo, ccc038demo.length, InetAddress.getLocalHost(),999);
        DatagramPacket dap = new DatagramPacket(demo, demo.length);
        soc.receive(dap);// 首先接收数据，然后再去获得数据的长度
        int total_length = dap.getLength();

        String showdemo = new String(demo, 0, total_length);
        System.out.println(showdemo);

        System.out.println(dap.getSocketAddress());// 获得对方的地址和端口--192.168.3.132:51332
        System.out.println(dap.getPort());// 对方端口51332
        soc.close();
    }
}
