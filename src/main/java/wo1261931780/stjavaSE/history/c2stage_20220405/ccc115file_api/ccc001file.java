package wo1261931780.stjavaSE.history.c2stage_20220405.ccc115file_api;

import java.io.File;
import java.text.SimpleDateFormat;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:c2stage_20220405.ccc115file_api
 * User:  wo1261931780@gmail.com
 * Time:  2022-04-20-40  星期二
 */
/**
 目标：File类的获取功能的API
 - public String getAbsolutePath()  ：返回此File的绝对路径名字符串。
 - public String getPath()  ： 获取创建文件对象的时候用的路径
 - public String getName()  ： 返回由此File表示的文件或目录的名称。
 - public long length()  ：    返回由此File表示的文件的长度。
 */
public class ccc001file {
    public static void main(String[] args) {
        System.out.println("------");
        File x = new File("C:\\Users\\1\\Documents\\GitHub\\st-java.github.io\\src\\c2stage_20220405\\ccc114IO\\ccc038demo.txt");
        // 上面获取的是绝对路径
        System.out.println(x.getAbsolutePath());
        // 获取绝对路径，C:\Users\1\Documents\GitHub\st-java.github.io\src\c2stage_20220405\ccc114IO\ccc038demo.txt
        System.out.println("相对路径：" + x.getPath());
        System.out.println(x.getName());
        System.out.println(x.length());
        System.out.println(x.lastModified());// 最后修改时间，long类型的数据
        SimpleDateFormat x1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:SS");
        System.out.println(x1.format(x.lastModified()));// 加上一个日期格式化器，2022-04-05 20:26:353
        System.out.println(x.isDirectory());// 是否是文件夹，false
        System.out.println(x.isFile());// 是否是文件，true
        System.out.println("------------------------------------");
        show2();
    }

    public static void show2() {
        File x = new File("st-java.github.io\\src\\c2stage_20220405\\ccc114IO\\ccc038demo.txt");
        System.out.println(x.getAbsolutePath());
        // 在同一个项目下，即使是相对路径的file对象，
        // 调用api去获得绝对路径时，还是会得到一个绝对路径
        System.out.println("相对路径：" + x.getPath());//但是相对路径是绝对不会发生变化的
        System.out.println(x.getName());// ccc038demo.txt
        System.out.println(x.length());// 0
        System.out.println(x.lastModified());// 最后修改时间，0
        SimpleDateFormat x1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:SS");// 0
        System.out.println(x1.format(x.lastModified()));// 加上一个日期格式化器，1970-01-01 08:00:00
        System.out.println(x.isDirectory());// 是否是文件夹，false
        System.out.println(x.isFile());// 是否是文件，false
    }
}
