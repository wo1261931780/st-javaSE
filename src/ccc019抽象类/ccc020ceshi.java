package ccc019抽象类;

/**
 * 抽象类
 */
public abstract class ccc020ceshi {
    /**
     * public void eat(){
     * System.out.println("11111");
     * }
     * public void eat();
     * // 如果没有方法体，可以删除/定义为抽象方法，
     * // 但是抽象方法又必须存在于抽象类。
     * // 抽象类中，可以有非抽象方法
     */
    public abstract void eat();
    // 类似上面这种，只有方法定义，但是没有大括号和执行方法的命令，就称为抽象方法
    // 比如，所有动物都需要吃东西，但是每个动物吃的不一样
    // 我们就需要对吃东西这个行为进行抽象
    // 好处是，我们可以一次定义，后续调用的时候重写即可
}
