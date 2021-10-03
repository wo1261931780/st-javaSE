package d二阶段收尾2021年10月2日.ddd020自定义异常;

public class ccc022对象类 {
    public void checkscore(int score) throws ccc021分数异常 {
        System.out.println("执行");
        if (score < 0 || score > 100) {
            System.out.println("分数异常");
            // throw new ccc021分数异常();
            throw new ccc021分数异常("分数应该在0-100之间");
            // 添加上面的提示，最终类似带参构造
        } else {
            System.out.println("分数正常");
        }
    }
    // 1.在展示异常的对象中，设定好构造方法即可
    // 2.在对象类，设置判断条件和参数
    // 3.这里的异常，可以理解为创建一个异常对象
    // 异常对象会自动调用父类exception的展示方法
    // 4.要展示异常，必须在new出来的对象前面，设置一个throw过程
    // throw完成以后，必须在类中同时签出，表示我已经使用了这个东西
    // 5.继承的异常类，决定了异常的展示方式
    // 运行异常runtime只会在运行时报错
    // 编译异常，只会在编译时报错
}
