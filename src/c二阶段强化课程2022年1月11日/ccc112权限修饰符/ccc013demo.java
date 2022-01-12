package c二阶段强化课程2022年1月11日.ccc112权限修饰符;

public class ccc013demo {
    private void show1() {
        System.out.println("111");
    }

    void show2() {
        System.out.println("2222");
    }

    protected void show3() {
        System.out.println("333");
    }

    public void show4() {
        System.out.println("4444");
    }

    public static void main(String[] args) {
        ccc013demo x = new ccc013demo();
        x.show1();
        x.show2();
        x.show3();
        x.show4();
        //上面显示四个权限的都可以直接访问，
    }
//简单概括一下：
    //1-private只能本类中访问
    //2-void可以在同一个包中访问
    //3-protect可以在导包+继承后，在不同的包中访问
    //4-public导包后，不继承也可以访问。
}
