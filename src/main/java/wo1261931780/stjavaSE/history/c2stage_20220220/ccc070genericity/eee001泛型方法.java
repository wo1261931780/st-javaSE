package c2stage_20220220.ccc070genericity;

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

    // public void show(T x) {
    //     System.out.println(x);
    // }

    /**
     * 必须设置为非static方法才可以运行
     * 如果使用了static修饰，那么可以在不创建对象的情况下运行
     */
    public <T> void show(T x) {
        // 这里就是泛型方法
        System.out.println(x);
    }
}
