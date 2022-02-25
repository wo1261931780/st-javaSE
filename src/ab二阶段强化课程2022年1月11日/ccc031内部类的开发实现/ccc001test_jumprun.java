package ab二阶段强化课程2022年1月11日.ccc031内部类的开发实现;

public class ccc001test_jumprun {
    public static void main(String[] args) {
        System.out.println("我是主类，执行测试");
        ccc001test_jumpint x = new ccc001test_jumpimp();
        ccc001test_jumpopt x1 = new ccc001test_jumpopt();
        x1.method(x);
        System.out.println("------------------------");
        System.out.println("下面是匿名内部类的作用");
        x1.method(new ccc001test_jumpint() {
            @Override
            public void jump() {
                System.out.println("狗可以跳高了");
            }
        });
        // 这里，匿名内部类直接替代了x对象，
        // 好处是减少了接口实现类的创建

    }
}
