package ccc028接口名的形参和返回;

public class ccc031测试 {
    public void usejkk(ccc029接口 j) {
        j.jkk();//传递完成以后，对象j直接使用jkk方法
    }

    public ccc029接口 ret() {//实际上是在接口中构建了一个方法，但是使用的是子类的功能
        ccc029接口 j2 = new ccc030子类();
        return j2;
    }
}
