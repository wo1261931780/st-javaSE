package c2stage_20220502.ccc169tcp_Instant_Messaging;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created by Intellij IDEA.
 * Project:st-java.github.io
 * Package:c2stage_20220502.ccc169tcp_Instant_Messaging
 * User:  wo1261931780@gmail.com
 * Time:  2022-05-10-53  星期一
 */
public class ccc003runnable implements Runnable {
    private Socket socket;
    public ccc003runnable(Socket socket) {
        this.socket = socket;
    }
    @Override
    public void run() {
        try {
            Scanner sc = new Scanner(System.in);
            InputStream inputStream = socket.getInputStream();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            String str;
            while ((str = bufferedReader.readLine()) != null) {
                System.out.println(Thread.currentThread().getName() + "已经上线");
                System.out.println(socket.getRemoteSocketAddress() + "输出内容为：" + str);
                mredirection(str);
            }
        } catch (IOException e) {
            System.out.println(socket.getRemoteSocketAddress() + "已经下线");
            throw new RuntimeException(e);
        }
    }

    private void mredirection(String str) throws IOException {
        for (Socket socket1 : ccc002service.allonlinesoc) {
            PrintStream printStream = new PrintStream(socket1.getOutputStream());
            printStream.println(str);
            printStream.flush();
        }
    }
}
