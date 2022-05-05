package c2stage_20220417.ccc139charset_writer;
/*
    需求：
        把模块目录下的ConversionStreamDemo.java 复制到模块目录下的 Copy.java

    思路：
        1:根据数据源创建字符缓冲输入流对象
        2:根据目的地创建字符缓冲输出流对象
        3:读写数据，复制文件
        4:释放资源
 */

import java.io.*;

public class eee097缓冲流案例 {
    public static void main(String[] args) throws IOException {
        copydemo();
    }

    public static void copydemo() throws IOException {
        BufferedReader x1 = new BufferedReader(new FileReader("l:\\java\\eee087.java"));
        BufferedWriter x2 = new BufferedWriter(new FileWriter("l:\\java\\22.java"));
        int i;
        char[] x3 = new char[1024];
        while ((i = x1.read(x3)) != -1) {
            x2.write(x3, 0, i);
            // x2.write(i);
        }
        x1.close();
        x2.close();
        System.out.println("结束");
    }
}
