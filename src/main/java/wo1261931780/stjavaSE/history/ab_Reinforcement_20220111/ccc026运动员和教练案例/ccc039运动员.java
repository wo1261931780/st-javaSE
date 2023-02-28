package wo1261931780.stjavaSE.history.ab_Reinforcement_20220111.ccc026运动员和教练案例;

public abstract class ccc039运动员 extends ccc038人 {
    public ccc039运动员() {
    }

    public ccc039运动员(int age, String name) {
        super(age, name);
    }

    @Override
    public void eat() {
        System.out.println("player:healthy food");
    }

    public abstract void study();
}
