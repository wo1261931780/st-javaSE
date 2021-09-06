package ccc010猫和狗;

public class ccc011cat extends ccc014animal {
    public ccc011cat() {
    }

    public ccc011cat(String name, int age) {
        super(name, age);
        //这里使用super直接导入父类的name和age
    }

    public void seekrat() {
        System.out.println(getName() + "抓老鼠");
    }
}
