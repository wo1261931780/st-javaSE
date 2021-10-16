package e二阶段收尾2021年10月12日day9.eee098缓冲流特有功能;

import java.io.*;

public class eee099特有功能 {
    public static void main(String[] args) throws IOException {
        File xx = new File("l:\\java\\demo.txt");
        BufferedWriter x = new BufferedWriter(new FileWriter(xx));
        for (int i = 0; i < 10; i++) {
            x.write("java" + i);
            // x.write("\r\n");
            x.newLine();
            // 自带的换行符号，避免不同系统之间的差异
        }
        System.out.println("-------------");
        x.close();
        show(xx);
    }

    public static void show(File x) throws IOException {
        BufferedReader x1 = new BufferedReader(new FileReader(x));
        String x2 = "";
        while ((x2 = x1.readLine()) != null) {
            // readline是自动读取字符串的方法，
            // 同样的，每次读取都会，让文本前进一行
            // 但是x2只含有文本内容，没有换行符，
            // 所以必须手动换行
            System.out.println(x2);
        }
    }
}
