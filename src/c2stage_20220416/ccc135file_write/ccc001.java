package c2stage_20220416.ccc135file_write;

import java.io.*;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:c2stage_20220416.ccc135file_write
 * User:  wo1261931780@gmail.com
 * Time:  2022-04-16-40  星期六
 */
public class ccc001 {
    public static void main(String[] args) throws IOException {
        System.out.println("测试");
        Writer x = new FileWriter("src/c2stage_20220416/ccc135file_write/ccc001.txt");
        x.write('x');
        // x.write('123');//单引号都是字符，要写字符串，还是用双引号，也说明，这里可以用字符串写入
        x.write("123");
        x.write('a');
        x.close();// close会自动执行flush方法，所以不需要手动刷新
        // 在没有关闭的情况下，直接读取没有数据
        Reader x1 = new FileReader("src/c2stage_20220416/ccc135file_write/ccc001.txt");
        int len;
        while ((len = x1.read()) != -1) {
            System.out.println(len);
        }
        x1.close();


    }
}
