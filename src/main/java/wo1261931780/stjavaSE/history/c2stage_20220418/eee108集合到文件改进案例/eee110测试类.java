package c2stage_20220418.eee108集合到文件改进案例;
/*
    需求：
        把ArrayList集合中的学生数据写入到文本文件。要求：每一个学生对象的数据作为文件中的一行数据
        格式：学号,姓名,年龄,居住地	举例：itheima001,林青霞,30,西安

    思路：
        1:定义学生类
        2:创建ArrayList集合
        3:创建学生对象
        4:把学生对象添加到集合中
        5:创建字符缓冲输出流对象
        6:遍历集合，得到每一个学生对象
        7:把学生对象的数据拼接成指定格式的字符串
        8:调用字符缓冲输出流对象的方法写数据
        9:释放资源
 */

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class eee110测试类 {
    public static void main(String[] args) throws IOException {
        ArrayList<eee109对象类> x = addway();

        BufferedWriter xx = new BufferedWriter(new FileWriter("l:\\java\\demo.txt"));
        for (eee109对象类 i : x) {
            String x1 = "学号：" + i.getNum() + "\t姓名：" + i.getName() + "\t年龄：" + i.getAge() + "\t地址：" + i.getAddress();
            xx.write(x1);
            xx.newLine();
            xx.flush();
        }
        xx.close();
        System.out.println("添加完成");
    }

    public static ArrayList<eee109对象类> addway() {
        eee109对象类 x1 = new eee109对象类(111, "aaa", 11, "a1");
        eee109对象类 x2 = new eee109对象类(222, "bbb", 22, "a2");
        eee109对象类 x3 = new eee109对象类(333, "ccc", 33, "a3");
        eee109对象类 x4 = new eee109对象类(444, "ddd", 44, "a4");
        eee109对象类 x5 = new eee109对象类(555, "eee", 55, "a5");
        ArrayList<eee109对象类> x = new ArrayList<>();
        x.add(x1);
        x.add(x2);
        x.add(x3);
        x.add(x4);
        x.add(x5);
        return x;
    }
}
