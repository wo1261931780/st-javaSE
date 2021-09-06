package ccc022接口及其特点;

public interface ccc026jump {
    public abstract void jump();

    //方法是抽象的，但是接口自带抽象属性
    //研究成员特点，直接看有没有成员变量/构造方法/成员方法
    public int num = 10;//接口中，默认final变量，所以所有的变量实际上都是常量（无法修饰）。
    public final int num2 = 20;
    public static final int num3 = 33;//完整写法
    int num4 = 44;

    //接口没有构造方法，因为没有具体存在
//    public void eat();//这样不行
    public abstract void eat();//这样可以，因为是抽象的
    void run();//接口中，默认有前面的public abstract（默认方法是抽象的）
    //这里 备注一下，如果接口中有方法出现，
    //那么子类实现的时候，必须重写里面所有的方法，不然会报错
 }
