package c2stage_20220410.ccc117creat;
/*
    File类创建功能：
        public boolean createNewFile()：当具有该名称的文件不存在时，创建一个由该抽象路径名命名的新空文件
            如果文件不存在，就创建文件，并返回true
            如果文件存在，就不创建文件，并返回false

        public boolean mkdir()：创建由此抽象路径名命名的目录
            如果目录不存在，就创建目录，并返回true
            如果目录存在，就不创建目录，并返回false

        public boolean mkdirs()：创建由此抽象路径名命名的目录，包括任何必需但不存在的父目录
            自己补齐
 */

import java.io.File;
import java.io.IOException;

public class eee047file创建命令 {
    public static void main(String[] args) throws IOException {
        // creat是针对对象创建的
        // mkdir是针对目录创建的
        // mkdirs强制创建对象和路径
        File x = new File("l:\\java\\demo2.txt");
        // 这里硬盘符的大小写没有影响，但是必须要有java文件夹存在，否则无法创建
        // 如果在有同名文件存在的情况下，
        // 创建命令会失败
        System.out.println(x.createNewFile());
        // 这里的file命令，保存的是逻辑目录，
        // 意思是，我可以用x来替代实际的目录，同时做目录的创建工作
        // 将目录理解为一个变量
        // ------------------------------------------------------------------
        File x1 = new File("l:\\java\\ccc038demo");
        System.out.println(x1.mkdir());
        // 同样返回true/false，表示目录创建成功
        // 目录已经存在，就会创建失败，
        // 同时，这里只支持创建单级目录，我有java文件夹的情况，才能创建demo目录
        // ------------------------------------------------------------------
        File x2 = new File("l:\\java\\test\\ff");
        System.out.println(x2.mkdirs());
        // 这里是强行创建目录，只要盘符存在，就可以创建成功
        // ------------------------------------------------------------------
        File x3 = new File("l:\\java\\show\\qx.txt");
        // System.out.println(x3.mkdir());
        // 执行错误命令，最终只会得到文件夹，不会得到文件
        System.out.println(x3.createNewFile());
    }

}
