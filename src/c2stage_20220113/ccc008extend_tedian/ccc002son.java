package c2stage_20220113.ccc008extend_tedian;

public class ccc002son extends ccc001father {
    public static void main(String[] args) {
        ccc002son x = new ccc002son();
        x.run();
        x.run2();

    }

    public void run() {//在没有特殊说明的情况下，类中的对象，优先调用类中的方法
        // 其实这里一般使用重写，但是不加override也可以完成
        System.out.println("子类run");
    }

    public void run2() {
        // run();
        super.run();//通过super，直接调用父类的run方法
    }
}
