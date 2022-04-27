package c2stage_20220412.ccc125charset;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:c2stage_20220412.ccc125
 * User:  wo1261931780@gmail.com
 * Time:  2022-04-22-15  星期二
 */
public class ccc001 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String x = "123测试";
        byte[] demo = x.getBytes();
        System.out.println(demo.length);//按照当前默认字符集，进行编码
        System.out.println(Arrays.toString(demo));
        // [49, 50, 51, -26, -75, -117, -24, -81, -107]
        // 这里前面三个的就是123，换句话说，英文和数字都是正数
        // 因为是GBK格式编码，-26, -75这两个表示一个中文字，后面以此类推
        byte[] DEMO2 = x.getBytes(StandardCharsets.UTF_8);// 这里就是编译异常，避免手写错误
        System.out.println(DEMO2.length);// 输出字符串长度
        System.out.println(Arrays.toString(DEMO2));// 这里，我指定的字符串 被统一编译为项目的GBK编码格式

        String x2 = new String(DEMO2);// 这里，如果修改字符集以后，字符串会乱码
        System.out.println(DEMO2);


    }
}
