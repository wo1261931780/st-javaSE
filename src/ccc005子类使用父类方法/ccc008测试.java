package ccc005子类使用父类方法;

public class ccc008测试 {
    public static void main(String[] args) {
        ccc007zi x1 = new ccc007zi();
        x1.zizi();
        //可以直接使用父类的方法，如果方法同名，会优先使用子类的方法
        x1.show();
        // super方法必须要在子类中/继承了父类的类中，调用才会生效
        // super.show();

    }
}
