package c2stage_20220113.ccc002static修饰成员方法;

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
        //静态成员方法只能访问静态变量和静态方法，main方法是静态
        System.out.println("33333333333");
        System.out.println(agej);
        // System.out.println(age);//实例成员变量无法访问
        System.out.println(xj);
        // System.out.println(x);//实例成员变量无法访问
        show1j();
        // show2();//实例成员方法无法访问
        // show4();//实例成员方法无法访问
    }

    //实例成员可以访问静态方法+实例方法
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
