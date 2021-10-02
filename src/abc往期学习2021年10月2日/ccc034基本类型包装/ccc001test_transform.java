package abc往期学习2021年10月2日.ccc034基本类型包装;

public class ccc001test_transform {
    public static void main(String[] args) {
        // 1.int类型转化为string类型
        int x = 111;
        String x1 = String.valueOf(x);
        System.out.println("x1目前是string类型:" + x1);
        // 其实还可以使用String x1 = ""+x;
        // 上面这种方式是通过空字符拼接实现
        // ---------------------------------------
        // ---------------------------------------
        // ---------------------------------------
        // 2.string类型转化为int类型
        String xx = "222";
        int xx1 = Integer.parseInt(xx);
        System.out.println("我是int类型的xx1：" + xx1);
        // 其实还可以先转化为integer，然后转换为int类型的数据来实现
        // Integer xx2=Integer.valueOf(xx);
        // ---------------------------------------
        // ---------------------------------------
        // ---------------------------------------
        // 什么类型的数据，就使用什么方式去转换
        // int类型的，就用integer.parseint转换
        // string类型的，就用string.valueof转换
    }
}
