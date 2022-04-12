package c2stage_20220412.ccc127file_io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:c2stage_20220412.ccc127file_io
 * User:  wo1261931780@gmail.com
 * Time:  2022-04-23-12  星期二
 */
public class ccc001 {
    public static void main(String[] args) throws FileNotFoundException {
        FileInputStream x = new FileInputStream("src/c2stage_20220412/ccc127file_io/demo.txt");
        // 上面是简化写法，就算直接写路径，内部还是根据结果，新建了一个file类
        // 看一下源码：
        //     public FileInputStream(String name) throws FileNotFoundException {
        //         this(name != null ? new File(name) : null);
        //     }
    }
}
