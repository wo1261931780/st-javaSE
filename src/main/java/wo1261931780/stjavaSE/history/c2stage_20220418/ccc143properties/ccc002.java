package c2stage_20220418.ccc143properties;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:c2stage_20220418.ccc143properties
 * User:  wo1261931780@gmail.com
 * Time:  2022-04-21-48  星期二
 */
public class ccc002 {
    public static void main(String[] args) throws IOException {
        Properties x = new Properties();// 首先新建一个配置文件对象
        System.out.println(x);// 直接输出，对象内部没有得到相关信息，所以是空的
        x.load(new FileReader("src/c2stage_20220418/ccc143properties/ccc001.properties"));
        // 使用fileread以后，载入相关资源，得到内部的信息
        System.out.println(x);// 然后展示，就能看到结果
        String demo = x.getProperty("ceshi");// 获取指定的键，将值存到一个字符串中
        System.out.println(demo);//输出，得到结果
        String demo2 = x.getProperty("222");
        System.out.println(demo2);// 没有对应键，就是null
    }
}
