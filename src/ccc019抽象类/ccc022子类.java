package ccc019抽象类;

public class ccc022子类 extends ccc021抽象 {

    @Override
    public void test() {
        System.out.println("子类中的test");
    }
    //这里重写必须是抽象方法，否则无法进行
    //继承抽象类之后，子类必须重写抽象方法，或者子类本身就是抽象类，否则报错
}
