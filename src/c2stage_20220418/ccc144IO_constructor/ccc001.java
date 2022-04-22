package c2stage_20220418.ccc144IO_constructor;

import org.apache.commons.io.IOUtils;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:c2stage_20220418.ccc144IO_constructor
 * User:  wo1261931780@gmail.com
 * Time:  2022-04-21-56  星期二
 */
public class ccc001 {
    public static void main(String[] args) throws IOException {
        IOUtils.copy(new FileInputStream("src/c2stage_20220418/ccc144IO_constructor/ccc001thread_extends.java"), new FileOutputStream("src/c2stage_20220418/ccc144IO_constructor/ccc001.txt"));
        // 一行代码完成复制和粘贴，
        // 同时不需要创建指定的管道
        // FileUtils.copyFileToDirectory(new File("src/c2stage_20220418/ccc144IO_constructor/ccc001thread_extends.java"), new File("src/c2stage_20220418/ccc144IO_constructor2/ccc002.java"));
        // 这里会默认将前面的作为文件，后面的xx.java作为文件夹
        // 然后复制的结果，是出现一个同名的文件
        // FileUtils.copyDirectoryToDirectory(new File("src/c2stage_20220418/ccc144IO_constructor"), new File("src/c2stage_20220418/ccc144IO_constructo2"));
        // FileUtils.delete(new File("src/c2stage_20220418/ccc144IO_constructo2"));
        // Files.copy(Path.of("src/c2stage_20220418/ccc144IO_constructor/lib"),Path.of("src/c2stage_20220418/ccc144IO_constructor2"));
        Files.copy(Path.of("src/c2stage_20220418/ccc144IO_constructor/ccc001.txt"), Path.of("src/c2stage_20220418/ccc144IO_constructor/lib2/ccc001.txt"));
        // 这里不能复制文件夹，只能复制文件
    }
}
