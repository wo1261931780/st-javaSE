package wo1261931780.stjavaSE.history.ab_Reinforcement_20220111.ccc026运动员和教练案例;

public abstract class ccc038人 {
    private int age;
    private String name;

    public ccc038人() {
    }

    public ccc038人(int age, String name) {
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
