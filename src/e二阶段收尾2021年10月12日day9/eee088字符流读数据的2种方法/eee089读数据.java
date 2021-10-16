package e二阶段收尾2021年10月12日day9.eee088字符流读数据的2种方法;

import java.io.*;

/**
 * 构造方法：
 * InputStreamReader (InputStream in)：创建一个使用默认字符集的InputStreamReader
 * 读数据的2种方式：
 * int read ()：一次读一个字符数据
 * int read (char[] cbuf)：一次读一个字符数组数据
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
