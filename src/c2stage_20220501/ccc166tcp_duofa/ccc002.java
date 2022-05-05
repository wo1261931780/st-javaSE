package c2stage_20220501.ccc166tcp_duofa;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by Intellij IDEA.
 * Project:st-java.github.io
 * Package:c2stage_20220501.ccc166tcp_duofa
 * User:  wo1261931780@gmail.com
 * Time:  2022-05-18-14  星期日
 */
public class ccc002 {
    public static void main(String[] args) throws IOException {
        ServerSocket x = new ServerSocket(7777);
        Socket demo = x.accept();
        InputStream show = demo.getInputStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(show));
        String sendm;
        while ((sendm = br.readLine()) != null) {
            System.out.println(sendm);
        }
    }
}
