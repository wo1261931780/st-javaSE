package ab往期学习2021年10月2日.bbb020输入学校人数;

public class bbb020string字符串的几种构造方式 {
    public static void main(String[] args) {
        char[] chars = {'a', 'b', 'c'};
        String x = new String(chars);
        String y = new String(chars);
        // 通过new的方式新建的字符串，都能得到一个新的地址
        // 最终比较的时候，==会比较地址，结果为false
        // 而equals比较地址对应的内容，结果为true
        System.out.println(x == y);//false
        System.out.println(x.equals(y));//true

        // Strings="abc";
        // 直接赋值的方式创建字符串对象， 内容就是abc
        String x1 = "aaa";
        String x2 = "aaa";

        System.out.println(x1 == x2);//true
        System.out.println(x1.equals(x2));//true
    }
}
