package c二阶段强化课程2022年1月11日.ccc018猫狗多态案例;

public class ccc021animal {
    private int age;
    private String name;

    public void run() {
        System.out.println("animal类中的run----------------");
    }

    public ccc021animal() {
    }

    public ccc021animal(int age, String name) {
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
