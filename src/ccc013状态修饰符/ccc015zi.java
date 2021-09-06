package ccc013状态修饰符;

public class ccc015zi extends ccc014fu {
    int age = 10;

    //   final int age =10;定义后，无法被重新定义
    @Override
    public void way() {
        super.way();
        System.out.println(age);
    }
}
