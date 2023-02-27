package wo1261931780.stjavaSE.history.ab_Reinforcement_20220111.ccc018猫狗多态案例;

public class ccc016cat extends ccc018animal {
    public ccc016cat() {
    }

    public ccc016cat(int age, String name) {
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
