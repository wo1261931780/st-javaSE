package abc往期学习2021年10月2日.ccc018猫狗多态案例;

public class ccc001test_animal {
    public int age;
    public String name;

    public ccc001test_animal(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public ccc001test_animal() {
    }

    public void eat(ccc001test_animal x) {
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
