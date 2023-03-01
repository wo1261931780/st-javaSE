package wo1261931780.stjavaSE.history.c2stage_20220416.ccc135file_write;
/*
    构造方法：
        OutputStreamWriter?(OutputStream out)：创建一个使用默认字符编码的OutputStreamWriter

    写数据的5种方式：
        void write?(int c)：写一个字符
        void write?(char[] cbuf)：写入一个字符数组
        void write?(char[] cbuf, int off, int len)：写入字符数组的一部分
        void write?(String str)：写一个字符串
        void write?(String str, int off, int len)：写一个字符串的一部分
 */

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;


public class eee087五种方式 {
    public static void main(String[] args) throws IOException {
        File x = new File("l:\\java\\dd.txt");
        // one(x);
        // onesz(x);
        // onest(x);
        onebytept(x);
    }

    public static void one(File x) throws IOException {
        OutputStreamWriter x1 = new OutputStreamWriter(new FileOutputStream(x));
        x1.write(97);
        // 不运行的情况下，文件和字符尚存在缓冲区
        // 要在文件中展示内容，
        // 就需要调用flush（冲洗）命令
        x1.flush();
        x1.write(98);
        // 刷新只在输入内容后执行
        x1.close();
        // close操作会自带刷新功能
        System.out.println("结束");
    }

    public static void onesz(File x) throws IOException {
        // byte[] x1 = {97, 98, 99, 100};
        char[] x1 = {'a', 'b', 'c', 'd', 'e'};
        OutputStreamWriter x2 = new OutputStreamWriter(new FileOutputStream(x));
        // x2.write(x1, 0, x1.length);
        // 这里直接使用byte类型会报错
        x2.write(x1, 1, 3);
        // 含义是，从1索引位置开始，输入3个
        // 最终结果为：bcd
        // 相对原来的报错，
        // 改变数据引发的问题是索引越界，比如这里不能使用x1.length，因为最终会得到-1

        x2.close();
    }

    public static void onest(File x) throws IOException {
        String x1 = "eeeee";
        OutputStreamWriter x2 = new OutputStreamWriter(new FileOutputStream(x));
        x2.write(x1);
        // System.out.println(String.valueOf("eeee".getBytes()));
        // 得到一个地址
        // x2.write(String.valueOf("eeee".getBytes()));
        x2.close();
        System.out.println("onest结束");
    }

    public static void onebytept(File x) throws IOException {
        String x1 = "12345";
        OutputStreamWriter x2 = new OutputStreamWriter(new FileOutputStream(x));
        // x2.write(x1, 0, x1.length());
        x2.write(x1, 1, 3);
        // 最终得到：234
        // 这里的12345对应的索引位置为0-4
        // 从1开始，就是从2开始
        x2.close();
    }
}
