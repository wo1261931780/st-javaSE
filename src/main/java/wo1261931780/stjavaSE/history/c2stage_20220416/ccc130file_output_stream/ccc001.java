package c2stage_20220416.ccc130file_output_stream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:c2stage_20220416.ccc130file_output_stream
 * User:  wo1261931780@gmail.com
 * Time:  2022-04-10-46  星期六
 */

/**
 * 目标：字节输出流的使用。
 * <p>
 * IO流的体系：
 * 字节流                                   字符流
 * 字节输入流           字节输出流               字符输入流       字符输出流
 * InputStream         OutputStream           Reader         Writer     (抽象类)
 * FileInputStream     FileOutputStream       FileReader     FileWriter (实现类)
 * <p>
 * a.FileOutputStream文件字节输出流。
 * -- 作用：以内存为基准，把内存中的数据，按照字节的形式写出到磁盘文件中去。
 * 简单来说，把内存数据按照字节写出到磁盘文件中去。
 * -- 构造器：
 * public FileOutputStream(File file):创建一个字节输出流管道通向目标文件对象。
 * public FileOutputStream(String file):创建一个字节输出流管道通向目标文件路径。
 * public FileOutputStream(File file , boolean append):创建一个追加数据的字节输出流管道通向目标文件对象。
 * public FileOutputStream(String file , boolean append):创建一个追加数据的字节输出流管道通向目标文件路径。
 * -- 方法：
 * public void write(int a):写一个字节出去 。
 * public void write(byte[] buffer):写一个字节数组出去。
 * public void write(byte[] buffer , int pos , int len):写一个字节数组的一部分出去。
 * 参数一，字节数组；参数二：起始字节索引位置，参数三：写多少个字节数出去。
 * 小结：
 * 记住。
 * 换行：  os.write("\r\n".getBytes()); // 换行
 * 追加数据管道： OutputStream os = new FileOutputStream("day10_demo/out01.txt" , true); // 追加管道！！
 */
public class ccc001 {
    public static void main(String[] args) throws IOException {
        File x = new File("C:\\Users\\1\\Documents\\GitHub\\st-java.github.io\\src\\c2stage_20220416\\ccc130file_output_stream\\ccc038demo.txt");
        // FileOutputStream x1 = new FileOutputStream(x);// 创建的时候清空所有的数据
        FileOutputStream x1 = new FileOutputStream(x, true);// 添加一个true，表示追加数据
        x1.write(123);
        x1.write('b');
        x1.write('a');
        // x1.write(Integer.parseInt("1"));
        byte[] x2 = {'a', 'b', 'c'};
        x1.write(x2);// 按照数组的形式写入数据
        byte[] x3 = "测试中文".getBytes();// 将字符串变成字节数组
        x1.write(x3);
        x1.write("\r\n".getBytes());// 换行符，多系统兼容
        byte[] x4 = {'A', 'B', 'C', 'D'};
        x1.write(x4, 0, 2);// 写指定数组，从0开始，写入的长度为2
        x1.flush();// 刷新数据，保证内存写到硬盘
        // 这里的读写是从头开始进行的
        // 如果文件中有数据，也会进行覆盖，然后从头开始写入
        x1.close();
    }
}
