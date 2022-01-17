package c2stage_20220113.ccc016final;

public class ccc016demo {
    public static void main(String[] args) {
        ccc014fu f = new ccc014fu();
        ccc015zi z = new ccc015zi();
        f.way();
        System.out.println("-------------------------");
        z.way();
        // surprise mother fucker
        // 这就是摆烂的代价，三天没写代码，我是废物
        // 有的类是标准类，允许继承会出现父类的存在被淡化的情况
        // 因为子类更加强大，人们会更加广泛地使用子类
        // 在部分不允许修改的极端情况，比如π的数据是固定的，不允许外界修改，所以会用到final
    }

    public static final String demo11 = "11";
    // 这里需要注意final关键字的使用位置
    // 修饰一个静态成员变量，且数值不能更改的时候，就在这里使用final

    // 上面的这种赋值方法，被称为定义常量
// 常量有几种定义方法，
// 上面的是第一种
// 还有一种，
    public static final String demo22;

    static {
        demo22 = "22";
    }
    // 这种定义方式是使用静态代码块，因为静态代码块先于main方法被加载
    // 所以赋值依旧完成

    // 一般都不会用来修改实例成员变量，
// 因为实例成员变量，因为实例而存在，换句话说，所有的实例，都可能用同样的name
// 这种情况下，设定常量，意义不大
}
