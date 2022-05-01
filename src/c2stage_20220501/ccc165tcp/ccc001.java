package c2stage_20220501.ccc165tcp;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;

/**
 * Created by Intellij IDEA.
 * Project:st-java.github.io
 * Package:c2stage_20220501.ccc165tcp
 * User:  wo1261931780@gmail.com
 * Time:  2022-05-16-44  星期日
 */
public class ccc001 {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("127.0.0.1", 7777);// 默认本机通信，如果要连到其它客户端，就需要手动设置
        OutputStream outs = s.getOutputStream();
        PrintStream demo = new PrintStream(outs);// 将低级的输出流包装为打印流
        demo.println("打印结果--------------");
        // 如果先发，也会在tcp连接中缓存，所以不用担心丢失
        demo.flush();// 刷新消息
        demo.close();// 关闭通信管道
        // 一般不建议关闭管道，因为关闭消息可能先于发送的报文消息，
        // 同时，二者的连接是长期有效的，直接关闭可能报错

    }

}
