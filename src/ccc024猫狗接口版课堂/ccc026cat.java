package ccc024猫狗接口版课堂;

public class ccc026cat extends ccc029animal implements ccc025接口 {
    private int age;
    private String name;

    @Override
    public void jump() {
        System.out.println("cat类中的jump方法");
    }

    @Override
    public void eat() {
        System.out.println("cat类中的eat方法");
    }

    public ccc026cat(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public ccc026cat() {
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
