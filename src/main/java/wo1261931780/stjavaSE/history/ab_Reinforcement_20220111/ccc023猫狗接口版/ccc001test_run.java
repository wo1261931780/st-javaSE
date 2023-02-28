package wo1261931780.stjavaSE.history.ab_Reinforcement_20220111.ccc023猫狗接口版;

public class ccc001test_run extends ccc001test_dog {
    public static void main(String[] args) {
        System.out.println("我是主类");
        ccc001test_animal x = new ccc001test_dog();
        x.jump();
        ccc001test_dog x1 = (ccc001test_dog) x;
        // 使用get和set必须要在实现类中进行
        // 或者必须在有get/set方法中的类，中进行
        // 为了调用get/set方法，我们必须同时在该类中创建对象
        // 在创建对象的过程中
        // 为了保持抽象类对象的存在，我们必须执行一次强转操作，这样，地址才能赋值给dog类
        System.out.println(x1.getName() + x1.getAge());

    }
}
