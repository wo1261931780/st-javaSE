package c2stage_20220113.ccc016final;

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
    // 重写的时候，直接输入方法名，就可以执行重写的操作
}
