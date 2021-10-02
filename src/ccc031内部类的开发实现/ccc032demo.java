package ccc031内部类的开发实现;

public class ccc032demo {
    public static void main(String[] args) {
        ccc033jumpoperator x = new ccc033jumpoperator();
        x.jump();
        ccc034jump x1 = new ccc035dog();
        x.method(x1);

        System.out.println("-----------------");
        x.method(new ccc034jump() {
            @Override
            public void jump() {
                System.out.println("finish");
            }//匿名内部类，减少了创建类的过程，直接用类的形式创建了对象
        });
    }
}
