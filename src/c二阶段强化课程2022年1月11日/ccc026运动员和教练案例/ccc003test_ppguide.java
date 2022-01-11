package c二阶段强化课程2022年1月11日.ccc026运动员和教练案例;

public class ccc003test_ppguide extends ccc002test_guide implements ccc001test_learn {
    public ccc003test_ppguide(String name, int age) {
        super(name, age);
    }

    public ccc003test_ppguide() {
    }

    @Override
    public void eatsm() {
        super.eatsm();
    }

    @Override
    public void jobsm() {
        // super.jobsm();
        System.out.println("乒乓球教练" + name + "学习英语，教授运动员" + age);
    }
}
