package ab二阶段强化课程2022年1月11日.ccc026运动员和教练案例;

public abstract class ccc002test_guide extends ccc001test_people implements ccc001test_learn {
    public ccc002test_guide(String name, int age) {
        super(name, age);
    }

    public ccc002test_guide() {
    }

    @Override
    public void eatsm() {
        System.out.println("教练可以吃垃圾食品");
    }

    @Override
    public void jobsm() {
        System.out.println("教练需要教运动员");
    }
}
