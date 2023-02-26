package ab_history_20211002.bbb012构造器和this;

public class bbb002this {
    public static void main(String[] args) {
        bbb001构造器 x = new bbb001构造器("bc", 80);
        // 这里的差别在于，bc是一开始构造对象的时候传递过去的变量
        x.race("bm");
        // 这里的bm是调用方法的时候传递的对象

        // 构造对象的时候，使用的是堆内存中的地址
        // 调用方法的时候，使用的是栈内存中的地址

    }
}
