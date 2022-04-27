package ab二阶段强化课程2022年1月11日.ccc028接口名的形参和返回;

public class ccc031测试 {
    public void usejkk(ccc029接口 j) {
        //传递完成以后，对象j直接使用jkk方法
        j.jkk();
    }

    /**
     * 实际上是在接口中构建了一个方法，但是使用的是子类的功能
     */
    public ccc029接口 ret() {
        ccc029接口 j2 = new ccc030子类();
        return j2;
    }
}
