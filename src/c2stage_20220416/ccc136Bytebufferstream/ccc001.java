package c2stage_20220416.ccc136Bytebufferstream;

import java.io.*;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:c2stage_20220416.ccc136Bytebufferstream
 * User:  wo1261931780@gmail.com
 * Time:  2022-04-19-32  星期六
 */
public class ccc001 {
    public static void main(String[] args) {
        File x = new File("src/c2stage_20220416/ccc136Bytebufferstream/demo.txt");
        File xx = new File("src/c2stage_20220416/ccc136Bytebufferstream/demo2.txt");
        try (
                InputStream x1 = new BufferedInputStream(new FileInputStream(x));
                OutputStream x2 = new BufferedOutputStream(new FileOutputStream(xx));//内部还是需要使用file类型的变量
        ) {
            int len;
            byte[] x4 = new byte[1024];
            while ((len = x1.read()) != -1) {
                String x3 = new String(x4, 0, len);
                System.out.println(x3);
                x2.write(x4, 0, len);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
