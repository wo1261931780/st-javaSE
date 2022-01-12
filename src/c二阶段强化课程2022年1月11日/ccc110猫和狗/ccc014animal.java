package c二阶段强化课程2022年1月11日.ccc110猫和狗;

public class ccc014animal {
    private String name;
    private int age;
//    Scanner xx=new Scanner(System.in);

    public ccc014animal() {
    }

    public ccc014animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        System.out.println("name------------");
        this.name = name;
    }

    public void setAge(int age) {
        System.out.println("age-------------");
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
