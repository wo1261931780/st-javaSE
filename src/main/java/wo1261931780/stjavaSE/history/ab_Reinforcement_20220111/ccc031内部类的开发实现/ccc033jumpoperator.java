package ab_Reinforcement_20220111.ccc031内部类的开发实现;

public class ccc033jumpoperator implements ccc034jump {
    @Override
    public void jump() {
        System.out.println("操作类中的jump");
    }

    public void method(ccc034jump j) {
        System.out.println("操作类中的method");
        j.jump();
        //        new ccc034jump(){
        //            @Override
        //            public void jump() {
        //                System.out.println("finish");
        //                System.out.println("jump----");
        //            }
        //        };
    }
}
