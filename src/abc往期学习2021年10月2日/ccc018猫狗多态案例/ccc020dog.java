package abc往期学习2021年10月2日.ccc018猫狗多态案例;

public class ccc020dog extends ccc021animal {
    public ccc020dog() {
    }

    public ccc020dog(int age, String name) {
        super(age, name);
    }

    @Override
    public void run() {
        System.out.println("dog中的run");
    }

    public void caught() {
        System.out.println("dog中的caught");
//        System.out.println(name+"今年"+age+"岁了，今天对着我wwwwwwwww");
    }
}
