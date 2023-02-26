package c2stage_20220410.ccc119file_traversal;

import java.io.File;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:c2stage_20220410.ccc119file_traversal
 * User:  wo1261931780@gmail.com
 * Time:  2022-04-10-23  星期日
 */
public class ccc001 {
    public static void main(String[] args) {
        File x = new File("C:\\Users\\1\\Documents\\GitHub\\st-java.github.io\\src\\c2stage_20220410\\ccc119file_traversal");
        String[] demo = x.list();
        System.out.println(demo);// 直接获取路径下的字符串，结果为[Ljava.lang.String;@682a0b20
        for (String s : demo) {
            System.out.println(s);// ccc001thread_extends.java
            // 这里才相当于去得到file路径下的所有文件内容

        }
        show1(x);
        /*
         * 以下是源码说明：
         * 返回一个字符串数组，命名此抽象路径名表示的目录中的文件和目录。
         * 如果此抽象路径名不表示目录，则此方法返回 null。
         * 否则返回一个字符串数组，一个对应于目录中的每个文件或目录。
         * 结果中不包括表示目录本身和目录父目录的名称。每个字符串都是一个文件名，而不是一个完整的路径。
         * 无法保证结果数组中的名称字符串会以任何特定顺序出现；特别是，它们不能保证按字母顺序出现。
         * 请注意，java.nio.file.Files 类定义了 newDirectoryStream 方法来打开目录并遍历目录中文件的名称。
         * 在处理非常大的目录时，这可能会使用更少的资源，并且在处理远程目录时可能会更敏感。
         * */
    }

    public static void show1(File x) {
        File[] demo_path = x.listFiles();
        // 把路径下，所有文件设置为file对象，存到一个数组当中
        for (File file : demo_path) {
            // 遍历得到的是数组中所有文件
            System.out.println(file);
            // C:\Users\1\Documents\GitHub\st-java.github.io\src\c2stage_20220410\ccc119file_traversal\ccc001thread_extends.java
            // 得到的是文件的绝对路径，而且会带有文件的后缀
            // 如果是文件夹，就不会有后缀名称
            // 但是这里全部都是一级文件/文件夹，内部的内容不会返回
        }
        // 如果调用者不是文件夹，那么，数组只能返回null，并且长度为0
    }
}
