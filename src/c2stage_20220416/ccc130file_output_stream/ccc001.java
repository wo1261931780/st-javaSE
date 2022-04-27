package c2stage_20220416.ccc130file_output_stream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:c2stage_20220416.ccc130file_output_stream
 * User:  wo1261931780@gmail.com
 * Time:  2022-04-10-46  星期六
 */
public class ccc001 {
    public static void main(String[] args) throws IOException {
        File x = new File("C:\\Users\\1\\Documents\\GitHub\\st-java.github.io\\src\\c2stage_20220416\\ccc130file_output_stream\\demo.txt");
        // FileOutputStream x1 = new FileOutputStream(x);// 创建的时候清空所有的数据
        FileOutputStream x1 = new FileOutputStream(x, true);// 添加一个true，表示追加数据
        x1.write(123);
        x1.write('b');
        x1.write('a');
        // x1.write(Integer.parseInt("1"));
        byte[] x2 = {'a', 'b', 'c'};
        x1.write(x2);// 按照数组的形式写入数据
        byte[] x3 = "测试中文".getBytes();// 将字符串变成字节数组
        x1.write(x3);
        x1.write("\r\n".getBytes());// 换行符，多系统兼容
        byte[] x4 = {'A', 'B', 'C', 'D'};
        x1.write(x4, 0, 2);// 写指定数组，从0开始，写入的长度为2
        x1.flush();// 刷新数据，保证内存写到硬盘
        // 这里的读写是从头开始进行的
        // 如果文件中有数据，也会进行覆盖，然后从头开始写入


    }
}
