package c2stage_20220410.ccc118delete;

import java.io.File;
import java.io.IOException;

public class eee051删除和注意事项 {
    public static void main(String[] args) throws IOException {
        File x = new File("l:\\java\\demo2");
        // 上面是绝对路径，拿过来直接粘贴就可以定位
        // File x = new File("myFile:\\java.txt");
        // 我这里直接报错，找不到路径位置...
        // 相对路径，必须先定位myFile的位置
        // --
        // System.out.println(x.createNewFile());
        // 在没有设置对应路径的情况下，
        // 会默认创建一个新文件，在当前java文件所在的目录
        // System.out.println(x.mkdir());
        System.out.println(x.delete());
        // 不存在文件和目录的情况下，
        // 直接创建失败
        // --
        // 在删除的时候需要注意，不能直接删除含有文件的目录
        // 文件夹内有文件，必须先删除文件，才能继续执行删除操作


    }
}
