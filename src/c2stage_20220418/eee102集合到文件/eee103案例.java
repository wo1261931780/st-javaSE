package c2stage_20220418.eee102集合到文件;
/*
    需求：
        把ArrayList集合中的字符串数据写入到文本文件。要求：每一个字符串元素作为文件中的一行数据

    思路：
        1:创建ArrayList集合
        2:往集合中存储字符串元素
        3:创建字符缓冲输出流对象
        4:遍历集合，得到每一个字符串数据
        5:调用字符缓冲输出流对象的方法写数据
        6:释放资源
 */

import java.io.*;
import java.util.ArrayList;

public class eee103案例 {
    public static void main(String[] args) throws IOException {
        ArrayList<String> x = new ArrayList<>();
        x.add("aaa");
        x.add("bbb");
        x.add("ccc");
        x.add("ddd");
        show(x);
    }

    public static void show(ArrayList<String> x) throws IOException {
        BufferedWriter x1 = new BufferedWriter(new FileWriter("l:\\java\\demo.txt"));
        BufferedReader x2 = new BufferedReader(new FileReader("l:\\java\\demo.txt"));
        String x3;
        // while ((x3 = x2.readLine()) != null) {
        for (int i = 0; i < x.size(); i++) {
            x3 = x.get(i);
            System.out.println(x3);
            x1.write(x3);
            x1.newLine();
            x1.flush();
        }
        System.out.println("结束");
    }
}
