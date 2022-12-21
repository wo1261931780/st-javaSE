package ab_history_20211002.bbb017默认类和对象;

public class bbb019测试 {
    public static void main(String[] args) {
        //如果没有给出构造方法，自动出现一个默认构造方法
        bbb018 x = new bbb018();
        x.show();
        bbb018 x1 = new bbb018("123", 33);
        //带参构造方法，可以得到直接指定具体参数的对象。
        x1.show();
    }
}
