package c2stage_20220502.ccc168tcp_thread_pool;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created by Intellij IDEA.
 * Project:st-java.github.io
 * Package:c2stage_20220502.ccc168tcp_thread_pool
 * User:  wo1261931780@gmail.com
 * Time:  2022-05-10-15  星期一
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
                System.out.print(Thread.currentThread() + "出现了\t");
                System.out.println(socket.getRemoteSocketAddress() + "输出内容为：" + str);
            }
        } catch (IOException e) {
            // throw new RuntimeException(e);
            System.out.println(socket.getRemoteSocketAddress() + "下线了");
        }
    }
}
