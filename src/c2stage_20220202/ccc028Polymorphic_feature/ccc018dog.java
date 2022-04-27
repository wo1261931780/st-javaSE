package c2stage_20220202.ccc028Polymorphic_feature;

public class ccc018dog extends ccc017animal {
    @Override
    public void eat() {
        System.out.println("dog类中的eat---------------");
    }
    //使用多态的前提，要继承，要重写方法，要重新传递对象
}
