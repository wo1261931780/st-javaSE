package c2stage_20220418.ccc142printSet;

import java.io.FileNotFoundException;
import java.io.PrintStream;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:c2stage_20220418.ccc142printSet
 * User:  wo1261931780@gmail.com
 * Time:  2022-04-21-20  星期二
 */
public class ccc001 {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("ceshi ");// 这就是最简单的输出流
        PrintStream x = new PrintStream("src/c2stage_20220418/ccc142printSet/ccc001.txt");
        System.setOut(x);// 设置重定向，将打印流的位置输出到文件中
        System.out.println("2022年4月19日21:25:07");
        System.out.println("测试");

    }
}
