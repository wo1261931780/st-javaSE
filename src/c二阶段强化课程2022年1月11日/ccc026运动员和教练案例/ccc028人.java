package c二阶段强化课程2022年1月11日.ccc026运动员和教练案例;

public abstract class ccc028人 {
    private int age;
    private String name;

    public ccc028人() {
    }

    public ccc028人(int age, String name) {
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

    public abstract void eat();
}
