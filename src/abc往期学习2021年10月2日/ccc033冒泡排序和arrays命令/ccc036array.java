package abc往期学习2021年10月2日.ccc033冒泡排序和arrays命令;

import java.util.Arrays;

public class ccc036array {
    public static void main(String[] args) {
        // array主要是各种操作数组的方法
        // 说人话就是，
        // 对于数组，想要做排序，展示等操作，直接用arrays就可以
        int[] xx = {16, 54, 321, 4, 561, 65, 45, 136, 4};
        System.out.println(Arrays.toString(xx));
        // sout(xx)直接展示，只会出现数组地址
        // tostring用字符串的形式返回数组的内容
        Arrays.sort(xx);
        // sort将数组按照数字顺序排列
        // 排序后，原数组地址不变，只有顺序发生变化
        System.out.println(Arrays.toString(xx));
        // math和arrays这种工具类，后台(源码)用private修饰，防止外界创建对象
        // 成员用public static 修饰，使用类名来访问成员方法
    }
}
