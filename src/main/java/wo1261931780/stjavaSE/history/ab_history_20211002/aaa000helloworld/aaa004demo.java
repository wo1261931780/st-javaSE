package wo1261931780.stjavaSE.history.ab_history_20211002.aaa000helloworld;

public class aaa004demo {
    public static void main(String[] args) {
        // 赋值运算符
        int b = 10;
        //运算符+=已经包含了类型转化过程
        b += 10;
        System.out.println("b的数据为：" + b);

        //自增自减，i++和i--。
        //i++和++i的作用完全一致。
        //需要注意的是--------------------------------
        int x = 1;
        //这里执行的命令是，先把x=1赋值给x1，然后对x进行++操作，
        int x1 = x++;
        //所以x=2，x1=1
        //输出为1
        System.out.println(x1);
        //输出为2
        System.out.println(x);
        System.out.println("--------------------------------------");
        int x2 = ++x;
        //输出结果为3,因为x的值是2，首先加和，x=3，
        System.out.println(x2);
        //然后将x=3，赋值给x2，所以x2=3

        // 2021年12月15日18:17:00，补充学习
        System.out.println("-----------拓展案例（可以了解和参考）--------------");
        int k = 3;
        int p = 5;
        // k  3 4 5 4
        // p  5 4 3 4
        // rs    3  +  5  -   4  + 4   - 5   +  4 + 2
        int rs = k++ + ++k - --p + p-- - k-- + ++p + 2;
        // 运算过程中，x++，就按照x的初试数据放入过程，否则就放入x增加以后的数据
        System.out.println(k); // 4
        System.out.println(p); // 4
        System.out.println(rs); // 9
    }
}
