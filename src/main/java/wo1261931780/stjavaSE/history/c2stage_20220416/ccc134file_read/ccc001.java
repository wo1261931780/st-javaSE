package c2stage_20220416.ccc134file_read;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:c2stage_20220416.ccc134file_read
 * User:  wo1261931780@gmail.com
 * Time:  2022-04-16-17  星期六
 */
/**
 目标：字符输入流的使用。

 IO流的体系：
 字节流                                   字符流
 字节输入流           字节输出流               字符输入流       字符输出流
 InputStream         OutputStream            Reader         Writer     (抽象类)
 FileInputStream     FileOutputStream        FileReader     FileWriter (实现类)

 c.FileReader:文件字符输入流。
 -- 作用：以内存为基准，把磁盘文件的数据以字符的形式读入到内存。
 简单来说，读取文本文件内容到内存中去。

 -- 构造器：
 public FileReader(File file):创建一个字符输入流与源文件对象接通。
 public FileReader(String filePath):创建一个字符输入流与源文件路径接通。

 -- 方法：
 public int read(): 读取一个字符的编号返回！ 读取完毕返回-1
 public int read(char[] buffer):读取一个字符数组，读取多少个字符就返回多少个数量，读取完毕返回-1
 小结：
 字符流一个一个字符的读取文本内容输出，可以解决中文读取输出乱码的问题。
 字符流很适合操作文本文件内容。
 但是：一个一个字符的读取文本内容性能较差！！
 */
public class ccc001 {
    public static void main(String[] args) throws IOException {
        File x = new File("src/c2stage_20220416/ccc134file_read/demo001.txt");
        FileReader x1 = new FileReader(x);
        // 这里的读取，要求文件的编码格式，和代码展示出来的编码格式一致，否则展示也会乱码
        int demo;
        while ((demo = x1.read()) != -1) {
            System.out.println("展示结果----------");
            System.out.println((char) demo);// 其实不转换也可以，但是全部是数字编码，对用户来说没有意义
        }
    }
}
