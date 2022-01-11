package c二阶段强化课程2022年1月11日.ccc030匿名内部类;

public class aaa002test_匿名内部类 extends aaa001内部类 {
    public void insm() {
        new aaa001内部类() {
            @Override
            public void find() {
                // super.find();
                System.out.println("匿名内部类");
            }
        }.find();

    }

}
