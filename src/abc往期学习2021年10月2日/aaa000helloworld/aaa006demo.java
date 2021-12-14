package abc往期学习2021年10月2日.aaa000helloworld;

public class aaa006demo {
    public static void main(String[] args) {
        System.out.println("123");
        System.out.println("123");
        System.out.println("123");
        System.out.println("123");
        System.out.println("123");
        // 直接使用ctrl+d多次复制即可
        System.out.println("demoshow");
        // "demoshow".sout
        // 这样也可以快速生成打印代码


        // 目标：识别定义变量常见的问题，并注意
        // 1、什么类型的变量一定是存放什么类型的数据
        int age = 21;

        // 2、同一个范围内不能定义重名的变量
        // int age = 25;
        age = 25; // 这里是赋值不是定义，所以没毛病！！

        // 3、变量定义的时候可以不给初始化值，但是使用的时候必须有初始化值。
        double money ;
        money = 10000;
        System.out.println(money);

        {
            int number = 90;
            System.out.println(number);
        }
        // System.out.println(number); 报错！
        System.out.println(age);
        // ************************************************
        // ************************************************
        // ************************************************
        char x='a';
        System.out.println(x);// a
        System.out.println(x+1);// 98
        // java中可以直接写二进制的数据，但是前面必须加上对应的前缀、
        int x1=0b1111;//二进制开头，相当于输入二进制的数字“1111”
        System.out.println(x1);//结果15，二进制转化为十进制数字进行输出
        int x2=0131;//八进制0开头，输入八进制的数字131
        System.out.println(x2);//结果89，八进制转化为二进制，然后转化为十进制输出
        int x3=0x123;//16进制0x开头，输入16进制数字123，
        System.out.println(x3);//结果291，十六进制转化为2进制，然后转化为十进制输出




    }
}
