package wo1261931780.stjavaSE.history.c2stage_20220502.ccc178definition;

/**
 * Created by Intellij IDEA.
 * Project:st-java.github.io
 * Package:c2stage_20220502.ccc178definition
 * User:  wo1261931780@gmail.com
 * Time:  2022-05-19-19  星期一
 */
@ccc001(name = "aa", authors = {"123", "12"}, price = 12.22)
public class ccc002 {
    @ccc001(name = "aa", authors = {"123", "12"}, price = 12.22)
    private int age;
    public ccc002() {
    }
    @ccc001(name = "aa", authors = {"123", "12"}, price = 12.22)
    public static void show() {
    }

    @ccc003(price = 123.33)// 单个属性的注解可以省略变量
    // 如果两个变量，有一个有默认值，也只需要写一个注解
    private int prices;
}
