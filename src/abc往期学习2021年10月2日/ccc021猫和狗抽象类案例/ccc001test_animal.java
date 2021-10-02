package abc往期学习2021年10月2日.ccc021猫和狗抽象类案例;

public abstract class ccc001test_animal {
    public String name;
    public int age;

    public ccc001test_animal() {
    }

    public ccc001test_animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract void eat(ccc001test_animal x);

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
