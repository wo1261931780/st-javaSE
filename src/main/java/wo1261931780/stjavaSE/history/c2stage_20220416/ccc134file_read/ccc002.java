package wo1261931780.stjavaSE.history.c2stage_20220416.ccc134file_read;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:c2stage_20220416.ccc134file_read
 * User:  wo1261931780@gmail.com
 * Time:  2022-04-16-28  星期六
 */

/**
 目标：字符输入流的使用-按照字符数组读取。

 IO流的体系：
 字节流                                       字符流
 字节输入流           字节输出流               字符输入流       字符输出流
 InputStream         OutputStream           Reader         Writer     (抽象类)
 FileInputStream     FileOutputStream       FileReader     FileWriter (实现类)

 c.FileReader:文件字符输入流。
 -- 作用：以内存为基准，把磁盘文件的数据以字符的形式读入到内存。
 简单来说，读取文本文件内容到内存中去。
 -- 构造器：
 public FileReader(File file):创建一个字符输入流与源文件对象接通。
 public FileReader(String filePath):创建一个字符输入流与源文件路径接通。
 -- 方法：
 public int read(): 读取一个字符的编号返回！ 读取完毕返回-1
 public int read(char[] buffer):读取一个字符数组，
 读取多少个字符就返回多少个数量，读取完毕返回-1
 小结：
 字符流按照字符数组循环读取数据，可以解决中文读取输出乱码的问题，而且性能也较好！！
 */
public class ccc002 {
    public static void main(String[] args) throws IOException {
        File x = new File("src/c2stage_20220416/ccc134file_read/demo001.txt");
        FileReader x1 = new FileReader(x);
        int len;
        char[] demo = new char[1024];// 这个是字符为单位的，相当于字符*1024个
        // 如果一个字符3个字节，就是3*1024
        while ((len = x1.read(demo)) != -1) {
            String x3 = new String(demo, 0, len);
            System.out.println(x3);
        }
    }
}
