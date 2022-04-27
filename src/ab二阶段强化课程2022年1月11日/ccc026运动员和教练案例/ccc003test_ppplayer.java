package ab二阶段强化课程2022年1月11日.ccc026运动员和教练案例;

public class ccc003test_ppplayer extends ccc002test_athelete implements ccc001test_learn {
    public ccc003test_ppplayer() {
    }

    public ccc003test_ppplayer(String name, int age) {
        super(name, age);
    }

    @Override
    public void eatsm() {
        super.eatsm();
    }

    @Override
    public void jobsm() {
        // super.jobsm();
        System.out.println("乒乓球运动员" + name + "学习英语" + age);
    }
}
