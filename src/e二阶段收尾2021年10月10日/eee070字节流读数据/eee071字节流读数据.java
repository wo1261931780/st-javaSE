package e二阶段收尾2021年10月10日.eee070字节流读数据;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 需求：把文件fos.txt中的内容读取出来在控制台输出
 * 使用字节输入流读数据的步骤：
 * 1:创建字节输入流对象
 * 2:调用字节输入流对象的读数据方法
 * 3:释放资源
 */
public class eee071字节流读数据 {
    public static void main(String[] args) throws IOException {
        recycle();
    }

    public static void recycle() throws IOException {
        byte[] xx = new byte[1024];
        // 1024及其整数倍
        // 这里的核心功能在于，
        // 一次读取一个字节的数据
        File xx1 = new File("l:\\java\\demo.txt");
        FileInputStream xx2 = new FileInputStream(xx1);
        int xx3 = 0;
        if (xx2 != null) {
            while ((xx3 = xx2.read(xx)) != -1) {
                // xx3 = xx2.read(xx);
                System.out.print(new String(xx, 0, xx3));
            }
        }
        xx2.close();
    }

    public static void mm() throws IOException {
        File x = new File("l:\\java\\demo.txt");
        FileInputStream x1 = new FileInputStream(x);
        byte[] x2 = new byte[5];
        int x3 = x1.read(x2);
        System.out.println(x3);
        // 结果为：5
        // x3表示实际读取到的数据个数
        System.out.println(new String(x2));
        // 结果为：aaaaa
        // 表示我新建了一个字符串，然后读取的字符个数为5
        // --说一下整体逻辑：
        // 1.我构建了一个长度为5的数组，
        // byte[] x2 = new byte[5];
        // 2.x1去读取x2长度的数据，
        // int x3 = x1.read(x2);
        // 3.然后把数据长度存到x3中，
        // 展示对应结果
        // System.out.println(x3);
        // 结果为：5
        // x3表示实际读取到的数据个数
        // 4.我原来一直读取的是数组中的数据，现在把数组中的数据存到字符串中
        // new String(x2)
        // 直接把字节数组变成字符串
        // System.out.println(new String(x2));
        // 结果为：aaaaa
        // ----------------------------------------------------------------
        // 下面的代码是重复执行读取操作，
        System.out.println("--------------------");
        x3 = x1.read(x2);
        System.out.println(x3);
        // 结果为5
        System.out.println(new String(x2));
        // 结果为：”
        //
        // bbb“
        // 这里读取的实际数据是：\r\nbbb，
        // 整体来看，数据长度还是5个字符，但是换行也被读取进来
        System.out.println("--------------------");
        x3 = x1.read(x2);
        System.out.println(x3);
        // 结果为5
        System.out.println(new String(x2));
        // 读取数据为：bb\r\n-
        // ...
        // System.out.println("--------------------");
        // x3 = x1.read(x2);
        // System.out.println(x3);
        // System.out.println(new String(x2));
        // ...继续执行
        // ...
        System.out.println("--------------------");
        x3 = x1.read(x2);
        System.out.println(x3);
        // 结果为3
        // System.out.println(new String(x2));
        // 读取数据为：emo-d
        // 实际只读取到emo三个字符，下面进行改进
        System.out.println("--------------------");
        System.out.println(new String(x2, 0, x3));
        // 上面三个分别表示：
        // 我需要读取的字符长度，0，我实际读取的字符长度
    }
}
