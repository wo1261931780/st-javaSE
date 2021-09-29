package ccc018猫狗多态案例;

public class ccc003test_run {
    public static void main(String[] args) {
        System.out.println("我是测试类");
        ccc001test_animal x = new ccc002test_dog();
        x.setName("111");
        x.setAge(222);
        x.eat(x);
    }
}
