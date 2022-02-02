package c2stage_20220202.ccc030Polymorphic_case;

public class ccc001computer {
    public static void main(String[] args) {
        ccc002usb x = new ccc003mouse();
        install(x);
        ccc002usb x1 = new ccc004keyboard();
        install(x1);

    }
    public static void install(ccc002usb x) {
        System.out.println("computer install");
        x.get_in();
        x.get_out();
        choose(x);
        System.out.println("**************************");
    }
    // 下面是自己写的代码，其实完全没必要，因为方法体内，不需要创建对象
    // 只需要在创建好对象以后，传递过来就可以
    // public static void install() {
    //     System.out.println("computer install");
    //     ccc002usb x = new ccc003mouse();
    //     x.get_in();
    //     x.get_out();
    //     choose(x);
    //     System.out.println("**************************");
    //     ccc002usb x1 = new ccc004keyboard();
    //     x1.get_in();
    //     x1.get_out();
    //     choose(x1);
    //     System.out.println("**************************");
    // }

    public static void choose(ccc002usb x) {
        if (x instanceof ccc003mouse) {
            ccc003mouse xx = (ccc003mouse) x;
            xx.mouse_click();
        } else if (x instanceof ccc004keyboard) {
            ccc004keyboard xx = (ccc004keyboard) x;
            xx.type();
        }
        System.out.println("choose finish");
    }
}
