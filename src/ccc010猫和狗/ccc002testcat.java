package ccc010猫和狗;

public class ccc002testcat extends ccc001testanimal {
    public ccc002testcat() {
        ccc001testanimal x1 = new ccc001testanimal(11, "aa");
        // 这里虽然是无参构造，但是调用了父类的带参构造方法
        // 其实用下面的也可以，

    }

    public ccc002testcat(int age, String name) {

    }

    @Override
    public void eatsm() {
        System.out.println("我是猫吃鱼，重写eat方法");
    }
}
