package ab_history_20211002.bbb010学生类和方法;

public class bbb014多个对象指向相同 {
    public static void main(String[] args) {
        bbb011学生类 x = new bbb011学生类();
        x.name = "11";
        System.out.println(x.name);
        bbb011学生类 xx = x;
        // 这里新建了一个对象，把x的对象地址赋值给了xx，
        // 最终x和xx的指向相同
        // 这里对xx对象的修改，也会导致x的变量变化

        xx.name = "22";
        System.out.println(xx.name);
        System.out.println(x.name);

        // 垃圾回收器
        // x=null;
        // 这里清除了x对象的指向

    }
    // public static  void
}
