package c2stage_20220113.ccc033Anonymous_internal_classe;

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
