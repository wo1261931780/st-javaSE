package abc往期学习2021年10月2日.ccc026运动员和教练案例;

public class ccc003test_basketguide extends ccc002test_guide implements ccc001test_learn {
    public ccc003test_basketguide(String name, int age) {
        super(name, age);
    }

    public ccc003test_basketguide() {
    }

    @Override
    public void eatsm() {
        super.eatsm();
    }

    @Override
    public void jobsm() {
        // super.jobsm();
        System.out.println("篮球教练" + name + "可以教授篮球" + age);
    }
}
