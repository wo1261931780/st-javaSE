package c2stage_20220501.ccc162duofa;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:c2stage_20220306.ccc85duofa
 * User:  wo1261931780@gmail.com
 * Time:  2022-03-10-34  星期一
 */
public class ccc001client {
    public static void main(String[] args) throws IOException {
        // // udp通信，不断发送，直到exit
        // DatagramSocket demo_s = new DatagramSocket(7777);// 这里可以指定我的端口是多少
        // // 指定以后，对方接收就是多少，不指定的情况下，默认帮你分配，
        // // 但是指定的情况下，多开客户端就需要设置好，避免冲突
        // Scanner x = new Scanner(System.in);
        // while (true) {
        //     System.out.println("输入：");
        //     String s = x.nextLine();
        //     // if (s.equals("exit")) {
        //     if ("exit".equals(s)) {// 阿里巴巴开发规则
        //         // System.exit(0);
        //         demo_s.close();
        //         break;
        //     }
        //     byte[] demo_st = s.getBytes();
        //     DatagramPacket demo_p = new DatagramPacket(demo_st, demo_st.length, InetAddress.getLocalHost(), 18959);
        //     // 这里是对方的端口
        //     demo_s.send(demo_p);
        // }
        // demo_s.close();

        DatagramSocket x = new DatagramSocket();
        Scanner s = new Scanner(System.in);
        while (true) {
            String str = s.nextLine();
            byte[] demo = str.getBytes();
            if (str.equals("exit")) {
                System.out.println("退出成功");
                s.close();
                break;
            }
            DatagramPacket p = new DatagramPacket(demo, demo.length, InetAddress.getLocalHost(), 8888);
            x.send(p);
        }
    }
}
