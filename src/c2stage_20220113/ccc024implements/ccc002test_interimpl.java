package c2stage_20220113.ccc024implements;

public class ccc002test_interimpl implements ccc001test_inter {
    int age = 11;
    // 就算存在变量名重复的问题，多态创建的对象也不会访问实现类中的变量

    @Override
    public void demorun() {
        System.out.println("我执行了demorun重写操作");
        System.out.println(ccc001test_inter.age);
    }
}
