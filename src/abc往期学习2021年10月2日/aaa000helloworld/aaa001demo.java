package abc往期学习2021年10月2日.aaa000helloworld;

public class aaa001demo {
    public static void main(String[] args) {
        System.out.println("hellow");
        int a = 10;
        System.out.println(a);
        a = 22;
        System.out.println(a);

        System.out.println("------------------------------");

        //        小范围的变量，可以向右转化为范围更大的变量
        //        这种类型转化属于自动转化
        byte x1 = 1;
        int x2 = x1;
        //        这里，byte向右转化为int类型
        System.out.println(x2);
        System.out.println("------------------------------");
        int x3 = 11;
        System.out.println(x3);
        //        转化后，会按照新的格式进行展示
        float x4 = x3;
        System.out.println(x4);
        double x5 = x3;
        System.out.println(x5);
        System.out.println("------------------------------");
        System.out.println("------------------------------");
        //下面的是强制转化
        //        把范围大的变量，转化为小的变量，比如double到int
        //        int xx1 =88.88;这是正常流程，但是浮点数会报错
        int xx1 = (int) 88.88;
        System.out.println(xx1);
    }
}

