package wo1261931780.stjavaSE.history.ab_Reinforcement_20220111.ccc018猫狗多态案例;

public class ccc014test_dog extends ccc013test_animal {
    public ccc014test_dog(int age, String name) {
        super(age, name);
    }

    public ccc014test_dog() {
    }


    @Override
    public void eat(ccc013test_animal x) {
        System.out.println("我是子类，狗中的eat方法");
        System.out.println(x.getName() + x.getAge());
        // 重写过程中，必须保持重写前后的括号内，变量一致
        // 不能父类中没有传递变量，子类中传递

    }
}
