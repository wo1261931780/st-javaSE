package abc往期学习2021年10月2日.bbb020输入学校人数;

public class bbb021 {
    private String school;
    private int abound;

    public bbb021() {//无参构造方法
        System.out.println("无参构造方法");
    }

    public bbb021(String school, int abound) {
        System.out.println("带参构造方法");
        if (abound > 0 && abound < 5000) {
            this.abound = abound;
            this.school = school;
            System.out.println(school + "的人数是：" + abound);//这里不需要this，因为局部变量就是我们要的值
        } else {
            System.out.println("人数错误,请重新输入");
        }
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public void setAbound(int abound) {
        this.abound = abound;
    }

    /*
        public String getSchool() {
            return school;
        }
        public int getAbound() {
            return abound;
        }
    */
    public void show() {
        System.out.println("执行show成功:" + school + "的人数为：" + abound);
    }

}
