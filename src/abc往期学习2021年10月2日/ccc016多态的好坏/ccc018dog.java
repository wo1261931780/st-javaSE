package abc往期学习2021年10月2日.ccc016多态的好坏;

public class ccc018dog extends ccc017animal {
    @Override
    public void eat() {
        System.out.println("dog类中的eat---------------");
    }
    //使用多态的前提，要继承，要重写方法，要重新传递对象
}
