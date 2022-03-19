package c2stage_20220220.ccc074genericity_impl;

public class eee006泛型接口 {
    public static void main(String[] args) {
        // eee004泛型<String> x = new eee005接口实现类();
        eee004泛型<String> x = new eee005接口实现类();
        // 凡是需要使用泛型的，都需要在类后面标注<T>等字样
        x.show("aa");
    }
}
