package c2stage_20220412.ccc127file_io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:c2stage_20220412.ccc127file_io
 * User:  wo1261931780@gmail.com
 * Time:  2022-04-20-29  星期五
 */
public class ccc002 {
    public static void main(String[] args) throws IOException {
        InputStream x = new FileInputStream("C:\\Users\\1\\Documents\\GitHub\\st-java.github.io\\src\\c2stage_20220412\\ccc127file_io\\ccc038demo.txt");
        int demo = 0;
        while ((demo = x.read()) != -1) {
            System.out.println((char) demo);
        }
        // 这里其实还是每个字节每个字节读取，只不过
    }
}
