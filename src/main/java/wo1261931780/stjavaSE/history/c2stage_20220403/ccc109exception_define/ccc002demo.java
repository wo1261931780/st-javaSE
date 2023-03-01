package wo1261931780.stjavaSE.history.c2stage_20220403.ccc109exception_define;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:c2stage_20220403.ccc109exception_define
 * User:  wo1261931780@gmail.com
 * Time:  2022-04-13-38  星期一
 */
public class ccc002demo {
    public static void main(String[] args) {
        try {
            show(-55);
        } catch (ccc001exception e) {
            e.printStackTrace();
        }
        //trycatch环绕和添加到方法签名，好像二者选择一个就可以
    }

    public static void show(int age) throws ccc001exception {
        if (age < 0 || age > 200) {
            // throw和throws的差别
            // throw是异常对象，我新建一个异常，就是throw对象
            // throws是方法申明中的异常
            throw new ccc001exception(age + "illegal");
            // 因为是编译时异常，只要写出来就会报错
        }
    }
}
