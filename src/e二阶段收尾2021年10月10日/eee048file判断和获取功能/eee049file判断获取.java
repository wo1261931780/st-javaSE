package e二阶段收尾2021年10月10日.eee048file判断和获取功能;
/*
    File类的判断和获取功能：
        public boolean isDirectory()：测试此抽象路径名表示的File是否为目录
        public boolean isFile()：测试此抽象路径名表示的File是否为文件
        public boolean exists()：测试此抽象路径名表示的File是否存在

        public String getAbsolutePath()：返回此抽象路径名的绝对路径名字符串
        public String getPath()：将此抽象路径名转换为路径名字符串
        public String getName()：返回由此抽象路径名表示的文件或目录的名称

        public String[] list()：返回此抽象路径名表示的目录中的文件和目录的名称字符串数组
        public File[] listFiles()：返回此抽象路径名表示的目录中的文件和目录的File对象数组
 */

import java.io.File;
import java.lang.reflect.Field;

public class eee049file判断获取 {
    public static void main(String[] args) {
        File x = new File("l:java\\demo");
        System.out.println(x);
        // l:java\demo
        // 运行时，该目录存在
        System.out.println(x.isDirectory());
        // 判断是否为目录，true
        System.out.println(x.isFile());
        // 判断是否为文件，false
        System.out.println(x.exists());
        // 判断file是否存在，true
        // ------------------------------------------------------------
        System.out.println(x.getAbsolutePath());
        // l:\\java\demo,绝对路径名，形式为字符串
        System.out.println(x.getPath());
        // l:java\demo，路径字符串
        System.out.println(x.getName());
        // demo，路径的文件和目录名称，
        // 这里只展示末位的文件夹名
        // ------------------------------------------------------------
        System.out.println("-------------------");
        File x1 = new File("l:java");
        String[] x2 = x1.list();
        // 返回目录中的文件和目录的名称,用名称构造一个字符串数组
        // 相当于打开一个文件夹，然后展示文件夹内部的所有文件
        for (String i : x2) {
            System.out.println(i);
        }
        System.out.println("-------------------");
        // 目录中的文件和目录的File对象数组，用file对象构造数组
        // 好处是，数组内的文件全部是file格式，
        // 而file格式，都可以直接调用file方法
        File[] x3 = x1.listFiles();
        for (File i2 : x3) {
            System.out.print(i2.getName());
            System.out.println("是不是文件：" + i2.isFile());
        }

    }
}
