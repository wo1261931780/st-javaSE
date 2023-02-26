package wo1261931780.stjavaSE.history.c2stage_20220202.ccc033Anonymous_internal_classe;

public class aaa002test_匿名内部类 extends aaa001内部类 {
    public void insm() {
        new aaa001内部类() {
            @Override
            public void find() {
                // super.find();
                System.out.println("匿名内部类");
            }
        }.find();
        // 匿名内部类，本质上是一个对象
        // 因为new xx();这个整体，相当于在xx中新建了一个对象
        // 所以在后面需要调用内部方法的时候，直接链式编程即可
        // 但是这个对象，不是”内部类“的对象
        // 而是重写了”内部类“的，作为”内部类“的继承类的对象
        // 会产生class文件，也说明了它本质上是一个类
        new c2stage_20220202.ccc033Anonymous_internal_classe.ccc031inside(){}.show(new c2stage_20220202.ccc033Anonymous_internal_classe.ccc031inside(){});
        // 上面的意思是，
        // 我新建了一个对象，然后对象调用了show方法
        // 因为show方法需要传递对象，所以我又传了一个对象进去
        // 简单来说，匿名内部类可以作为一个对象直接传递过去

    }

}
