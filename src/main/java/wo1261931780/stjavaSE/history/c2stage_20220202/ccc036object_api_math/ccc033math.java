package c2stage_20220202.ccc036object_api_math;
//public static int abs?(int a)：返回参数的绝对值

//public static double ceil?(double a)：返回大于或等于参数的最小double值，等于一个整数

//public static double floor?(double a)：返回小于或等于参数的最大double值，等于一个整数

//public static int round?(float a)：按照四舍五入返回最接近参数的int

//public static int max?(int a,int b)：返回两个int值中的较大值

//public static int min?(int a,int b)：返回两个int值中的较小值(自学)

//public static double pow?(double a,double b)：返回a的b次幂的值

//public static double random?()：返回值为double的正值，[0.0,1.0)

/**
 目标：Math类的使用。
 Math用于做数学运算。
 Math类中的方法全部是静态方法，直接用类名调用即可。
 方法：
 方法名                                          说明
 public static int abs(int a)                   获取参数a的绝对值：
 public static double ceil(double a)            向上取整
 public static double floor(double a)           向下取整
 public static double pow(double a, double b)   获取a的b次幂
 public static long round(double a)             四舍五入取整
 小结：
 记住。
 */

public class ccc033math {
    public static void main(String[] args) {
        //12，返回绝对值
        System.out.println(Math.abs(12));
        System.out.println(Math.abs(-12));
        System.out.println("----");
        //13，返回》=x
        System.out.println(Math.ceil(12.1));
        //-12返回《=x
        System.out.println(Math.ceil(-12.1));
        System.out.println("----");
        //12，返回《=x
        System.out.println(Math.floor(12.1));
        //-13，返回《=x
        System.out.println(Math.floor(-12.1));
        System.out.println("----");
        //12.0，四舍五入
        System.out.println(Math.round(12.1));
        //-13.0，四舍五入
        System.out.println(Math.round(-12.1));
        //-13，F表示是float类型
        System.out.println(Math.round(-12.1F));
        System.out.println("----");
        //12.2，较大值
        System.out.println(Math.max(12.1, 12.2));
        //12.1，较小值
        System.out.println(Math.min(12.1, 12.2));
        System.out.println("----");
        //8，返回2的3次方
        System.out.println(Math.pow(2, 3));
        System.out.println("----");
        //[0.0-1.0)之间的随机数,可以0.0，不可以1.0
        System.out.println(Math.random());
        //取整
        System.out.println((int) (Math.random() * 100));
        //System.out.println(Math.abs(-55));

        // 现在要3-9的随机数：
        // 首先-3，就得到0-6的随机数
        // 但是直接random是左闭右开
        // Math.random()*7;得到一个0-7的左闭右开
        // 为了得到0-6，需要int类型，所以进行一次强转
        // (int) Math.random()*7
        // 现在就能得到0-6
        // int i = (int) Math.random() * 7 + 3;
        // i就是3-9
    }

}
