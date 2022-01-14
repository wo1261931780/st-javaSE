package c2stage_20220113.ccc016final;

public class ccc017其它修改 {
    public static void main(String[] args) {
        // final修改，将变量的数据固定为常量，后续无法对变量赋值
        final int age = 20;
        System.out.println(age);

        // final处理新建对象，固定地址数据

        final ccc015zi x = new ccc015zi();
        x.age = 20;
        System.out.println(x.age);
    }
}
