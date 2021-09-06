package ccc036装箱和拆箱;

public class ccc037 {
    public static void main(String[] args) {
        Integer x=100;
        System.out.println(x);
        //这就是自动装箱，把数据从基本类型转换为包装类型
        //Integer就是包装类型
        x+=200;
        System.out.println(x);
        //这里自动执行了装箱和拆箱的过程，
        //具体过程是
        x=x.intValue()+100;
        System.out.println(x);
        //intvalue就是拆箱过程
        if (x==null){//默认进行不为null的判断
            System.out.println("null出现");
        }else {
            System.out.println(x+"---ok");
        }
    }
}
