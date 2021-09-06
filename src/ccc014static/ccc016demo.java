package ccc014static;

public class ccc016demo {
    public static void main(String[] args) {
        ccc015static x = new ccc015static();
        x.name = "junw";//将aaa修改为junw
        x.age = 20;//将10修改为20
        x.college = "hw";//这里是静态变量，将huawei修改为hw
        //将变量变成静态之后，一次修改，永远生效
        x.show();
        //junw,20,hw
        System.out.println("finish");
        ccc015static x2 = new ccc015static();
        x2.age = 30;
        x2.show();
        //aaa,30,hw
        //这里x2只修改了年龄，结果是aaa+30+hw，因为college是静态变量
    }
}
