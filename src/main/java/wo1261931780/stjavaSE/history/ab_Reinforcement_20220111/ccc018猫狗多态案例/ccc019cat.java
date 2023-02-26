package ab_Reinforcement_20220111.ccc018猫狗多态案例;

public class ccc019cat extends ccc021animal {
    public ccc019cat() {
    }

    public ccc019cat(int age, String name) {
        super(age, name);
    }

    @Override
    public void run() {
        System.out.println("cat中的run");
    }

    public void near() {
        System.out.println("cat中的near-----------");
    }
}
