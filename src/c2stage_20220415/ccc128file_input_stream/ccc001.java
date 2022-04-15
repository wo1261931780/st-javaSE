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
public class ccc001 {
    public static void main(String[] args) throws IOException {
        // 同样是读取数据，这次使用数组作为基本单位读取
        InputStream x = new FileInputStream("src/c2stage_20220415/ccc128file_input_stream/demo.txt");
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
            // 如果我的数据，不是按照3排列的，比如12测试
            // 这个时候读取，就会按照12乱码的形式，没有考虑编码，直接按照3的倍数去读取
        }
    }
}
