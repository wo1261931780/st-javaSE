package ab_Reinforcement_20220111.ccc110猫和狗;

public class ccc013demo {
    public static void main(String[] args) {
        ccc011cat c1 = new ccc011cat("11", 1);
        ccc012dog d1 = new ccc012dog("22", 2);
        System.out.println("猫的姓名是：" + c1.getName() + ",猫的年龄是：" + c1.getAge());
        c1.seekrat();
    }
}
