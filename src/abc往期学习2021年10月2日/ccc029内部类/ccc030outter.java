package abc往期学习2021年10月2日.ccc029内部类;

public class ccc030outter {
    private int age = 10;

    /**
     * 外部的方法，访问同个类中，该类内部的方法，必须先创建对象
     */
    public void see() {
        innn x = new innn();
        x.show();
    }

    /**
     * 内部类
     */
    public class innn {
        //内部类的含义是，类的中间，再创建一个类，
        //结果内部创建的类，可以直接使用类原本的变量和方法
        // 比如我innn类，是一个内部类，
        // innn中间的对象，可以访问外部的age变量，同时给出展示
        //内部类可以直接访问外部的age成员
        public void show() {
            System.out.println(age);
        }
    }
}
