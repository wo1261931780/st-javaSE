package c2stage_20220430.ccc162duofa;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:c2stage_20220306.ccc85duofa
 * User:  wo1261931780@gmail.com
 * Time:  2022-03-10-42  星期一
 */
public class ccc002service {
    public static void main(String[] args) throws IOException {
        DatagramSocket demo_s = new DatagramSocket(18959);//1.建立通信，设置端口
        byte[] demo_st = new byte[1024 * 64];// 2.设置数组的长度
        int st_length = demo_st.length;// 3.设置实际的长度

        String show_st = "";// 6.展示结果，长度为0-总长度
        while (true) {
            DatagramPacket demo_p = new DatagramPacket(demo_st, st_length);// 4.接收字符，设置好接收的长度
            demo_s.receive(demo_p);// 5.接收
            // show_st = new String(demo_st, 0, st_length);
            show_st = new String(demo_st, 0, demo_p.getLength());// 要去获取长度，不是直接得到长度
            System.out.println("接收到的结果为：" + show_st + "，对方地址：" + demo_p.getAddress() + "，对方端口：" + demo_p.getPort());
        }

    }
}
