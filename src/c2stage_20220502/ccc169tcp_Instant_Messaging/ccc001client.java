package c2stage_20220502.ccc169tcp_Instant_Messaging;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created by Intellij IDEA.
 * Project:st-java.github.io
 * Package:c2stage_20220502.ccc169tcp_Instant_Messaging
 * User:  wo1261931780@gmail.com
 * Time:  2022-05-10-38  星期一
 */
public class ccc001client {
    public static void main(String[] args) {
        try {
            Socket x = new Socket("127.0.0.1", 7777);
            OutputStream demoout = x.getOutputStream();
            new ccc004getmessage(x).start();// 独立的读消息线程
            PrintStream printStream = new PrintStream(demoout);
            Scanner sc = new Scanner(System.in);
            while (true) {
                System.out.println("请发消息：");
                String str = sc.nextLine();
                printStream.println(str);
                printStream.flush();
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
