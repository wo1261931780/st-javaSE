package c二阶段强化课程2022年1月11日.ccc026运动员和教练案例;

public class ccc033乒乓球教练 extends ccc030教练 implements ccc027学习英语 {
    public ccc033乒乓球教练() {
    }

    public ccc033乒乓球教练(int age, String name) {
        super(age, name);
    }

    @Override
    public void learn() {
        System.out.println("guide learn foreign language");
    }

    @Override
    public void teach() {
        System.out.println("guide teach skills about ping pang");
    }
}
