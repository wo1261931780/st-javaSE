package c2stage_20220415.ccc128file_input_stream2;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:c2stage_20220415.ccc128file_input_stream2
 * User:  wo1261931780@gmail.com
 * Time:  2022-04-22-54  星期五
 */
public class ccc001 {
    public static void main(String[] args) throws IOException {
        File demo = new File("src/c2stage_20220415/ccc128file_input_stream2/demo.txt");
        InputStream x = new FileInputStream(demo);
        System.out.println(demo.length());//343,这里是long类型的
        byte[] x1 = new byte[(int) demo.length()];// 所以要转化为int类型
        int demo2 = x.read(x1);
        // System.out.println(new String(x1, 0, demo2));
        // 中文还是读不出来
        byte[] demobyte = x.readAllBytes();// 输入流，直接读取所有的字节文件
        System.out.println("--" + new String(demobyte, 0, demobyte.length) + "--");//

    }
}
