package abc往期学习2021年10月2日.aaa001初期学习集合;

public class aaa024a方法的参数传递 {
    public static void main(String[] args) {
        System.out.println("-------------------------------");
        int xx = 10;
        System.out.println(xx);
        demo1(xx);
        System.out.println("-------------------------------");
        System.out.println(xx);
        System.out.println("-------------------------------");
        int dd = demo1(xx);
        //这里也会出现一次x1，因为调用方法的过程中，方法中展示了x1的数值
        System.out.println("接收了方法中的变动，数据为：" + dd);
    }

    public static int demo1(int x1) {
        x1 = 20;
        // 这里的修改，其实是修改了xx参数的数据
        // 可以理解为：
        // xx=10，x1=xx=20
        // 但是此时的x1数据修改，不会影响main方法中的xx数值
        // 因为demo1方法中的修改只针对栈内存，不影响实际数据
        System.out.println("我是方法中的参数，形式参数:" + x1);
        // 修改后，sout会给出变动数据，因为是栈内存的表达式，同属于一个方法
        return x1;
    }
}
