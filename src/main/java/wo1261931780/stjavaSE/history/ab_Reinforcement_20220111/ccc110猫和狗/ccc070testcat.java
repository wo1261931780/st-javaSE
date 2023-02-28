package wo1261931780.stjavaSE.history.ab_Reinforcement_20220111.ccc110猫和狗;

public class ccc070testcat extends ccc069testanimal {
    public ccc070testcat() {
        ccc069testanimal x1 = new ccc069testanimal(11, "aa");
        // 这里虽然是无参构造，但是调用了父类的带参构造方法
        // 其实用下面的也可以，

    }

    public ccc070testcat(int age, String name) {

    }

    @Override
    public void eatsm() {
        System.out.println("我是猫吃鱼，重写eat方法");
    }
}
