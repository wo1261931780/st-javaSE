package ccc026运动员和教练案例;

public abstract class ccc030教练 extends ccc028人 {
    public ccc030教练() {
    }

    public ccc030教练(int age, String name) {
        super(age, name);//直接传递参数给父类
    }

    @Override
    public void eat() {
        System.out.println("we can smoke");
    }

    public abstract void teach();
}
