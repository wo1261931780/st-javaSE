package c2stage_20220418.ccc140series;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:c2stage_20220418.ccc140demo
 * User:  wo1261931780@gmail.com
 * Time:  2022-04-21-31  星期一
 */
public class ccc002rundemo {
    public static void main(String[] args) throws IOException {
        System.out.println("---------------------");
        ccc001object x = new ccc001object("a1", 11, "22");
        // 首先新建一个对象
        FileOutputStream demo = new FileOutputStream("src/c2stage_20220418/ccc140series/ccc002rundemo.txt");
        // 然后新建一个输出流
        ObjectOutputStream x1 = new ObjectOutputStream(demo);
        // 对象序列化的前提，是有序列化的输出存在
        x1.writeObject(x);
        x1.close();
        // 序列化的存储，直接打开没有意义，因为本身就是为了调用而存在
        // 但是并不代表这样

    }
}
