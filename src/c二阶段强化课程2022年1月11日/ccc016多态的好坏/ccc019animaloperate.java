package c二阶段强化课程2022年1月11日.ccc016多态的好坏;

public class ccc019animaloperate {
    // public void use(ccc018dog x){
    //     x.eat();
    // }
    public void use(ccc017animal x) {
        System.out.println("操作类中开始调用use方法");
        x.eat();
        // 这里，是dog类中的对象x，使用了dog类中的eat方法，
        // 但是上面的sout无论如何还是会走一遍
        // 整体的流程是：
        // dog x传递过来，然后变成了animal x=new dog
        // 然后x调用eat方法
        // 多态的好处在于，使用父类作为参数传递，但是调用方法，使用的是子类
        // 坏处在于，不能调用子类特有的方法
    }
}
