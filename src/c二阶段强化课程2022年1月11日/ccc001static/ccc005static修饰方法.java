package c二阶段强化课程2022年1月11日.ccc001static;

public class ccc005static修饰方法 {
    /**
     * 这里主要测试static的范围
     */
    public static int agej = 10;
    public static String xj = "yyyy";
    public int age = 20;
    public String x = "xxxx";
    //ccc017range xx=new ccc017range();

    public static void show1j() {
        System.out.println("11111111111111");
    }

    public static void show3j() {
        //静态方法只能访问静态方法，main方法是静态
        System.out.println("33333333333");
        System.out.println(agej);
        //        System.out.println(age);//动态变量无法访问
        System.out.println(xj);
        //        System.out.println(x);//动态变量无法访问
        show1j();
        //        show2();//动态方法无法访问
        //        show4();//动态方法无法访问
    }

    //动态全部可以访问
    public void show2() {
        System.out.println("2222222222222");
        System.out.println(agej);
        System.out.println(age);
        System.out.println(xj);
        System.out.println(x);
        show1j();
        show3j();
        show4();
    }

    public void show4() {
        System.out.println("444444444444");
    }
}
