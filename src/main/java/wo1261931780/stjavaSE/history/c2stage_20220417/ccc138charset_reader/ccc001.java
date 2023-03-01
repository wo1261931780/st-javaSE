package wo1261931780.stjavaSE.history.c2stage_20220417.ccc138charset_reader;

import java.io.*;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:c2stage_20220417
 * User:  wo1261931780@gmail.com
 * Time:  2022-04-21-44  星期日
 */
public class ccc001 {
    public static void main(String[] args) throws IOException {
        File demo = new File("src/c2stage_20220417/ccc138charset/ccc038demo.txt");
        InputStream x = new FileInputStream(demo);
        // 阅读器，必须以输入流作为对象才能使用
        Reader x1 = new InputStreamReader(x, "GBK");
        // Reader x1 = new InputStreamReader(x, StandardCharsets.UTF_8);
        // 这里和教程不一样，教程用双引号指定了编码格式
        // 这里直接使用常量即可
        // String x2;
        // while ((x2 = x1.readline()) != null) {
        // 这里和jdk16不一样，里面可以直接指定readline，这里不行
        // }
        int x2;
        while ((x2 = x1.read()) != -1) {
            System.out.print((char) x2);
        }
        // 这里直接读取也不会报错
    }
}
