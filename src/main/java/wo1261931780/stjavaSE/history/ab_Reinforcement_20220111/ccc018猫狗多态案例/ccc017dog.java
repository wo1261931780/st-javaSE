package wo1261931780.stjavaSE.history.ab_Reinforcement_20220111.ccc018猫狗多态案例;

public class ccc017dog extends ccc018animal {
    public ccc017dog() {
    }

    public ccc017dog(int age, String name) {
        super(age, name);
    }

    @Override
    public void run() {
        System.out.println("dog中的run");
    }

    public void caught() {
        System.out.println("dog中的caught");
//        System.out.println(name+"今年"+age+"岁了，今天对着我wwwwwwwww");
    }
}
