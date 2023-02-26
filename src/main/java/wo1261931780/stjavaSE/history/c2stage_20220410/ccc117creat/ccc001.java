package c2stage_20220410.ccc117creat;

import java.io.File;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:c2stage_20220408.ccc117
 * User:  wo1261931780@gmail.com
 * Time:  2022-04-21-59  星期五
 */
public class ccc001 {
    public static void main(String[] args) {
        File x = new File("C:\\Users\\1\\Documents\\GitHub\\st-java.github.io\\src\\c2stage_20220410\\demo");
        // 首先要创建一个不存在的目录
        x.mkdir();//默认只能创建一级目录
        // 如果输入的目录是多级的，直接返回false
        // 要创建多级目录，调用mkdirs
        x.mkdirs();
    }
}
