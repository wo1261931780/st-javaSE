package wo1261931780.stjavaSE.history.ab_Reinforcement_20220111.ccc031内部类的开发实现;

public class ccc054demo {
    public static void main(String[] args) {
        ccc055jumpoperator x = new ccc055jumpoperator();
        x.jump();
        ccc056jump x1 = new ccc057dog();
        x.method(x1);

        System.out.println("-----------------");
        x.method(new ccc056jump() {
            @Override
            public void jump() {
                System.out.println("finish");
            }//匿名内部类，减少了创建类的过程，直接用类的形式创建了对象
        });
    }
}
