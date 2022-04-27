package c2stage_20220416.ccc134file_read;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:c2stage_20220416.ccc134file_read
 * User:  wo1261931780@gmail.com
 * Time:  2022-04-16-28  星期六
 */
public class ccc002 {
    public static void main(String[] args) throws IOException {
        File x = new File("src/c2stage_20220416/ccc134file_read/demo001.txt");
        FileReader x1 = new FileReader(x);
        int len;
        char[] demo = new char[1024];// 这个是字符为单位的，相当于字符*1024个
        // 如果一个字符3个字节，就是3*1024
        while ((len = x1.read(demo)) != -1) {
            String x3 = new String(demo, 0, len);
            System.out.println(x3);

        }

    }
}
