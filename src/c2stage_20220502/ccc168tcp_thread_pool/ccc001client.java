package c2stage_20220502.ccc168tcp_thread_pool;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created by Intellij IDEA.
 * Project:st-java.github.io
 * Package:c2stage_20220502.ccc168tcp_thread_pool
 * User:  wo1261931780@gmail.com
 * Time:  2022-05-09-51  星期一
 */
public class ccc001client {
    public static void main(String[] args) throws IOException {
        Socket x = new Socket("127.0.0.1", 7777);
        OutputStream demoinput = x.getOutputStream();
        PrintStream printStream = new PrintStream(demoinput);
        Scanner sc = new Scanner(System.in);

        while (true) {
            String str = sc.nextLine();

            printStream.println(str);

            if (str.equals("exit")) {
                x.close();
                break;
            }

            printStream.flush();
        }
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
