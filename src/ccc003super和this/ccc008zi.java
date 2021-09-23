package ccc003super和this;

public class ccc008zi extends ccc007fu {
    public int age = 22;

    public void show() {
        int age = 33;
        //使用的是方法中的33
        System.out.println(age);
        //使用本类中成员变量的22
        System.out.println(this.age);
        //使用父类中的11
        System.out.println(super.age);
    }
}
