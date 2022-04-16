package c2stage_20220416.ccc130file_output_stream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/**
 * 构造方法：
 * FileOutputStream (String name)：创建文件输出流以指定的名称写入文件
 * FileOutputStream (File file)：创建文件输出流以写入由指定的 File对象表示的文件
 * 写数据的三种方式：
 * void write (int b)：将指定的字节写入此文件输出流
 * 一次写一个字节数据
 * void write (byte[] b)：将 b.length字节从指定的字节数组写入此文件输出流
 * 一次写一个字节数组数据
 * void write (byte[] b, int off, int len)：将 len字节从指定的字节数组开始，从偏移量off开始写入此文件输出流
 * 一次写一个字节数组的部分数据
 */
public class eee061字节 {
    public static void main(String[] args) throws IOException {
        File x = new File("l:\\java");
        FileOutputStream x1 = new FileOutputStream("l:\\java\\demo2.txt");
        // 异常需要抛出
        // FileOutputStream x2=new FileOutputStream(x);
        // 本质上做的，就是上面这个，
        // 将file路径封装成一个对象
        // --
        // 一个新的理解是，我可以设置一个x路径对象
        // 然后再把x传递给x1，让x1执行文件操作
        x1.write(11);
        // void write (int b)：将指定的字节写入此文件输出流
        // 一次写一个字节数据
        byte[] x2 = {97, 98, 99, 100, 101};
        x1.write(x2);
        // void write (byte[] b)：将 b.length字节从指定的字节数组写入此文件输出流
        // x1.write(x2);这里实际上就是把x2这个数组全部写入了x1，
        // 然后在x1中出现x2的字节码内容abcde
        // 一次写一个字节数组数据
        // --
        byte[] x3 = "测试".getBytes(StandardCharsets.UTF_8);
        // 将“测试”作为一个字符串赋值给x3，
        // 然后x3作为字符串数组拿到数据
        // 返回x3的数据值
        x1.write(x3);
        byte[] x4 = "aaaa".getBytes(StandardCharsets.UTF_8);
        // void write (byte[] b, int off, int len)：
        // 将 len字节从指定的字节数组开始，从偏移量off开始写入此文件输出流
        // 一次写一个字节数组的部分数据
        x1.write(x4, 0, x4.length);
        // 从索引的0号位置开始，写入x4这个数组的数据，
        // 写入的数据长度为x4.length
        x1.close();
    }
}
