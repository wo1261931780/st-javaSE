package wo1261931780.stjavaSE.history.c2stage_20220202.ccc031internal_classes;

public class ccc008interview_case {
    public static void main(String[] args) {

    }

}
class demo{

    private int age=33;
    public class demo2{
        private int age=22;
        public void show(){
            int age=11;
            System.out.println(age);//11
            System.out.println(this.age);//22
            // 首先age的变量是重复存在的，
            // 默认访问只会访问方法内部的，距离最近
            // 访问同类的，算是成员变量，所以需要this.xx来制定
            // 访问外部类的，或者非本类的，就需要制定类名，然后制定具体位置，比如xx.this.yy的形式
            System.out.println(demo.this.age);//33
        }
    }
}
