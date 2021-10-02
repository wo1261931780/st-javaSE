package abc往期学习2021年10月2日.aaa000helloworld;

public class aaa005demo {
    public static void main(String[] args) {
        //关系运算符，2021年9月3日17:46:22
        int x1 = 10;
        int x2 = 20;
        System.out.println(x2 = x1);//输出结果为10，相当于赋值x1给x2，最终输出x2

        //逻辑运算符
        //一共四种，与/或/异或/非

        //短路逻辑运算符，短路与&&，短路或||
        //定义变量
        int i = 10;
        int j = 20;
        int k = 30;
        //&& 有false则false
        //        有一个短路（为false），则不通（输出false）
        System.out.println((i > j) && (i > k)); //false && false
        //----------------------------------------------------
        //短路和false在前面还是后面，没关系
        System.out.println((i < j) && (i > k)); //true && false
        System.out.println((i > j) && (i < k)); //false && true
        //----------------------------------------------------
        System.out.println((i < j) && (i < k)); //true && true
        System.out.println("上面是短路与--------");

        //|| 有true则true
        //        两条路，只要有一条是通路即可到达目的地，输出true
        System.out.println((i > j) || (i > k)); //false || false
        //----------------------------------------------------
        System.out.println((i < j) || (i > k)); //true || false
        System.out.println((i > j) || (i < k)); //false || true
        //----------------------------------------------------
        System.out.println((i < j) || (i < k)); //true || true
        System.out.println("短路或--------");
        //----------------------------------------------------
        //----------------------------------------------------
        //&&和&
        //System.out.println((i++ > 100) & (j++ > 100)); //false & false
        //        如果执行上面的语句，那么i输出为11，j输出为21
        System.out.println((i++ > 100) && (j++ > 100)); //false && false
        //        执行上面的语句，i输出为11，j为20
        //短路与，执行的时候，只要出现false，就会直接停止，不输出后面的代码
        System.out.println("i:" + i);
        System.out.println("j:" + j);
    }
}
