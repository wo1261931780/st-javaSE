package ccc013状态修饰符;

public class ccc017其它修改 {
    public static void main(String[] args) {
        final int age=20;//这里是修改具体的数据
        System.out.println(age);

        final ccc015zi x=new ccc015zi();//这里的修改只是把地址固定，并没有修改值
        x.age =20;
        System.out.println(x.age);
    }
}
