package c2stage_20220416.ccc130file_output_stream;
/*
    字节流写数据的两个小问题:
        1:字节流写数据如何实现换行呢？
            window:\r\n
            linux:\n
            mac:\r
        2:字节流写数据如何实现追加写入呢？
            public FileOutputStream (String name,boolean append)
                创建文件输出流以指定的名称写入文件。
                如果第二个参数为true ，则字节将写入文件的末尾而不是开头
 */

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class eee063写数据 {
    public static void main(String[] args) throws IOException {
        File x = new File("l:\\java\\demo.txt");
        // FileOutputStream x1 = new FileOutputStream(x);
        FileOutputStream x1 = new FileOutputStream(x, true);
        // 上面，二者的不同在于，后续的参数支持追加写入
        // 但是，追加写入只能从末尾开始，
        // 例如原式123，追加000以后，只会变成123000
        for (int i = 0; i < 10; i++) {
            x1.write("demo".getBytes());
            x1.write("\r\n".getBytes());
            // 上面是win自带的换行符
            // idea内部可以识别多种换行符
            // 但是linux，win，mac三个换行符不相同
            // window:\r\n
            // linux:\n
            // mac:\r
        }
        // 如果不是追加写入的类型，
        // 字节流的写入操作，会导致源文件内的数据丢失，
        // 数据会被覆盖为我代码中写入的数据
        System.out.println("结束");
        x1.close();
    }
}
