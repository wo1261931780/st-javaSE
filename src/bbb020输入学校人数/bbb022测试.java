package bbb020输入学校人数;

//这里可以看到，21因为没有main方法，所以不能run，右上角没有小箭头
public class bbb022测试 {
    public static void main(String[] args) {
        bbb021 x = new bbb021();
        //无参构造方法
        x.setSchool("set");
        x.setAbound(1233);
        //set方法是用来给无参方法赋值的。
//        x.getSchool();
//        x.getAbound();
        x.show();
        System.out.println("-------------------------");
        bbb021 x1 = new bbb021("jimei", 165);
//        x1.show();
    }
}
