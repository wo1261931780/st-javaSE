package ccc019抽象类;

public class ccc023demo {
    public static void main(String[] args) {
        System.out.println("start---------------");
        ccc021抽象 a=new ccc022子类();
        //抽象类不能直接创建对象，
        //只能这样通过多态的方式创建
        a.test();
        a.test2();
        //这里一直报错，已经解决，当时是setting里面class的配置路径出错
    }
}
