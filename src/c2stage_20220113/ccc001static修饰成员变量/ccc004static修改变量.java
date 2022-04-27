package c2stage_20220113.ccc001static修饰成员变量;

public class ccc004static修改变量 {
    public static void main(String[] args) {
        ccc003static定义 x = new ccc003static定义();
        //将aaa修改为junw
        x.name = "junw";
        //将10修改为20
        x.age = 20;
        //这里是静态变量，将huawei修改为hw
        x.college = "hw";
        //将变量变成静态之后，一次修改，永远生效
        x.show();
        //junw,20,hw
        System.out.println("finish");
        ccc003static定义 x2 = new ccc003static定义();
        x2.age = 30;
        x2.show();
        //aaa,30,hw
        //这里x2只修改了年龄，结果是aaa+30+hw，因为college是静态变量
    }
}
