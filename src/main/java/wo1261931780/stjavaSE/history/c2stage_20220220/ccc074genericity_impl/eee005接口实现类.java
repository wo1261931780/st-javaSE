package c2stage_20220220.ccc074genericity_impl;

public class eee005接口实现类<T> implements eee004泛型<T> {
    /**
     * 在含有泛型的类和实现中，二者都需要跟上泛型的备注
     */
    @Override
    public void show(T x) {
        System.out.println(x);
        System.out.println("我是接口实现类");
    }
}
