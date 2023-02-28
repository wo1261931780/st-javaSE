package wo1261931780.stjavaSE.history.ab_Reinforcement_20220111.ccc026运动员和教练案例;

public class ccc044篮球教练 extends ccc040教练 {
    public ccc044篮球教练() {
    }

    public ccc044篮球教练(int age, String name) {
        super(age, name);
    }

    @Override
    public void teach() {
        System.out.println("guide teach skills about basketball");
    }
    //这里教程是统一重写，我把eat方法放到了上一级
}
