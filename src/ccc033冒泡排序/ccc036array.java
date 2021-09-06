package ccc033冒泡排序;

import java.util.Arrays;

public class ccc036array {
    public static void main(String[] args) {
        //array主要是各种操作数组的方法
        int[] xx = {16, 54, 321, 4, 561, 65, 45, 136, 4};
        Arrays.sort(xx);
        //sort将数组按照数字顺序排列
        System.out.println(Arrays.toString(xx));
        //tostring用字符串的形式返回数组的内容
        //math和arrays这种工具类，后台(源码)用private修饰，防止外界创建对象
        //成员用public static 修饰，使用类名来访问成员方法
    }

}
