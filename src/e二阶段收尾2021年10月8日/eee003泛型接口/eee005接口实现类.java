package e二阶段收尾2021年10月8日.eee003泛型接口;

public class eee005接口实现类<T> implements eee004泛型<T> {
    @Override
    public void show(T x) {
        System.out.println(x);
        System.out.println("我是接口实现类");
    }
}
