package abc往期学习2021年10月2日.bbb015this构造方法封装;

public class bbb016构造方法 {
    public static void main(String[] args) {
        // 不同于show()和demo()，bbb015()也是一种方法
        //其实bbb015也是一种方法，称为构造方法。
        bbb015this x = new bbb015this();
        x.setName("junw");
        x.setAge(11);
        x.show();
        // 这里，x调用的show和set方法，所以在方法内，this指代的就是x的内存地址
        // 谁调用方法，就使用谁的地址
    }
}
