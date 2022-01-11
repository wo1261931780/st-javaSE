package ab往期学习2021年10月2日.bbb028Stringuild相关;

import java.util.Scanner;

public class bbb035字符串反转plus {
    public static void main(String[] args) {
        Scanner xx = new Scanner(System.in);
        System.out.println("请输入字符串：");
        String x2 = xx.nextLine();
        String z = fz(x2);
        //接收结果一定要有，不然无法执行后面的sout语句。
        System.out.println(z);
    }

    public static String fz(String x) {
        //        StringBuilder x1=new StringBuilder(x);
        //        x1.reverse();
        //        x=x1.toString();
        //        return x;
        //下面是函数式编程
        return new StringBuilder(x).reverse().toString();
        // 这里用new StringBuilder(x)其实也是造了一个对象，
        // 因为对象没有名字，所以称为匿名对象
        // 同时，即使是匿名对象，也可以对其使用方法
        // 为什么一定要将stringbuilder转化为string类型？2021年9月18日15:42:21

    }
}
