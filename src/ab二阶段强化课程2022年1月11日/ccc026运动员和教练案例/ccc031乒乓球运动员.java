package ab二阶段强化课程2022年1月11日.ccc026运动员和教练案例;

public class ccc031乒乓球运动员 extends ccc029运动员 implements ccc027学习英语 {
    public ccc031乒乓球运动员() {
    }

    public ccc031乒乓球运动员(int age, String name) {
        super(age, name);
    }

    @Override
    public void learn() {
        System.out.println("player learn foreign language");
    }

    @Override
    public void study() {
        System.out.println(" ping pang player study");
    }
}
