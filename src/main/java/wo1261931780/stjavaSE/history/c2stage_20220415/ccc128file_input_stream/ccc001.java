package c2stage_20220415.ccc128file_input_stream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:c2stage_20220414
 * User:  wo1261931780@gmail.com
 * Time:  2022-04-23-08  星期四
 */

/**
 目标：字节输入流的使用。

 IO流的体系：
 字节流                                   字符流
 字节输入流            字节输出流               字符输入流        字符输出流
 InputStream          OutputStream           Reader           Writer  (抽象类)
 FileInputStream      FileOutputStream       FileReader       FileWriter(实现类，可以使用的)

 文件字节输入流：FileInputStream
 -- 作用：以内存为基准，把磁盘文件中的数据以字节的形式读取到内存中去。
 按照字节读文件数据到内存中。
 -- 构造器：
 public FileInputStream(File file):创建字节输入流管道与源文件对象接通
 public FileInputStream(String pathname)：创建字节输入流管道与源文件路径接通。
 -- 方法：
 public int read(): 每次读取一个字节返回，读取完毕返回-1。

 小结：
 一个一个字节读取中文数据输出其实是被淘汰的，性能极差！
 一个一个字节读取中文数据输出，会出现截断中文字节的情况，无法避免读取中文输出乱码的问题。

 */
public class ccc001 {
    public static void main(String[] args) throws IOException {
        // 同样是读取数据，这次使用数组作为基本单位读取
        InputStream x = new FileInputStream("src/c2stage_20220415/ccc128file_input_stream/ccc038demo.txt");
        // byte[] x1 = new byte[3];
        // int demo1 = x.read(x1);// 这里得到我读取的长度
        // String str = new String(demo1);
        // System.out.println(str);// 3,这里应该是jdk的版本差异，我读取的结果，只有读取的字节个数
        // 教程展示的是具体的字节内容
        // 后面会涉及到，
        // 如果我多次读取，12345，五个字节，按照3个一组，一共读取两次
        // 两次的结果，是123和453，
        // 因为是字节流的形式，在读取不够的时候，会往前读取以前的内容
        // 同理，如果读取完毕，会直接返回-1
        // int read = x.read(x1);
        // String x2 = new String(x1, 0, read);// 4as
        // System.out.println(x2);
        // 解释一下上面的代码，读取一个字节数组的数据，从0开始计数，设置我读取的长度
        show(x);
        // 原始数据为123456abcd
    }

    public static void show(InputStream s) throws IOException {
        byte[] x = new byte[3];
        int demolength = 0;
        while ((demolength = s.read(x)) != -1) {
            String demo = new String(x, 0, demolength);
            // 这样读取的好处在于，不会出现强行读取的情况
            // 读取的最后一次，如果只有一个字节，也会按照一个字节展示结果
            System.out.println(demo);
            // 但是也有问题
            // 如果我的数据，不是按照3排列的，比如"12测试"
            // 这个时候读取，就会按照"12乱码"的形式，没有考虑编码，直接按照3的倍数去读取
        }
    }
}
