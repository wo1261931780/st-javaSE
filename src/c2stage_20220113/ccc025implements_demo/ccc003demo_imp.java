package c2stage_20220113.ccc025implements_demo;

public class ccc003demo_imp implements ccc001demo1, ccc002demo2 {
    private String name;

    public ccc003demo_imp(String name) {
        this.name = name;
    }

    public ccc003demo_imp() {
    }

    @Override
    public void eat() {
        System.out.println(name + "eat something");
    }

    @Override
    public void sleep() {
        System.out.println(name + "sleep each day");
    }
    // 上面直接alt+回车，就可以完成实现的过程
    // 但是实现类，还是需要创建对象+调用方法的过程，否则无法生效
}
