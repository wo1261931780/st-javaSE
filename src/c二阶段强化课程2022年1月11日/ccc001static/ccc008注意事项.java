package c二阶段强化课程2022年1月11日.ccc001static;

public class ccc008注意事项 {
    public static String name1;
    String name2;

    public static void show1() {
        System.out.println(name1);
        // System.out.println(name2);//直接报错，静态方法不能直接访问成员变量

        ccc008注意事项 x = new ccc008注意事项();
        System.out.println(x.name2);//只能先创建一个对象，通过间接的方式访问name

        show2();//静态方法可以访问静态方法
        // show3();//静态方法不能直接访问实例方法
        // System.out.println(this);//同样的，不能直接访问this，因为this指向的就是对象

    }

    public static void show2() {
        System.out.println("我是show2");

    }

    public void show3() {

    }


}
