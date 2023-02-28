package wo1261931780.stjavaSE.history.c2stage_20220113.ccc021abstract_catdog_case;

public abstract class ccc048animal {
    private int age;
    private String name;

    public ccc048animal() {
    }

    public ccc048animal(int age, String name) {
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
