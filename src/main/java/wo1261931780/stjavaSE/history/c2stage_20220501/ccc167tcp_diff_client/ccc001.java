package c2stage_20220501.ccc167tcp_diff_client;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created by Intellij IDEA.
 * Project:st-java.github.io
 * Package:c2stage_20220501.ccc167tcp_diff_client
 * User:  wo1261931780@gmail.com
 * Time:  2022-05-19-59  星期日
 */
public class ccc001 {
    public static void main(String[] args) throws IOException {
        Socket x = new Socket("127.0.0.1", 7777);
        OutputStream otp = x.getOutputStream();
        PrintStream demoprint = new PrintStream(otp);
        Scanner sc = new Scanner(System.in);
        while (true) {
            String s = sc.nextLine();
            demoprint.println(s);
            if (s.equals("exit")) {
                x.close();
                break;
            }
            demoprint.flush();
        }
    }
}
