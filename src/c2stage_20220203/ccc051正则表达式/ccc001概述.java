package c2stage_20220203.ccc051正则表达式;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:c2stage_20220203.ccc051正则表达式
 * User:  wo1261931780@gmail.com
 * Time:  2022-02-13-23  星期日
 */
public class ccc001概述 {
    public static void main(String[] args) {
        // String xx;
        System.out.println(show("123"));
        System.out.println(show("000000000"));
        System.out.println(show("a"));
        System.out.println(show("333"));
    }

    public static boolean show(String x) {
        if (x == null || x.length() < 6 || x.length() > 20) {
            return false;
        }
        //判断长度是否符合要求
        for (int i = 0; i < x.length(); i++) {
            if (x.charAt(i) < '0' || x.charAt(i) > '9') {
                return false;
            }
        }//判断字符是否全部整数
        return true;
    }

    public static boolean check(String x) {
        return x != null && x.matches("\\d{6,20}");
        //这里说明\\d的含义
        //首先，一个反斜杠表示转义符，转换意义
        //本身\d就表示全部是数字，但是java会认为“\d”是一个字符，
        //所以需要\\d来说明后面一个\d是一个整体
        // {6,20}表示最少6位，最多20位

    }
}
