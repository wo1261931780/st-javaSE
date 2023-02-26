package c2stage_20220418.ccc141printstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:c2stage_20220418.ccc141printstream
 * User:  wo1261931780@gmail.com
 * Time:  2022-04-23-25  星期一
 */
public class ccc001 {
    public static void main(String[] args) throws FileNotFoundException {
        // PrintStream x = new PrintStream("src/c2stage_20220418/ccc141printstream/ccc001.txt");
        // 二者的差别在于下面的打印流可以实现写入数据的追加操作
        PrintStream x = new PrintStream(new FileOutputStream("src/c2stage_20220418/ccc141printstream/ccc001.txt", true));
        x.print("测试");
        x.print("123");
        x.print("abc");
        x.println("abc");
        x.println("---");
        x.close();
        // 打印流也是刷新数据，然后重写，会对文本内容执行清空操作
        // 底层还是使用了缓冲输出流
        // 在打印结果上面，printwriter
        PrintWriter x1 = new PrintWriter("src/c2stage_20220418/ccc141printstream/ccc001.txt");
        x1.println("demo");
        x1.close();
        // 在jdk16中，一开始打印流只支持字节写入
        // 而printwriter支持字符写入，
        // 但是二者的性能是一样的
    }
}
