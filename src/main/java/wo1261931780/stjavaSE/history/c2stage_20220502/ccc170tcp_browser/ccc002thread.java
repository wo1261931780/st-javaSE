package c2stage_20220502.ccc170tcp_browser;

import java.io.*;
import java.net.Socket;

/**
 * Created by Intellij IDEA.
 * Project:st-java.github.io
 * Package:c2stage_20220502.ccc170tcp_browser
 * User:  wo1261931780@gmail.com
 * Time:  2022-05-12-28  星期一
 */
public class ccc002thread implements Runnable {
    private Socket socket;
    public ccc002thread(Socket socket) {
        this.socket = socket;
    }
    @Override
    public void run() {
        try {
            // InputStream inputStream = socket.getInputStream();
            // BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            // String str = bufferedReader.readLine();
            // while (str!=null){
            //     System.out.println(socket.getRemoteSocketAddress()+"输出内容为："+str);
            // }
            OutputStream outputStream = socket.getOutputStream();
            PrintStream printStream = new PrintStream(outputStream);
            printStream.println("HTTP/1.1 200 OK");
            printStream.println("Content-Type:text/html;charset=UTF-8");// 上面就是默认头
            printStream.println();
            printStream.println("<div>show me the money</div>");// 通讯内容
            printStream.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
