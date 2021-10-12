package e二阶段收尾2021年10月10日.eee056遍历目录;
/*
    需求：
        需求：给定一个路径(E:\\itcast)，请通过递归完成遍历该目录下的所有内容，并把所有文件的绝对路径输出在控制台

    思路：
        1:根据给定的路径创建一个File对象
        2:定义一个方法，用于获取给定目录下的所有内容，参数为第1步创建的File对象
        3:获取给定的File目录下所有的文件或者目录的File数组
        4:遍历该File数组，得到每一个File对象
        5:判断该File对象是否是目录
            是：递归调用
            不是：获取绝对路径输出在控制台
        6:调用方法
 */

import java.io.File;

public class eee57遍历 {
    public static void main(String[] args) {
        File x = new File("l:\\java");
        show(x);
        System.out.println("结束");
    }

    public static void show(File x) {
        File[] x1 = x.listFiles();
        // 获取该目录下的所有文件
        // 然后对文件执行遍历，判断文件类型
        // System.out.println(x1);
        if (x1 != null) {
            // 首先判断是否是空集合
            for (File i : x1) {
                if (i.isDirectory()) {
                    show(i);
                    // 递归调用的关键一步
                } else {
                    String x2 = i.getAbsolutePath();
                    System.out.println(x2);
                    // 输出绝对路径
                }
            }
        }
        // return show(x);
        // 保留该命令会导致循环调用，
        // 递归没有出口
    }
}
