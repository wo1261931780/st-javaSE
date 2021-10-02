package abc往期学习2021年10月2日.ccc013状态修饰符;

public class ccc015zi extends ccc014fu {
    int age = 10;

    /**
     * final int age =10;定义后，无法被重新定义
     * final类似标记最终状态...
     * final修饰三种，
     * 修饰方法，无法被重写
     * 修饰变量，定义为常量，无法重新赋值
     * 修饰类，该类就不能产生子类
     */
    @Override
    public void way() {
        super.way();
        System.out.println(age);
    }
}
