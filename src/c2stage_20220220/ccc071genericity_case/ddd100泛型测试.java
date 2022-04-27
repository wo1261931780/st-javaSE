package c2stage_20220220.ccc071genericity_case;

public class ddd100泛型测试<T> {
    /**
     * 注意，类的后面必须跟上泛型的注释
     */
    private T t;
    // 这里的泛型可以用任意字母表示

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}
