package c2stage_20220501.ccc167tcp_diff_client;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by Intellij IDEA.
 * Project:st-java.github.io
 * Package:c2stage_20220501.ccc167tcp_diff_client
 * User:  wo1261931780@gmail.com
 * Time:  2022-05-09-22  星期一
 */
public class ccc002 {
    public static void main(String[] args) throws IOException {
        ServerSocket soc = new ServerSocket(7777);
        while (true) {
            Socket demosoc = soc.accept();
            new ccc003operator_thread(demosoc).start();
            // 将所有通信的处理，接收，全部交给线程类处理，每次有新的对话，就新建一个线程来处理
        }
        // InputStream inputStream = demosoc.getInputStream();
        // BufferedReader xx = new BufferedReader(new InputStreamReader(inputStream));
        // String str;
        // while ((str = xx.readLine()) != null) {
        //     System.out.println(demosoc.getRemoteSocketAddress() + "传输内容：" + str);
        // }


    }
}
