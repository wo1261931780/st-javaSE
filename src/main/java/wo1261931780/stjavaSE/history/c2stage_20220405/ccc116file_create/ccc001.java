package wo1261931780.stjavaSE.history.c2stage_20220405.ccc116file_create;

import java.io.File;
import java.io.IOException;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:c2stage_20220405.ccc116file_create
 * User:  wo1261931780@gmail.com
 * Time:  2022-04-20-53  星期二
 */
/**
 目标：File类的创建和删除的方法
 - public boolean createNewFile() ：当且仅当具有该名称的文件尚不存在时，
 创建一个新的空文件。 （几乎不用的，因为以后文件都是自动创建的！）
 - public boolean delete() ：删除由此File表示的文件或目录。 （只能删除空目录）
 - public boolean mkdir() ：创建由此File表示的目录。（只能创建一级目录）
 - public boolean mkdirs() ：可以创建多级目录（建议使用的）
 */
public class ccc001 {
    public static void main(String[] args) throws IOException {
        File x = new File("C:\\Users\\1\\Documents\\GitHub\\st-java.github.io\\src\\c2stage_20220405\\ccc116file_create\\ccc038demo.txt");
        System.out.println(x.createNewFile());// 创建文件一般用不到，因为实际开发中都是自动创建文件
        File x1 = new File("C:\\Users\\1\\Documents\\GitHub\\st-java.github.io\\src\\c2stage_20220405\\ccc116file_create\\demo2");
        System.out.println(x1.mkdir());// 创建目录
        // 创建目录的api默认只能创建一级目录，多级目录会失败
        File x2 = new File("C:\\Users\\1\\Documents\\GitHub\\st-java.github.io\\src\\c2stage_20220405\\ccc116file_create\\demo2\\demo3\\demo4");
        System.out.println(x1.mkdirs());// 创建多级目录
        // 输出结果返回true/false
        File x3 = new File("C:\\Users\\1\\Documents\\GitHub\\st-java.github.io\\src\\c2stage_20220405\\ccc116file_create\\demo2");
        System.out.println(x3.delete());// 文件在占用状态依旧可以删除
        // 但是删除操作，不能删除非空文件夹，防呆

    }
}
