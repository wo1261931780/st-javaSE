package bbb010学生类和方法;

public class bbb012学生测试类 {
    public static void main(String[] args) {
        //创建对象，格式是类+对象名称=在类中new一个新的对象。
    bbb011学生类 x=new bbb011学生类();
    //这里必须是类中的对象，只有类中的对象才能使用类中的方法。
        //创建x相当于，把类中的地址发给了x，这样使用的时候x就可以直接访问到类中的堆内存的值。
        System.out.println(x);//结果是：“bbb010.bbb011学生类@7ef20235”
        //解释一下结果，bbb010是包的名称，bbb011是类的名称，后面的@7ef20235是堆内存的地址
//        所以我创建对象x，相当于告诉x我的地址在哪里。这样x就能直接访问内存值。
    //使用对象
        System.out.println(x.name+"--"+x.age);//对象名称x，加上后缀的变量名称name。
        x.age=300;
        x.name="sss";
        System.out.println(x.name+"--"+x.age);
        x.dos();//使用方法，就是对象x，后面加上方法名称dos，而dos已经在类中定义过了
        //定义dos的格式就是public void dos（）{
        //sout......
        // }
        x.study();//对象x，使用类bbb011中的方法study，
        //在study执行后，先进入栈内存，执行结束后，从栈内存消失。

        //我们可以把类，理解成集中提供变量和方法的地方，
        //我们在测试中，创建对象，然后让对象使用类中的方法。
        bbb011学生类 z=new bbb011学生类();
        System.out.println(z);//bbb010.bbb011学生类@34c45dca
        //这里我们可以看到，对象不同，对应的地址也是不同的
        System.out.println(z.name+"****"+z.age);
        //同时，这里的变量因为新的地址，会回到默认值
        //变量会变化，但是方法不变，可以多个对象同时调用。





    }

}
