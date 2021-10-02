package abc往期学习2021年10月2日.ccc023猫狗接口版;

public class ccc025dog implements ccc026接口 {
    private int age;
    private String name;

    @Override
    public void jump() {
        System.out.println("dog类中的jump方法");
    }

    public void eat() {
        System.out.println("dog类中的eat方法");
    }

    public ccc025dog() {
    }

    public ccc025dog(int age, String name) {
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
