package c2stage_20220501.ccc166tcp_duofa;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created by Intellij IDEA.
 * Project:st-java.github.io
 * Package:c2stage_20220501.ccc166tcp_duofa
 * User:  wo1261931780@gmail.com
 * Time:  2022-05-17-29  星期日
 */
public class ccc001 {
    public static void main(String[] args) throws IOException {
        Socket x = new Socket("127.0.0.1", 7777);
        OutputStream x1 = x.getOutputStream();
        PrintStream demo = new PrintStream(x1);
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("展示结果：");
            String msg = sc.nextLine();
            demo.println(msg);
            demo.flush();
        }
    }
}
