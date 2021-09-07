package aaa000helloworld;

public class aaa002demo {
    public static void main(String[] args) {
        //        算数运算符
        int a = 14;
        int b = 5;
        System.out.print("加法：");
        System.out.println(a + b);
        System.out.println("有字符串，加号变连接号：" + a + b);
        System.out.println("-------------------------------");
        System.out.print("减法：");
        System.out.println(a - b);
        //        System.out.println("有字符串，就会变成连接号：" + a + b);
        System.out.println("-------------------------------");
        System.out.print("乘法：");
        System.out.println(a * b);
        System.out.println("有字符串，乘法不变：" + a * b);
        System.out.println("-------------------------------");
        System.out.print("除法：");
        System.out.println(a / b);
        System.out.println("有字符串，除法不变：" + a / b);
        System.out.println("除法得到商=2，取余得到余数=0");
        //除法的计算，不会出现四舍五入的情况，2021年9月7日14:35:29
        System.out.println("-------------------------------");
        System.out.print("取余：");
        System.out.println(a % b);
        System.out.println("有字符串，取余不变：" + a % b);
        //        整数相除，只有整数结果，要想得到小数，必须有小数存在
        //        反过来说，结果中有小数，那么中间一定有小数存在
        System.out.println(6.0 / 5);
    }
}
