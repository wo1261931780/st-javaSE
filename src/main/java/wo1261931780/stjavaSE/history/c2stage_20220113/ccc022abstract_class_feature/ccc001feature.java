package c2stage_20220113.ccc022abstract_class_feature;

public class ccc001feature {
    //抽象类为什么不能创建对象
// 抽象类存在构造器，因为存在子类继承
// 如果没有构造器，子类无法完成数据初始化的过程
//     主要原因在于
// 如果抽象类可以创建对象，那么它的对象就可以调用抽象类中的抽象方法
// 但是从结构的角度来说，抽象方法没有方法体，不可以被直接调用
// 所以会出现矛盾的情况
// java就设定抽象类不能进行对象创建
//     换句话说，抽象本身就意味着实例化

    // 虽然抽象类中，可以没有抽象方法，但是后续可以进行创建
    // 因此对象会发生错误




}