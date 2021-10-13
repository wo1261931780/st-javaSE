package e二阶段收尾2021年10月10日.eee068复制文本文件案例;
/*
    需求：
        把“E:\\itcast\\窗里窗外.txt”复制到模块目录下的“窗里窗外.txt”

        数据源：
            E:\\itcast\\窗里窗外.txt --- 读数据 --- InputStream --- FileInputStream
        目的地：
            myByteStream\\窗里窗外.txt --- 写数据 --- OutputStream --- FileOutputStream

    思路：
        1:根据数据源创建字节输入流对象
        2:根据目的地创建字节输出流对象
        3:读写数据，复制文本文件(一次读取一个字节，一次写入一个字节)
        4:释放资源
 */

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class eee069案例 {
    public static void main(String[] args) throws IOException {
        File x = new File("l:\\java\\demo.txt");
        FileInputStream x1 = new FileInputStream(x);
        FileOutputStream x2 = new FileOutputStream("l:\\java\\demo2.txt");
        int x3;
        while ((x3 = x1.read()) != -1) {
            System.out.print((char) x3);
            x2.write(x3);
        }
        x1.close();
        x2.close();
        System.out.println("结束");
    }
}
