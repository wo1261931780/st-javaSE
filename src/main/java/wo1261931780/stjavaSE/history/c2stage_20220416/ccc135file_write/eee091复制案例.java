package c2stage_20220416.ccc135file_write;

import java.io.*;

public class eee091复制案例 {
    public static void main(String[] args) throws IOException {
        System.out.println("-----");
        File x = new File("l:\\java\\eee087.java");
        copy(x);

    }

    public static void copy(File x) throws IOException {
        InputStreamReader x1 = new InputStreamReader(new FileInputStream(x));
        OutputStreamWriter x2 = new OutputStreamWriter(new FileOutputStream("l:\\java\\ccc038demo\\22.java"));
        int i;
        while ((i = x1.read()) != -1) {
            x2.write(i);
        }
        System.out.println("结束");
        x1.close();
        x2.close();
        // 因为没有close，导致上面没有刷新
    }

    public static void copybyte(File x) throws IOException {
        InputStreamReader x1 = new InputStreamReader(new FileInputStream(x));
        OutputStreamWriter x2 = new OutputStreamWriter(new FileOutputStream("l:\\java\\33.java"));
        // byte[] xx = new byte[1024];
        char[] xx = new char[1024];
        // 上面byte是针对字节流定义的，而字符流就需要char类型的数组
        int i;
        while ((i = x1.read(xx)) != -1) {
            x2.write(xx, 0, i);
        }
        x1.close();
        x2.close();
        System.out.println("结束");
    }
}
