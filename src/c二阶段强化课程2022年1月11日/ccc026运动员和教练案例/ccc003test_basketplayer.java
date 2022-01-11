package c二阶段强化课程2022年1月11日.ccc026运动员和教练案例;

public class ccc003test_basketplayer extends ccc002test_athelete implements ccc001test_learn {
    public ccc003test_basketplayer() {
    }

    public ccc003test_basketplayer(String name, int age) {
        super(name, age);
    }

    @Override
    public void eatsm() {
        super.eatsm();
    }

    @Override
    public void jobsm() {
        // super.jobsm();
        System.out.println("篮球运动员" + name + "可以学习篮球" + age);
    }
}
