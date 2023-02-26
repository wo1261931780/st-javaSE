package c2stage_20220202.ccc031internal_classes;

public class ccc003Local_Internal_Classes {
    public String name;
    public int age;

    public ccc003Local_Internal_Classes() {
    }

    public ccc003Local_Internal_Classes(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void showinn() {
        System.out.println("我是成员内部类");
        inn x1 = new inn();
        x1.show0();
    }

    public void show() {
        class demo {
            public void showin() {
                System.out.println("我是局部内部类");
                System.out.println(name + age);
            }
        }
        demo x = new demo();
        x.showin();
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

    public class inn {
        public void show0() {
            System.out.println("我是成员内部类");
            System.out.println(name + age);
        }
    }
}
