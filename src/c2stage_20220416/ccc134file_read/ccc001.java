package c2stage_20220416.ccc134file_read;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:c2stage_20220416.ccc134file_read
 * User:  wo1261931780@gmail.com
 * Time:  2022-04-16-17  星期六
 */
public class ccc001 {
    public static void main(String[] args) throws IOException {
        File x = new File("src/c2stage_20220416/ccc134file_read/demo001.txt");
        FileReader x1 = new FileReader(x);
        // 这里的读取，要求文件的编码格式，和代码展示出来的编码格式一致，否则展示也会乱码
        int demo;
        while ((demo = x1.read()) != -1) {
            System.out.println("展示结果----------");
            System.out.println((char) demo);// 其实不转换也可以，但是全部是数字编码，对用户来说没有意义
        }
    }
}
