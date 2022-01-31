package c2stage_20220113.ccc033Anonymous_internal_classe;

public class ccc002swim_run {
    public static void main(String[] args) {
        ccc001swim students = new ccc001swim() {
            @Override
            public void swim() {
                System.out.println("学生游泳");
            }
        };
        competition(students);//注意，这里必须是静态的才可以调用
        //非静态的无法使用
        System.out.println("***************************");
        competition(new ccc001swim() {
            @Override
            public void swim() {
                System.out.println("老师游泳");
            }
        });
        System.out.println("***************************");
        ((ccc001swim) () -> System.out.println("lambda表达式简化")).swim();//这个就是lambda表达式，进一步简化匿名内部类
        //(ccc001swim) () -> System.out.println("lambda表达式简化")，直接作为一个对象
        //(ccc001swim) ()表示新建了一个swim中的对象
        // -> System.out.println("lambda表达式简化")对方法重写

        System.out.println("***************************");
        new ccc001swim() {
            @Override
            public void swim() {
                System.out.println("未使用lambda表达式");
            }
        }.swim();
        System.out.println("***************************");
        competition((ccc001swim) () -> System.out.println("运动员游泳"));


    }

    public static void competition(ccc001swim x) {
        System.out.println("开始");
        x.swim();
        System.out.println("结束");
    }

}
