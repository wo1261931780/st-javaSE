package ab二阶段强化课程2022年1月11日.ccc031内部类的开发实现;

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
