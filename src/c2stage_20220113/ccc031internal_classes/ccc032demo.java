package c2stage_20220113.ccc031internal_classes;

public class ccc032demo {
    public static void main(String[] args) {
        //在成员内部类中，创建对象的格式
        // ccc031成员内部类.inside xx=new ccc031成员内部类().new inside();
        //格式是：
        //外部类名.内部类名 xx=new 外部类.new 内部类；
        //外部类名.内部类名 xx=外部类对象（通过new 外部类产生）.内部类对象（通过new 内部类产生）；
        // xx.show();
        ccc031成员内部类.ceshi1 x1 = new ccc031成员内部类().new ceshi1();
        x1.show();
        System.out.println("--------------------------------------");

        ccc031成员内部类 x = new ccc031成员内部类();
        x.find();
        //在外部类中使用一次，直接调用内部类的方法
        //上面第一次创建内部类的方式比较麻烦
        //这里是在外部类中创建了对象，
        // 然后x对象直接调用了外部类中，的find方法
        //而find方法的作用是（创建内部类对象+使用show方法）
    }
}
