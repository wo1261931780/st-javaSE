package wo1261931780.stjavaSE.history.c2stage_20220416.ccc136Bytebufferstream;

import java.io.*;

public class eee075字节缓冲流 {
    public static void main(String[] args) throws IOException {
        File x = new File("L:\\java\\ccc038demo.txt");
        // FileOutputStream x1 = new FileOutputStream(x);
        BufferedOutputStream x1 = new BufferedOutputStream(new FileOutputStream(x));
        // 上面的代码合并了两个命令
        // 源代码：
        // public BufferedOutputStream(OutputStream out) {
        // this(out, 8192);
        // }
        // public BufferedOutputStream(OutputStream out, int size) {
        // super(out);
        // if (size <= 0) {
        //     throw new IllegalArgumentException("Buffer size <= 0");
        // }
        // buf = new byte[size];
        // }
        // 相当于在内部封装了一个8192字节的数组
        x1.write("www".getBytes());
        // 这里实际上还是输出流，因为执行的命令还是输出流命令
        x1.write("demo".getBytes());
        x1.close();
        // FileInputStream x2 = new FileInputStream(x);
        // int i;
        // while ((i = x2.read()) != -1) {
        //     System.out.print((char) i);
        // }
        System.out.println("-----------------------------");
        // 通过字节缓冲流读取数据
        BufferedInputStream x3 = new BufferedInputStream(new FileInputStream(x));
        int i;
        while ((i = x3.read()) != -1) {
            System.out.print((char) i);
        }
        System.out.println("-----------------------------");
        // 通过数组形式读取数据
        byte[] xx = new byte[1024];
        // 1.定义一个数组
        int x4;
        // 2.定义一个int类型的变量，用来接收读取到的数据
        while ((x4 = x3.read()) != -1) {
            // 当读取尚未结束的时候，
            System.out.println(new String(xx, 0, x4));
        }
    }
}
