package wo1261931780.stjavaSE.history.ab_Reinforcement_20220111.ccc102子类父类数据引用;

public class ccc005测试 {
    public static void main(String[] args) {
        System.out.println("test start--------");
        ab_Reinforcement_20220111.ccc102子类父类数据引用.ccc003fu x1 = new ab_Reinforcement_20220111.ccc102子类父类数据引用.ccc003fu();
        x1.show();
        // 这里，如果show方法为静态的，则直接报错
        // 不应该通过实例访问静态成员
        ab_Reinforcement_20220111.ccc102子类父类数据引用.ccc004zi x2 = new ab_Reinforcement_20220111.ccc102子类父类数据引用.ccc004zi();
        x2.zi();
        System.out.println();
    }
}
