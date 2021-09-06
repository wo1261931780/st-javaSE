package ccc029内部类;

public class ccc030outter {
    private int age = 10;

    public class innn {//内部类
        //内部类的含义是，类的中间，再创建一个类，
//结果内部创建的类可以直接使用类原本的参数和方法
        public void show() {//内部类可以直接访问外部的age成员
            System.out.println(age);
        }
    }

    public void see() {//外部的方法，访问同个类中，该类内部的方法，必须先创建对象
        innn x = new innn();
        x.show();
    }
}
