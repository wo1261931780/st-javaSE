package wo1261931780.stjavaSE.history.ab_Reinforcement_20220111.ccc110猫和狗;

public class ccc069testanimal {
    private int age;
    private String name;

    public ccc069testanimal() {
    }

    public ccc069testanimal(int age, String name) {
        this.age = age;
        this.name = name;
        System.out.println(name + "已经" + age + "了");
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

    public void eatsm() {
        System.out.println("我是吃东西");
    }
}
