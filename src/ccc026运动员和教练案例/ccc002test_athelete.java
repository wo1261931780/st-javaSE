package ccc026运动员和教练案例;

public abstract class ccc002test_athelete extends ccc001test_people implements ccc001test_learn {
    public ccc002test_athelete() {
    }

    public ccc002test_athelete(String name, int age) {
        super(name, age);
    }

    @Override
    public void eatsm() {
        System.out.println("运动员吃健康食品");
    }

    @Override
    public void jobsm() {
        System.out.println("具有学习能力");
    }
}
