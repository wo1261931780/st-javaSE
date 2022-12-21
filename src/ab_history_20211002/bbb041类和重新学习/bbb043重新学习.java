package ab_history_20211002.bbb041类和重新学习;

public class bbb043重新学习 {
    public static void main(String[] args) {//测试类都有main方法
        bbb042测试类 x = new bbb042测试类();
        //在类中创建了x作为对象
        x.pay("asd", 456);
        //调用类中的pay方法，并按照格式，对对象x进行了定义。
        //直接给对象x的brand变量进行赋值。
        x.brand = "aaa";
        System.out.println(x.brand);
        // 上面的brand没有加修饰符，默认是public，所以才能从外部访问
        // 对于私有变量id，无法直接使用x.id进行修改
    }
}
