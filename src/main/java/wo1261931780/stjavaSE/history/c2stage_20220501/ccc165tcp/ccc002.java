package wo1261931780.stjavaSE.history.c2stage_20220501.ccc165tcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by Intellij IDEA.
 * Project:st-java.github.io
 * Package:c2stage_20220501.ccc165tcp
 * User:  wo1261931780@gmail.com
 * Time:  2022-05-16-44  星期日
 */
public class ccc002 {
    public static void main(String[] args) throws IOException {
        ServerSocket x=new ServerSocket(7777);
        Socket demosc = x.accept();
        InputStream inps = demosc.getInputStream();
        // 首先要缓冲字符输入流，
        // 因此需要将输入流转换为缓冲流
        BufferedReader br=new BufferedReader(new InputStreamReader(inps));
        String str;
        while ((str=br.readLine())!=null){
            // 这里读取的是整行消息，如果不是整行，就会报错
            System.out.println(x.getInetAddress()+"传输的内容是："+str);
        }
    }
}
