package ab二阶段强化课程2022年1月11日.ccc008学生案例;

public class ccc002学生类 extends ccc001父类 {
    private int classnum;

    public int getClassnum() {
        return classnum;
    }

    public void setClassnum(int classnum) {
        this.classnum = classnum;
    }

    public void class_retire() {
        System.out.println("填写听课反馈");
    }

    // 子类可以多层继承，同时保留自己的成员变量
}
