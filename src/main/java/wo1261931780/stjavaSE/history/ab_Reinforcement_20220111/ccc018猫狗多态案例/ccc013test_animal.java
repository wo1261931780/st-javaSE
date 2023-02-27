package wo1261931780.stjavaSE.history.ab_Reinforcement_20220111.ccc018猫狗多态案例;

public class ccc013test_animal {
    public int age;
    public String name;

    public ccc013test_animal(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public ccc013test_animal() {
    }

    public void eat(ccc013test_animal x) {
        System.out.println("我是animal中的eat方法");
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
