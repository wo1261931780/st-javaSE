package c2stage_20220113.ccc021abstract_catdog_case;

public abstract class ccc022animal {
    private int age;
    private String name;

    public ccc022animal() {
    }

    public ccc022animal(int age, String name) {
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
