package c2stage_20220501.ccc167tcp_diff_client;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

/**
 * Created by Intellij IDEA.
 * Project:st-java.github.io
 * Package:c2stage_20220501.ccc167tcp_diff_client
 * User:  wo1261931780@gmail.com
 * Time:  2022-05-09-36  星期一
 */
public class ccc003operator_thread extends Thread {
    private Socket demosoc;

    public ccc003operator_thread() {

    }

    public ccc003operator_thread(Socket demosoc) {
        this.demosoc = demosoc;
    }

    @Override
    public void run() {
        InputStream inputStream = null;
        try {
            inputStream = demosoc.getInputStream();
            BufferedReader xx = new BufferedReader(new InputStreamReader(inputStream));
            String str;
            while ((str = xx.readLine()) != null) {
                System.out.println(demosoc.getRemoteSocketAddress() + "传输内容：" + str);
            }
        } catch (Exception e) {
            // throw new RuntimeException(e);
            // e.printStackTrace();
            System.out.println(demosoc.getRemoteSocketAddress() + "已经下线");
        }
    }
}
