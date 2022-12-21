package ab_Reinforcement_20220111.ccc026运动员和教练案例;

public abstract class ccc029运动员 extends ccc028人 {
    public ccc029运动员() {
    }

    public ccc029运动员(int age, String name) {
        super(age, name);
    }

    @Override
    public void eat() {
        System.out.println("player:healthy food");
    }

    public abstract void study();
}
