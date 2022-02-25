package ab二阶段强化课程2022年1月11日.ccc007继承;

public class ccc003测试 {
    public static void main(String[] args) {
        ccc002fu x1 = new ccc002fu();
        // 使用了类中默认存在的无参构造方法
        // 在类中的对象，可以使用类中存在的方法
        //如果fu里面有static就无法调用
        x1.show();
        ccc002zi x2 = new ccc002zi();
        // 如果子类继承了父类，那么就可以使用父类中的方法

        x2.zi();
        //extends后面可以不跟小括号
        x2.show();
        //继承父类的子类，可以同时使用子类和父类中的所有方法
        // 继承的时候，最好保持子类是父类的一种
    }
}
