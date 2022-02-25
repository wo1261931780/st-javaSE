package ab二阶段强化课程2022年1月11日.ccc102子类父类数据引用;

public class ccc005测试 {
    public static void main(String[] args) {
        System.out.println("test start--------");
        ccc003fu x1 = new ccc003fu();
        x1.show();
        // 这里，如果show方法为静态的，则直接报错
        // 不应该通过实例访问静态成员
        ccc004zi x2 = new ccc004zi();
        x2.zi();
        System.out.println();
    }
}
