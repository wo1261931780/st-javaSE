package ab二阶段强化课程2022年1月11日.ccc018猫狗多态案例;

public class ccc002test_dog extends ccc001test_animal {
    public ccc002test_dog(int age, String name) {
        super(age, name);
    }

    public ccc002test_dog() {
    }


    @Override
    public void eat(ccc001test_animal x) {
        System.out.println("我是子类，狗中的eat方法");
        System.out.println(x.getName() + x.getAge());
        // 重写过程中，必须保持重写前后的括号内，变量一致
        // 不能父类中没有传递变量，子类中传递

    }
}
