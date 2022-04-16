package c2stage_20220416.ccc131file_output_stream2;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class eee079编码格式 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String x = "abc";
        // 设置一个字符
        byte[] x1 = x.getBytes();
        // 将字符串转化为字节数组
        System.out.println(Arrays.toString(x1));
        // 数组把字节转化为string类型
        // 结果：
        // [97, 98, 99]
        // -----------------------------------------------------
        System.out.println("--------------");
        String xx = "abc测试";
        byte[] xx1 = xx.getBytes();
        System.out.println(Arrays.toString(xx1));
        // 结果为：
        // [97, 98, 99, -78, -30, -54, -44]
        // 这里默认使用的是GBK格式编码，
        // 一个汉字，对应的是两个字节
        // 如果使用UTF-8格式编码，一个汉字对应三个字节
        byte[] xx2 = xx.getBytes("UTF-8");
        System.out.println(Arrays.toString(xx2));
        // 结果为：
        // [97, 98, 99, -26, -75, -117, -24, -81, -107]
        // 对应的编码格式为UTF-8格式
        // 一个汉字字符占用三个字节
        // 汉字的第一个字节都是负数
        // java底层在编码的时候对照编码表做设置

    }
}
