package abc往期学习2021年10月2日.ccc026运动员和教练案例;

public abstract class ccc001test_people {
    public String name;
    public int age;

    public ccc001test_people() {
    }

    public ccc001test_people(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract void eatsm();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
