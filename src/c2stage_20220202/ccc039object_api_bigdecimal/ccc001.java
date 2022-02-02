package c2stage_20220202.ccc039object_api_bigdecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ccc001 {
    public static void main(String[] args) {
        double x = 0.1;
        double x1 = 0.2;
        BigDecimal x2 = BigDecimal.valueOf(x);
        BigDecimal x3 = BigDecimal.valueOf(x1);
        BigDecimal x4 = x2.multiply(x3);//加减乘除直接使用即可
        // 因为bigdecimal本身就是一个对象，这个对象内部有若干运算方法
        System.out.println("我是x4：" + x4);
        double x5 = x4.doubleValue();//我们计算过程，保证精确性以后，还需要按照double类型传递数据
        System.out.println("我是x5：" + x5);
        System.out.println("***********************************************");
        BigDecimal a1 = new BigDecimal(20);
        BigDecimal a2 = new BigDecimal(3);
        // BigDecimal a3 = a1.divide(a2);//式子20/3=6.6666，永远无法除尽，直接得到会报错

        /**
         参数一：除数 参数二：保留小数位数  参数三：舍入模式
         */
        BigDecimal a3 = a1.divide(a2,2, RoundingMode.HALF_UP);//设置一个保留小数的条件即可
        //**********************a1除a2，保留2位小数，四舍五入的条件
        System.out.println(a3);//这里20/3=6.67，相当于四舍五入
    }
}
