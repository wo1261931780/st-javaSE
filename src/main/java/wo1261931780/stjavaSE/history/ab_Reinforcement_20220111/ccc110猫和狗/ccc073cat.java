package wo1261931780.stjavaSE.history.ab_Reinforcement_20220111.ccc110猫和狗;

public class ccc073cat extends ccc076animal {
    public ccc073cat() {
    }

    public ccc073cat(String name, int age) {
        super(name, age);
        //这里使用super直接导入父类的name和age
    }

    public void seekrat() {
        System.out.println(getName() + "抓老鼠");
    }
}
