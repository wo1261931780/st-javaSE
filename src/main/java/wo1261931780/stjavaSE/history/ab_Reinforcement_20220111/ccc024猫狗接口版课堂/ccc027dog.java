package ab_Reinforcement_20220111.ccc024猫狗接口版课堂;

public class ccc027dog extends ccc029animal implements ccc025接口 {//这里可以同时继承和实现
    private int age;
    private String name;

    @Override
    public void jump() {
        System.out.println("dog----jump");
    }

    @Override
    public void eat() {
        System.out.println("meat--------------");
    }

    public ccc027dog() {
    }

    public ccc027dog(int age, String name) {
        this.age = age;
        this.name = name;
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
