package c2stage_20220416.ccc131file_output_stream2;

import java.io.*;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:c2stage_20220416.ccc131file_output_stream2
 * User:  wo1261931780@gmail.com
 * Time:  2022-04-11-17  星期六
 */
public class ccc001 {
    public static void main(String[] args) throws IOException {
        File x = new File("C:\\Users\\1\\Documents\\GitHub\\st-java.github.io\\src\\c2stage_20220416\\ccc130file_output_stream\\ccc038demo.txt");
        InputStream x1 = new FileInputStream(x);
        byte[] x2 = new byte[1024];
        int lenth;// 一般都要给出读取的长度，方便后面操作
        File demo = new File("C:\\Users\\1\\Documents\\GitHub\\st-java.github.io\\src\\c2stage_20220416\\ccc131file_output_stream2\\demo2.txt");
        OutputStream x3 = new FileOutputStream(demo);
        while ((lenth = x1.read(x2)) != -1) {
            System.out.println(lenth);
            x3.write(x2, 0, lenth);
        }
        System.out.println("end");
        x1.close();
        x3.close();
    }
}
