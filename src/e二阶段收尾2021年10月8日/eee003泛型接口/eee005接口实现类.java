package e二阶段收尾2021年10月8日.eee003泛型接口;

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
