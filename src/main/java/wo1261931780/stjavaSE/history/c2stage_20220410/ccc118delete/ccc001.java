package wo1261931780.stjavaSE.history.c2stage_20220410.ccc118delete;

import java.io.File;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:c2stage_20220410.ccc118delete
 * User:  wo1261931780@gmail.com
 * Time:  2022-04-10-08  星期日
 */
public class ccc001 {
    public static void main(String[] args) {
        File x = new File("C:\\Users\\1\\Documents\\GitHub\\st-java.github.io\\src\\c2stage_20220410\\ccc038demo");
        // 在绝对路径存在的情况下，直接执行删除操作，即使是文件夹也可以顺利删除
        // 如果文件被占用，删除操作也可以顺利执行，而且文件的访问不受影响
        // 但是上面的删除都是不走win回收站的，所以执行删除还是要慎重
        System.out.println(x.delete());
        // 删除文件夹，如果文件夹为空，那么也不会执行，只能删除非空文件夹
        // 这是避免错误操作
    }
}
