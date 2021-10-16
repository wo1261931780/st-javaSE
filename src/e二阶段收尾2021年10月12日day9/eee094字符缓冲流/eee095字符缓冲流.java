package e二阶段收尾2021年10月12日day9.eee094字符缓冲流;
/*
    字符缓冲流：
        BufferedWriter：将文本写入字符输出流，缓冲字符，以提供单个字符，数组和字符串的高效写入，可以指定缓冲区大小，或者可以接受默认大小。默认值足够大，可用于大多数用途
        BufferedReader：从字符输入流读取文本，缓冲字符，以提供字符，数组和行的高效读取，可以指定缓冲区大小，或者可以使用默认大小。 默认值足够大，可用于大多数用途

    构造方法：
        BufferedWriter(Writer out)
        BufferedReader(Reader in)
 */

import java.io.*;

public class eee095字符缓冲流 {
    public static void main(String[] args) throws IOException {
        System.out.println("-----");
        show_write();
        System.out.println("-------------------");
        show_read();
    }

    public static void show_write() throws IOException {
        // FileWriter x1 = new FileWriter("l:\\java\\dd.txt");
        BufferedWriter x1 = new BufferedWriter(new FileWriter("l:\\java\\dd.txt"));
        x1.write("demo");
        x1.write("dddd");
        x1.close();
    }

    public static void show_read() throws IOException {
        BufferedReader x1 = new BufferedReader(new FileReader("l:\\java\\dd.txt"));
        char[] x2 = new char[1024];
        int i;
        while ((i = x1.read(x2)) != -1) {
            // System.out.println((char) i);
            System.out.println(new String(x2, 0, i));
            // 必须转化为字符串的形式
        }
        System.out.println("读取结束");
    }

}
