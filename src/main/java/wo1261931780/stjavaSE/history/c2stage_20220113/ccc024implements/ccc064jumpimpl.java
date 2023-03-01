package wo1261931780.stjavaSE.history.c2stage_20220113.ccc024implements;

/**
 * 接口名+impl=接口后面的实现类
 */
public class ccc064jumpimpl implements ccc063jump {

    @Override
    public void jump() {
        System.out.println("jumpimpl中的jump方法");
        //实现的过程中，如果有任何抽象方法，就必须重写一次，没有则不用
    }

    @Override
    public void eat() {
        System.out.println("jumpimpl的eat方法");
        // super();
        // 这里，虽然是接口实现类，但是还可以调用父类的构造方法
        // 需要说明的是，
        // 接口中不允许构造方法存在，但是还可以调用
        // 这里的调用，是调用了object()这个无参构造方法
        // 因为所有的构造方法，都会调用这个方法，
        // 同时，所有的类，其实都默认继承了object类
        // 所以实现类中，可以进行父类的构造
    }

    @Override
    public void run() {
        System.out.println("jumpimpl中的run方法");
    }
}
