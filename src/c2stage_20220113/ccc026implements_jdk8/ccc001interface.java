package c2stage_20220113.ccc026implements_jdk8;

public interface ccc001interface {
    default void eat() {
        System.out.println("eat something");
        show2();
    }
    // 默认方法，不能直接调用，因为本质还是接口
    // 需要调用，只能被实现后，在实现类中进行调用

    static void show() {
        System.out.println("show something");
    }
    // 类似这种静态方法，就需要使用类名调用

    // 私有方法
    private void show2() {
        System.out.println("demo show2");
    }
    // 上面这种方法属于私有，只能在类的内部被调用，
// 但问题是，接口本身不具备构造的能力
// 因此，要想使用这种私有方法，就只能将方法放到其他公开方法中，
// 在其它方法生效的时候，间接调用该方法


}
