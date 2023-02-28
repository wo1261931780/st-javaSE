package wo1261931780.stjavaSE.history.ab_Reinforcement_20220111.ccc024猫狗接口版课堂;

public abstract class ccc032animal {
    private int age;
    private String name;
    public abstract void eat();
    //eat方法是抽象的，
    //因为后面需要在子类中对eat进行重写，但是为了节约代码，所以抽象处理

    public ccc032animal() {
    }

    public ccc032animal(int age, String name) {
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
