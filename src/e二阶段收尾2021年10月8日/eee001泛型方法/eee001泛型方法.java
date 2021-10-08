package e二阶段收尾2021年10月8日.eee001泛型方法;

public class eee001泛型方法<T> {
    public void show(String x) {
        System.out.println(x);
    }
    // 方法名相同，方法不同，称为方法重载

    public void show(Integer x) {
        System.out.println(x);
    }

    public void show(boolean x) {
        System.out.println(x);
    }

    public void show(T x) {
        System.out.println(x);
    }
    // 必须设置为非static方法才可以运行
}
