package ccc030匿名内部类;

public class demo1 {
    public static void main(String[] args) {
        int x = 4;
        System.out.println(x++);
        // 这个主类是一个测试
        // 测试语法，上面输出的是4
        System.out.println(x);
        // 这里输出的是5
        // 上面x++，实际上是先输出x，然后执行++操作
    }
}
