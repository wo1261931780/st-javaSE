package ab往期学习2021年10月2日.aaa001初期学习集合;

public class aaa023e方法重载的练习 {
    public static void main(String[] args) {
        show();
        System.out.println("*****");
        show(10);
        System.out.println("*****");
        show(10, "ooo");
        System.out.println("*****");

    }

    // 方法重载，可以在方法体中相互调用

    public static void show() {
        // System.out.println("method1");
        show(1);
        // 这里的意思是，
        // 在我没有设置任何参数的情况下，show方法默认展示数字1
        // 然后，在我需要设置展示数据的时候，就填入具体数据
    }

    public static void show(int x) {
        System.out.println("method1" + x);
    }

    public static void show(int x, String xx) {
        System.out.println("method1" + x + xx);
    }

    // ************************************************
    // 新方法
    public static void open() {
    }

    // 重载方法
    public static void open(int a) {
    }

    // 重载方法
    static void open(int a, int b) {
    }

    // 重载方法
    public static void open(double a, int b) {
    }

    // 重载方法，会区分变量的前后顺序
    // 举例：二肽
    public static void open(int a, double b) {
    }

    // 重复方法，static关键字可以不写
    // public void open(int i, double d) { }

    // 新方法,java是区分大小写的
    public static void open2() {
    }

    // ************************************************
}
