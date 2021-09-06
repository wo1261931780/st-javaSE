package ccc022接口及其特点;

public class ccc023demo {
    public static void main(String[] args) {
        ccc026jump x = new ccc024cat();//在子类cat中创建对象x，x使用父类jump中的方法。
        x.jump();//结果是cat类中的jump方法
        ccc026jump cc = new ccc027jumpimpl();
        cc.jump();//结果是jumpimpl中的jump方法
        System.out.println(cc.num);//结果是10
        System.out.println(cc.num2);//结果是20
        System.out.println(ccc026jump.num);//结果是10
        //可以直接访问，也说明这是通过静态修饰的
    }
}
