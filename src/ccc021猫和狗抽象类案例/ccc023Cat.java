package ccc021猫和狗抽象类案例;

public class ccc023Cat extends ccc022animal {
    @Override
    public void eat() {
        System.out.println("cat类的eat方法------------");
    }

    public void cat1() {
    }

    public void cat1(int age, String name) {
        super.setAge(age);
        super.setName(name);
//        super(name,age);//官方教程
    }
}
