package ccc034基本类型包装;

public class ccc035demo {
    public static void main(String[] args) {
        //判断数据是否在int范围内
        //public static final int MIN_VALUE
        //持有最小值的常数为 int可以为-2的31次方
        //转换基本数据类型，int到string

        Integer x=new Integer("100");//这里使用的是数字类型的字符串，不能直接用"aaaa"这种
        //因为方法已经过时，被value of替代，所以不推荐使用
        System.out.println(x);
        Integer xx=new Integer(200);
        //同理，这里可以直接输入数字
        System.out.println(xx);
        Integer x1=Integer.valueOf("300");
        //包装x1的int数值
        System.out.println(x1);
        Integer x2=Integer.valueOf("444");
        System.out.println(x2);
//        Integer x3=Integer.valueOf("a");//无法输入字母,也无法数字字母混合
//        System.out.println(x3);
    }


}
