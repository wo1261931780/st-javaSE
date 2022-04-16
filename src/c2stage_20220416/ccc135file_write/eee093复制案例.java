package c2stage_20220416.ccc135file_write;
/*
    需求：
        把模块目录下的ConversionStreamDemo.java 复制到模块目录下的 Copy.java

    数据源和目的地的分析
        数据源：myCharStream\\ConversionStreamDemo.java --- 读数据 --- Reader --- InputStreamReader --- FileReader
        目的地： myCharStream\\ Copy.java --- 写数据 --- Writer --- OutputStreamWriter --- FileWriter

    思路：
        1:根据数据源创建字符输入流对象
        2:根据目的地创建字符输出流对象
        3:读写数据，复制文件
        4:释放资源
 */

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class eee093复制案例 {
    public static void main(String[] args) throws IOException {
        File x = new File("l:\\java\\eee087.java");
        show(x);
        System.out.println("--");
    }

    public static void show(File x) throws IOException {
        // InputStreamReader x1 = new InputStreamReader(new FileInputStream(x));
        FileReader x1 = new FileReader(x);
        // 代码更加简洁
        // OutputStreamWriter x2 = new OutputStreamWriter(new FileOutputStream("l:\\java\\33.java"));
        FileWriter x2 = new FileWriter("l:\\java\\demo\\22.java");
        char[] xx = new char[1024];
        int i;
        while ((i = x1.read(xx)) != -1) {
            x2.write(xx, 0, i);
        }
        x1.close();
        x2.close();
    }
}
