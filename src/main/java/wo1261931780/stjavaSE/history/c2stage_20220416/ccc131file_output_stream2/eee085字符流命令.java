package wo1261931780.stjavaSE.history.c2stage_20220416.ccc131file_output_stream2;
/*
    InputStreamReader：是从字节流到字符流的桥梁
        它读取字节，并使用指定的编码将其解码为字符
        它使用的字符集可以由名称指定，也可以被明确指定，或者可以接受平台的默认字符集

    OutputStreamWriter：是从字符流到字节流的桥梁
        是从字符流到字节流的桥梁，使用指定的编码将写入的字符编码为字节
        它使用的字符集可以由名称指定，也可以被明确指定，或者可以接受平台的默认字符集
 */

import java.io.*;

public class eee085字符流命令 {
    public static void main(String[] args) throws IOException {
        // 使用指定的编码，将字符编码为字节
        // 不指定的情况下，设置为默认字符集
        // OutputStreamWriter x = new OutputStreamWriter(new FileOutputStream("l:\\java\\test.txt"));
        // 这里直接创建了一个txt对象，然后用默认编码格式，直接输出指定文字
        OutputStreamWriter x = new OutputStreamWriter(new FileOutputStream("d:\\java\\test.txt"), "UTF-8");
        // 指定编码类型，，在writer中设置
        x.write("测试");
        x.close();
        System.out.println("-----------");
        InputStreamReader x1 = new InputStreamReader(new FileInputStream("d:\\java\\test.txt"));
        int i;
        while ((i = x1.read()) != -1) {
            System.out.println((char) i);
        }
        // 按教程展示，我的读写编码不一致会导致乱码出现
        // UTF-8和GBK两个，都能正常展示内容
        x1.close();

    }
    // 总结一下吧：
    // InputStreamReader读取字节，然后解码为字符
    // OutputStreamWriter读取字符，然后编码为字节
}
