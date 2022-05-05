package c2stage_20220416.ccc134file_read;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 构造方法：
 * InputStreamReader (InputStream in)：创建一个使用默认字符集的InputStreamReader
 * 读数据的2种方式：
 * int read ()：一次读一个字符数据
 * int read (char[] cbuf)：一次读一个字符数组数据
 */
/**
 目标：字符输出流的使用。

 IO流的体系：
 字节流                                   字符流
 字节输入流           字节输出流               字符输入流       字符输出流
 InputStream         OutputStream           Reader         Writer     (抽象类)
 FileInputStream     FileOutputStream       FileReader     FileWriter (实现类)

 d.FileWriter文件字符输出流的使用。
 -- 作用：以内存为基准，把内存中的数据按照字符的形式写出到磁盘文件中去。
 简单来说，就是把内存的数据以字符写出到文件中去。
 -- 构造器：
 public FileWriter(File file):创建一个字符输出流管道通向目标文件对象。
 public FileWriter(String filePath):创建一个字符输出流管道通向目标文件路径。
 public FileWriter(File file,boolean append):创建一个追加数据的字符输出流管道通向目标文件对象。
 public FileWriter(String filePath,boolean append):创建一个追加数据的字符输出流管道通向目标文件路径。
 -- 方法：
 a.public void write(int c):写一个字符出去
 b.public void write(String c)写一个字符串出去：
 c.public void write(char[] buffer):写一个字符数组出去
 d.public void write(String c ,int pos ,int len):写字符串的一部分出去
 e.public void write(char[] buffer ,int pos ,int len):写字符数组的一部分出去
 小结：
 字符输出流可以写字符数据出去，总共有5个方法写字符。
 覆盖管道：
 Writer fw = new FileWriter("Day10Demo/src/dlei03.txt"); // 覆盖数据管道
 追加数据管道：
 Writer fw = new FileWriter("Day10Demo/src/dlei03.txt",true); // 追加数据管道
 换行：
 fw.write("\r\n"); // 换行
 结论：读写字符文件数据建议使用字符流。复制文件建议使用字节流。
 */
public class eee089读数据 {
    public static void main(String[] args) throws IOException {
        File x = new File("l:\\java\\dd.txt");
        // re(x);
        re2(x);
    }

    public static void re(File x) throws IOException {
        InputStreamReader x1 = new InputStreamReader(new FileInputStream(x));
        int i;
        while ((i = x1.read()) != -1) {
            System.out.println((char) i);
        }
        // 需要注意的是，
        // 这里读取字符数据，是按照每个字符进行展示的
        // 例如测试两个字，展示就是测+试
        // 中文字符会根据编码解码进行自动转换
        x1.close();
    }

    public static void re2(File x) throws IOException {
        InputStreamReader x1 = new InputStreamReader(new FileInputStream(x));
        char[] x2 = new char[1024];
        int i;
        while ((i = x1.read(x2)) != -1) {
            // System.out.println((char) i);
            System.out.println(new String(x2, 0, i));
            // 数组，偏移量，读取到的字符长度i
            // 需要解释的是，这里读取的文件类型可以是任意的，
            // 例如java文件，最终会按照txt文本格式去读取
        }
        x1.close();
    }
}
// 数字类型
// 学校收费，学杂费多少，金额统计，
