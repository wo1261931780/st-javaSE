package c2stage_20220202.ccc031internal_classes;

public class ccc006test_run {
    public static void main(String[] args) {
        ccc005Member_Internal_Classes.ceshi1 x = new ccc005Member_Internal_Classes().new ceshi1();
        // 首先，从外部访问必须遵循上面的语法
        // 其次，在类名.内部类名访问的时候，
        // 记得加括号
        x.show();

        // ***************************************
        // 这样理解：
        // ccc005Member_Internal_Classes.ceshi1 x=new ccc005Member_Internal_Classes().new ceshi1();
        // 首先我在ccc005Member_Internal_Classes的内部类ceshi1创建对线x
        // 具体的执行流程：首先在new ccc005Member_Internal_Classes()新建一个对象
        // 然后这个对象继续新建一个new ceshi1();
        // 这样我就得到了一个内部类的对象x
        // 对象x就可以调用内部类的show方法


    }
}
