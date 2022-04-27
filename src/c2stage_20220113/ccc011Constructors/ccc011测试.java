package c2stage_20220113.ccc011Constructors;

public class ccc011测试 {
    public static void main(String[] args) {
        ccc010zi x1 = new ccc010zi();
        //这里就是无参
        // 在子类中使用无参构造，会默认调用父类的构造方法
        // 调用的过程，主要是为了做数据初始化
        // 子类中的使用，默认都会访问父类无参构造

        System.out.println("---------------------------");
        ccc010zi x2 = new ccc010zi(44);
    }
    // 有个坑，如果父类只写了带参构造，
    // 会因为没有无参构造，导致子类数据无法初始化，进而报错
}
