package c2stage_20220113.ccc010override;

public class ccc008zi extends ccc007fu {

    @Override
    // override是注解
    // 检验下面的方法call，在重写的过程中是否有错误
    // 父类中的private内容，是无法被继承的，也就无法被检验

    public void call(String name) {
        // 语句相同，但是参数不一致，就是方法重写
        System.out.println("子类声明");
        System.out.println("---------------");
        // System.out.println("call to :"+name);
        // 这里的语句是多余的，我们可以直接加上super，直接调用父类的方法
        super.call(name);
        // 直接传递参数
    }
}
