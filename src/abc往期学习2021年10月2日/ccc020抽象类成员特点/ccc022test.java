package abc往期学习2021年10月2日.ccc020抽象类成员特点;

public class ccc022test {
    public static void main(String[] args) {
        ccc021animal a = new ccc023cat();
        //这里一直报错，已经解决，当时是setting里面class的配置路径出错
        a.eat();
        a.show();
        //因为继承，导致cat中的a具备父类animal的功能。
        //抽象类是带有特定要求的类：
        //1.如果使用抽象的父类，子类就必须重写(接受)父类的某个特性，
        //2.如果因为继承关系，子类自带了父类的一些功能。
    }
}
