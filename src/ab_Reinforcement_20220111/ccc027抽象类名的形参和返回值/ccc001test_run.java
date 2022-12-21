package ab_Reinforcement_20220111.ccc027抽象类名的形参和返回值;

public class ccc001test_run {
    public static void main(String[] args) {
        System.out.println("我是主类");
        // ccc001test_pet x = new ccc001test_dog();
        // x.eatsm();
        ccc001test_dog x = new ccc001test_dog();
        // x.usedog(x);
        ccc001test_dog x1 = x.getdog();
        x.usedog(x1);
        // 上下两个use方法不一样
        // 一个是将自身传递过去，一个是创建了新的对象后，将其传递过去
    }
}
