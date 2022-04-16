package c2stage_20220416.ccc130file_output_stream;

import java.io.FileOutputStream;
import java.io.IOException;

public class eee059字节流 {
    public static void main(String[] args) throws IOException {
        // 需要对字节流和字符流做分类解释
        // 简单来说，
        // 能使用记事本直接打开的文件吗，同时我们可以读懂内容的，一般作为字符流
        // 类似图片webp文件，我们打开以后是“乱码”的形式，
        // 我们就作为字节流处理
        // 同时，如果无法判断一个文件的类型，就直接作为字节流处理
        // 因为字节流是万能类型
        // --
        // 今天应该完成的，是day9-10的进度

        FileOutputStream x = new FileOutputStream("l:demo.txt");
        System.out.println(x);
        // java.io.FileOutputStream@4eec7777
        // 输出一个内存地址
        // 这里，即使不用"l:\\demo.txt"，一样可以创建具体对象
        // 执行的实际上是写入操作，这里写入一个文件
        x.write(97);
        // 记事本中的文字是a，对应的字符串中的97=a
        // write将指定的字节写入此文件输出流
        x.write(57);
        x.write(55);
        // 记事本结果a97，几个注意点：
        // 1.write命令输入的内容是不换行的
        // 2.删除上面的命令以后，只会输入已经出现的命令，没有出现的命令直接删除
        // 举例，我已经输入了a，然后输入97，
        // 这个时候删除97的输入指令，记事本中的97就会消失
        // 最终记事本中只有a
        // --
        x.close();
        // close关闭此文件输出流并释放与此流相关联的任何系统资源。
        System.out.println("结束");
    }

    // 字节流做了三件事情：
    //     A:调用系统功能创建了文件
    //     B:创建了字节输出流对象
    //     C:让字节输出流对象指向创建好的文件
    // 整体流程：new对象--write内容--close关闭


}
