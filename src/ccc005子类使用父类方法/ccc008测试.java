package ccc005子类使用父类方法;

public class ccc008测试 {
    public static void main(String[] args) {
        ccc007zi x1 = new ccc007zi();
        x1.zizi();
        //可以直接使用父类的方法，但是会先使用子类的
        x1.show();
    }
}
