package c2stage_20220113.ccc033Anonymous_internal_classe;

public class ccc031inside {
    public void show2() {
        System.out.println("内部类中的sout");
        //匿名内部类需要存在于方法中，
        new ccc032ceshi() {
            //同时需要重写继承的方法
            @Override
            public void show() {
                System.out.println("内部类中的show方法");
            }
        };
        //需要分号，本质上匿名内部类是一个对象
        //继承了该类/实现了该接口的，子类匿名对象
        //这里概括一下——————————————————————————
        //new 匿名内部类(){};这是匿名内部类的完整格式
        //new 匿名内部类(){重写接口/父类的方法};

        new ccc032ceshi() {
            @Override
            public void show() {
                System.out.println("重写测试中的方法");
            }
        }.show();
        //这样才算调用
        //——————————————————————————
        //new 匿名内部类(){}.show();匿名内部类的调用
        //上面等于：对象x.show();

        ccc032ceshi xx = new ccc032ceshi() {
            @Override
            public void show() {
                System.out.println("");
            }
        };
        //作为一个整体送过去
        xx.show();
    }
    public void show(ccc031inside x){
        System.out.println("传递成功");
        x.show2();
    }
}
