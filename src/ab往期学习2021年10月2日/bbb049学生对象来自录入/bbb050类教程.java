package ab往期学习2021年10月2日.bbb049学生对象来自录入;

public class bbb050类教程 {
    private String name = "";
    private int age = 0;

    public bbb050类教程() {
    }

    public bbb050类教程(String name, int age) {
        //必须赋值，不然原参数无法获得具体数据
        this.name = name;
        this.age = age;
        System.out.println(name + age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    //    Scanner x=new Scanner(System.in);
    //    public void bl(){
    //        System.out.println("请输入姓名：");
    //        name=x.nextLine();
    //        System.out.println("请输入年龄：");
    //        age=x.nextInt();
    //    }
    // 2021年11月3日23:40:53
    // 明天入职
}
