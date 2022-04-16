package c2stage_20220415.ccc128file_input_stream;
/*
    需求：
        把文件fos.txt中的内容读取出来在控制台输出

    FileInputStream：从文件系统中的文件获取输入字节
        FileInputStream(String name)：通过打开与实际文件的连接来创建一个FileInputStream,该文件由文件系统中的路径名name命名

    使用字节输入流读数据的步骤：
        1:创建字节输入流对象
        2:调用字节输入流对象的读数据方法
        3:释放资源
 */

import java.io.FileInputStream;
import java.io.IOException;

public class eee067字节流读数据 {
    public static void main(String[] args) throws IOException {
        FileInputStream x = new FileInputStream("l:\\java\\demo.txt");
        // int x1 = x.read();
        // System.out.println(x1);
        // System.out.println((char) x1);
        // 强转以后就是d
        // 如果字符长度较短，读取结束以后直接返回-1
        System.out.println("--------------------");
        // for (int i = 0; x.read() != -1; i++) {
        //     int x2 = x.read();
        //     // System.out.println(x2);
        //     System.out.print((char) x2);
        // }
        // 上面的循环中，i全程都没有使用
        // 同时，每次read实际上都前进了一位数，最终导致读取的字符不完整
        // 改进后使用while循环
        int x2;
        while ((x2 = x.read()) != -1) {
            // int x2 = x.read();
            System.out.print((char) x2);
        }
        x.close();
    }
}
