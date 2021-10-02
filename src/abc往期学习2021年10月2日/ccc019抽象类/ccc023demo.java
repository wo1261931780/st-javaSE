package abc往期学习2021年10月2日.ccc019抽象类;

public class ccc023demo {
    public static void main(String[] args) {
        System.out.println("start---------------");
        ccc021抽象 a = new ccc022子类();
        //抽象类不能直接创建对象，
        // 类似ccc021抽象 a=new ccc021抽象();这样创建对象，是不允许的
        //只能这样通过多态的方式创建
        a.test();
        // 子类继承了父类抽象类，并且重写了test方法，所以可以直接调用
        // 这里是直接调用子类中的抽象方法
        a.test2();
        // 这里是直接调用父类的方法，
        // 虽然该方法在子类中不存在，但是在父类中有，所以继承后，会直接使用父类的
        // 这里一直报错，已经解决，当时是setting里面class的配置路径出错
    }
}
