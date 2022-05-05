package c2stage_20220502.ccc169tcp_Instant_Messaging;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

/**
 * Created by Intellij IDEA.
 * Project:st-java.github.io
 * Package:c2stage_20220502.ccc169tcp_Instant_Messaging
 * User:  wo1261931780@gmail.com
 * Time:  2022-05-11-04  星期一
 */
public class ccc004getmessage extends Thread {
    private Socket socket;
    public ccc004getmessage(Socket socket) {
        this.socket = socket;
    }
    @Override
    public void run() {
        try {
            InputStream inputStream = socket.getInputStream();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            String str;
            while ((str = bufferedReader.readLine()) != null) {
                System.out.println(Thread.currentThread().getName() + "，地址：" + socket.getRemoteSocketAddress() + "收到的结果为：" + str);
            }
        } catch (IOException e) {
            System.out.println(Thread.currentThread().getName() + "线程结束");
            ccc002service.allonlinesoc.remove(socket);// 删除对应的管道
            throw new RuntimeException(e);
        }
    }
}
