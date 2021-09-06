package ccc001;

public class ccc003测试 {
    public static void main(String[] args) {
        ccc002fu x1=new ccc002fu();
        x1.show();//如果fu里面有static就无法调用
        ccc002zi x2=new ccc002zi();
        x2.zi();
        x2.show();//extends后面可以不跟小括号
        //继承父类的子类，可以同时使用子类和父类中的所有方法
    }
}
