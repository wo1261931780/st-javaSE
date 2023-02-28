package c2stage_20220412.ccc127file_io;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:c2stage_20220412.ccc127file_io
 * User:  wo1261931780@gmail.com
 * Time:  2022-04-23-12  星期二
 */
public class ccc001 {
    public static void main(String[] args) throws IOException {
        FileInputStream x = new FileInputStream("src/c2stage_20220412/ccc127file_io/ccc038demo.txt");
        // 上面是简化写法，就算直接写路径，内部还是根据结果，新建了一个file类
        // 看一下源码：
        //     public FileInputStream(String name) throws FileNotFoundException {
        //         this(name != null ? new File(name) : null);
        //     }
        // 其实内部还是将其作为一个file对象，进行了构造
        int demo = x.read();// 这里担心我们读取的结果不存在，可能会返回-1，所以编译报错
        System.out.println((char) demo);// 结果为1
        // 这里每次都会读取一个字节返回，而int的数据类型是32位的，所以接收没问题
        // 又因为数字和英文，都是占用一个字节，所以直接读取没问题

        int demo2 = x.read();// read方法，底层是stream流的形式，所以读取是按照顺序往前走的
        System.out.println((char) demo2);// 因为是中文，一个汉字占用两个字节，所以会乱码
    }
}
