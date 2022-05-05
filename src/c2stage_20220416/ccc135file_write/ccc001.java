package c2stage_20220416.ccc135file_write;

import java.io.*;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:c2stage_20220416.ccc135file_write
 * User:  wo1261931780@gmail.com
 * Time:  2022-04-16-40  星期六
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
