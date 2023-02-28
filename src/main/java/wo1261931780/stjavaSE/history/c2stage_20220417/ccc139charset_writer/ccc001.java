package c2stage_20220417.ccc139charset_writer;

import java.io.*;
import java.nio.charset.StandardCharsets;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:c2stage_20220417.ccc139charset_writer
 * User:  wo1261931780@gmail.com
 * Time:  2022-04-22-26  星期日
 */
public class ccc001 {
    public static void main(String[] args) throws IOException {
        File x = new File("src/c2stage_20220417/ccc139charset_writer/ccc038demo.txt");
        OutputStream x1 = new FileOutputStream(x);
        Writer x2 = new OutputStreamWriter(x1, StandardCharsets.UTF_8);
        // 这里没有在源码中看到缓冲区，所以要转一道，使用缓冲输入流去写数据
        BufferedWriter x3 = new BufferedWriter(x2);
        x3.write("测试，ccc038demo");
        x3.close();// 一定要记得关闭
    }
}
