package wo1261931780.stjavaSE.history.ab_Reinforcement_20220111.ccc026运动员和教练案例;

public abstract class ccc040教练 extends ccc038人 {
    public ccc040教练() {
    }

    public ccc040教练(int age, String name) {
        //直接传递参数给父类
        super(age, name);
    }

    @Override
    public void eat() {
        System.out.println("we can smoke");
    }

    public abstract void teach();
}
