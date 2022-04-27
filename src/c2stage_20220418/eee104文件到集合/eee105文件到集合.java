package c2stage_20220418.eee104文件到集合;
/*
    需求：
        把文本文件中的数据读取到集合中，并遍历集合。要求：文件中每一行数据是一个集合元素

    思路：
        1:创建字符缓冲输入流对象
        2:创建ArrayList集合对象
        3:调用字符缓冲输入流对象的方法读数据
        4:把读取到的字符串数据存储到集合中
        5:释放资源
        6:遍历集合
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class eee105文件到集合 {
    public static void main(String[] args) throws IOException {
        ArrayList<String> xx = new ArrayList<>();
        readshow(xx);
        System.out.println("--------------");
        for (int i = 0; i < xx.size(); i++) {
            System.out.println(xx.get(i));
        }
        System.out.println("--------------");
        System.out.println(xx);
    }

    public static void readshow(ArrayList<String> xx) throws IOException {
        BufferedReader x = new BufferedReader(new FileReader("l:\\java\\demo.txt"));
        String x1 = "";
        while ((x1 = x.readLine()) != null) {
            // xx.add(x1 + "\r\n");
            xx.add(x1);
        }
        x.close();
        System.out.println("结束");

    }
}
