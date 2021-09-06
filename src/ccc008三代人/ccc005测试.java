package ccc008三代人;

public class ccc005测试 {
    public static void main(String[] args) {
        System.out.println("开始---------------");
        ccc003son x1=new ccc003son();
        x1.skating();//儿子自带的方法
        x1.smoke();//因为儿子继承了父亲，所以可以使用父亲的方法
        x1.drink();//又因为父亲继承了爷爷，根据多层继承关系，儿子也可以调用爷爷的方法
        //这就是单个继承和多层继承
    }
}
