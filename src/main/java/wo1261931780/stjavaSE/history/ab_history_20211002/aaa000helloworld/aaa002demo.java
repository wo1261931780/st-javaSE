package ab_history_20211002.aaa000helloworld;

public class aaa002demo {
    public static void main(String[] args) {
        // 2021年12月15日17:40:09，补充学习
        // 目标：掌握基本的算术算术运算符的使用：+ - * / %
        int aaa = 10;
        int bbb = 3;
        System.out.println(aaa + bbb);
        System.out.println(aaa - bbb);
        System.out.println(aaa * bbb);
        System.out.println(aaa / bbb); // 3.3333  ==>  3
        System.out.println(aaa * 1.0 / bbb); // 3.3333
        System.out.println(3 / 2);
        System.out.println(3 * 1.0 / 2); // 1.5，这里必须先进行类型的转换
        System.out.println(3  / 2 * 1.0); // 1.0
        // 这里优先计算的是3/2，所以得到1，小数部分已经丢失，1*1.0只能得到1.0
        System.out.println(aaa % bbb); // 1

        // 目标：+符号做连接符的识别
        int a = 5 ;
        System.out.println("abc" + 'a'); // abca
        System.out.println("abc" + a);   // abc5
        System.out.println(5 + a); // 10
        System.out.println("abc" + 5 + 'a'); // abc5a
        System.out.println(15 + "abc" + 15); // 15abc15
        System.out.println(a + 'a'); // 102
        System.out.println(a + "" +'a'); // 5a
        System.out.println(a + 'a'+" itheima "); // 102 itheima
        System.out.println("itheima"+ a + 'a'); // itheima5a
        System.out.println("itheima"+ ( a + 'a' ));// itheima102
        // 算数运算符
        int asdqwe = 14;
        int b = 5;
        System.out.print("加法：");
        System.out.println(asdqwe + b);//19
        System.out.println("有字符串，加号变连接号：" + asdqwe + b);//145
        System.out.println("-------------------------------");
        System.out.print("减法：");
        System.out.println(asdqwe - b);
        // System.out.println("有字符串，就会变成连接号：" + a + b);
        System.out.println("-------------------------------");
        System.out.print("乘法：");
        System.out.println(asdqwe * b);
        System.out.println("有字符串，乘法不变：" + asdqwe * b);
        System.out.println("-------------------------------");
        System.out.print("除法：");
        System.out.println(asdqwe / b);
        System.out.println("有字符串，除法不变：" + asdqwe / b);
        System.out.println("除法得到商=2，取余得到余数=0");
        // 除法的计算，不会出现四舍五入的情况，2021年9月7日14:35:29
        System.out.println("-------------------------------");
        System.out.print("取余：");
        System.out.println(asdqwe % b);
        System.out.println("有字符串，取余不变：" + asdqwe % b);
        // 整数相除，只有整数结果，要想得到小数，必须有小数存在
        // 反过来说，结果中有小数，那么中间一定有小数存在
        System.out.println(6.0 / 5);
    }
}
