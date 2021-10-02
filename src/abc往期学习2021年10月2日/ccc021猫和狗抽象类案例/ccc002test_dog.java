package abc往期学习2021年10月2日.ccc021猫和狗抽象类案例;

public class ccc002test_dog extends ccc001test_animal {

    @Override
    public void eat(ccc001test_animal x) {
        System.out.println(x.getName() + x.getAge());
        System.out.println("子类结束");
    }
}
