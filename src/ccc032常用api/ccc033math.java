package ccc032常用api;

public class ccc033math {
    public static void main(String[] args) {
        System.out.println(Math.abs(12));//12，返回绝对值
        System.out.println(Math.abs(-12));
        System.out.println("----");
        System.out.println(Math.ceil(12.1));//13，返回》=x
        System.out.println(Math.ceil(-12.1));//-12返回《=x
        System.out.println("----");
        System.out.println(Math.floor(12.1));//12，返回《=x
        System.out.println(Math.floor(-12.1));//-13，返回《=x
        System.out.println("----");
        System.out.println(Math.round(12.1));//12.0，四舍五入
        System.out.println(Math.round(-12.1));//-13.0，四舍五入
        System.out.println(Math.round(-12.1F));//-13，F表示是float类型
        System.out.println("----");
        System.out.println(Math.max(12.1,12.2));//12.2，较大值
        System.out.println(Math.min(12.1,12.2));//12.1，较小值
        System.out.println("----");
        System.out.println(Math.pow(2,3));//8，返回2的3次方
        System.out.println("----");
        System.out.println(Math.random());//[0.0-1.0)之间的随机数,可以0.0，不可以1.0
        System.out.println((int)(Math.random()*100));//取整
//        System.out.println(Math.abs(-55));
    }
}
