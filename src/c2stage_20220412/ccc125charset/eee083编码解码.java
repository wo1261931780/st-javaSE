package c2stage_20220412.ccc125charset;
/*
    编码：
        byte[] getBytes()：使用平台的默认字符集将该 String编码为一系列字节，将结果存储到新的字节数组中
        byte[] getBytes(String charsetName)：使用指定的字符集将该 String编码为一系列字节，将结果存储到新的字节数组中

    解码：
        String(byte[] bytes)：通过使用平台的默认字符集解码指定的字节数组来构造新的 String
        String(byte[] bytes, String charsetName)：通过指定的字符集解码指定的字节数组来构造新的 String
 */

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class eee083编码解码 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        System.out.println("----");
        String x = "aaa测试";
        byte[] x1 = x.getBytes(StandardCharsets.UTF_8);
        // 指定编码格式，
        // 然后将得到的数据存到x1数组中
        System.out.println(Arrays.toString(x1));
        // 将数组解码
        // [97, 97, 97, -26, -75, -117, -24, -81, -107]
        // String x2 = new String(x1);
        // 解码
        String x2 = new String(x1, "GBK");
        // 解码方式出错，结果aaa娴嬭瘯
        System.out.println(x2);
        // aaa测试
    }
}
