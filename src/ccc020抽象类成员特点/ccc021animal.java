package ccc020抽象类成员特点;

public abstract class ccc021animal {
    private int age = 20;
    private final String nn = "222";//final后，一般就称为常量

    public void show() {
        age = 12;
        System.out.println(age);
    }

    public ccc021animal() {
    }

    public ccc021animal(int age) {
        //抽象类可以进行构造，这样子类才能实现对父类的访问
        //这种构造主要为了实现数据的初始化
        this.age = age;
    }
    public abstract void eat();
}
