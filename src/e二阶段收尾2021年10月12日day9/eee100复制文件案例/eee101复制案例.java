package e二阶段收尾2021年10月12日day9.eee100复制文件案例;
/*
    需求：
        把模块目录下的ConversionStreamDemo.java 复制到模块目录下的 Copy.java

    思路：
        1:根据数据源创建字符缓冲输入流对象
        2:根据目的地创建字符缓冲输出流对象
        3:读写数据，复制文件
            使用字符缓冲流特有功能实现
        4:释放资源
 */

import java.io.*;

public class eee101复制案例 {
    public static void main(String[] args) throws IOException {
        File x = new File("l:\\java\\eee087.java");
        readshow(x);
    }

    public static void readshow(File x) throws IOException {
        BufferedReader x1 = new BufferedReader(new FileReader(x));
        BufferedWriter x4 = new BufferedWriter(new FileWriter("l:\\java\\copy.java"));
        char[] x2 = new char[1024];
        String x3;
        while ((x3 = x1.readLine()) != null) {
            x4.write(x3);
            // 这里只读取了内容，不会对格式进行处理
            x4.newLine();
            // 手动添加换行
            x4.flush();
            // 手动刷新存取
        }
        x1.close();
        x4.close();
        System.out.println("结束");
    }
}
