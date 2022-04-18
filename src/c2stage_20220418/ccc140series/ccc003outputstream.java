package c2stage_20220418.ccc140series;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:c2stage_20220418.ccc140series
 * User:  wo1261931780@gmail.com
 * Time:  2022-04-22-02  星期一
 */
public class ccc003outputstream {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream x = new ObjectInputStream(new FileInputStream("src/c2stage_20220418/ccc140series/ccc002rundemo.txt"));
        ccc001object demo = (ccc001object) x.readObject();// 这里java为了避免强制类型转换，即使我们做了强转，也会给出提醒
        // 所以需要抛出异常
        x.close();// 资源关闭的先后，对反序列化没有太大的影响
        System.out.println(demo);// ccc001object{name='a1', age=11, address='null'}
        // 这里必须保持路径的一致，否则容易报错
    }
}
