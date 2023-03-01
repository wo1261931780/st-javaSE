package wo1261931780.stjavaSE.history.c2stage_20220405.ccc114IO;

import java.io.File;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:c2stage_20220405.ccc114IO
 * User:  wo1261931780@gmail.com
 * Time:  2022-04-19-29  星期二
 */
public class ccc001 {
    public static void main(String[] args) {
        File x = new File("C:\\Users\\1\\Desktop\\FPgPobEVQAMPGbF.jpg");
        // 双反斜杠，还是为了作为转义符
        // 如果\n单独出现，系统会认为是换行，但是在文件的命名中，该情况不可避免
        // 双反斜杠就产生了提示作用
        long demo = x.length();
        // 由此可以看出，对file类型的对象，获取长度，只会得到long类型的数据
        // 而long类型的数据，代表的就是x文件的字节个数
        // File x = new File("C:/Users/1/Desktop/FPgPobEVQAMPGbF.jpg");
        // 其实这里也可以直接用正斜杠表示层级，因为不会冲突，所以也不需要转义符存在
        // 但是正斜杠会导致文件读取的错误，开发过程如果用这种命名，需要避免文件的名称带有
        File x1 = new File("C:/Users" + File.separator + "1/Desktop/FPgPobEVQAMPGbF.jpg");
        // 这种分割方式的好处在于跨平台
        // 用api代替字符，能在不同平台上自动代表不同的形式，避免出问题
        show();
    }

    public static void show() {
        // 支持绝对路径和相对路径
        File x = new File("st-java.github.io/src/c2stage_20220405/ccc114IO/ccc038demo.txt");
        System.out.println(x.length());//0
        // 相对路径必须在一个项目下
        // 如果file的结果是一个文件夹，那么结果也是0，因为文件夹的大小没有意义
        // 要获取文件夹的大小，必须要遍历文件夹中的所有文件，才能获得文件大小的总和
        System.out.println(x.exists());// 判断路径下的文件夹是否存在
        // file的对象/路径，存不存在都可以，
        // 如果不存在，后面也可以通过创建目录的方式创建出对应路径
    }
}
