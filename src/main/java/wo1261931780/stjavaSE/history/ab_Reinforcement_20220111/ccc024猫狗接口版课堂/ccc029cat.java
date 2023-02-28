package wo1261931780.stjavaSE.history.ab_Reinforcement_20220111.ccc024猫狗接口版课堂;

public class ccc029cat extends ccc032animal implements ccc028接口 {
    private int age;
    private String name;

    @Override
    public void jump() {
        System.out.println("cat类中的jump方法");
    }

    @Override
    public void eat() {
        System.out.println("cat类中的eat方法");
    }

    public ccc029cat(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public ccc029cat() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
